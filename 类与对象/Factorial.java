public class Factorial{
	public static void main(String[] args) {
		
		T t1 = new T();
		int n = t1.factorial(5);
		System.out.println(n);
	}
}

class T{
	public int factorial(int n){
		if(n == 1){
			return 1;
		}else{
			return factorial(n-1)*n;
		}
	}
}