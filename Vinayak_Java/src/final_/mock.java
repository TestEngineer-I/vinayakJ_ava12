package final_;

public class mock {

	
	public static void main(String[] args) {
		
		   try {
			   
			   int data= 25/0;
			   
			   System.out.println(data);
			   
		   }
		   
		   catch (ArithmeticException e) {
		     
		   
		   }
		   
		   finally {
			   
			   System.out.println("final");
		   }
		   
		   
		   System.out.println("contine....");
					
			}
}
