package Programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Throws {

	public static void main(String[] args) throws Exception {

		File fr=new File("C:\\Users\\K A V I N\\Desktop\\new.txt");
		
		BufferedReader br =new BufferedReader(new FileReader(fr));
		
		String st;
		
		while((st=br.readLine())!= null) {
			System.out.println("st");
		}
		br.close();
	}

}
