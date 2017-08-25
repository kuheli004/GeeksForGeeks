package Array;

public class MaxNonContSubArray {
	static int  arr[]={5, 5, 10, -100, -10, -5};
	public static void main(String[] args) {
	int incl=arr[0];
	int excl=0;
	int excl_new=0  ;
	
	for(int i=1;i<arr.length;i++){
		excl_new=excl<incl?incl:excl;
		
		incl=excl+arr[i];
		excl=excl_new;
		
	
	}
	excl_new=excl<incl?incl:excl;
	System.out.println(excl_new);

	}

}
