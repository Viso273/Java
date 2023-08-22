public class RecursionExercise02{
	public static void main(String[] args){

		//猴子吃桃问题：有一堆桃子，
		// 猴子第一天吃了其中的一半，并再多吃了一个
		// 以后每天猴子都吃其中一半并多吃一个。
		// 到第十天时，猴子想吃的时候发现只剩一个，问原来共多少个桃子

		T t1 = new T();
		int day = 1;
		System.out.println(t1.Eat(day));
	}
}

class T{

	//问题分析：
	/*
	逆推
	1.第十天  1个
	2.第九天  4个  （1+1）*2
	3.第八天  10个 （2+1）*2
	.....
	*/

	public int Eat(int day){
		if(day == 10){//第十天剩一个桃子
			return 1;
		}else if(day>=1 && day <=9){
			return (Eat(day+1)+1)*2;
		}else{
			System.out.println("day在1-10之间");
			return -1;
		}
	}
}