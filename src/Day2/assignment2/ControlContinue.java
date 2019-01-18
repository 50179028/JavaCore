package Day2.assignment2;

public class ControlContinue {
	public static void main(String args[]) {
		boolean bool = true;
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<10; j++) {
				
				if(j>5){
					
					continue;
				}
				System.out.print(j + "\t");
			}
			System.out.println("Outer loop");
		}
		System.out.println("end");
	}

}
