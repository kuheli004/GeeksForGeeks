package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Problem2 {
	
	public static void main(String[] args) {
	
        
		   String exp = "a+b*(c^d-e)^(f+g*h)-i";
		
	
	        System.out.println(infixToPostfix(exp));

	}
	private static String infixToPostfix(String exp) {
		Stack<Character> s = new Stack();
		String result="";
		for(int i=0;i<exp.length();i++){
			
			char c=exp.charAt(i);
			if(c>='a' && c<='z')
				result+=c;
			else if(c=='(')
				s.push(c);
			else if(c==')'){
				System.out.println("before::"+s);
				while(!s.isEmpty() && s.peek()!='('){
				result+=s.pop();
			
				}
				System.out.println("after::"+s);
				if(!s.isEmpty() &&s.peek()!='(')
					return "invalid operation";
				else
					s.pop();
				System.out.println("after that::"+s);
			}
				else
				{
				
					while(!s.isEmpty() && (prec(c)<=prec(s.peek()))){
						result+=s.pop();
					}
				
					s.push(c);
					
				}}
			while(!s.isEmpty()){
				result+=s.pop();
			
			}
		return result;
		}
	

	private static int prec(char c) {
		switch(c){
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
			
		case '^':
			return 3;
		
	}
		return -1;
	}
	/*private   char  pop(Stack s) {
		if(isEmpty(s))
		{
			System.out.println("Underflow");
			return '1';
		}
		else
		return arr[s.top1--];
	}
	private   void push(Stack s,char i) {

		if(s.top1>=(MAX-1))
			System.out.println("Overflow");
		else{
		
			arr[++s.top1]=i;
		}
	}
	private   boolean isEmpty(Stack s) {
		return (s.top1<0?true:false);
	}*/

}
