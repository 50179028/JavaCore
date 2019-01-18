package Day3.assignment1;

public class Student {
    private static int Studentid = 550;
    private char StudentType;
    private String StudentName;
    public static int StudentCount = 0;


    Student(){
        Studentid ++;
        StudentCount ++;
        this.StudentName="ABC";
        this.StudentType='D';
    }

    Student (char sType, String fname, String lname){
        Studentid++;
        StudentCount++;
        this.StudentType = sType;
      this.StudentName = fname + lname;
    }


    public void displayDetails(Student s){
        System.out.println(s.Studentid);
        System.out.println(s.StudentType);
        System.out.println(s.StudentName);
        System.out.println("Student Count : "+StudentCount);
    }
    public static void main (String args[]) {
        Student StudentOne = new Student('D', "Bony", "Thomas");
        StudentOne.displayDetails(StudentOne);

        Student newobject = new Student();
        newobject.displayDetails(newobject);

        Student Student1 = new Student('D', "Bony", "Thomas");
        Student1.displayDetails(newobject);
    }
}
