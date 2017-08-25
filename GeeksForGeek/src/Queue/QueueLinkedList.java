package Queue;

public class QueueLinkedList {
	QNode front,rear;
	QueueLinkedList(){
		front =rear=null;
		
	}
	public static void main(String[] args) {
		QueueLinkedList q=new QueueLinkedList();
			q.enqueue(10);
	        q.enqueue(20);
	        q.dequeue();
	        q.dequeue();
	        q.enqueue(30);
	        q.enqueue(40);
	        q.enqueue(50);
	        System.out.println("Dequeued item is "+ q.dequeue().key);
	}
	private QNode dequeue() {
		if(front==null)
			return null;
		QNode temp=front;
		front=front.next;
		if(front==null)
			rear=null;
		return temp;
		
	}
	private void enqueue(int item) {
		QNode temp=new QNode(item);
		
		if(rear==null)
		front =rear=temp;
		
		rear.next=temp;
		rear=temp;
		
	}

}
 class QNode{
	int key;
	QNode next;
	public QNode(int key){
		this.key=key;
		this.next=null;
	}
}
