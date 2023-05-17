package challenge1;

public class Nonrepeatingcharacter {

	
		public  int firstUniqChar(String s) {
		     for (int i = 0;  i<s.length();i++)
		     {
		    	 if (s.indexOf(s.charAt(i))== s.lastIndexOf(s.charAt(i)) ) {
	                    return i;
	                }
		    	
		    	 }
	      
			return -1;    
		}
			
		public static void main(String[] args) {
			
			String input="aabb";
			
			
			Nonrepeatingcharacter res=new Nonrepeatingcharacter();
			System.out.println(res.firstUniqChar(input));

	
	
}

}	

