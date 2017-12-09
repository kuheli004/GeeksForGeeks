package TreePractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public class BinaryTree {
	Node root;
	static int maxlevel=0;
	   static Node next = null;
	   
	BinaryTree(int data){
		root=new Node(data);
	}
    Values val = new Values();
	BinaryTree(){
		
	}
	class Values 
	{
	    int max, min;
	}
	  
	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.left.right.left=new Node(7);
		tree.root.left.right.right=new Node(8);
	//	tree.root.left.right.right.left=new Node(9);
		tree.root.right.left=new Node(6);
	 
	//	tree.root.left.left.left.left=new Node(9);
		BinaryTree tree2=new BinaryTree();
		 	tree2.root = new Node(5);
		 	tree2.root.left = new Node(3);
	        tree2.root.right = new Node(7);
	        tree2.root.right.left = new Node(6);
	        tree2.root.right.right = new Node(8);
	        tree2.root.left.right = new Node(4);
	        tree2.root.right.right.left = new Node(2);
	        tree2.root.right.right.right = new Node(1);
	  
	/*	System.out.println("********PRE ORDER*************");
		PrintPreOrder(tree.root);
		System.out.println();
		System.out.println("********IN ORDER*************");
		PrintInOrder(tree.root);
		System.out.println();
		System.out.println("********POST ORDER*************");
		PrintPostOder(tree.root);
		System.out.println();*/
	/*	System.out.println("********LEVEL ORDER USING QUEUE*************");
		PrintLevelOrder(tree.root);*/
	/*	System.out.println("********LEVEL ORDER WITHOUT QUEUE*************");
		PrintLevelOrderWidOutQueue(tree.root);*/
	//	System.out.println(SizeOfTree(tree.root));
		//InorderTraverseUsingStack(tree.root);	
		/*Node n=MirrorTree(tree.root);
		PrintLevelOrder(n);*/
		//System.out.println(IdenticalTree(tree.root,tree2.root));
		//PrintSpiral(tree.root);
		//PrintSpiralUsingStack(tree.root);
		//System.out.println(countLeafNode(tree.root));
		//PrintLeftView(tree.root);
		//PrintRightView(tree.root);
		//System.out.println(hasPathSum(tree.root,11));
		/*System.out.println(sumTree(tree2.root));
		PrintLevelOrder(tree2.root);*/
		//PrintAncestor(tree.root,6);
		//System.out.println(isSubTree(tree.root,tree2.root));
		//PrintBoundary(tree.root);
		//System.out.println(isBalancedTree(tree.root));
		//getLevelDiff(tree.root);
		//PrintSingleChild(tree.root);
		//PrintKDistantfromRoot(tree.root,1);
		//treePathsSum(tree.root);
		//System.out.println(isBST(tree2.root));
		//System.out.println(isIsomorphic(tree.root,tree2.root));
		// tree.verticalOrder(tree.root);
	   //  lca(tree2.root,1,8);
	      //  connect(tree.root);//only for complete binary tree
	        /*tree.root.nextRight=null;
	        connectReccurUsingConstantXtraSpace(tree.root);*/
	      
	    //	PrintLevelOrder(tree.root);
	   /*     int ans=Integer.MIN_VALUE;
	        System.out.println(Diameter(tree.root,ans));*/
	     //   bottomView(tree.root);
	    	String str=serialize(tree.root);
	    	Node n=deserialize(str);
	    	PrintLevelOrder(n);
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
	 private static Node deserialize(String data) {
		 if(data==null || data.length()==0)
		        return null;
		 
		    String[] arr = data.split(",");
		   Node root = new Node(Integer.parseInt(arr[0]));
		 
		 
		    LinkedList<Node> queue = new LinkedList<Node>();
		    queue.add(root);
		 
		    int i=1;
		    while(!queue.isEmpty()){
		        Node t = queue.poll();
		 
		        if(t==null)
		            continue;
		 
		        if(!arr[i].equals("#")){
		            t.left = new Node(Integer.parseInt(arr[i]));    
		            queue.offer(t.left);
		 
		        }else{
		            t.left = null;
		            queue.offer(null);
		        }
		        i++;
		 
		        if(!arr[i].equals("#")){
		            t.right = new Node(Integer.parseInt(arr[i]));    
		            queue.offer(t.right);
		 
		        }else{
		            t.right = null;
		            queue.offer(null);
		        }
		        i++;
		    }
		 
		    return root;
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
		            sb.append(String.valueOf(t.key) + ",");
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
	private static void bottomView(Node root) {
		 if (root == null)
	            return;
	 
	        // Initialize a variable 'hd' with 0 for the root element.
	        int hd = 0;
	 
	        // TreeMap which stores key value pair sorted on key value
	        Map<Integer, Integer> map = new TreeMap<>();
	 
	         // Queue to store tree nodes in level order traversal
	        Queue<Node> queue = new LinkedList<Node>();
	 
	        // Assign initialized horizontal distance value to root
	        // node and add it to the queue.
	        root.hd = hd;
	        queue.add(root);
	 
	        // Loop until the queue is empty (standard level order loop)
	        while (!queue.isEmpty())
	        {
	            Node temp = queue.remove();
	            
	            // Extract the horizontal distance value from the
	            // dequeued tree node.
	            hd = temp.hd;
	 
	            // Put the dequeued tree node to TreeMap having key
	            // as horizontal distance. Every time we find a node
	            // having same horizontal distance we need to replace
	            // the data in the map.
	            map.put(hd, temp.key);
	 
	            // If the dequeued node has a left child add it to the
	            // queue with a horizontal distance hd-1.
	            if (temp.left != null)
	            {
	                temp.left.hd = hd-1;
	                queue.add(temp.left);
	            }
	            // If the dequeued node has a left child add it to the
	            // queue with a horizontal distance hd+1.
	            if (temp.right != null)
	            {
	                temp.right.hd = hd+1;
	                queue.add(temp.right);
	            }
	        }
	 
	        // Extract the entries of map into a set to traverse
	        // an iterator over that.
	        Set<Entry<Integer, Integer>> set = map.entrySet();
	 
	        // Make an iterator
	        Iterator<Entry<Integer, Integer>> iterator = set.iterator();
	 
	        // Traverse the map elements using the iterator.
	        while (iterator.hasNext())
	        {
	            Map.Entry<Integer, Integer> me = iterator.next();
	            System.out.print(me.getValue()+" ");
	        }
	    }
		
	
	private static int Diameter(Node root, int ans) {
		 if(root==null)
			 return 0;
		 int lh=height(root.left);
		 int rh=height(root.right);
		ans=Math.max(ans,1+lh+rh);
		 
		return ans;
	}
	static void connectReccurUsingConstantXtraSpace(Node p) 
	    {
	        // Base case
	        if (p == null)
	            return;
	  
	        /* Before setting nextRight of left and right children, set nextRight
	           of children of other nodes at same level (because we can access 
	           children of other nodes using p's nextRight only) */
	        if (p.nextRight != null)
        	connectReccurUsingConstantXtraSpace(p.nextRight);
//	  
	        /* Set the nextRight pointer for p's left child */
	        if (p.left != null)
	        {
	            if (p.right != null) 
	            {
	                p.left.nextRight = p.right;
	                p.right.nextRight = getNextRight(p);
	            } 
	            else
	                p.left.nextRight = getNextRight(p);
	  
	            /* Recursively call for next level nodes.  Note that we call only
	             for left child. The call for left child will call for right child */
	            connectReccurUsingConstantXtraSpace(p.left);
	        }
	          
	        /* If left child is NULL then first node of next level will either be
	         p->right or getNextRight(p) */
	        else if (p.right != null) 
	        {
	            p.right.nextRight = getNextRight(p);
	            connectReccurUsingConstantXtraSpace(p.right);
	        } 
	        else
	        	connectReccurUsingConstantXtraSpace(getNextRight(p));
	    }
	  
	    /* This function returns the leftmost child of nodes at the same
	       level as p. This function is used to getNExt right of p's right child
	       If right child of p is NULL then this can also be used for 
	       the left child */
	   static  Node getNextRight(Node p) 
	    {
	        Node temp = p.nextRight;
	  
	        /* Traverse nodes at p's level and find and return
	         the first node's first child */
	        while (temp != null) 
	        {
	            if (temp.left != null)
	                return temp.left;
	            if (temp.right != null)
	                return temp.right;
	            temp = temp.nextRight;
	        }
	  
	        // If all the nodes at p's level are leaf nodes then return NULL
	        return null;
	    }
	private static void connect(Node root) {
		root.nextRight=null;
		connectReccur(root);
		
	}
	private static void connectReccur(Node root) {
		if(root==null)
			return ;
		if(root.left!=null)
			root.left.nextRight=root.right;
		
		if(root.right!=null)
			root.right.nextRight=(root.nextRight!=null)?root.nextRight.left:null;
	
		connectReccur(root.left);
		connectReccur(root.right);
	}
	private static void lca(Node root, int n1, int n2) {

		  while(root!=null) {
			  if(n1<root.key && n2<root.key)
				  root=root.left;
			  else if(n1>root.key && n2>root.key)
				  root=root.right;
			  else break;
		  }
		  System.out.println(root.key);
		
	}
	void findMinMax(Node node, Values min, Values max, int hd) 
	    {
	        // Base case
	        if (node == null) 
	            return;
	  
	        // Update min and max
	        if (hd < min.min) 
	            min.min = hd;
	        else if (hd > max.max) 
	            max.max = hd;
	  
	        // Recur for left and right subtrees
	        findMinMax(node.left, min, max, hd - 1);
	        findMinMax(node.right, min, max, hd + 1);
	    }
	  
	    // A utility function to print all nodes on a given line_no.
	    // hd is horizontal distance of current node with respect to root.
	    void printVerticalLine(Node node, int line_no, int hd) 
	    {
	        // Base case
	        if (node == null) 
	            return;
	  
	        // If this node is on the given line number
	        if (hd == line_no) 
	            System.out.print(node.key + " ");        
	  
	        // Recur for left and right subtrees
	        printVerticalLine(node.left, line_no, hd - 1);
	        printVerticalLine(node.right, line_no, hd + 1);
	    }
	  
	    // The main function that prints a given binary tree in
	    // vertical order
	    void verticalOrder(Node node) 
	    {
	        // Find min and max distances with resepect to root
	        findMinMax(node, val, val, 0);
	  
	        // Iterate through all possible vertical lines starting
	        // from the leftmost line and print nodes line by line
	        for (int line_no = val.min; line_no <= val.max; line_no++) 
	        {
	            printVerticalLine(node, line_no, 0);
	            System.out.println("");
	        }
	    }
	  
	
	private static boolean isIsomorphic(Node root1, Node root2) {
		if(root1==null && root2==null)
			return true;
		if(root1==null|| root2==null)
			return false;
		if(root1.key!=root2.key)
			return false;
		return((isIsomorphic(root1.left,root2.left)&&isIsomorphic(root1.right,root2.right))||
				(isIsomorphic(root1.left,root2.right)&&isIsomorphic(root1.right,root2.left)));
			
	
	}
	private static boolean isBST(Node root) {
	return (isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
		
	}
	private static boolean isBSTUtil(Node root ,int min, int max) {
		if(root==null)
			return true;
		if(root.key<min||root.key>max)
			return false;
		
		return (isBSTUtil(root.left,min,root.key-1)&&(isBSTUtil(root.right,root.key+1,max)));
			
	}
	private static void treePathsSum(Node root) {
		System.out.print(treePathsSumUtil(root,0));
	
	}
	private static int treePathsSumUtil(Node root, int val) {
		if(root==null)
			return 0;
		val=val*10+root.key;
		if(root.left==null && root.right==null)
			return val;
		
		return (treePathsSumUtil(root.left,val)+treePathsSumUtil(root.right,val));
	}
	private static void PrintKDistantfromRoot(Node root, int i) {
		if(root==null)
			return;
			if(i==0)
				System.out.print(root.key+" ");
			if(i>0)
			{
				PrintKDistantfromRoot(root.left,i-1);
				PrintKDistantfromRoot(root.right,i-1);
			}
	
	}
	private static void PrintSingleChild(Node root) {
		if(root==null)
			return;
		if(root.left!=null && root.right==null)
			System.out.print(root.left.key+" ");
		else if(root.right!=null && root.left==null)
			System.out.print(root.right.key+" ");  
		PrintSingleChild(root.left);	
		PrintSingleChild(root.right);
	
	
}
	
	private static int getLevelDiffRec(Node root) {
	if(root== null)
			return 0;
		return (root.key-getLevelDiffRec(root.left)-getLevelDiffRec(root.right));
		
	}
	private static void getLevelDiff(Node root) {

		Queue<Node> q=new LinkedList<Node>();
		List<Node> li=new ArrayList<Node>();
		q.add(root);
		boolean flag=true;
		int sumOdd=0,sumEven=0;
			while(!q.isEmpty()){
			//Node n=q.peek();
			if(flag){
				while(!q.isEmpty())
				{
					sumOdd+=q.peek().key;
					li.add(q.poll());
				}
			
			}
			else
			{
				while(!q.isEmpty())
				{
					sumEven+=q.peek().key;
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
		
	private static boolean isBalancedTree(Node root) {
	if(root==null)
		return true;
	int lh=height(root.left);
	int rh=height(root.right);
	if((Math.abs(lh-rh)<=1)&&(isBalancedTree(root.left))&&(isBalancedTree(root.right)))
		return true;
	return false;
		
	}
	private static void PrintBoundary(Node root) {
		if(root!=null) {
			System.out.print(root.key+" ");
			PrintBoundaryLeft(root.left);
			PrintLeaves(root.left);
			PrintLeaves(root.right);
			PrintBoundaryRight(root.right);
		}
	}
	private static void PrintBoundaryRight(Node node) {
		if(node!=null) {
			if(node.right!=null) {
				PrintBoundaryRight(node.right);
				System.out.print(node.key+" ");
				
			}
			else if(node.left!=null) {
				PrintBoundaryRight(node.left);
				System.out.print(node.key+" ");
			}
			
		}
		
		
	}
	private static void PrintLeaves(Node node) {
	if(node!=null) {
		PrintLeaves(node.left);
		if(node.left==null && node.right==null){
			System.out.print(node.key+" ");
		}
		PrintLeaves(node.right);
	}
		
	}
	private static void PrintBoundaryLeft(Node node) {
		if(node!=null) {
			if(node.left!=null) {
				System.out.print(node.key+" ");
				PrintBoundaryLeft(node.left);
			}
			else if(node.right!=null) {
				System.out.print(node.key+" ");
				PrintBoundaryLeft(node.right);
			}
			
		}
		
	}
	private static boolean isSubTree(Node T, Node  S) {
		if(T==null)
			return false;
		if(S==null)
			return true;
		if(isIdentical(T,S))
			return true;
		return (isSubTree(T.left,S)|| isSubTree(T.right,S));
	}
	private static boolean isIdentical(Node root1, Node root2) {
		if(root1 ==null && root2==null)
			return true;
		if(root1==null || root2==null)
			return false;
		
		return ((root1.key==root2.key
				)&&(isIdentical(root1.left,root2.left))
				&& (isIdentical(root1.right,root2.right)));
		
	}
	private static boolean PrintAncestor(Node root,int target) {
		
		if(root==null)
			return false;
		if(root.key==target)
			return true;
	if(PrintAncestor(root.left,target)||PrintAncestor(root.right,target)) {
		System.out.print(root.key+" ");
		return true;
	}
			return false;
		
	}
	private static int sumTree(Node node) {
		
		if(node==null)
			return 0;
	int old_data=node.key;
	node.key=sumTree(node.left)+sumTree(node.right);
	
	return node.key+old_data;
	
		
	}
	private static boolean hasPathSum(Node root, int sum) {
	if(root==null)
		return(sum==0);
	return(hasPathSum(root.left,sum-root.key)
			||hasPathSum(root.right,sum-root.key));
		
	}
	private static void PrintRightView(Node root) {
		
		RightViewUtils(root,1);
		
	}
	private static void RightViewUtils(Node root, int level) {
		if(root==null)
			return;
		if(level>maxlevel){
		System.out.print(root.key+" ");
		maxlevel=level;
		}
		RightViewUtils(root.right, level+1);
		RightViewUtils(root.left , level+1);

		
	}

	private static void PrintLeftView(Node root) {
		
		if(root!=null)
			System.out.print(root.key+" ");
		if(root.left!=null)
			PrintLeftViewUtil(root.left,true);
		if(root.right!=null)
			PrintLeftViewUtil(root.right,false);
	}
	private static void PrintLeftViewUtil(Node root, boolean b) {
		if(root!=null) {
			if(b)
			System.out.print(root.key+" ");	
			if(root.left!=null)
				PrintLeftViewUtil(root.left,true);
			if(root.right!=null)
				PrintLeftViewUtil(root.right,false);
		}
		}
		
	
	private static int countLeafNode(Node root) {
		if(root==null)
			return 0;
		if(root.left==null && root.right==null)
			return 1;
		return (countLeafNode(root.left)+countLeafNode(root.right));
			
	}
	private static void PrintSpiralUsingStack(Node root) {
		Stack<Node> s1=new Stack<Node>();
		Stack<Node> s2=new Stack<Node>();
		if(root!=null) {
			s1.push(root);
			
		}
		
		while(s1.isEmpty()|| s2.isEmpty()) {
			while(!s1.isEmpty())
			{
				Node t=s1.pop();
				System.out.print(t.key+"-->");
				if(t.right!=null)
					s2.push(t.right);
				if(t.left!=null)
					s2.push(t.left);
				
			}
			
			while(!s2.isEmpty()) {
				Node t=s2.pop();
				System.out.print(t.key+"-->");
				
				if(t.left!=null)
					s1.push(t.left);
				if(t.right!=null)
					s1.push(t.right);
				
			}
		}
		
		
	}
	private static void PrintSpiral(Node root) {
		int h=height(root);
		boolean f=false;
		for(int i=1;i<=h;i++) {
			PrintGivenLevelInSprial(root,i,f);
			f=!f;
		}
	}

	private static void PrintGivenLevelInSprial(Node root, int i, boolean f) {
	if(root==null)
		return;
	if(i==1)
		System.out.print(root.key+"-->");
	if(i>1) {
		if(f) {
		PrintGivenLevelInSprial(root.left,i-1,f);
		PrintGivenLevelInSprial(root.right,i-1,f);
		}
		else {
			PrintGivenLevelInSprial(root.right,i-1,f);
			PrintGivenLevelInSprial(root.left,i-1,f);
		}
	}
		
	}
	private static boolean IdenticalTree(Node root, Node root2) {
			if(root==null && root2==null)
				return true;
			else
			{
				return (root.key==root2.key)&&
						(IdenticalTree(root.left,root2.left))&&
						(IdenticalTree(root.right,root2.right));
			}
	}
	private static Node MirrorTree(Node root) {
		Node node=root;
		if(root==null)
			return node;
		Node left=MirrorTree(node.left);
		Node right=MirrorTree(node.right);
		
		node.left=right;
		 node.right=left;
		 return node;
	}

	private static void InorderTraverseUsingStack(Node root) {
		Stack<Node> s=new Stack<Node>();
		Node n=root;
				
		while(n!=null)
		{
			s.push(n);
			n=n.left;
		}
		
		while(!s.isEmpty()) {
			
			
			Node t=s.pop();
			System.out.print(t.key+"--->");
			
				t=t.right;
			
			while(t!=null)
			{
				s.push(t);
				t=t.left;
			}
			
		}
		
		
		
	}

	private static int SizeOfTree(Node root) {
		if(root==null)
			return 0;
	
		int lh=SizeOfTree(root.left);
		int rh=SizeOfTree(root.right);
		
		return lh+rh+1;
	}

	private static void PrintLevelOrderWidOutQueue(Node root) {
		int h=height(root);
	
		for(int i=1;i<=h;i++)
			PrintGivenLevel(root,i);
		
		
	}

	private static void PrintGivenLevel(Node root, int l) {
	if(root==null)
		return;
	if(l==1)
		System.out.print(root.key+"--->");
	if(l>1) {
	if(root.left!=null)
		PrintGivenLevel(root.left,l-1);
	if(root.left!=null)
		PrintGivenLevel(root.right,l-1);
	}
		
	}

	private static int height(Node root) {
	if(root==null)
		return 0;
	int lh=height(root.left)+1;
	int rh=height(root.right)+1;
	
	if(lh<rh)
		return rh;
	else 
		return lh;
	
	}

	private static void PrintLevelOrder(Node root) {
		Queue<Node> q=new LinkedList<Node>();
		if(root!=null)
		q.add(root);
		while(!q.isEmpty()) {
			Node temp=q.poll();
			System.out.print(temp.key+"--->");
			if(temp.left!=null)
			q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
	}

	private static void PrintPostOder(Node root) {
		
	
		if(root.left!=null)
			PrintPostOder(root.left);
	
		if(root.right!=null)
			PrintPostOder(root.right);
		if(root!=null)
			System.out.print(root.key+" ");
	}

	private static void PrintInOrder(Node root) {
		
		if(root.left!=null)
			PrintInOrder(root.left);
		if(root!=null)
			System.out.print(root.key+" ");
		if(root.right!=null)
			PrintInOrder(root.right);
		
	}

	private static void PrintPreOrder(Node root) {
	
		if(root!=null)
			System.out.print(root.key+" ");
		if(root.left!=null)
			PrintPreOrder(root.left);
	
		if(root.right!=null)
			PrintPreOrder(root.right);
	}

}
