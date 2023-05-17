package challenge1;



public class Challange4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {1,3,9,9,3,8,1,0,0};
		int res=0;
		for(int i=0;i<=num.length-1;i++) 
		{
		res=res^num[i];
		}
		System.out.println(res); 
	

}
}