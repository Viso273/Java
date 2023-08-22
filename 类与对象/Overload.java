class Calc{
	int max(int a, int b){
		return a>b?a:b;
	}
	float max(float a, float b){
		return a>b?a:b;
	}
	double max(double a, double b){
		return a>b?a:b;
	}
}

public class Overload{
	public static void main(String[] args) {
		Calc ca = new Calc();
		System.out.println(ca.max(1,2));
		System.out.println(ca.max(1.1,2.2));
		System.out.println(ca.max(1.21212,2.32323));

	}
}