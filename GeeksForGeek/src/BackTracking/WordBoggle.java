package BackTracking;

public class WordBoggle {
	static String dictionary[]= {"HI", "FOR", "BIE"};
	static int M=2,N=2;
	public static void main(String[] args) {
		   char boggle[][] = {{'H','I'},
				   			  {'B','E'}};
		   
		   findWords(boggle);

	}

	private static void findWords(char[][] boggle) {
		boolean visited[][]=new boolean [M][N];
	
		String str="";
		 for (int i=0; i<M; i++)
		       for (int j=0; j<N; j++)
		             findWordsUtil(boggle, visited, i, j, str);
		
	}

	private static void findWordsUtil(char[][] boggle, boolean[][] visited, int i, int j, String str) {
		 visited[i][j] = true;
		    str = str + boggle[i][j];
		    
		    if(isWord(str))
		    	System.out.println(str);
		    for (int row=i-1; row<=i+1 && row<M; row++)
		        for (int col=j-1; col<=j+1 && col<N; col++)
		          if (row>=0 && col>=0 && !visited[row][col])
		            findWordsUtil(boggle,visited, row, col, str);
		    
		    str=str.substring(0,str.length()-1);
		    visited[i][j] = false;
	}

	private static boolean isWord(String str) {
		 for (int i=0; i<dictionary.length; i++)
		        if (str.equals(dictionary[i]))
		          return true;
		    return false;
	}

}
