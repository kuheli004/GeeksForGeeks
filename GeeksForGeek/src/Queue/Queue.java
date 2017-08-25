package Queue;

public class Queue {
		int capactity,front,rear,size=0;
		int arr[];
	public Queue(int capacity) {
		this.capactity=capacity;
		front=this.size=0;
		rear=capactity-1;
		arr=new int[this.capactity];

	}
private int rear() {
		if(!isEmpty(this))
		return arr[rear];
		else
			return	Integer.MIN_VALUE;
	}

	private int front() {
		if(!isEmpty(this))
			return arr[front];
			else
				return	Integer.MIN_VALUE;
	}

	private int dequeue() {
		if(!isEmpty(this))
		{
			int temp=arr[front];
			front=(front+1)%capactity;
			size=size-1;
			return temp;
			
		}
		return Integer.MIN_VALUE;	
	}

	private boolean isEmpty(Queue queue) {
		return (queue.size==0);
	}

	private void enqueue(int item) {
		if(isFull(this))
		return;
		else
		{
			rear=(rear+1)%capactity;
			arr[rear]=item;
			size=size+1;
			System.out.println(item+" is enqued");
		}
		
	}

	private boolean isFull(Queue queue) {
		// TODO Auto-generated method stub
		return (queue.size==queue.capactity);
	}
	public static void main(String[] args) {
		 Queue queue = new Queue(1000);
        
	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);
	        queue.enqueue(40);
	      
	       
	        System.out.println(queue.dequeue() + 
	                     " dequeued from queue\n");
	        queue.enqueue(50);
	        
	        System.out.println(queue.dequeue() + 
	                     " dequeued from queue\n");
	        
	        System.out.println("Front item is " + 
	                               queue.front());
	          
	        System.out.println("Rear item is " + 
	                                queue.rear());

	}

}
