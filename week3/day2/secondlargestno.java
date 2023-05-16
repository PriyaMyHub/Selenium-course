package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class secondlargestno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer> largest=new TreeSet<Integer>();
		List<Integer> largestlist=new ArrayList<Integer>();
		
		for (int i = 0; i < data.length; i++) {
			
			largest.add(data[i]);
			
			
		}
			largestlist.addAll(largest);
			
			System.out.println("This is a list: "+largestlist);
			
			System.out.println("The second largest number is :"+largestlist.get(largestlist.size()-2));
			
			
				
				
			}
			
		}
	
		

	


