package Day2.assignment4;

public class CourseManagement {
	public static void main(String args[]) {
		Student Student1 = new Student();
		Student1.setStudentID(10, "yash");
		System.out.println(Student1.getStudentID());
		System.out.println(Student1.getname());
		
		Student1.setStudentType('s');
		System.out.println(Student1.getStudentType());
	}
	
}

