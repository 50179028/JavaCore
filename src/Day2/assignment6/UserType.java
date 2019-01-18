package Day2.assignment6;

public class UserType {
	String name;
	UserType(String parameterval){
		name = parameterval;		
	}
UserType(){
	this("student");
}
public static void main (String args[]) {
	UserType ut1 = new UserType("faculty");
	UserType ut2 = new UserType();

	System.out.println(ut1.name);
	System.out.println(ut2.name);
}
}
