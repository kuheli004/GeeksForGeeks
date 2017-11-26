package LinkedList;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class LinkedList {
	 Node head;
	 static class Node{
			int data;
			Node next;
			Node down;
			Node(int data){
				this.data=data;
				this.next=null;
				this.down=null;
			}
	
	 }
	
	
	public static void main(String[] args) {
	
		LinkedList li=new LinkedList();
		Node first=new Node(1);
		Node two=new Node(2);
		Node three=new Node(2);
		Node four=new Node(1);
		Node five=new Node(0);
		Node six=new Node(1);
		Node seven=new Node(2);
		Node eight=new Node(1);
		Node nine=new Node(0);
		Node ten=new Node(20);
		Node ele=new Node(25);
		li.head=first;
		li.head.next=two;
		li.head.next.next=three;
		three.next=four;
		four.next=five;
		five.next=six;
		six.next=seven;
		seven.next=eight;
		eight.next=nine;
		LinkedList li2=new LinkedList();
		Node a=new Node(1);
		Node b=new Node(3);
		Node c=new Node(5);
		Node d=new Node(7);
		Node i=new Node(6);
		li2.head=a;
		a.next=b;
		b.next=c;
		c.next=d;
		//d.next=i;
		LinkedList li3=new LinkedList();
		Node e=new Node(2);
		Node f=new Node(4);
		Node g=new Node(6);
		Node h=new Node(8);
		
		li3.head=e;
		e.next=f;
		f.next=g;
		g.next=h;
		
		/*eight.next=nine;
		nine.next=ten;
		ten.next=ele;*/
	//	printList(li.head);
		
	//	findMiddle(li.head);
	//	DeleteMid(li.head);
	//	RemoveDupFromSortedList(li.head);

		//printList(head);
		//RemoveDupFromUnSortedList(head);
	//	DeleteElementSumEqualToZero(li.head);
		//ReverseLinkedList(li.head);
		//head=addOne(head);
		//head=recursiveAddOne(head);
	//	head=reverseInGroup(head,3);
		//System.out.println("Loop is there::::"+isLoop(head));
		//RemoveLoop(head);
		//NthNodeFromEnd(head,3);
		//head=RotateLinkedList(head,4);
		//Node l=MergeTwoSortedList(li2.head,li3.head);
		//Node n=PairWiseSwap(li.head);
	//	Node n=addTwoNumByLinkedList(li2.head,li3.head);
		//System.out.println(isPalindrome(li.head));
		//Node n=flattenList(li.head);
		//Node n=mergeAtAlternatePos(li2.head,li3.head);
		//Node n=skipMDeleteN(li.head,4,2);
		//Node n=deleteLastOccur(li.head,2);
		//Node n=reverseAlternateKNode(li.head,3);
		Node n=sortListWih0s1s2s(li.head);
		
		printList(n);
		
	}


	private static Node sortListWih0s1s2s(Node head) {
		int count[]= {0,0,0};
		Node curr=head;
		while(curr!=null) {
			count[curr.data]++;
			curr=curr.next;
		}
		int i=0;
		curr=head;
		while(curr!=null) {
			if(count[i]==0) {
				
				i++;
			}
			else {
				curr.data=i;
				curr=curr.next;
				count[i]--;
				
			}
			
				
		}
		return head;
	}


	private static Node reverseAlternateKNode(Node head,int k) {
		Node curr=head;
		Node prev=null;
		Node next=null;
		
		int count=0;
		while(curr!=null && count<k) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			count++;
		}
		if(head!=null)
			head.next=curr;
	
			count=0;
			while(curr!=null && count<k-1){
				curr=curr.next;
				count++;
			}
			if(curr!=null) {
				curr.next=reverseAlternateKNode(curr.next,k);
			}
			
		return prev;
		
	
	}


	private static Node deleteLastOccur(Node head, int key) {
			Node curr=head;
			Node prev=null;
			Node x=null;
			while(curr!=null) {
				if(curr.data==key) {
					x=prev;
					x.next=curr;
					curr=curr.next;
				}
				else {
					prev=curr;
					curr=curr.next;				
					}
			}
				if(x!=null && x.next.data!=key)
					x.next=x.next.next;
				
			
			return head;
	}


	private static Node skipMDeleteN(Node head,int M,int N) {
	
		Node curr=head;
		Node next=null;
		while(curr!=null) {
		for(int i=0;i<M-1  && curr!=null;i++) {
			curr=curr.next;
		}
		if(curr==null)
			return head;
		next=curr.next;
		for(int i=0;next!=null && i<N ;i++) {
			next=next.next;
		}
		if(curr!=null)
		curr.next=next;
		
		curr=next;
		}
		return head;
		
	}







	private static Node mergeAtAlternatePos(Node head1, Node head2) {
		Node p_curr=head1;
		Node q_curr=head2;
		Node p_next=null,q_next=null;
		while(p_curr!=null && q_curr!=null) {
			p_next=p_curr.next;
			q_next=q_curr.next;
			
		
			q_curr.next=p_next;
			p_curr.next=q_curr;
			
			p_curr=p_next;
			q_curr=q_next;
		}
		
		return head1;
		
	}







	private static Node flattenList(Node head) {
		if(head==null|| head.next==null) {
			return head	;
		}
		head.next=flattenList(head.next);
		head=merge(head,head.next);
		return head;	
	}







	private static Node merge(Node a, Node b) {
		  if (a == null)     return b;
		  
	        // if second linked list is empty then first
	        // is the result
	        if (b == null)      return a;
	 
	        // compare the data members of the two lonked lists
	        // and put the larger one in the result
	        Node result;
	 
	        if (a.data < b.data)
	        {
	            result = a;
	            result.down =  merge(a.down, b);
	        }
	 
	        else
	        {
	            result = b;
	            result.down = merge(a, b.down);
	        }
	 
	        return result;
	}







	

	private static boolean isPalindrome(Node head) {
		Node p=head;
		Node n=ReverseLinkedList(head);
		
		while(p!=null && n!=null) {
			if(p.data!=n.data)
				return false;
			p=p.next;
			n=n.next;
		}
		return true;
		
	}







	private static Node addTwoNumByLinkedList(Node head1, Node head2) {
		Node n=null;
		Node head=null;	
		int sum=0;
		int carry=0;
		while(head1!=null|| head2!=null) {
			 sum=carry+(head1!=null?head1.data:0)+(head2!=null?head2.data:0);
			 carry=(sum>=10)?1:0;
			sum=sum%10;
			if(n!=null) {
			n.next=new Node(sum);
			n=n.next;
			}
			else {
				n=new Node(sum);
				head =n;
			}
			if(head1!=null)
			head1=head1.next;
			if(head2!=null)
			head2=head2.next;
			
			
		}
		if(carry>0)
			n.next=new Node(carry);
		return head;
		
	}







	private static Node PairWiseSwap(Node head) {
		Node temp=head;
		while(temp!=null && temp.next!=null) {
			int k=temp.data;
			temp.data=temp.next.data;
			temp.next.data=k;
			
			temp=temp.next.next;
		}
		
		return head;
		
	}







	private static Node MergeTwoSortedList(Node head1, Node head2) {
		Node finalList=null;
		if(head1==null)
			return head2;
		if(head2==null)
			return head1;
		if(head1.data<=head2.data) {
			finalList=head1;
			finalList.next=MergeTwoSortedList(head1.next,head2);
		}
		else
		{
			finalList=head2;
			finalList.next=MergeTwoSortedList(head1,head2.next);
		}
		return finalList;
		
	}







	private static Node RotateLinkedList(Node head,int k) {
		Node curr=head;
		int count=0;
		while(count<k-1 && curr!=null)
		{
			count++;
			curr=curr.next;
		}
		Node kthNode=curr;
		while(curr.next!=null)
			curr=curr.next;
		curr.next=head;
		head=kthNode.next;
		kthNode.next=null;
		
		return head;
		
	}







	private static void NthNodeFromEnd(Node head,int n) {
	Node fast=head;
	Node slow=head;
	for(int i=0;i<n;i++) {
		fast=fast.next;
	}
	while(fast!=null) {
		fast=fast.next;
		slow=slow.next;
	}
	System.out.println(slow.data);
		
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
