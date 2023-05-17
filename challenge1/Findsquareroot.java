package challenge1;

public class Findsquareroot{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 3;
		int a=1;
		int squareRoot = 1;
		for (int i = 1; i <= input; i++) {
			squareRoot = squareRoot-(squareRoot*squareRoot-input)/(2*squareRoot);
		}
		
		if(a*a == input) {
			System.out.println("Square Root : " +squareRoot);
		}
		else {
			System.out.println("Not Square Root : " +(squareRoot-1));
		}

	}}































