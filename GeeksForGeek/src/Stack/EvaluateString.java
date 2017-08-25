package Stack;

import java.util.Stack;

public class EvaluateString {

	public static void main(String[] args) {
		System.out.println(EvaluateString.evaluate("10 + 2 * 6"));
        System.out.println(EvaluateString.evaluate("100 * 2 + 12"));
        System.out.println(EvaluateString.evaluate("100 * ( 2 + 12 )"));
        System.out.println(EvaluateString.evaluate("100 * ( 2 + 12 ) / 14"));

	}

	private static int evaluate(String exp) {
		char token[]=exp.toCharArray();
		Stack<Integer> value=new Stack<>();
		Stack<Character> oper=new Stack<>();
		int result=0,a=0,b=0;
		for(int i=0;i<token.length;i++){
			if(token[i]>='1'|| token[i]<='9')
				value.push((int)token[i]);
			else if(token[i]=='(')
				oper.push(token[i]);
			else if(token[i]==')')
			{
				while(!oper.isEmpty() 
						&& oper.peek()!='(')
				{
					char op=oper.pop();
					if(!value.isEmpty())
					 a=value.pop();
					if(!value.isEmpty())
					 b=value.pop();
					result+=applyOp(op,a,b);
				}
			}
		}
		return result;
	}

	private static int applyOp(char op, int a, int b) {
	switch(op){
	case '+':
		return a+b;
	case '-':
		return a-b;
	case '*':
		return a*b;
	case '/':
		if(b==0)
		throw new UnsupportedOperationException("Cannot divide by zero");
		return a/b;
	}
		return 0;
	}

}
