import java.util.Scanner;//表示把java.util中Scanner类导入
public class Input {

	//编写1个main方法
	public static void main(String[] args){
		//演示接受用户的输入
		//步骤
		//Scanner表示简单的文本扫描器，在Java.util
		//1.引入Scanner所在的包
		//2.创建Scanner对象,new创建一个对象

		Scanner myScanner = new Scanner(System.in);
		//3.接受用户输入
		System.out.println("put in you name:");
		String name = myScanner.next();//接受用户输入的字符串
		System.out.println("put in you age:");
		int age = myScanner.nextInt();//接受用户输入int
		System.out.println("put in you wages:");
		double salary = myScanner.nextDouble();//接受用户输入double
		System.out.println("the messages of this guy:");
		System.out.println("name:" + name + "\nage:" + age + "\nwages" + salary);
	}
}