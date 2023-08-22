public class ForExercise03{

	public static void main(String[] args) {
		//用for循环实现，打印0~127各个数字对应的字符，每8个打印一行
		//思路：
		//1.使用强制类型转换
		//2.if语句打印转义字符换行
		for(int i = 0; i < 128; i++){
			System.out.print(i + " : " + (char) i + "  ");
			if((i+1) % 8 == 0){
				System.out.println("\n");
			}
		}
	}
}