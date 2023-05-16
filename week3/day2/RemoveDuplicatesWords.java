package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> removedupwords=new LinkedHashSet<String>();
		String text = "We learn java basics as part of java sessions in java week1";
		String[] arr=text.split(" ");
		
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			
			removedupwords.add(arr[i]);
			
		}
		System.out.println(removedupwords);
		 }
			
		
		
		
		 }
	
		

		
		
	

