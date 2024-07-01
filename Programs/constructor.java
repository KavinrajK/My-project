package Programs;

public class constructor {

	
	int a=90;
	
	public constructor()      // default constructor(method with out arguments)
	{
		System.out.println("Hello");
	}
	
	public constructor(String s)  //Parameterized constructor 
	{                                // (method with arguments)
		
		System.out.println(s);
		
	}
	
	public static void main(String[] args) {
		
		constructor c=new constructor();
		
	       
		constructor c1=new constructor("captain");
		
		

	}

}
