package challenge1;

public class Challenge3Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="A man, a plan, a canal: Panama";
		String rev="";
		String lower=s.replaceAll("(?i)[^A-Z]", "").toLowerCase();
		
		for (int i=lower.length()-1; i>=0; i--)
		{
			rev=rev+lower.charAt(i);
		}
		if(lower.equals(rev))
		{
			
			System.out.println(lower+ " "+ "Is a palindrom phrase");
		}
		else {
			System.out.println(lower+ " "+"Not a palindrome phase");
		}
			
		
		

	}

}
