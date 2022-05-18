package except;

public class Tester {
	public static void main(String args[]) {
		A obj = new A();
		obj.display();
	}

}

class A {
	void display() {
		int a;
		int x[] = new int[5];
		try {
			try {
				a = 5 / 2;
				x[5] = 6;
			} 
			/*catch (ArithmeticException e) {
				System.out.println("cannot perform division" + e);
			}  
				  catch (ArrayIndexOutOfBoundsException e) { System.out.println("indexcrossed"
				  + e); }
				 
		}*/
      catch (Exception e) {
			System.out.println("UnknownException" + e);
		} 
		
		}
		finally {
			System.out.println("bye");
		}
}}