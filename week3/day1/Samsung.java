package week3.day1;

public class Samsung extends AndroidTV{
	
	public void openApp() {
		System.out.println("OpenApp from Samsung");
	}
	
	public void playVideo() {
		System.out.println("Play video from samsung");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Samsung s=new Samsung();
		s.playVideo();

	}


}
