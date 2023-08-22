import java.util.Scanner;
public class BreakExercise{

	public static void main(String[] args){

		//实现登录验证，有三次机会，如果用户名为“丁真”，密码“666”提示登录成功
		//否则提示还有几次机会，使用for + break完成
		//
		//思路分析
		//1.创建Scanner对象接受用户输入
		//2.定义String name ;String password;
		//3.最多循环三次，满足条件则提前退出
		//4.定义一般变量int chance 记录剩余机会
		Scanner myScanner = new Scanner(System.in);
		String name = "";//初始值
		String password = "";
		int chance = 3;//登录一次减少一次
		for(int i = 1; i<=3; i++){
			System.out.println("请输入名字：");
			name = myScanner.next();
			System.out.println("请输入密码：");
			password = myScanner.next();
			//开始比较
			//字符串比较使用的时equals
			//equals有两种用法：
			//String str1 = "abc";
			//String str2 = "def";
			//str1.equals("def");
			//"def".equals(str1);[推荐，可以避免空指针]
			if("丁真".equals(name) && "666".equals(password)){
				System.out.println("恭喜你登录成功~");
				break;
			}
			//登录机会减少一次
			chance--;
			System.out.println("你还有" + chance +"次登录机会");
		}

	}
}