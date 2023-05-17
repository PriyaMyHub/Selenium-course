package challenge1;

public class IsHappyNumber {

	public int getSum(int num){

		int rem=0,sum=0;
	
		while(num>0) {

			rem=num%10;
			sum=sum+rem*rem;
			num=num/10;

		}
		return sum;

	}
	public static void main(String[] args) {

		int num=70;
		int res=num;
		IsHappyNumber number=new IsHappyNumber();
	
		while(res!=1 && res!=4) {
			res= number.getSum(res);
		}
		
      if(res==1)
    	  System.out.println("Happy Number");
      else
    	  System.out.println("Not a Happy Number");

	}

}