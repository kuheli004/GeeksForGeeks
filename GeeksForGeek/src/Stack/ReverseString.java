package Stack;

public class ReverseString {

		static int top1;
		static int max=15;
		static char[] arr=new char[max];
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("kuheli");
		System.out.print(resverseString(sb).toString());

	}
	
	private static StringBuffer resverseString(StringBuffer sb) {
		int n=sb.length();
	
		for(int i=0;i<n;i++){
			char c=sb.charAt(i);
			push(c);
		}
		
		for(int i=0;i<n;i++){
			char c=pop();
			sb.setCharAt(i, c);
		}
		return sb;
		
		
	}

	private static   char  pop() {
	if(isEmpty())
	{
		System.out.println("Underflow");
		return '1';
	}
	else
	return arr[top1--];
}
private  static void push(char i) {

	if(top1>=(max-1))
		System.out.println("Overflow");
	else{
	
		arr[++top1]=i;
	}
}
private static   boolean isEmpty() {
	return (top1<0?true:false);
}
}
