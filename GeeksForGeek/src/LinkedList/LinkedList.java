package LinkedList;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class LinkedList {
	static Node head;
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
		Node five=new Node(1);
		Node six=new Node(2);
		Node seven=new Node(3);
		Node eight=new Node(10);
		Node nine=new Node(-18);
		Node ten=new Node(20);
		Node ele=new Node(25);
		head=first;
		head.next=two;
		head.next.next=three;
		three.next=four;
		four.next=five;
		five.next=six;
		six.next=seven;
		/*seven.next=eight;
		eight.next=nine;
		nine.next=ten;
		ten.next=ele;*/
	//	printList(li.head);
		System.out.println();
	//	findMiddle(li.head);
	//	DeleteMid(li.head);
	//	RemoveDupFromSortedList(li.head);

		printList(head);
		RemoveDupFromUnSortedList(head);
	//	DeleteElementSumEqualToZero(li.head);
		//ReverseLinkedList(li.head);
		//head=addOne(head);
		//head=recursiveAddOne(head);
	//	head=reverseInGroup(head,3);
		//System.out.println("Loop is there::::"+isLoop(head));
		//RemoveLoop(head);
		printList(head);
		
	}



	private static void RemoveDupFromUnSortedList(Node head) {
		Set<Integer> hs=new HashSet<Integer>();
		Node temp=head;
		Node prev=null;
		while(temp!=null) {
			if(!hs.contains(temp.data)) {
				hs.add(temp.data);
				prev=temp;
			}
			else
			{
				prev.next=temp.next;
			}
			temp=temp.next;
		}
		
		
	}



	private static void RemoveLoop(Node head) {
		Node slow=head;
		Node fast=head;
		boolean flag=false;
		while(slow!=null && fast!=null && fast.next!=null) {
				slow=slow.next;
				fast=fast.next.next;
				if(fast==slow) {
					flag=true;
					break;
					}
				}
			
		if(flag) {
			slow=head;
			while(slow.next!=fast.next) {
				slow=slow.next;
				fast=fast.next;
		}
			fast.next=null;
		}
	}
	
		



	private static boolean isLoop(Node head) {
		Node slow=head;
		Node fast=head;
		while(slow!=null && fast!=null && fast.next!=null) {
				slow=slow.next;
				fast=fast.next.next;
				if(fast==slow)
				return true;
		}
		
		return false;
	}



	private static Node reverseInGroup(Node head, int k) {
		Node prev=null;
		Node curr=head;
		Node next=null;
		int count=1;
		while(curr!=null && count<=k) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			count++;
		}
		if(next!=null)
		head.next=reverseInGroup(next,k);
	//	printList(prev);
		return prev;
		
	}



	private static Node recursiveAddOne(Node head) {
		int carry=addWithCarry(head);
		if(carry>0) {
			Node newNode=new Node(carry);
			newNode.next=head;
			return newNode;
			
		}
		return head;
	}



	private static int addWithCarry(Node head) {
		if(head==null)
			return 1;
		int res=head.data+addWithCarry(head.next);
		head.data=res%10;
		return res/10;
	}



	private static Node addOne(Node head) {
		head=ReverseLinkedList(head);
		head=addOneUtils(head);
		return ReverseLinkedList(head);
	
	}



	private static Node addOneUtils(Node head) {
		Node res=head;
		Node temp = null;
		int carry=1,sum=0;
		while(head!=null) {
			sum=carry+head.data;
			carry=(sum>=10)?1:0;
			sum=sum%10;
			head.data=sum;
			temp=head;
			head=head.next;
		}
		if(carry>0) 
			temp.next=new Node(carry);
			return res;
		
		
	}



	private static Node ReverseLinkedList(Node head) {
		Node prev=null;
		Node curr=head;
		Node next=null;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
	//	printList(prev);
		return prev;
	}



	private static void DeleteElementSumEqualToZero(Node head) {
		System.out.print("*******Delete Element Sum Equal To Zero**********");
		if (head == null)
		{
			System.out.println("NULL");
		}
		Stack<Node> stack = new Stack<Node>();
		Node node = head;  	
		while(node != null)
		{
			if (node.data < 0)
			{
				int sum = node.data;
	                        while (!stack.isEmpty())
				{
					Node temp = stack.pop();
					sum += temp.data;
					temp = null;
					if (sum == 0)
					{
						//node = stack.pop();
						break;
					}
				}
			}
			else
			{
				stack.push(node);
			}
			node = node.next;
		}
		System.out.println();
		while(!stack.isEmpty()) {
			System.out.print(stack.pop().data+" ");
		}

        
		
	}



	private static void RemoveDupFromSortedList(Node head) {
		System.out.println("*********Program To Remove Duplicate Element From Sorted List***********");
		Node temp=head;
		while(temp!=null) {
			while(temp.next!=null && temp.data==temp.next.data)
				temp.next=temp.next.next;
			
			temp=temp.next;
		}
		printList(head);
	}



	private static void DeleteMid(Node head) {
		System.out.println("******Program To Delete Middle Element********");
		if(head.next==null)
		{
			head=null;
			System.out.println(head.data);
		}
		else
		{
			Node fast=head;
			Node slow=head;
			Node prev=head;
			while(fast!=null && fast.next!=null) {
				fast=fast.next.next;
				prev=slow;
				slow=slow.next;
			}
			prev.next=slow.next;
			printList(head);
		}
	
		
		
	}



	private static void findMiddle(Node head) {
		System.out.println("******Program To Find Middle Element********");
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
		System.out.println();
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
