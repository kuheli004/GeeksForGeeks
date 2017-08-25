package Queue;

import java.util.LinkedList;
import java.util.Stack;

public class QueueUsingStack {
	Stack<Integer> st1=new Stack<Integer>();
	Stack<Integer> st2=new Stack<Integer>();
	public static void main(String[] args) {
		
		QueueUsingStack q=new QueueUsingStack();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		System.out.println(q.dequeue() +" is dequeed");
		q.enqueue(50);
		q.enqueue(60);
		System.out.println(q.dequeue()+" is dequeed");
		System.out.println("Size is::"+q.size());
		System.out.println("Empty::"+q.isEmpty());
		System.out.println("front is "+q.front());
	}
	private int front() {
		if(st2.isEmpty()){
			while(!st1.isEmpty()){
				st2.push(st1.pop());	
			}
				}
			
			return st2.peek();
	}
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return (st1.isEmpty() && st2.isEmpty());
	}
	private int size() {
		// TODO Auto-generated method stub
		return st1.size()+st2.size();
	}
	private int dequeue() {
		if(st2.isEmpty()){
	while(!st1.isEmpty()){
		st2.push(st1.pop());	
	}
		}
	
	return st2.pop();
	}
	private void enqueue(int i) {
			st1.add(i);
			System.out.println(i +" is enqueued");
		
	}

}
