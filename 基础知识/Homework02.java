import java.util.Scanner;
public class Homework02{

	public static void main(String[] args){
		//判断一个数为整数，属于哪个范围：>0 , <0 ,=0

		//分析：
		//？？

		Scanner myScanner = new Scanner(System.in);
		System.out.println("输入一个整数：");
		int inte = myScanner.nextInt();
		if(inte < 0){
			System.out.println(inte + " < 0");
		}
		else if(inte > 0){
			System.out.println(inte + " > 0");
		}
		else{
			System.out.println(inte + " = 0");
		}
	}
}