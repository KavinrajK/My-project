package Programs;

public class overloadingtype {

	public static void type(int a,String b, double c) {
		System.out.println("Type of arguments");
		
	}
	
	public static void type(String d,int q) {
		System.out.println( "overloading");
		
	}
	
	
	public static void main(String[] args) {
		
type(12,"raja",7.8);
type("ravi",30);
	}

}
