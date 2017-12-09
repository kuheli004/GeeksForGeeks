package TreePractice;

public class Node {
	int key;
	Node left,right,nextRight,next;
	int hd;
	
	Node(int data){
		key=data;
		left=null;
		right=null;
		nextRight=null;
		hd=Integer.MAX_VALUE;
	}

}
