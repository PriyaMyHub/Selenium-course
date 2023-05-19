package challenge1;

import java.util.HashSet;
import java.util.Set;

public class RepeatedCharacter11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abbccbaacz";
		char res=' ';
		
		Set<Character> set=new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			
			
			if (!set.add(s.charAt(i)))
			{
				
				res=s.charAt(i);
				break;
			}
			
			
		}
		
System.out.println(res);
	}

}
