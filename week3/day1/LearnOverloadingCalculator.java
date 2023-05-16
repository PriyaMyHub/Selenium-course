package week3.day1;

public class LearnOverloadingCalculator {
	
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public void multiple(double a, double b)
	{
		System.out.println(a*b);
	
	}
	public void multiple(float a, float b) {
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnOverloadingCalculator c=new LearnOverloadingCalculator();
		c.add(2, 5);
		c.add(2, 5, 1);
		c.multiple(12, 12);
		c.multiple(13.5f, 13.5f);
		
		
		
		
		
		
		

	}

}
