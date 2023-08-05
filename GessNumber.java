public class GessNumber{

	public static void main(String[] args){
		//写一个猜数游戏：系统随机产生一个1~100的整数，
		//要求用户用输入框输入一个整数，
		//如果数字小于随机数，则输出“小了”，如果数字大于随机数，则输出“大了”；
		//如果猜中，则输出“对了”；
		//如果输错3次，则输出“游戏失败”；

		//思路：
		//1.随机数用Math.random()获取
		//2.设置一个记录猜词次数的计数器
		int num = (int)(Math.random()*100.0);
		int count = 0;
		for(int i = 0; i < 3; i++){
			String strGessNumber = 
			    javax.swing.JOptionPane.showInputDialog("输入一个数： ");
			int gessNumber = Integer.parseInt(strGessNumber);
			if(gessNumber == num){
				System.out.println("猜对了");
				break;
			}
			else if(gessNumber < num){
				System.out.println("小了" + "(剩余机会：" + (2-i) +"次)" );
				if(i == 2){
					System.out.println("游戏失败");
				}
			}
			else{
				System.out.println("大了" + "(剩余机会：" + (2-i) +"次)" );
				if(i == 2){
					System.out.println("游戏失败");
				}
			}


		}
	}
}