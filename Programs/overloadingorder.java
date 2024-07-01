package Programs;

public class overloadingorder {
	public static void order(double a,String s) {
		System.out.println("order of arrguments");
	}
	
	public static void order(String s ,double c) {
	  System.out.println("order"); 
		
	}
	public static void main(String[] args) {
		order(11.2,"sarth");
		order("pluro",20.34);
		
		

	}

}
