
public class QueenEight2 {
    public static void main(String[] args) {
        new QueenEight2().solve();
    }
    private static final int N = 8;
    private int[] y; // 记录每列上皇后放的位置
    int count = 0; //   解的个数
    public void solve() {
        count = 0;
        y = new int[N+1]; //    初始化数组
        int x = 1;
        while (x>0) {
            y[x]++; //为当前x位置找一个皇后的位置
            while ((y[x]<=N)&&(!check(x)))
                y[x]++; //找到合适的位置
            if (y[x]<=N) {
                if (x == N) {   // 如果找到了一个放置皇后的完整方案，解+1，打印结果
                    count++;
                    print();
                }else x++;  // 还没找到完整方法，继续寻找下一个皇后位置。
            }else {
                //  所有位置均不安全，回溯。
                y[x] = 0;
                x--;
            }
        }
    }
    //  测试合法性
    private boolean check(int k) {
        for (int j=1;j<k;j++)
            if ((Math.abs(k-j)==Math.abs(y[j]-y[k])) || (y[j] == y[k]))
                return false;
        return true;
    }
    // 显示结果
    private void print() {
        System.out.println(count);
        for (int i=1;i<=N;i++) {
            for (int j=1;j<=N;j++)
                if (j == y[i])
                    System.out.print("x");    //如果该位置放了皇后则显示x
                else
                    System.out.print("o");
            System.out.println();
        }
    }
}