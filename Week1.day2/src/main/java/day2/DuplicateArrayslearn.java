package day2;

public class DuplicateArrayslearn {

	public static void main(String[] args) {
		int n[]= {2,5,7,9,2,5};
		for(int i=0;i<n.length;i++)
		{
			for (int j=i+1; j<n.length;j++)
			{
				if (n[i]==n[j])
				{
				System.out.println(n[i]);
				}
			}
		}
		

	}

}
