import java.util.Scanner;
public class Homework04{

	public static void main(String[] args){

		//判断一个数是否为水仙花数

		//分析：
		//水仙花数：三位数，且各个位上数字立方和等于其本身
		//如：153 = 1*1*1 + 3*3*3 +5*5*5
		//1）判断是否为三位数
		//2）获取各个位上的数字，分别存到另外的单独变量中
		//3）求和判断

		Scanner myScanner = new Scanner(System.in);
		int temp1,temp2,temp3;
		System.out.println("请输入一个三位数字：");
		int num = myScanner.nextInt();
		//判断是否为三位数
		if(num > 999 || num < 100){
			System.out.println("输入有误！");
			return;
		}else{
			System.out.println("输入正确！");
			//得到各个位上的数字
			temp1 = (num%10);//个位
			temp2 = (num%100 - temp1)/10;//十位
			temp3 = (num-temp2*10-temp1)/100;
			//判断是否相等
			if(num == Math.pow(temp1,3)+Math.pow(temp2,3)+Math.pow(temp3,3)){
				System.out.println("这个数是水仙花数！");
			}
			else{
				System.out.println("这个数不是水仙花数！");
			}
		}
	}
}