package Programs;

public class exceptionhandling {

	public static void main(String[] args) throws ArithmeticException
	{
	 
	   
	  
	 try {
	    	int a=20;                  // ArithmeticException
		    System.out.println(a/0);
		    
		    
			   
	    }
	    catch(Exception e) {
	    	System.out.println(e);
	    	
	    }  finally {
	    	
	    	System.out.println( "Exception is proced");
	    }
	    
	    
	 /*   try{
	                                  //ArrayIndexOutOfBoundsException
	    	int dog[] =new int[6];
			   dog[8]=12;
			   
	    }catch(Exception e) {
	    
	    	
	    	System.out.println(e);
	    }*/
	}
	}


