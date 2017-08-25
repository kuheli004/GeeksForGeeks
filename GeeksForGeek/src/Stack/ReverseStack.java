package Stack;

import java.util.Stack;

public class ReverseStack {
	 static Stack<Character> st = new Stack<>();
	public static void main(String[] args) {
	     st.push('1');
	     st.push('2');
	     st.push('3');
	     st.push('4');
         
        System.out.println("Original Stack");
         
        System.out.println(st);
      
      
        reverse();
         
        System.out.println("Reversed Stack");
         
        System.out.println(st);

	}
	private static void reverse() {
	if(!st.isEmpty()){
		char c=st.peek();
		
		st.pop();
		reverse();
		insertBottom(c);
	}
		
	}
	private static void insertBottom(char c) {
	
	if(st.isEmpty())
		st.push(c);
	else{
		char a=st.peek();
		st.pop();
		insertBottom(c);
		st.push(a);
	}
	
		
	}

}
