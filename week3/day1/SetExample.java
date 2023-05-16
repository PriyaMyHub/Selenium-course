package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,3,5,6,7,7,6,5,4,3,2,1};
		Set<Integer> set=new LinkedHashSet<Integer>();
		
		
		for (int i = 0; i < num.length; i++) {
			set.add(num[i]);
			System.out.println(num[i]);
			
		}
	

	}

}
