public class EightQueen{


	static int[][] board;

	static boolean isPossible(int N,int row,int col){
		for(int i =0;i<row;i++){//检查同一列
			if(board[i][col]==1){
				return false;
			}
		}
		for(int i = row-1,j=col-1;i>=0&&j>=0;i--,j--){//检查对角线，左下角
			if(board[i][j]==1){
				return false;
			}
		}
		for(int i=row-1,j=col+1;i>=0&&j<N;i--,j++){//检查右上角
			if(board[i][j]==1){
				return false;
			}
		}
		return true;
	}

	static void placeNQueens(int N ,int row){
		if(row == N){
			for(int i = 0; i<N;i++){
				for(int j = 0;j<N;j++){
					System.out.print(board[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("\n/=================/\n");
			return;
		}
		for(int i=0;i <N;i++){
			if(isPossible(N,row,i)){
				board[row][i]=1;
				placeNQueens(N,row+1);
			}
			board[row][i]=0;
		}
	}

	public static void main(String[] args){
		
		int N = 8;
		board = new int[N][N];
		placeNQueens(N,0);
	}
}

