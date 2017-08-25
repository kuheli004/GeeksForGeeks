package String;

public class LongestCommonString {

	public static void main(String[] args) {
	String str1="ABCDF";
	String str2="ZCDS";
	System.out.print(lcs(str1.toCharArray(),str2.toCharArray()));

	}

	private static int lcs(char[] str1, char[] str2) {
		int temp[][]=new int[str1.length][str2.length];
		int max=0;
		for(int i=0;i<temp.length;i++){
			for(int j=0;j<temp[i].length;j++){
					if(str1[i]==str2[j])
						temp[i][j]=temp[i-1][j-1]+1;
					
					if(temp[i][j]>max)
						max=temp[i][j];
						
						
			}
				
		}
		return max;
		
	}

}
