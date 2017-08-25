package Stack;

import java.util.Stack;

public class EvaluatePostFix {
	 static Stack<Integer> st=new Stack<>();
	public static void main(String[] args) {
	String exp="23*69*+";
	int result=PostFixEvaluate(exp);
	System.out.println(result);

	}

	private static int PostFixEvaluate(String exp) {
		int result=0;
		for(int i=0;i<exp.length();i++){
			
			char c=exp.charAt(i);
			
			if(c>='0' && c<='9'){
				st.push(c-'0');
				
			}
					
			else {
				if(!st.isEmpty()){
				int a=st.pop();
				int b=st.pop();
				switch(c){
				case '+':
					st.push(a+b)  ;
					break;
				case '-':
					st.push(a-b)  ;
					break;
				case '*':
					st.push(a*b)  ;
					break;
				case '/':
					if(b==0)
					throw new UnsupportedOperationException("Cannot divide by zero");
					st.push(a/b)  ;
					break;
				}
				}
			
			}
				
		}
		return st.pop();
	}
	
}
