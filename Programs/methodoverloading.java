package Programs;

public class methodoverloading {
                                    // Number of arguments
	
	/* public static void add(int a,int b) {
		 
		 System.out.println("method overloading");
		 
	 }
	public static void add(int c,int d,int e) {
		
		System.out.println("compile polymorphism");
	}
	
	
	public static void main(String[] args) {
		add(10,20);
		
		add(30,35,40);
		
	

	}*/

	
	public static int add(int a,int b) {
		return a+b;
	}
	public static int add(int c,int a, int b) {
		return a+b+c;
		
	}
	
	public static void main(String[] args) {
	
		System.out.println(methodoverloading.add(10,20));
		System.out.println(methodoverloading.add(10,10,10));
		
	}
}
