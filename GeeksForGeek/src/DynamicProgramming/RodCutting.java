package DynamicProgramming;

class RodCutting
{
    /* Returns the best obtainable price for a rod of
       length n and price[] as prices of different pieces */
    static int cutRod(int price[],int n,int len)
    {
        int val[][] = new int[n+1][len+1];
       
 
        // Build the table val[] in bottom up manner and return
        // the last entry from the table
        for (int i = 0; i<=n; i++)
        {
        	for(int j=0;j<=len;j++) {
        		if(i==0|| j==0)
        			val[i][j]=0;
        		else if(j>=i) 
        			val[i][j]=Math.max(val[i-1][j],price[i-1]+val[i][j-i]);
        			else
        				val[i][j]=val[i-1][j];
        		}
        	}
        	
        	
           /* int max_val = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++)
                max_val = Math.max(max_val, 
                                   price[j] + val[i-j-1]);
            val[i] = max_val;*/
        
 
        return val[n][len];
    }
 
    /* Driver program to test above functions */
    public static void main(String args[])
    {
        int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
        int size = arr.length;
        int len=8;
        System.out.println("Maximum Obtainable Value is " +
                            cutRod(arr, size,len));
    }
}