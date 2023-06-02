package challenge1;

import java.util.HashSet;
import java.util.Set;

public class Sumofuniquenum17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {1,2,3,2,3,4};
		
		Set<Integer> set1=new HashSet<Integer>();
		Set<Integer> set2=new HashSet<Integer>();
		
		for (int i = 0; i <num.length; i++) {
			
			boolean nums=set1.add(num[i]);
			if(!nums)
			{
				set2.add(num[i]);
				if(set2.contains(num[i])==set1.contains(num[i]))
				{
					set1.remove(num[i]);
				}
			}
			
		}

		//System.out.println(set1);
		
		int sum = 0;
		for( int i : set1) {
		    sum=sum +i;
		}

		System.out.println(sum);
		
		
	}


}
