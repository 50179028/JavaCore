package Day2.assignment5;

public class Student {
	public int Studentid;
	public char StudentType;
	
public Student(){
	 Studentid =10;
	 StudentType = 'f';	 		
	}
public Student(int id, char type)
{
	this.Studentid = id;
	this.StudentType = type;
}
	public int getStudentid()					
	{
		return Studentid;
	}
	
	public char getStudentType() {
		return StudentType;
	}



}
