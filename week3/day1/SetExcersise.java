package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExcersise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			String companyName = "google";
			String s= "";
			char ch[] = companyName.toCharArray();
			
			Set<String> setStrng = new LinkedHashSet<String>();
			
			for (int i = 0; i < ch.length; i++) {
				setStrng.add(ch[i]+s);
				
				}
			
			System.out.println(setStrng);
}}
