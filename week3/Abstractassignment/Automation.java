package Abstractassignment;

public class Automation implements Language,TestTool{
	
	
	public void java() {
		
		System.out.println("Java Language");
		
	}
	public void Selenium() {
		System.out.println("This is Selenium tool");
	}
	
	public void ruby() {
		System.out.println("Ruby Language");
	}
	
	public void python() {
		System.out.println("Python Language");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation a=new Automation();
		a.python();
		a.ruby();
		a.Selenium();
		a.java();
		
		

	}

}
