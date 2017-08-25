package GreedyAlgo;

public class ChainPair {
	int a;
	int b;
	

	public ChainPair(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}


	public static void main(String[] args) {
		ChainPair arr[]=new ChainPair[] {new ChainPair(5, 24), new ChainPair(15, 25),
				new ChainPair(27, 40),new ChainPair(50, 60)};
		System.out.println(maxChainLength(arr,arr.length));

	}


	private static int maxChainLength(ChainPair[] arr, int n) {
		int i,j,max=0;
		int mcl[]=new int[n];
		for(i=0;i<n;i++)
			mcl[i]=1;
		
		for( i=1;i<n;i++) {
			for(j=0;j<i;j++) {
				if((arr[i].a>arr[j].b) && (mcl[i]<mcl[j]+1))
					mcl[i]=mcl[j]+1;
			}
		}
		for(i=0;i<n;i++) {
			if(mcl[i]>max)
				max=mcl[i];
		}
		return max;
			
	}

}
