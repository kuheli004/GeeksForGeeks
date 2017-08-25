package GreedyAlgo;

public class Problem4 {

	public static void main(String[] args) {
	 int a=4;
	 int b =5;
	 int sqr=a*b;
	
	int count=0,temp=0;
	if(a>b){
	temp=a;
	a=b;
	b=temp;
	}
	
	while(a>=1){
		count+=b/a;
		temp=b%a;
		b=a;
		a=temp;
		
		
	}
	System.out.println(count);
	}

}
