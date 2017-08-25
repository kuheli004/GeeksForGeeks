package Stack;

import java.util.Stack;

public class SortStack {
	static Stack<Integer> st=new Stack<>();
	public static void main(String[] args) {
		
		st.push(-3);
		st.push(14);
		st.push(18);
		st.push(-5);
		st.push(30);
	
		System.out.println(st);
			reverse();
		System.out.println(st);

	}

	private static void reverse() {

		if(!st.isEmpty()){
			int  c=st.peek();
			st.pop();
			reverse();
			insert(c);
		}
		
	}

	private static void insert(int c) {

		if(st.isEmpty()){
			st.push(c);
		}
		else
		{
			int	a=st.peek();
		
			if(c<a){
				st.pop();
			insert(c);
			st.push(a);
			}
			else
				st.push(c);
			}
		
		
				
		}
		
	}

