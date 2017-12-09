package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;



public class BinaryTree {
	Node root;
	Leaf myLevel=new Leaf();
	  static Node next = null;
	BinaryTree(int key){
		root=new Node(key);
	}
	BinaryTree(){
		root=null;
	}
	class Leaf{
		int leafLevel=0;
		
	}
	static int min=Integer.MIN_VALUE;
	 static  int []in = new int[]{4,2,5,1,3,6};
	    static int [] pre = new int[]{1,2,4,5,3,6};
	    static int start=0,end=5,preIndex=0;
	    static int maxlevel=0;
	public static void main(String[] args) {
	
		BinaryTree tree=new BinaryTree();
		tree.root=new Node(1);	
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		tree.root.left.left.left=new Node(8);
		BinaryTree tree2=new BinaryTree(1);
		tree2.root.left=new Node(3);
		tree2.root.right=new Node(2);
		tree2.root.left.right=new Node(6);
		tree2.root.left.left=new Node(7);
		tree2.root.right.right=new Node(4);
		tree2.root.right.left=new Node(5);
	/*	tree2.root.left.right=new Node(6);
		tree2.root.right.right=new Node(3);*/
	/*	System.out.println("\nPreorder traversal of binary tree is \n");
		 printPreorder(tree.root);
		 
	     System.out.println("\nInorder traversal of binary tree is \n");
	     printInorder(tree.root);  
	 
	     System.out.println("\nPostorder traversal of binary tree is \n");
	     printPostorder(tree.root);*/
	     
	    // System.out.println("\nLevel order traversal of binary tree is \n");
	    // PrintLevelOrder(tree.root);
	     //PrintLevelOrderWidOutQueue(tree.root);
	    // System.out.println("Size of tree is::"+SizeOfTree(tree.root));
			//InorderTraverseUsingStack(tree.root);
		//System.out.println("Symetrical::"+IdenticalTree(tree.root,tree2.root));
		//Node n=MirrorTree(tree.root);
		//PrintLevelOrder(n);
		 	//PrintSpiral(tree.root);
			// PrintSpiralUsingStack(tree.root);
		//System.out.println(Diameter(tree.root));
		//System.out.println(hasPathSum(tree.root,10));
	//	System.out.print(CountLeafNode(tree.root));
		//System.out.println(isBalancedTree(tree.root));
		//PrintAncestors(tree.root,7);
		//System.out.println((2*tree2.root.data==SumTree(tree2.root))?"SumTree":"Not Sum Tree");
		//System.out.println(isSubTree(tree.root,tree2.root));
			//connect(tree.root);
		/*	if(tree.check(tree.root))
				System.out.println("Leaves are at same level");
			else
				System.out.println("Leaves are not at same level");*/
		/*tree.toSumTree(tr	ee.root);
	     System.out.println("\nInorder traversal of binary tree is \n");
	     printInorder(tree.root);  */
	//	printBoundary(tree.root);
	//	reverseLevelOrder(tree.root);
	//	reverseLevelOrderUsingStack(tree.root);
		//getLevelDiff(tree.root);
		//System.out.println(getLevelDiffRec(tree.root));
		
		
		//print_postorder_from_inorder_preorder(start,end);
		//System.out.println(isIsomorpic(tree.root,tree2.root));
		//RightView(tree.root);
		//PrintSingle(tree.root);
		//printKDistantfromLeaf(tree.root,1);
		treePathsSum(tree.root);
		System.out.println(isBST(tree2.root));
		System.out.println(serialize(tree.root));
		populateNext(tree.root);
		}
	  static void populateNext(Node node) 
	    {
	        // The first visited node will be the rightmost node
	        // next of the rightmost node will be NULL
	        if (node != null) 
	        {
	            // First set the next pointer in right subtree
	            populateNext(node.right);
	  
	            // Set the next as previously visited node in reverse Inorder
	            node.next = next;
	  
	            // Change the prev for subsequent node
	            next = node;
	  
	            // Finally, set the next pointer in left subtree
	            populateNext(node.left);
	        }
	    }

		private static String serialize(Node root) {
			 if(root==null){
			        return "";
			    }
			 
			    StringBuilder sb = new StringBuilder();
			 
			    LinkedList<Node> queue = new LinkedList<Node>();
			 
			    queue.add(root);
			    while(!queue.isEmpty()){
			       Node t = queue.poll();
			        if(t!=null){
			            sb.append(String.valueOf(t.data) + ",");
			            queue.add(t.left);
			            queue.add(t.right);
			        }else{
			            sb.append("#,");
			        }
			    }
			 
			    sb.deleteCharAt(sb.length()-1);
			    System.out.println(sb.toString());
			    return sb.toString();
	}
		
		private static boolean isBST(Node root) {
		return (isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
			
		}
		private static boolean isBSTUtil(Node root ,int min, int max) {
			if(root==null)
				return true;
			if(root.data<min||root.data>max)
				return false;
			
			return (isBSTUtil(root.left,min,root.data-1)&&(isBSTUtil(root.right,root.data+1,max)));
				
		}
	private static void treePathsSum(Node root) {
		System.out.print(treePathsSumUtil(root,0));
	
	}
	private static int treePathsSumUtil(Node root, int val) {
		if(root==null)
			return 0;
		val=val*10+root.data;
		if(root.left==null && root.right==null)
			return val;
		
		return (treePathsSumUtil(root.left,val)+treePathsSumUtil(root.right,val));
	}
	private static void printKDistantfromLeaf(Node root	, int k) {
	int path[]=new int[1000];
	boolean visited[]=new boolean[1000];
	printKDistantfromLeafUtils(root,path,visited,0,k);
		
	}
	private static void printKDistantfromLeafUtils(Node root, int[] path,
			boolean[] visited, int i, int k) {
		if(root==null)
			return;
		path[i]=root.data;
		visited[i]=false;
		i++;
		
		if((root.left==null && root.right==null) && (i-k-1>=0) 
				&& (visited[i-k-1]==false)){
			System.out.print(path[i-k-1]+" ");
			visited[i-k-1]=true;
			return;
		}
		printKDistantfromLeafUtils(root.left,path,visited,i,k);
		printKDistantfromLeafUtils(root.right,path,visited,i,k);
	}
	private static void PrintSingle(Node root) {
			if(root==null)
				return;
			if(root.left!=null && root.right==null)
				System.out.print(root.left.data+" ");
			else if(root.right!=null && root.left==null)
				System.out.print(root.right.data+" ");  
			PrintSingle(root.left);	
			PrintSingle(root.right);
		
		
	}
	private static void RightView(Node root) {
		
		RightViewUtils(root,1);
		
	}
	private static void RightViewUtils(Node root, int level) {
		if(root==null)
			return;
		if(level>maxlevel){
		System.out.print(root.data+" ");
		maxlevel=level;
		}
		RightViewUtils(root.right, level+1);
		RightViewUtils(root.left , level+1);

		
	}
	private static boolean isIsomorpic(Node root1, Node root2) {
	if(root1 ==null && root2==null)
		return true;
	if(root1==null || root2==null)
		return false;
	if(root1.data !=root2.data)
		return false;
	return ((isIsomorpic(root1.left,root2.left)&& isIsomorpic(root1.right,root2.right))
	||(isIsomorpic(root1.left,root2.right)&& isIsomorpic(root1.right,root2.left)));
	}
	static void print_postorder_from_inorder_preorder(int l,int r)
	{
	if(l>r)
	return;

	int temp=pre[preIndex];

	int pos=search(l,r,temp);
	preIndex++;
	print_postorder_from_inorder_preorder(l,pos-1);
	print_postorder_from_inorder_preorder(pos+1,r);
		System.out.print(temp+" ");
	}
	
	private static int search(int start, int end,int rootValue) {
	for(int i=start;i<=end;i++){
		if(in[i]==rootValue)
			return i;
	}
	return -1;
	}
	private static int getLevelDiffRec(Node root) {
	if(root== null)
			return 0;
		return (root.data-getLevelDiffRec(root.left)-getLevelDiffRec(root.right));
		
	}
	private static void getLevelDiff(Node root) {

		Queue<Node> q=new LinkedList<Node>();
		List<Node> li=new ArrayList<Node>();
		q.add(root);
		
		boolean flag=false;
		int sumOdd=0,sumEven=0;
			while(!q.isEmpty()){
			//Node n=q.peek();
			if(flag){
				while(!q.isEmpty())
				{
					sumOdd+=q.peek().data;
					li.add(q.poll());
				}
			
			}
			else
			{
				while(!q.isEmpty())
				{
					sumEven+=q.peek().data;
					li.add(q.poll());
				}
				
			}
			for(Node s:li){
				if(s.left!=null)
			q.add(s.left);
				if(s.right!=null)
			q.add(s.right);
			}
			li.clear();
			flag=!flag;
			}
			System.out.println(sumOdd-sumEven);
		}
		
	
	private static void reverseLevelOrderUsingStack(Node root) {
		Stack<Node> S=new Stack<Node>();
		Queue<Node> Q=new LinkedList<Node>();
		Q.add(root);
		while(Q.isEmpty()!=true){
			Node n=Q.peek();
			Q.remove();
			S.push(n);
			if(n.right!=null)
				Q.add(n.right);
		
			if(n.left!=null)
				Q.add(n.left);
		}
		while(S.isEmpty()!=true){
			Node n=S.peek();
			System.out.print(n.data+" ");
			S.pop();
		}
	}
	
	private static void reverseLevelOrder(Node root) {
		int h=height(root);
		for(int i=h;i>=0;i--){
			PrintGivenLevelReverse(root,i);
		}
		
	}
	private static void PrintGivenLevelReverse(Node root, int level) {
		if(root==null)
			return;
		if(level==1)
			System.out.print(root.data+" ");
		else if(level >1){
			PrintGivenLevelReverse(root.left,level-1);
			PrintGivenLevelReverse(root.right,level-1);
		}
		
	}
	private static void printBoundary(Node root) {
		if(root!=null){
			printBoundaryLeft(root.left);	
			PrintLeaves(root.left);
			PrintLeaves(root.right);
			printBoundaryRight(root.right);
		}
	
	}
	private static void PrintLeaves(Node root) {
	if(root!=null){
		PrintLeaves(root.left);
		if(root.left==null && root.right==null)
			System.out.print(root.data+" ");
		PrintLeaves(root.right);
	}
		
	}
	private static void printBoundaryRight(Node root) {
	if(root!=null){
			
			if(root.right!=null)
			{
				printBoundaryRight(root.right);
				System.out.print(root.data+" ");
			}
			else if(root.left!=null){
				printBoundaryRight(root.right);
				System.out.print(root.data+" ");
			}
		}
		
	}
	private static void printBoundaryLeft(Node root) {
		if(root!=null){
			
			if(root.left!=null)
			{
				System.out.print(root.data+" ");
				printBoundaryLeft(root.left);
			}
			else if(root.right!=null){
				System.out.print(root.data+" ");
				printBoundaryLeft(root.left);
			}
		}
	}
	private int toSumTree(Node root) {
		if(root==null)
			return 0;
		int old=root.data;
		root.data=toSumTree(root.left)+toSumTree(root.right);
		return root.data+old;
		
	}
	private boolean check(Node root) {
		int level=0;
	return checkUtil(root,level,myLevel);
	}
	private boolean checkUtil(Node root, int level, Leaf leaf) {
	if(root==null)
		return true;
	if(root.left==null && root.right==null){
		if(leaf.leafLevel==0){
			leaf.leafLevel=level;
			return true;
		}
		return (level==leaf.leafLevel);
		
	}
		return (checkUtil(root.left ,level+1,leaf) &&checkUtil(root.right,level+1,leaf));
	}
	private static void connect(Node root) {
	root.nextRight=null;
	connectRecur(root);
	}
	private static void connectRecur(Node root) {
		if(root==null)
			return;
		if(root.left!=null)
		root.left.nextRight=root.right;
		
		if(root.right!=null)
		root.right.nextRight=(root.nextRight!=null)?root.nextRight.left:null;
		
		connectRecur(root.left);
		connectRecur(root.right);
		
	} 
	private static boolean isSubTree(Node T, Node S) {
		if(S==null)
			return true;
		if(T==null)
		return false;
		 if(isIdentical(T,S))
			 return true;
		 
		 return (isSubTree(T.left,S)|| isSubTree(T.right,S));
		
	}
	private static boolean isIdentical(Node root1, Node root2) {
		if(root1==null && root2==null)
			return true;
		if(root1==null || root2==null)
			return false;
		return ((root1.data==root2.data)&&
				isIdentical(root1.left,root2.left) &&
				isIdentical(root1.right,root2.right));
				
	}
	private static int SumTree(Node root) {
		if(root==null)
			return 0;
		if(root.left==null && root.right==null)
			return root.data;
		
		if(root.data==SumTree(root.left)+SumTree(root.right))
			return (2*root.data);
			return 0;
		
		
	}
	private static boolean PrintAncestors(Node root, int target) {
		if (root==null)
			return false;
		if(root.data==target)
			return true;
		
		if(PrintAncestors(root.left,target)||PrintAncestors(root.right,target)){
			System.out.print(root.data+"---");
			return true;
		}
		return false;
		
	}
	private static boolean isBalancedTree(Node root) {
		if(root==null)
			return true;
		 int lh=height(root.left);
		 int rh=height(root.right);
		if (Math.abs(lh-rh)<=1 && isBalancedTree(root.left)&& 
				isBalancedTree(root.right))
			return true;
		return false;
	}
	private static boolean hasPathSum(Node root,int sum) {
		
		if(root==null)
			return (sum==0);
	/*	if(sum==0 && root.left==null && root.right==null)
			return true;*/
		
			return(hasPathSum(root.left,sum-root.data)||hasPathSum(root.right,sum-root.data));
		
					
	}
	private static int Diameter(Node root) {
		
	/*	if(root==null)
			return 0;
		
		int rootHeight=height(root.left)+height(root.right)+1;
		if(root.left!=null)
		 ld=Diameter(root.left);
		if(root.right!=null)
		 rd=Diameter(root.right);
		
	
		return Math.max(rootHeight,(Math.max(ld, rd)));
		//return (Math.max(lh+rh+1,Math.max(ld,rd)));
*/		
		  if (root == null)
		        return 0;

		    int rootDiameter =height(root.left) + height(root.right) + 1;
		    int leftDiameter =Diameter(root.left);
		    int rightDiameter =Diameter(root.right);

		    return Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
		
	}
	private static void PrintSpiralUsingStack(Node root) {
		if(root==null)
			return ;
		Stack<Node> s1=new Stack<Node>();
		Stack<Node> s2=new Stack<Node>();
		s1.push(root);
		while(!s1.isEmpty()|| !s2.isEmpty()){
			while(!s1.isEmpty()){
			Node n=s1.pop();
			System.out.print(n.data+"--");
			if(n.right!=null)
			s2.push(n.right);
			if(n.left!=null)
			s2.push(n.left);
		}
			while(!s2.isEmpty()){
				Node n2=s2.pop();
				System.out.print(n2.data+"--");
				if(n2.left!=null)
				s1.push(n2.left);
				if(n2.right!=null)
				s1.push(n2.right);
			}
		
		}
	}
	private static void PrintSpiral(Node root) {
	boolean f=false;
		int d=height(root);
		for(int i=0;i<=d;i++)
		{
			PrintGivenLevelInSpiral(root,i,f);
			f=!f;
		}
		
	}
	private static void PrintGivenLevelInSpiral(Node root, int d, boolean f) {
		if(root==null)	
			return;
		if(d==0)
			System.out.print(root.data+"--");
		else if(d>0){
			if(f){
				PrintGivenLevelInSpiral(root.left,d-1,f);
				PrintGivenLevelInSpiral(root.right,d-1,f);	
			}
			else{
				PrintGivenLevelInSpiral(root.right,d-1,f);
				PrintGivenLevelInSpiral(root.left,d-1,f);	
			}
		}
	}
	private static int CountLeafNode(Node root) {
		if(root==null)
			return 0;
		else if(root.left==null && root.right==null){
			return 1;
		}
		else
			return (CountLeafNode(root.left)+CountLeafNode(root.right));
		
	}
	private static Node MirrorTree(Node root) {
		Node node=root;
	if(node==null)
		return node;
	Node leftNode=MirrorTree(node.left);
	Node rightNode=MirrorTree(node.right);
	node.left=rightNode;
	node.right=leftNode;
	return root;
	}
	private static boolean IdenticalTree(Node root1, Node root2) {
		if((root1==null && root2!=null)||(root1!=null && root2==null))
				return false;
		else if(root1==null && root2==null)
			return true;
		else
		{
			return((root1.data==root2.data)&&(IdenticalTree(root1.left,root2.left))&&
					(IdenticalTree(root1.right,root2.right)));
		}
	}
	private static void InorderTraverseUsingStack(Node root) {
		Stack<Node> s=new Stack<Node>();
		Node v=root;
		while(v!=null){
		s.push(v);
		v=v.left;
		}
		while(!s.isEmpty()){
		
		v=s.pop();	
		System.out.print(v.data+"--");
		if(v.right!=null){
			v=v.right;
			
		while(v!=null){
			s.push(v);
			v=v.left;	
		}
		}
		}
		
	}
	private static int SizeOfTree(Node root) {
		if(root==null)
			return 0;
		else{
			return(SizeOfTree(root.left)+SizeOfTree(root.right)+1);
		}
	}
	private static void PrintLevelOrderWidOutQueue(Node root) {
		int h=height(root);
		//System.out.println(h);
		for(int i=0;i<=h;i++){
			   printGivenLevel(root, i);
		}
	}
	private static void printGivenLevel(Node root, int i) {
		if(root==null)
			return;
		if(i==0)
			System.out.print(root.data+"--");
		else if(i>0)
		{
			printGivenLevel(root.left,i-1);
			printGivenLevel(root.right,i-1);
		}
	}
	private static int height(Node root) {
		if(root==null)
			return 0;
		else
		{
				int lHeight=height(root.left);
				int rHeight=height(root.right);
				if(lHeight>rHeight)
					return (lHeight+1);
				else
					return (rHeight+1);
		}
	}
	private static void PrintLevelOrder(Node root) {
		Queue<Node> q=new LinkedList<Node>();
		if(root!=null)
			q.add(root);
		while(!q.isEmpty()){
			Node v=q.poll();
			//if(v!=null)
			System.out.print(v.data+"--");
			if(v.left!=null)
			q.add(v.left);
			if(v.right!=null)
			q.add(v.right);
			
		}
		
	}
	private static void printPostorder(Node root) {
	if(root!=null){
		printPostorder(root.left);
		printPostorder(root.right);
		System.out.print(root.data+"--");
	}
	}
	private static void printInorder(Node root) {
		if(root!=null){
			printInorder(root.left);
			System.out.print(root.data+"--");
			printInorder(root.right);
			
		}
		
	}
	private static void printPreorder(Node root) {
		if(root!=null){
			System.out.print(root.data+"--");
			printPreorder(root.left);
			printPreorder(root.right);
			
		}
		
	}

}
class Node{
	Node next;
	int data;
	Node left;
	Node right;
	Node nextRight;
		
	public Node(int data){
		this.data=data;
		left=right=null;
		nextRight=null;
		next=null;
	}
}
