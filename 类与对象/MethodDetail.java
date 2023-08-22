public class MethodDetail{
	public static void main(String[] args) {
		
		//一个方法有多个返回值

		AA a =new AA();
		int[] res = a.getSumAndSub(1,4);
		System.out.println("和为：" + res[0] + "差为：" + res[1]);
	}
}

class AA{

	public int[] getSumAndSub(int i,int j){
		int [] res = new int[2];
		res[0] = i + j;
		res[1] = i - j;
		return res;
	}
}