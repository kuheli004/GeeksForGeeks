package Stack;

public class FindMiddle {
	StackNode middle;
	StackNode last;
	boolean flag;
	FindMiddle(){
		middle=null;
		last =null;
		flag=false;
	}
	void push(int data){
		StackNode s=new StackNode();
		s.data=data;
		if(last==null)
		{
			last=s;
			middle=s;
			flag=true;
		}
		else{
			StackNode temp=last;
			last=s;
			temp.next=last;
			last.prev=temp;
			flag=!flag;
			if(flag)
				middle=middle.next;
		}
	}
	void print(){
		StackNode temp=last;
		while(temp!=null)
		{
			System.out.print(temp.data+"--->");
			temp=temp.prev;
		}
		System.out.println();
	}
	int getMiddle(){
		return middle.data;
	}
	void deleteMiddle(){
		StackNode temp=middle;
		temp.prev.next=middle.next;
		middle.next.prev=temp.prev;
		flag=!flag;
	
		if(!flag)
		middle=middle.prev;
	}

	public static void main(String[] args) {
		FindMiddle f=new FindMiddle();
		f.push(1);
		f.push(2);
		f.push(3);
		f.push(4);
		f.push(5);
		f.print();
		System.out.println();
		System.out.println(f.getMiddle());
		f.deleteMiddle();
		f.print();
		System.out.println(f.getMiddle());
		f.deleteMiddle();
		f.print();
		System.out.println(f.getMiddle());
		f.deleteMiddle();
		f.print();
		System.out.println(f.getMiddle());
		

	}
	

}
class StackNode{
	int data;
	StackNode next;
	StackNode prev;
	StackNode()
	{
		next =null;
		prev=null;
	}
}
