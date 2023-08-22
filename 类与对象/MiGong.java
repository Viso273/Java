public class MiGong{
	public static void main(String[] args){

		//思路
		//1.先用二维数组创建迷宫  int[][] map = new int[8][7]
		//2.规定map数组的元素值： 0表示可走  1表示障碍物

		int[][] map = new int[8][7];
		//3.将最上面的一行和最下面的一行，全部设置为1
		for(int i = 0;i < 7;i++){
			map[0][i] = 1;
			map[7][i] = 1; 
		}
		//4.将最右边和最左边的设置为1
		for(int i = 0;i<7;i++){
			map[i][0] = 1;
			map[i][6] = 1;
		}
		//5.单独设置个别障碍物
		map[3][1]=1;
		map[3][2]=1;
		map[2][2]=1;
		

		//输出看效果
		System.out.println("=====当前地图====");
		for(int i = 0;i<map.length;i++){
			for(int j = 0;j<map[i].length;j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println("");
		}

		//使用findWay找路
		T t1 = new T();
		t1.findWay(map,1,1);
		System.out.println("=====找路1的结果====");
		for(int i = 0;i<map.length;i++){
			for(int j = 0;j<map[i].length;j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println("");
		}

		//重置
		for(int i = 0;i<map.length;i++){
			for(int j = 0;j<map[i].length;j++){
				map[i][j] = 0;
			}
		}
		//将最上面的一行和最下面的一行，全部设置为1
		for(int i = 0;i < 7;i++){
			map[0][i] = 1;
			map[7][i] = 1; 
		}
		//将最右边和最左边的设置为1
		for(int i = 0;i<7;i++){
			map[i][0] = 1;
			map[i][6] = 1;
		}
		//单独设置个别障碍物
		map[3][1]=1;
		map[3][2]=1;


		//输出看效果
		System.out.println("=====当前地图====");
		for(int i = 0;i<map.length;i++){
			for(int j = 0;j<map[i].length;j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println("");
		}


		//使用findWay2
		t1.findWay2(map,1,1);
		System.out.println("=====找路2的结果====");
		for(int i = 0;i<map.length;i++){
			for(int j = 0;j<map[i].length;j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println("");
		}

	}
}


class T{
	//使用递归回溯的思想来解决问题

	//1.findWay方法找路径
	//2.找到返回true
	//3.map就是二维数组，即迷宫
	//4.i，j就是老鼠的位置，初始化位置为（1，1）
	//5.因为我们是递归的找路，所以先规定map各个值的含义
	// 0表示可以走   1表示障碍物  2表示可以走 3表示走过但是死路
	//6.递归终点：map[6][5] = 2的时候说明找到通路，否则就继续找
	//7.先确定老鼠找路的策略 下->右->上->左
	public boolean findWay(int[][] map,int i, int j){
		if(map[6][5] == 2){//找到了
			return true;
		}else{
			if(map[i][j]==0){//当前位置0，表示可以走
				//假定可以走通
				map[i][j] = 2;
				//使用找路的策略，来确定该位置是否能真的走通
				if(findWay(map,i+1,j)){
					return true;
				}else if(findWay(map,i,j+1)){
					return true;
				}else if(findWay(map,i-1,j)){
					return true;
				}else if(findWay(map,i,j-1)){
					return true;
				}else{
					map[i][j] = 3;
					return false;	
				}
			}else{//map[i][j] == 1,2,3   
				  //1:障碍物，不能走  2:已经测试过了，不能重复 3.死路
				return false;
			}
		}
	}



	//修改找路策略
	//上->右->下->左
	public boolean findWay2(int[][] map,int i, int j){
		if(map[6][5] == 2){//找到了
			return true;
		}else{
			if(map[i][j]==0){//当前位置0，表示可以走
				//假定可以走通
				map[i][j] = 2;
				//使用找路的策略，来确定该位置是否能真的走通
				if(findWay2(map,i-1,j)){
					return true;
				}else if(findWay2(map,i,j+1)){
					return true;
				}else if(findWay2(map,i+1,j)){
					return true;
				}else if(findWay2(map,i,j-1)){
					return true;
				}else{
					map[i][j] = 3;
					return false;	
				}
			}else{//map[i][j] == 1,2,3   
				  //1:障碍物，不能走  2:已经测试过了，不能重复 3.死路
				return false;
			}
		}
	}
}