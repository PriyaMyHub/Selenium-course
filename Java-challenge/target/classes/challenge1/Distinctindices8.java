package challenge1;

public class Distinctindices8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {1,2,3,1,2,3};
		int k=2;
		boolean number=false;
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if((num[i]==num[j]) && Math.abs(i-j)<=k)
				{
					number=true;
				
					break;
				}
			}
		
		
		}
		
		System.out.println(number);

	}

}
