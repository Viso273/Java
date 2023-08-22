public class TwoDimensionArray{
	public static void main(String[] args) {
		//创建二维数组，但是只确定一维数组的个数,但是每个一维数组还没有开数据空间
		int[][] arr = new int[3][];
		for(int i = 0;i<arr.length;i++){//遍历arr的每一个一维数组
			//给每个一维数组开空间new
			//如果没有给一维数组new，那么arr[i]就是null
			arr[i] = new int[i+1];

			//遍历一维数组,并给一维数组的每个元素fuzhi
			for(int j =0;j<arr[i].length;j++){
				arr[i][j] = i+1;//赋值

			}
		}
		System.out.println("=====arr元素=====");
		//遍历arr输出
		for(int i =0;i<arr.length;i++){
			//输出arr的每一个一维数组
			for(int j =0;j<arr[i].length;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}
}