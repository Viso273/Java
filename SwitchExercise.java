
import java.util.Scanner;
public class SwitchExercise {

	//编写一个main方法
	public static void main(String[] args){

		//使用switch语句把小写类型的char型转为大写。
		//只转换a,b,c,d,e.其他的输出“other”。
        
        //创建scanner对象
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入a-e");
        char c1 = myScanner.next().charAt(0);
        switch(c1){
        	case 'a':
        		System.out.println("A");
        		break;
        	case 'b':
        		System.out.println("B");
        		break;
        	case 'c':
        		System.out.println("C");
        		break;
        	case 'd':
        		System.out.println("D");
        		break;
        	case 'e':
        		System.out.println("E");
        		break;
        	default:
        		System.out.println("others");

        }

        //对学生成绩100~90的输出A，89~80的输出B，79~70的输出C，69~60的输出D，60以下的输出“不及格”；
        //思路分析
        //1.使用switch分支语句
        //2.取整运算分情况
        System.out.println("请输入你的成绩");
        double score = myScanner.nextDouble();
        if ((int)score/10 >= 6){
        	switch((int)score/10){
            	case  10:
            		System.out.println("A");
            		break;
           		case  9:
            		System.out.println("A");
            		break;
            	case  8:
            		System.out.println("B");
            		break;
            	case  7:
            		System.out.println("C");
            		break;
            	case  6:
            		System.out.println("D");
            		break;
            	default:
            		break;
        	}
    	}
    	 else{
        	System.out.println("不及格");
        }

        //根据用于指定月份，打印改约所属的季节。3，4，5春
        //思路分析：
        //1.同一季节的月份连续，使用穿插
        System.out.println("输入月份");
        int month = myScanner.nextInt();
        if(month>0 && month<13){
            switch(month){
                case 3:
                case 4:
                case 5:
                    System.out.println("春季");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("夏季");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("秋季");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println("冬季");
                    break;
                //default:
                //    System.out.println("输入有误");
            }
        }else{
            System.out.println("输入有误");
        }
	}
}