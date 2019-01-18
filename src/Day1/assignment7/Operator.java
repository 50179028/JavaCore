package Day1.assignment7;

public class Operator {
	public static void main (String [] args) {
		boolean bool1 = true;
		boolean bool2 = true;
		boolean bool3 = true;
		
		if(bool1 || (bool1 && (bool2=false))) {
			System.out.println("success");
		}
		else{
			System.out.println("Failure");
		}
		System.out.println("bool2 value: " + bool2);
	}

}
