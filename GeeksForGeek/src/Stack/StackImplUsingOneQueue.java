package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplUsingOneQueue {

	 Queue<Integer> q1 = new LinkedList<Integer>();
	    

	    public int pop() {
	        if (q1.peek() == null) {
	            System.out.println("The stack is empty, nothing to return");
	            int i = 0;
	            return i;
	        } else {
	        	
	        	return q1.poll();
	        }
	    }

	    public void push(int data) {
	    q1.add(data);
	    		for(int i=q1.size()-1;i>0;i--)
	    		{
	    			int a=q1.peek();
	    			q1.poll();
	    			q1.add(a);
	    		}
	    }
	
	public static void main(String[] args) {
		StackImplUsingOneQueue s1 = new StackImplUsingOneQueue();
	        //       Stack s1 = new Stack();
	        s1.push(1);
	        s1.push(2);
	        s1.push(3);
	        s1.push(4);
	        s1.push(5);
	        s1.push(6);
	        s1.push(7);
	        System.out.println(s1.q1);
	      
	        System.out.println("1st = " + s1.pop());
	        System.out.println("2nd = " + s1.pop());
	        System.out.println("3rd = " + s1.pop());
	        System.out.println("4th = " + s1.pop());
	        System.out.println("5th = " + s1.pop());
	        System.out.println("6th = " + s1.pop());
	        System.out.println("7th = " + s1.pop());

	}

}
