package week3.day1;

public class Android implements AndroidInterface{
	
	public void openApp() {
		System.out.println("Open an App");
	}


	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.println("Watch Video");
	}
		
		public static void main(String[] args){
			
			
			
			Android a=new Android();
			a.openApp();
			a.playVideo();
			
			

		}


		
	}


