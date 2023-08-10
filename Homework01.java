public class Homework01{

	public static void main(String[] args){
		//编程实现如下功能
		//某人有现金100，000元，每经过一次路口，需要缴费，规则如下
		//1）当现金> 50，000时，每次交5%
		//2）当现金<=50，000时，每次交1，000
		//编程计算该人可以经过多少次路口，要求用while break方式完成

		//分析：
		//1.while循环语句的判断条件设置为>50，000；
		//2.现金cash为0时退出
		//3.设置count计数经过的路口数

		int cash  = 100000;
		int count = 0;
		while(cash > 50000){
			cash = (int)(0.95*cash);
			count++;
		}
		while(cash <= 50000){
			cash -= 1000;
			count++;
			if(cash < 1000){
				break;
			}
		}
		System.out.println("一共走了" + count + "个路口");
	}
}