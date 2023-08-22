import java.util.Scanner;
public class BubbleSort{
	public static void main(String[] args) {
		
		//化繁为简，先死后活

		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入数组大小");
		int length = myScanner.nextInt();
		int[] arr = new int[length];
		for(int i = 0; i<length;i++){
			System.out.println("请输入第"+(i+1)+"个元素");
			arr[i] = myScanner.nextInt();
		}
		int temp = 0;
		for(int i = 0;i < length - 1;i++){
			for(int j = 0;j<length - 1-i;j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i = 0;i<length;i++){
		System.out.print(arr[i] + " ");
		}
	}
}