package challenge1;

public class Jewels10 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		String jewel="di";
		String stone="diamond";
		int num=0;
		
		for (int i = 0; i < stone.length(); i++) {
			for (int j = 0; j < jewel.length(); j++) {
				
				if(stone.charAt(i)==jewel.charAt(j)) {
					
					num++;
				}
					
				
			}
		
		}
		System.out.println(num);
	}

}
