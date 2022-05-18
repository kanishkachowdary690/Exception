package except;

public class Tester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=9,j=0;
		try {
			int k=i+j;
			if(k<10) {
				throw new MyException("k cannot be less than 10");
			}
			System.out.println(k);
		}
		
		  catch(ArithmeticException e)
		{ System.out.println("Arithmetic"+e); 
		}
		 
		catch(Exception e) {
			System.out.println("unkown"+e);
		}
		
		finally {
			System.out.println("finally done");
		}

	}

}
class MyException extends Exception{
	
	  public MyException(String str) { 
		  super(str); 
		  }
	 
}
