package Programs;

public class genric {

	int a;
	char b;
	 
	public void insert(int c,char d) {
		
		a=c;
		b=d;
	System.out.println(a);
	}
	
	public void display() {
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public static void main(String[] args) {
		genric G=new genric();
		G.insert(20, 'K');
		G.display();
		
		G.insert(45, 'A');
		G.display();
		
		

	}

}
