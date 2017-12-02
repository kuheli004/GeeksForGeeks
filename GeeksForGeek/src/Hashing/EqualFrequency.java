 package Hashing;


public class EqualFrequency {

	public static void main(String[] args) {
		String str= "aabbccccc";
		System.out.println(possibleSameCharFreqByOneRemoval(str));

	}

	private static boolean possibleSameCharFreqByOneRemoval(String str) {
		int l=str.length();
		int freq[]=new int [26];
		
		for(int i=0;i<l;i++) {
			freq[getIdx(str.charAt(i))]++;
		}
		if(allSame(freq,26))
			return true;
		for(char c='a';c<='z';c++) {
			int i=getIdx(c);
			if(freq[i]>0)
				freq[i]--;
			if(allSame(freq,26))
				return true;
			freq[i]++;
		}
		return false;
	}

	private static boolean allSame(int[] freq, int N) {
		   int same = 0;
		   
		    //  get first non-zero element
		    int i=0;
		    for (i = 0; i < N; i++)
		    {
		        if (freq[i] > 0)
		        {
		            same = freq[i];
		            break;
		        }
		    }
		 
		    //  check equality of each element with variable same
		    for (int j = i+1; j < N; j++)
		        if (freq[j] > 0 && freq[j] != same)
		            return false;
		 
		    return true;
	}

	private static int getIdx(char c) {
		return c-'a';
	}

}
