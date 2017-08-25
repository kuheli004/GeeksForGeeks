package Stack;

public class Tower {

	public static void main(String[] args) {
		tower(2,'S','D','A');

	}

	private static void tower(int n, char source , char dest, char aux) {
		if(n==0)
			return;
		
		tower(n-1,source,aux,dest);
		System.out.println("Move the Disk "+n+" from "+source+" to "+dest);
		tower(n-1,aux,dest,source);
		
	}

}
