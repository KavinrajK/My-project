package Programs;

public class staticmethod {

	// static method inside a Non static in 3 ways
	//--------------------------------------------------------
	
	static String D= "Hello "; // static variable
	 int Q=190;                 // non static variable
	 
	public static void kavin()  // static method
	{
		
		System.out.println( "GOOD MORNING");
		
	 }
		public void raja()  // non static method
		{
			System.out.println("FRIENDS");
		}
	
	
	public static void main(String[] args) {
		System.out.println(D);   // Direct method
		kavin();                   // Direct method
		
		
		// By object 
		staticmethod Method =new staticmethod();
		System.out.println(Method.D);
		Method.kavin();
		Method.raja();
		
		//Classname.methodname/variable name
		
		System.out.println(staticmethod.D);
		staticmethod.kavin();
		
		
		
		
		
		
	}

}
