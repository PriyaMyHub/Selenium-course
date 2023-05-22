package challenge1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Uniquenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,1,2,2};
		
		Map<Integer, Integer> map=new  HashMap<Integer, Integer>();
		
		for(int num:arr)
		{
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		Set<Integer> set=new HashSet<Integer>(map.values());
		if(map.size()==set.size())
		{
			System.out.println(true);
			
		}
		else
		{
			System.out.println(false);
		}
		
		

	}

}
