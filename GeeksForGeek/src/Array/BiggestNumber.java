package Array;

import java.util.Arrays;
import java.util.Comparator;

public class BiggestNumber {
	static String arr[]={"54", "546", "548", "60"};
	public static void main(String[] args) {
		  Arrays.sort(arr,new Comparator<String>() 
				    {
				  
				        public int compare(String a, String b) 
				        {
				            String s1 = a + b;
				            String s2 = b + a;
				            return s2.compareTo(s1);
				        }
				    });
		  for(int i=0 ; i< arr.length ; i++)
		        System.out.print(arr[i]);
	}

}
