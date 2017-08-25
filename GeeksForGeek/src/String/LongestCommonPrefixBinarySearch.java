package String;

public class LongestCommonPrefixBinarySearch {

	public static void main(String[] args) {
		 String arr[] = {"geeksforgeeks", "geeks",
                 "geek", "geezer"};
		 int n=arr.length;
		 System.out.println(CommonPrefix(arr,n));
	}

	private static String CommonPrefix(String[] arr, int n) {
	int index=findMinLen(arr,n);
	int low=0,high=index-1;
	String prefix="";
	while(low<=high) {
		int mid=(low+(high-low)/2);
		if(allcontainsPrefix(arr,n,arr[0],low,mid)) {
			prefix+=arr[0].substring(low, mid+1);
		low=mid+1;
		}
		else
			high=mid-1;
		
	}
	
	return prefix;
	
	}


	private static boolean allcontainsPrefix(String[] arr, int n, String str, int low, int high) {
			
		for(int i=0;i<=n-1;i++) {
			for(int j=low;j<=high;j++) {
				if(arr[i].charAt(j)!=str.charAt(j))
					return false;
			}
			
		}
		return true;
	}

	private static int findMinLen(String[] arr, int n) {
		int min=arr[0].length();
		for(int i=1;i<n;i++) {
			if(arr[i].length()<min)
				min=arr[i].length();
		}
		return min;
	}

}
