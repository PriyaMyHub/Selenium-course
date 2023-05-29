package challenge1;

public class Sortsentence14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			String input="is2 sentence4 This1 a3";
			String[] split = input.split(" ");
	        String[] sorted = new String[split.length];

	        for (String str : split) {
	            int len = str.length();
	            int index = str.charAt(len - 1) - '0';
	            sorted[index - 1] = str.substring(0, len - 1);
	        }
	         String s1=String.join(" ", sorted);
	         System.out.println(s1);
		

	}

}
