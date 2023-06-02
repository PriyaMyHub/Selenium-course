package challenge1;

import java.util.HashMap;

public class Luckyinteger16 {

	public static int findluckyint(int[] arr) {
		// TODO Auto-generated method stub
		
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		
        	for (int i : arr) 
        	{
        	map.put(i, map.getOrDefault(i, 0) + 1);
        	}
        	
        	for (int j = arr.length - 1; j >= 0; j--)
        	{
            if (map.containsKey(arr[j]) && map.get(arr[j]) == arr[j]) 
            {
            	
            	return arr[j];
            }
        }
        return -1;
    }
	
	public static void main(String[] args) {
		
		int arr[]= {2,2,3,3,4,4,4,3};
		int output=findluckyint(arr);
		
		System.out.println(output);
		
	}
	
}


