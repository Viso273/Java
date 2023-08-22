import java.util.Scanner;
public class ForExercise02{

	public static void main(String[] args) {

		//完成表达式的输出
		// 0 + 5 = 5
		// 1 + 4 = 5
		// 2 + 3 = 5
		// 3 + 2 = 5
		// 4 + 1 = 5
		// 5 + 0 = 5
		//化繁为简
		//1.先输出 0 ~ 5
		//2.后输出 其对于5的补数

		//先死后活
		//（1） 5换成变量 n
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int n = myScanner.nextInt();
		for(int i = 0; i <= n; i++){
			System.out.println(i + " + "+(n-i) +" = " + n);
		}

	}
}