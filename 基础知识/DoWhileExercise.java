public class DoWhileExercise{

	public static void main(String[] args){
		//统计1--200之间的能被5整除而不能被3整除的数
		int i = 1;
		int count = 0;
		do {
			if(i % 5 == 0 && i % 3 != 0){
				System.out.println("i = " + i);
				count ++;
			}
			i++;
		}while( i <= 200 );

		System.out.println("count = " + count);
	}
}