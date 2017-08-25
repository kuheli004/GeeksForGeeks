package String;

public class LongestDistinctCharacter {

	public static void main(String[] args) {
		char str[]="ABDEFGABEF".toCharArray();
	    int len =  longestUniqueSubsttr(str);
	    System.out.println("The length of the longest non-repeating "
	    		+ "character substring is::"+len);

	}

	private static int longestUniqueSubsttr(char[] str) {
		int len=str.length;
		int curr_len=1;
		int max_len=1;
		int pev_index=0;
		int i;
		int visited[]=new int[256];
		for( i=0;i<256;i++)
			visited[i]=-1;
		visited[str[0]]=0;
		
		for(i=1;i<len;i++) {
			pev_index=visited[str[i]];
			
			 if (pev_index == -1 || i - curr_len > pev_index)
				 curr_len++;
			 else
			 {
			       if (curr_len > max_len)
		                max_len = curr_len;
		 
			       curr_len = i - pev_index;
			 }
			 visited[str[i]] = i;
		}
		if (curr_len > max_len)
	        max_len = curr_len;
		 return max_len;
		
	}

}
