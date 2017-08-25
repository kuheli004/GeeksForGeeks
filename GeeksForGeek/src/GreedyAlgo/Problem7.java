package GreedyAlgo;

import java.util.Arrays;

public class Problem7 {

	public static void main(String[] args) {
		int n=6;
	 int[] arv={900,940,950,1100,1500,1800};
	 int[] dept={910,1200,1120,1130,1900,2000};
	 Arrays.sort(dept);
	 int i=0,j=0,max=0;
	 int pltfrm=0;
	 	while(i<n && j<n){
	 		if(arv[i]<dept[j])
	 		{
	 			pltfrm++;
	 			i++;
	 			if(pltfrm > max)
		 			max=pltfrm;
	 		}
	 		else{
	 			pltfrm--;
	 			j++;
	 		}
	 			
	 		
	 	}
	 	System.out.println(max);
	 
	}

}
