import java.util.Scanner;
public class MulForExercise{
	
	public static void main(String[] args){

		//统计三个班的成绩情况,每个班有5个学生
		//求出各个班的平均分和所有班级的平均分
		//统计三个班及格人数,每个班有5学生
		//
		//思路分析
		//化繁为简
		//1.先计算一个班的5个学生的成绩,使用for
		//
		//2.外层嵌套for循环输入三个班
		//
		//3.统计及格人数passNumber
		//
		//4.代码优化[效率,可读性,结构]
		//
		//先死后活
		//
		
		//创建Scanner对象
		Scanner myScanner = new Scanner(System.in);
		double sum     = 0.0;
		int passNumber = 0;
		for(int i = 0; i < 3; i++){
			double total   = 0.0;
			double average = 0.0;
			for(int j = 0; j < 5; j++){
				System.out.println("请输入第" + (i+1) + "个班级的第" + (j+1) + "个学生的成绩");
				double score = myScanner.nextDouble();
				total += score;
				if(score >= 60){
					passNumber++;
				}
			}
				System.out.println("第" + (i+1) + "个班的总分:" + total);
				average = total/5;
				System.out.println("第" + (i+1) + "个班的均分:" + average);
				sum += total;
		}
		System.out.println("三个班的总分:" + sum + " 三个班的平均分:" + (sum/(3*5)));
		System.out.println("及格人数: " + passNumber);
	}
}