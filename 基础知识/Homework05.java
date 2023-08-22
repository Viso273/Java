public class Homework05{

	public static void main(String[] args){
		
		//输出1-100之间的不能被5整除的数，五个一行

		//分析：
		//1）用for循环
		//2）遇到5的倍数用continue跳过
		//3）设置计数器，每五个输出一次"\n"

		int count = 0;
		for(int i =1; i<=100;i++){
			if(i%5 != 0){
				System.out.print(i+"\t");
				count++;
			}else{
				continue;
			}
			if(count%5 == 0){
				System.out.print("\n");
			}
		}

	}
}