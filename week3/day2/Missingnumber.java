package week3.day2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Missingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {1,2,3,3,4,5,6,7,9,9,10};
		
		
		Set<Integer> set=new TreeSet<Integer>();
		List<Integer> list=new ArrayList<Integer>();
		
		for (int i = 0; i < num.length; i++) {
			set.add(num[i]);
			
		}
		System.out.println(set);
		
		System.out.println(list.addAll(set));
		
	}
			
			
			
			
		

	}


