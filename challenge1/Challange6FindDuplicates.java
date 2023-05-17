package challenge1;

import java.util.Arrays;

public class Challange6FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {1,1,3,4};
		boolean r=false;

		
		Arrays.sort(num);
		for(int i=1;i<num.length;i++)
		{
			if(num[i]==num[i-1])
			{
				r=true;	
			
				break;
			}
		
		}
		System.out.println(r);
		
	}
		
	

}
