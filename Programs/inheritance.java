package Programs;

class Animel{
	int a=10;
	public void name() {
		System.out.println("wild animals");
	}
}
class dog extends Animel{
	
	public void bark() {
		System.out.println("Dog is the pet animal");
	}
}

public class inheritance {

	public static void main(String[] args) {
		dog d=new dog();
		d.bark();
		d.name();
		System.out.println(d.a);

	}

}
