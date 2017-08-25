package BackTracking;

import java.util.HashSet;

public class SolveSoduku {


	  static int N  =4;
	  public static void main(String args[]){
	    char[][] board = {{'1', '4', '2', '.'},
	                      {'2', '3', '.', '1'},
	                      {'4', '.', '.', '2'},
	                      {'3', '.', '.', '.'}};
	      
	    
	      solveSudoku(board);
	      printGrid(board);
	  }
	  private static void printGrid(char[][] grid) {
		    for (int row = 0; row < N; row++)
		    {
		       for (int col = 0; col < N; col++)
		       {
		        System.out.print(grid[row][col]+" "); 
		       }
		       System.out.println();
		 
		    }
		    
		  }
		  
		  public static void solveSudoku(char[][] board) {
		    solve(board);
		}
		 
		public static boolean solve(char[][] board){
		    for(int i=0; i<4; i++){
		        for(int j=0; j<4; j++){
		            if(board[i][j]!='.')
		                continue;
		 
		            for(int k=1; k<=4; k++){
		                board[i][j] = (char) (k+'0');
		                if(isValid(board, i, j) && solve(board))
		                    return true;
		                board[i][j] = '.';    
		            }
		 
		            return false;
		        }
		    }
		 
		    return true; // does not matter
		}
		 
		public static boolean isValid(char[][] board, int i, int j){
		    HashSet<Character> set = new HashSet<Character>();
		 
		    for(int k=0; k<4; k++){
		        if(set.contains(board[i][k]))
		            return false;
		 
		        if(board[i][k]!='.' ){
		            set.add(board[i][k]);
		        }
		    }
		 
		    set.clear();
		 
		    for(int m=0; m<2; m++){
		        for(int n=0; n<2; n++){
		            int x=i/2*2+m;
		            int y=j/2*2+n;
		            if(set.contains(board[x][y]))
		                return false;
		 
		            if(board[x][y]!='.'){
		                set.add(board[x][y]);
		            }    
		        }
		    }
		 
		    return true;
		}

		
}
