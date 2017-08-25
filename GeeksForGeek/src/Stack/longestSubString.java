package Stack;

import java.util.Stack;

public class longestSubString {
	static Stack<Character> st=new Stack<>();
	public static void main(String[] args) {
		String str="((()";
		int count=0;
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(c=='(')
				st.push(c);
			else 
			{
				if(!st.isEmpty()){
					
					char a=st.peek();
					if(a=='('){
						st.pop();
						count+=2;
					}
					else
						st.push(c);
				}
			}
		}
		System.out.print(count);

	}

}
