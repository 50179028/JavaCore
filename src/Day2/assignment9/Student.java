package Day2.assignment9;

public class Student {
    private static int Studentid = 550;
    private char StudentType;
    private String StudentName;

    Student(){
        Studentid ++;
        this.StudentName="ABC";
        this.StudentType='D';
    }

    Student (char sType, String fname, String lname){
        Studentid++;
        this.StudentType = sType;
      this.StudentName = fname + lname;
    }


    public void displayDetails(Student s){
        System.out.println(Studentid);
        System.out.println(s.StudentType);
        System.out.println(s.StudentName);
    }
}
