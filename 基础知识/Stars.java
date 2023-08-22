import java.util.Scanner;
public class Stars{
	public static void main(String[] args){

		/*打印空心金字塔
		
		思路"
		化繁为简
		1.先打印一个矩形
		*****
		*****
		*****
		*****
		*****
		2.打印半个金字塔
		*
		**
		***
		****
		*****
		3.打印整个金字塔
		     *          1   4
		    ***         3   3
		   *****        5   2
		  *******       7   1
		 *********      9   0
		4.打印空心的金字塔 [最难]
		     *          1   当前行的第一个位置和最后一个*
		    * *         2   当前行的第一个位置和最后一个*
		   *   *        2   当前行的第一个位置和最后一个*
		  *     *       2   当前行的第一个位置和最后一个*
		 *********      9   全部输出
		

		先死后活
		5 层数做成变量 int totalLevel = 5

		*/
		System.out.println("输入层数: ");
		Scanner myScanner = new Scanner(System.in);
		int totalLevel = myScanner.nextInt();
		for(int i = 1; i <= totalLevel; i++){//i表示层数

			//在输出*之前还有空格
			for(int k = 1; k <= (totalLevel-i); k++){
				System.out.print(" ");
			}
			//控制每层打印的*的个数
			for(int j = 1; j <= (2*i-1); j++){
				//最后一层全部都输出*---------------
				//                                |
				if(j == 1 || j == (2*i-1) || i == totalLevel){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}

			//每打完一层换行
			System.out.println("");
		}	
	}
}