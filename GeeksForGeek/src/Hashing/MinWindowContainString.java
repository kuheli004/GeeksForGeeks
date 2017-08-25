package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class MinWindowContainString {

	  static final int no_of_chars = 26;
	     
	  public static String minWindow(String S1 , String T1){
		    int sLen = S1.length();
		    int tLen = T1.length();
		    
		    char[] S = S1.toCharArray();
		    char[] T = T1.toCharArray();
		    
		    int minWinLen= sLen;
		    
		    int[] need = new int[26];
		    Arrays.fill(need , 0);
		    
		    for(int i=0; i<tLen ; i++)
		        need[T[i]-'a']++;
		        
		    int[] has = new int[26];
		    
		    int end=0;
		    int count = 0;
		    
		    int x = 0 , y = 0;
		    
		    for(int begin=0 ; end < sLen ; end++)
		    {
		        if(need[S[end]-'a'] == 0) continue;
		        
		        has[S[end]-'a']++;
		        
		        if(has[S[end]-'a'] <= need[S[end]-'a'] )
		            count++;
		        
		        if(count == tLen)
		        {
		            while( need[S[begin]-'a'] == 0 || has[S[begin]-'a'] > need[S[begin]-'a'] )
		            {
		                if (has[S[begin]-'a'] > need[S[begin]-'a'])
		                    has[S[begin]-'a']--;
		                
		                begin++;
		            }
		            
		            int winLen = end - begin + 1;

		            if(winLen<minWinLen)
		            {
		                minWinLen = winLen;
		                x = begin;
		                y = end;
		                
		            }
		                
		        }
		    }
		    return S1.substring(x,y+1);
		}
	    // Driver Method
	    public static void main(String[] args)
	    {
	        String str = "zoomlazapzo";
	        String pat = "oza";
	      
	       System.out.print("Smallest window is :  n" +
	    		   minWindow(str, pat));
	    }

}
