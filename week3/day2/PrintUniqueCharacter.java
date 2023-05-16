package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myname="Priyanka";
		char[] c=myname.toCharArray();
		
		Set<Character> nameset=new HashSet<Character>();
		for (int i = 0; i < c.length; i++) {
			nameset.add(c[i]);
		}
		
	System.out.println(nameset);

	}

}
