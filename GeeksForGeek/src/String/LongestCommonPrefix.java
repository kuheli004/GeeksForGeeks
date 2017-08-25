package String;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		 String arr[] = {"geeksforgeeks", "geeks",
                 "geek", "geezer","x"};
		 int n=arr.length;
		 System.out.println(CommonPrefix(arr,n));

	}

	private static String CommonPrefix(String[] arr, int n) {
		
		String prefix=arr[0];
		for(int i=1;i<n;i++) {
			 prefix=CommonPrefixUtils(prefix,arr[i]);
		}
		return prefix;
	}

	private static String CommonPrefixUtils(String str1, String str2) {
		String result="";
		for(int i=0,j=0;i<str1.length() && j<str2.length();i++,j++) {
			if(str1.charAt(i)!=str2.charAt(j))
				break;
			result+=str1.charAt(i);
		}
		return result;
		
	}

}
