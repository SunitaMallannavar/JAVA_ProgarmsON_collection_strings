package java_programs_on_Strings;

public class ReversOfString1stHalfSepand2ndHalfSep {

	
		 // Function to concatenate two 
	    // different halves of given strings
	    public static void swapTwoHalves(String a,
	                                     String b)
	    {
	        int la = a.length();
	        int lb = b.length();
	          
	        // Creating new strings by
	        // exchanging the first half
	        // of a and b. Please refer below 
	        // for details of substring.
	        // https://www.geeksforgeeks.org/java-lang-string-substring-java/
	        String c = a.substring(0,la/2) + 
	                   b.substring(lb/2,lb);
	        String d = b.substring(0,lb/2) + 
	                  a.substring(la/2,la);
	              
	        System.out.println(c + "\n" + d);
	    }
	    public static void main(String[] args) {
	        // Given strings
	        String a = "remuneration";
	        String b = "day";
	          
	        // Calling function
	        swapTwoHalves(a, b);

	}

}
