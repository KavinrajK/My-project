package Programs;

public class object {

	int a=18;  // Non static variable
	String s="name";
	static int b=10;  // static variable
	
	public void student()  // Method name 
	{
		System.out.println("Pass");
	}
	public static void main(String[] args) 
	{
	
		object o=new object();   // Object creation // Classname Ref.value =new classname() ;
		o.student();
		System.out.println(o.a);
		
		
		
	}

}
