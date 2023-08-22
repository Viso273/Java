import java.util.Scanner;
public class PayBack{

	public static void main(String[] args){

		//如果李三不还钱，则老韩将一直使出五连鞭，知道李三说出还钱为止
		//化繁为简
		//1.不停的问还钱吗？
		//2.使用char answer接受 --->定义一个Scanner对象

		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		do{
			System.out.println("五连鞭");
			System.out.println("还钱吗? y/n");
			answer = myScanner.next().charAt(0);
			System.out.println("他的回答是:" + answer);
		}while(answer != 'y');
	}
}