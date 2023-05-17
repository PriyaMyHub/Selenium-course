package challenge1;

import java.util.Arrays;

public class Arraymajorityele6 {
	public static void main(String[] args) {
		
	int[] arr = { 2,9,9,9,9,4,4};
	Arrays.sort(arr);
    System.out.println(arr[(arr.length-1)/2]); // return the middle element of array

}}