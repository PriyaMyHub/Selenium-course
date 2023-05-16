package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		String arr[]= {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		int len=arr.length;
		Arrays.sort(arr);
		
		for(int i=len-1;i>=0;i--)
		{
			list.add(arr[i]);
			
		}
		
		System.out.println(list);
		
		}

	}


