package DivCon;

public class KthElementOfTwoSortedArray {

	public static void main(String[] args) {
	int arr1[]= {2, 3, 6, 7, 9};
	int arr2[]= {1,4,8,10};
	int k=5;
	//System.out.println(KthElement(arr1,arr2,0,0,arr1.length-1,arr2.length-1,k));
	System.out.println(findKth(arr1,0,arr2,0,k));
	}


	private static int findKth(int[] A, int i,int[] B, int j, int k) {
		   // Here is the simple trick. We've just changed the parameter order if first array is not smaller.
	    // so that later we won't need to write if-else conditions to check smaller/greater stuff
	    if((A.length - i) > (B.length - j))
	    {
	        return findKth(B, j, A, i, k);
	    }

	    if(i >= A.length) 
	    {
	        return B[k - 1];
	    }
	    if(k == 1)
	    {
	        return Math.min(A[i], B[j]);
	    }

	    int aMid = Math.min(k / 2, A.length - i);
	    int bMid = k - aMid;

	    if(A[i + aMid - 1] <= B[j + bMid - 1])
	    {
	        return findKth(A, i + aMid, B, j, k - aMid);
	    }

	    return findKth(A, i, B, j + bMid, k - bMid);
	}


	private static int  KthElement(int[] arr1, int[] arr2, int start1, int start2, int end1, int end2, int k) {
		if(start1==end1)
			return arr2[k];
		if(start2==end2)
			return arr1[k];
		int mid1=(end1-start1)/2;
		int mid2=(end2-start2)/2;
		   if (mid1 + mid2 < k)
		    {
		        if (arr1[mid1] > arr2[mid2])
		            return KthElement(arr1,arr2,start1, start2 + mid2 + 1, end1, end2,
		                k - mid2 - 1);
		        else
		            return KthElement(arr1,arr2,start1 + mid1 + 1, start2, end1, end2,
		                k - mid1 - 1);
		    }
		    else
		    {
		        if (arr1[mid1] > arr2[mid2])
		            return KthElement(arr1,arr2,start1, start2, start1 + mid1, end2, k);
		        else
		            return KthElement(arr1,arr2,start1, start2, end1, start2 + mid2, k);
		    }
		
	}

}
