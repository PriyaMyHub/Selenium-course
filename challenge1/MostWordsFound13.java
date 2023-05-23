package challenge1;

public class MostWordsFound13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] sentence= {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		int words=0;
		
		for (int i = 0; i < sentence.length; i++) {
			
			String[] arr=sentence[i].split(" ");
			
			if(arr.length>words)
			{
				words=arr.length;
			}
			
		}
		
System.out.println(words);
	}

}
