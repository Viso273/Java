import java.util.Scanner;
public class Rhombus{
	public static void main(String[] args){
		/*
		打印菱形
		菱形行数的级数用边长算
		核心问题:空格和*的分配
		分析:       *的数量     空格数   *只出现在首尾  层数   实心时*的数量
		   *	       1         3         4    4      1          1
		  * *		   2         2         3    5      2          3
         *   *         2         1         2    6      3          5
        *     *        2         0         1    7      4          7
         *   *         2         1         2    6      5          5
          * *          2         2         3    5      6          3
           *           1         3         4    4      7          1

		*/
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入菱形边长:");
		int sideLength = myScanner.nextInt();
		for(int i = 1; i <= (sideLength*2 - 1); i++){//i表示行数
			//打印*前的空格数 
			for(int j = 1; j <= ((sideLength - i)>0 ? (sideLength - i):(i - sideLength)); j++){
				System.out.print(" ");
			}
			//控制每层打印的*的个数
			if(i<=sideLength){
				for(int k = 1; k <= 2*i-1; k++){
					if(k == 1 || k == 2*i-1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}                   //2*sideLength - (i - sideLength)*2 - 1
			}else{
				for(int k =1; k<= (2*sideLength-i)*2-1;k++){
					if(k == 1 || k == (2*sideLength-i)*2-1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			//每行打完换行
			System.out.println("");
		}
	}
}