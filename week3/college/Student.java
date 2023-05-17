package college;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Student name from class--> Student");
	}
	
	public void studentDept() {
		System.out.println("Student Department from class--> Student");
	}
	
	public void studentId() {
		System.out.println("Student id from class-->Student");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentDept();
		s.studentId();
		s.studentName();

	}

}
