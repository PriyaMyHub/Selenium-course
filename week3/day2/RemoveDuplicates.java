package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="PayPal India";
		char[] arr=s.toLowerCase().toCharArray();
		
//		Declare a Set as charSet for Character
		Set<Character> charSet=new LinkedHashSet<Character>();
		
//		Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupCharSet=new LinkedHashSet<Character>();
		
		for (int i = 0; i < arr.length; i++) {
			boolean add=charSet.add(arr[i]);
//			if the character is already in the charSet then, add it to the dupCharSet
			if(!add)
			{
				dupCharSet.add(arr[i]);
				if(dupCharSet.contains(arr[i])==charSet.contains(arr[i]));
				charSet.remove(arr[i]);
			}
			
		}
		
		System.out.println(charSet);
		System.out.println(dupCharSet);
		
		
		
		
	}
}
		
	
	


