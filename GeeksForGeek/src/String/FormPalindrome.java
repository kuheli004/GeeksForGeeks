package String;

public class FormPalindrome {
	
	public static void main(String args[]) {
	char ch[]= {'J','A','V','A'};
	int n=ch.length;
		System.out.println(findMinInsert(ch,n));
	}

	private static int findMinInsert(char[] ch, int n) {
		for(int i=n-1;i>=0;i--) {
			if(ispalin(ch,0,i))
				return (n-i-1);
		}
		return -1;
	}

	private static boolean ispalin(char[] ch, int low, int high) {
		while(low<high) {
			if(ch[low]!=ch[high])
				return false;
			low++;
			high--;
		}
		return true;
	}

	
}

