public class HanoiTower{
	public static void main(String[] args){

		T tower = new T();
		tower.move(5,'A','B','C');

	}
}

class T{
	//思路分析：
	//不论圆盘多少，视为一个或者两个
	
	public void move(int num,char a,char b,char c){
		//num 表示圆盘数 a,b,c表示三个塔
		if(num == 1){
			System.out.println(a+"->"+c);

		}else{
			//如果多个盘，视为两个，最下面的和上面所有(num -1)
			//(1)先移动上面所有的盘到b借助c
			move(num-1,a,c,b);
			//(2)把最下面的盘移动到c
			System.out.println(a+"->"+c);
			//(3)把b的所有盘移动到c借助a
			move(num-1,b,a,c);
		}
	}
}