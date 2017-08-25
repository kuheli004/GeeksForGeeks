package Stack;

import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		String s="{()}[]";
		boolean f=true;
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c=='('||c=='{'||c=='[')
				st.push(c);
			else if(c==')'||c=='}'||c==']')
			{
				char k=st.peek();
				if(!isMatchingPair(k,c))
				{	
					f=false;
					break;
				}
				else
					st.pop();
			}
		}
		if(f)
			System.out.println("Balanced");
		else
	
			System.out.println("Not Balanced");

			
		}
	

	private static boolean isMatchingPair(char k, char c) {
	
		if(k=='(' && c==')')
			return true;
		else if(k=='{' && c=='}')
			return true;
		else if(k=='[' && c==']')
			return true;
		else
			return false;
	}
		

}
