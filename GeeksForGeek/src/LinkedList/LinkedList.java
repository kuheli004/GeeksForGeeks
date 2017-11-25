package LinkedList;

public class LinkedList {
	Node head;
	 static class Node{
			int data;
			Node next;
			Node(int data){
				this.data=data;
				this.next=null;
			}
	
	 }
	
	
	public static void main(String[] args) {
	
		LinkedList li=new LinkedList();
		Node first=new Node(1);
		Node two=new Node(2);
		Node three=new Node(3);
		Node four=new Node(4);
		Node five=new Node(5);
		Node six=new Node(6);
		li.head=first;
		li.head.next=two;
		li.head.next.next=three;
		three.next=four;
		four.next=five;
		five.next=six;
		printList(li.head);
		System.out.println();
		findMiddle(li.head);
		
		
	}



	private static void findMiddle(Node head) {
		if(head==null|| head.next==null)
			System.out.println(head.data);
		else
		{
			Node fast=head;
			Node slow=head;
			while(fast!=null && fast.next!=null) {
				fast=fast.next.next;
				slow=slow.next;
			}
			System.out.println(slow.data);
		}
	
		
		
	}



	private static void printList(Node head) {
		if(head==null|| head.next==null)
			System.out.println(head.data);
		else {
			Node t=head;
			while(t!=null) {
				System.out.print(t.data+"---->");
				t=t.next;
			}
		}
		
	}



}
