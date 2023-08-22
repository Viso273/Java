public class Homework07{

	public static void main(String[] args){

		//求出1-1/2+1/3-1/4+1/5.....1/100的和

		//分析：
		//1）分母down计数累加
		//2）先求出正的
		//3）for求和
		//4) 注意隐藏点：要把公式分子1写作1.0才有精确的小数

		int    down  = 1;
		double temp  = 0;
		double count = 0;
		for(int i = 1; i<=100;i++){
			temp = (1.0/down);
			down++;
			if(i % 2 == 0){
				count -= temp;
			}else{
				count += temp;
			}
			
		}
		System.out.print(count);
	}	
}