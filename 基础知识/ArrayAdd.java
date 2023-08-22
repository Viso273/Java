import java.util.Scanner;
public class ArrayAdd{
	public static void main(String[] args) {
		//数组添加
		//1.定义初始数组int[] arr={1,2,3}
		//2.定义一个新的数组int[] arrNew = new int[arr.length+1];
		//3.遍历arr数组,一次将arr数组中的元素拷贝到arrNew数组
		//4.将4赋值给arrNew[arrNew.length - 1] = 4;把4赋值给arrNew最后一个元素
		//5.让arr指向arrNew；arr = arrNew；那么原来arr数组就被销毁

		int[] arr ={1,2,3};
		Scanner myScanner = new Scanner(System.in);
		do{
			int[] arrNew=new int[arr.length+1];
			//遍历arr数组。一次将arr数组元素拷贝到arrNew数组
			for(int i = 0;i<arr.length;i++){
				arrNew[i] = arr[i];
			}
			System.out.println("请输入你要添加的元素");
			int addNum = myScanner.nextInt();
			//把addNum赋值给arrNew最后一个元素
			arrNew[arrNew.length-1]=addNum;
			//让arr指向arrNew
			arr = arrNew;
			//输出arr
			System.out.println("=====arr扩容后的效果=====");
			for(int i =0;i<arr.length;i++){
				System.out.print(arr[i]+"\t");
			}
			//询问是否继续添加
			System.out.println("是否继续添加？(y/n)");
			char key = myScanner.next().charAt(0);
			if(key == 'n'){
				break;
			}
		}while(true);

		System.out.println("已退出添加");
	}
}