package Programs;

class Question{
	 int z;
	public void addition(int a,int b) {
		z=a+b;
		System.out.println("The answer of addition:"  + z);
	}
}
class Answer extends Question{
	
	public void substraction(int a,int b) {
		z=a-b;
		
		System.out.println("The answer of substraction:" +z);
	}
}


public class singlelevelinheritance {

	public static void main(String[] args) {
	
Answer A=new Answer();
 A.addition(10, 20);
 
 A.substraction(30, 20);
	}

}
