public class Homework08{

	public static void main(String[] args){

		//求1+(1+2)+(1+2+3)+...+(1+2+3+4+6+...+100)的结果

		//分析：

		//常规思路：
		//1.一共100项相加
		//2.每一项的数字在逐渐增加
		//3.很像一个双层循环
		//4.使用sum进行统计
		int sum = 0;
		for(int i =1;i<=100;i++){//i表示第几项，也是当前项的最后一个数
			for(int j = 1;j<=i;j++){//内层对i再进行一次循环
				sum+=j;
			}
		}
		System.out.println("和为" + sum);

		//计数法：
		//一共100个1，99个2，...1个100相加
		int count =0;
		for(int i =1;i<=100;i++){
			count += i*(101-i);
		}	
		System.out.println("和为" + count);
	}
}