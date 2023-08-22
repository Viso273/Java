import java.util.Scanner;
public class ForExercise{

	public static void main(String[] args) {
		// 打印1~100之间的所有9的倍数的整数，统计个数 及总和
		//1.化繁为简：将复杂的需求拆解为简单的需求，逐步完成
		//2.先死后活：先考虑固定的值，然后转化成可以灵活变化的值
		//
		//思路：
		//化繁为简
		//1.输出1~100的值
		//2.输出是9的倍数的数
		//先死后活
		//1.为了更好的适应需求，把范围的开始值和结束值做出变量
		//2.把倍数改为变量
		int start = 0;
		int end   = 0;
		int t     = 0; 
		int count = 0;
		int total = 0;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入起始值：");
		start = myScanner.nextInt();
		System.out.println("请输入结束值：");
		end   = myScanner.nextInt();
		System.out.println("请输入倍数  ：");
		t     = myScanner.nextInt();
		for(int i = start ; i < end ;i++){
			if(i % t == 0){
				System.out.println("i = " + i);
				count++ ;
				total += i;
			}

		}
		System.out.println("count = " + count);
		System.out.println("total = " + total);
	}
}