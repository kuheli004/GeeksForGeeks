package GreedyAlgo;

public class Problem8 {

	public static void main(String[] args) {
		int stack1[]={3,2,1,1,1};
		int stack2[]={4,3,2};
		int stack3[]={2,5,4,1};
		int  n1=stack1.length;
		int  n2=stack2.length;
		int  n3=stack3.length;
		int sum1=0,sum2=0,sum3=0,top1=0,top2=0,top3=0;
		for(int i=0;i<n1;i++)
			sum1+=stack1[i];
		for(int i=0;i<n2;i++)
			sum2+=stack2[i];
		for(int i=0;i<n3;i++)
			sum3+=stack3[i];
		
		
		while(true){
			if(top1==n1|| top2==n2 || top3==n3){
				System.out.println(0);
				break;
			}
				
				
		if(sum1>sum2 && sum1>sum3)
			sum1-=stack1[top1++];
		if(sum2>sum1 && sum2>sum3)
			sum2-=stack2[top2++];
		if(sum3>sum1 && sum3>sum2)
			sum3-=stack3[top3++];
		System.out.println(top1+" "+top2+" "+top3);	
		if(sum1==sum2 && sum1==sum3){
			System.out.println(sum1);
			break;
		}
	}
		
		

	}

}
