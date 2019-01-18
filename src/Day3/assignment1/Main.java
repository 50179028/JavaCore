package Day3.assignment1;

public class Main {
    public static void main (String args[]) {
        Student StudentOne = new Student('D', "Bony", "Thomas");
        StudentOne.displayDetails(StudentOne);

        Student newobject = new Student();
        newobject.displayDetails(newobject);

        Student Student1 = new Student('D', "Bony", "Thomas");
        Student1.displayDetails(newobject);
    }
}
