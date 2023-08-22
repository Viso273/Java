public class ArrayReverse{
	public static void main(String[] args) {
		
		//将数组内的元素反转

		//定义数组
		int[] array={11,22,33,44,55,66};

		//分析：
		//1.把array[0]和array[5]交换
		//2.把array[1]和array[4]交换
		//3.把array[1]和array[4]交换
		//4.交换三次 = array.length/2
		//5.每次交换时，对应的下标是array[i]和array[arr.length - 1 - i]
		int temp = 0;
		int len = array.length;
		for(int i = 0;i<len/2;i++){
			temp = array[len-1-i];//保存
			array[len-1-i] = array[i];
			array[i] = temp;
		}
		//输出
		for(int i=0;i<len;i++){
			System.out.print(array[i]+"\t");
		}


		System.out.println("");
		//逆序赋值法
		//创建一个新数组，遍历逆序存入
		int[] arr = new int[array.length];
		for(int i = len-1 , j=0; i>=0;i--,j++){
			arr[j] = array[i];
		}
		//for循环结束后，arr是逆序的
		//让array指向arr的数据空间,此时array原来的数据空间没有被引用，
		//被当作垃圾处理******重点*******
		array = arr;
		for(int i=0;i<len;i++){
			System.out.print(array[i]+"\t");
		}
	} 
}