public class BankCash{
	public static void main(String[] args){
		//制作一个模拟银行操作的流程。
		//系统运行，出现输入框，让用户选择 “0”：退出   “1”：存款  “2”：取款  “3”：查询
		//初始余额为0
		//用户选择“1”，可以输入钱数，将款项存入余额
		//用户选择“2”，可以输入钱数，将款项从余额中减去，钱不够时输出提示信息
		//用户选择“3”，可以打印当前余额；
		//用户选择“0”，程序退出
		//注意：只要没有退出，用户操作后选择菜单重新显示

		//分析：
		//1.初始化余额count为0；
		//2.构造死循环使得菜单能一直显示，直到用户选择“0”


//      //不能用switch语句放在死循环内，因为switch中的break无法使程序跳出死循环
// 		int count = 0;
// 		for(;;){
// 			String strButton = 
// 				javax.swing.JOptionPane.showInputDialog("请输入您的操作： \n0：退出  1：存款  2：取款  3：查询");
// 			int button = Integer.parseInt(strButton);
// 			switch(button){
// 				case 0:
// 					break;
// 				case 1:
// 					String strMoneyIn = 
// 						javax.swing.JOptionPane.showInputDialog("请输入您的存入金额：");
// 					count += Integer.parseInt(strMoneyIn);
// 					break;
// 				case 2:
// 					String strMoneyOut = 
// 						javax.swing.JOptionPane.showInputDialog("请输入您的取出金额：");
// 					int moneyOut = Integer.parseInt(strMoneyOut);
// 					if(count < moneyOut){
// 						System.out.println("余额不足！");
// 					}
// 					else{
// 						count -= moneyOut;
// 					}
// 					break;
// 				case 3:
// 					System.out.println("您的账户余额为：" + count);
// 					break;
// 				default:
// 					System.out.println("您的输入有误！");
// 					break;
// 			}
// 		}
// 	}
// }

		int count = 0;
		for(;;){
			String strButton = 
				javax.swing.JOptionPane.showInputDialog("请输入您的操作： \n0：退出  1：存款  2：取款  3：查询");
			int button = Integer.parseInt(strButton);
			if(button == 0){
				break;
			}
			else if(button == 1){
				String strMoneyIn = 
						javax.swing.JOptionPane.showInputDialog("请输入您的存入金额：");
				count += Integer.parseInt(strMoneyIn);
			}
			else if(button == 2){
				String strMoneyOut = 
						javax.swing.JOptionPane.showInputDialog("请输入您的取出金额：");
				int moneyOut = Integer.parseInt(strMoneyOut);
				if(count < moneyOut){
					System.out.println("余额不足！");
				}
				else{
					count -= moneyOut;
				}
			}
			else if(button == 3){
				System.out.println("您的账户余额为：" + count);
			}
			else{
				System.out.println("您的输入有误！");
			}
		}
	}
}