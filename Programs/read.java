package Programs;

import java.io.File;
import java.util.Scanner;

public class read {

	    public static void main(String[] args) throws Exception
	    {
	        // pass the path to the file as a parameter
	        File file = new File(
	            "C:\\Users\\K A V I N\\Desktop\\new.txt");
	        Scanner sc = new Scanner(file);
	 
	        while (sc.hasNextLine())
	            System.out.println(sc.nextLine());
	    }
	}

