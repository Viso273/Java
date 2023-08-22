public class RecursionExercise01{
	public static void main(String[] args){

		//请用递归的方式求出斐波那契数列1，1，2，3，5，8，13 .....
		//第n位的数字是多少
		T t1 = new T();
		System.out.print(t1.fibonacci(7));


	}
}

class T{
	/*
	使用递归求出斐波那契数列
	思路分析：
	1.当n = 1 斐波那契数为  1
	2.当n = 2 斐波那契数为  1
	3.当n >= 3 斐波那契数为 前两个数的和
	*/

	public int fibonacci(int n){
		if(n==1 || n==2){
			return 1;
		}
		else{
			return (fibonacci(n-1)+fibonacci(n-2));
		}
	}
}