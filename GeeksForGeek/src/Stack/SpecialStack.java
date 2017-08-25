package Stack;

import java.util.Stack;

public class SpecialStack {
	static Stack<Integer> st=new Stack<>();
	static Stack<Integer> aux=new Stack<>();
	static int min;
	public static void main(String[] args) {
		
		push(7);
		push(2);
		push(12);
		push(1);
		push(8);
		System.out.println(st);
		System.out.println("min is:::"+getMin());
		pop();
		pop();
		System.out.println("min is:::"+getMin());
	}

	private static int getMin() {
		// TODO Auto-generated method stub
		return st.peek();
	}

	private static void pop() {
		if(!st.isEmpty()){
		st.pop();
		}
	}

	private static void push(int i) {
		if(st.isEmpty()){
			st.push(i);
			min=i;
		}
		else
		{
			if(i<min){
				st.push(i);
			min=i;
			}
			else
				st.push(min);
		}
		
	}

/*	private static void pop() {
		if(!st.isEmpty() && !aux.isEmpty()){
			st.pop();
			aux.pop();
		}
		
	}*/

/*	private static int getMin() {
		if(!aux.isEmpty())
		return aux.peek();
		else
			return -1;
	}
*/
/*	private static void push(int i) {
			if(st.isEmpty() && aux.isEmpty())
			{
				st.push(i);
				aux.push(i);
			}
			else
			{
				st.push(i);
				int y=aux.peek();
				if(i<y)
					aux.push(i);
				else
					aux.push(y);
			}
		
	}*/
}
