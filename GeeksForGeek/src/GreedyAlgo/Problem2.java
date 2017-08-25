package GreedyAlgo;

public class Problem2 {

	public static void main(String[] args) {
		int s=4;
		int d=3;
		int num=0;
		int f=0;
		int digit=d;
		for(int i=1;i<=9;i++){
			num=num+i;
			digit--;
			int diff=s-num;
			System.out.println(num+":::"+diff+"::"+digit);
			if(diff<=9){
				num=num*10+diff;
				digit--;
				}
			else if(diff>=10 && diff<=18)
				 {
				f=diff/2;
				num=num*10+f;
				num=num*10+f;
				digit-=2;
				 }
			else{
				num=0;
				digit=d;
				continue;
			}
				
			System.out.println(num+":::"+digit);
			if( digit==0)
				break;
			
			}
	
		System.out.println(num);	
		}
	
	}

	


