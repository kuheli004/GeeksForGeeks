package Stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
	static Stack<Integer> st=new Stack<>();

	public static void main(String[] args) {
		int arr[]={100, 80, 60, 70, 60, 75, 85};
		int s[]=new int[7];
		calculateSpan(arr,7,s);
		System.out.println(Arrays.toString(s));
	}

	private static void calculateSpan(int[] price, int n, int[] S) {
		S[0]=1;
		st.push(0);
		   for (int i = 1; i < n; i++)
		   {
		      while (!st.empty() && price[st.peek()] <= price[i])
		         st.pop();
		 
		      
		      S[i] = (st.empty())? (i + 1) : (i - st.peek());
		 
		      // Push this element to stack
		      st.push(i);
		   }
		
	}

}
