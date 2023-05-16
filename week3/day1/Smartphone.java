package week3.day1;

public class Smartphone extends LearnOverridingAndroid {
	public void takeVideo()
	{
		System.out.println("Take video from smartphone");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smartphone s=new Smartphone();
		s.takeVideo();

	}

}
