package challenge1;

public class Lenghtoflast2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s="luffy is still joyboy";
		
		String last=s.substring(s.lastIndexOf(" ")+1);
		int l=last.length();
		System.out.println(last+ " "+ l);

	}

}
