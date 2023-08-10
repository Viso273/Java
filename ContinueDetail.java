public class ContinueDetail{

	public static void main(String[] args) {
		lable1:
		for(int j = 0; j < 2; j++){
			lable2:
			for(int i =0; i < 10; i++){
				if( i == 2){
					// continue ;//等价于continue到最近的一个
					// continue lable1;
					continue lable2;
				}
				System.out.println("i = " + i);
			}
		}
	}
}