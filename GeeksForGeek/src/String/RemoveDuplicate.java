package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		String str="geeks for geeks";
		Set<Character> li=new LinkedHashSet<Character>();
		for(int i=0;i<str.length()-1;i++)
		{
				li.add(str.charAt(i));

		}
		
		for(char c:li)
		System.out.print(c);

	}

}
