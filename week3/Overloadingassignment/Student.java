package Overloadingassignment;

public class Student {
	
	public void getStudentInfo(int id){
		
		System.out.println(" Student id is: "+ id);
		
	}
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Student name is: "+name +"   "+ "Student id is: "+ id);
	}
	
	public void getStudentInfo(double phonenumber,String emailid)
	{
		System.out.println("Student contact number is: "+phonenumber + "    "  +"Student emailid is: "+emailid);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.getStudentInfo(1086670, "Priyanka");
		s.getStudentInfo(177890);
		s.getStudentInfo(867893889, "priyankatthiyagu@gmail.com");
		

	}

}
