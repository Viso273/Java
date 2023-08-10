public class HundredChickens{
	public static void main(String[] args) {
		//百鸡问题：
		//公鸡一只值五钱，母鸡一只值仨钱，小鸡三只值一钱
		//今有百鸡百钱，问公鸡，母鸡，小鸡各多少只？

		//分析：
		//1）列出方程式：5x + 3y + z/3  = 100; x + y + z = 100
		//2) 枚举？三重for循环匹配正确结果
		for(int i = 0;i<100;i++){
			for(int j = 0;j<100;j++){
				for(int k = 0;k<100;k+=3){
					if((5*i + 3*j + k/3 == 100) && (i + k + j==100)){
						System.out.println("公鸡："+i+"母鸡："+j+"小鸡："+k);
					}
				}
			}
		}
		System.out.println("");
		//3）优化，缩小枚举范围
		for(int i = 0;i<20;i++){
			for(int j = 0;j<33;j++){
				for(int k = 0;k<100;k+=3){
					if((5*i + 3*j + k/3 == 100) && (i + k + j==100)){
						System.out.println("公鸡："+i+"母鸡："+j+"小鸡："+k);
					}
				}
			}
		}
		System.out.println("");
		//4）继续优化，减少循环层数，减少一个变量
		for(int i = 0;i<20;i++){
			for(int j = 0;j<33;j++){
				if((5*i+3*j+(100-i-j)/3.0==100)){
					System.out.println("公鸡："+i+"母鸡："+j+"小鸡："+(100-i-j/3));
				}
			}
		}
		System.out.println("");
		//5)继续优化，再减少一个变量，消元法使用x表示其他变量
		//
		for(int i =0;i<15;i++){
			int j = 25-7*i/4;
			int k = 75+3*i/4;
			if((i+j+k==100)&&(5*i+3*j+k/3==100)&&k%3==0){
				System.out.println("公鸡："+i+"母鸡："+j+"小鸡："+k);
			}
		}

	}
}