package alpha;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		   Scanner g=new Scanner(System.in);
	   	     System.out.println("Enter the alphabet");
	   	     char c=g.next().charAt(0);
		    
		     if('A'<=c && 'Z'>=c)
		     {
		    	 System.out.println("Alphabet");
			    	
		     }
		     
		     else if ('a'<=c && 'z'>=c)
		    {
		    	 System.out.println("Alphabet");
			    	
		    
		    }
		    
		    else {
		   
		    	 System.out.println("No");
		    	
		    }

	}

}
