package Stack;

import java.util.Stack;

public class BalancedExp {

	public static void main(String[] args) {
		String s="}{{}}{{{";
		int m=0,n=0;
		Stack<Character> st=new Stack<>();
		if(s.length()%2==0){
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c=='{')
				st.push(c);
			else if(c=='}')
			{
				if(!st.isEmpty()){
				char k=st.peek();
				if(k=='{')
					st.pop();
				else
					st.push(c);
				}
				else	
					st.push(c);
					
			}
		}
		while(!st.isEmpty())
		{
			char c=st.peek();
			if(c=='{')
				m++;
			else
				n++;
			st.pop();
		}
	
		System.out.println(((m+n)/2)+m%2);	
		}
	
	else
	{
		System.out.println(" Can't be made balanced using reversals");
			
	}


	}
}
