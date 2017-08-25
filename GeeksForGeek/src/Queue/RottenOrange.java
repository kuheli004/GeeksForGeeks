package Queue;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class RottenOrange {
	static ArrayDeque<NodeElement> q=new ArrayDeque<NodeElement>();  

	public static void main(String[] args) {
		 int arr[][] =  {{2, 1, 0, 2, 1},
				 	    {1, 0, 1, 2, 1},
                        {1, 0, 0, 2, 1}};
		 int ans = rotOranges(arr);
		 if (ans == -1)
			 System.out.println("All oranges cannot rot\n");
		 	else
		 	System.out.println("Time required for all oranges to rot => "+ans);
			}

	private static int rotOranges(int[][] arr) {
		int curTime=0;
		int M=arr.length;
		int N=arr[0].length;
		for(int i=0;i<M;i++)
		{
			for(int j=0;j<N;j++){
				if(arr[i][j]==2)
					q.add(new NodeElement(i,j,curTime));
			}
		}
		while(!q.isEmpty()){
			NodeElement n=q.remove();
			curTime=n.time;
			
			if(n.i+1<M && arr[n.i+1][n.j]==1){
				arr[n.i+1][n.j]=2;
				q.add(new NodeElement(n.i+1,n.j,curTime+1));
			}
			if(n.i-1>=0 && arr[n.i-1][n.j]==1){
				arr[n.i-1][n.j]=2;
				q.add(new NodeElement(n.i-1,n.j,curTime+1));
			}
			if(n.j+1<N && arr[n.i][n.j+1]==1){
				arr[n.i][n.j+1]=2;
				q.add(new NodeElement(n.i,n.j+1,curTime+1));
			}
			if(n.j-1>=0 && arr[n.i][n.j-1]==1){
				arr[n.i][n.j-1]=2;
				q.add(new NodeElement(n.i,n.j-1,curTime+1));
			}
				
		}
		return curTime;
		
	}
}
class NodeElement
{
	int i,j,time;
public	NodeElement(int i,int j,int time){
		this.i=i;
		this.j=j;
		this.time=time;
	}
}