package java_programs_on_Strings;

public class PalindromOrNot {

	public static void isPalindromOrNot(int num)
	{
		
     int r=0;
     int sum=0;
     int t;
     //Break point
     t=num;
     
    
   while(num>0)
     {
    	r= num%10; // 1get the reminder
    	sum=(sum*10)+r; //1
    	num=num/10; //15
    	
     }
     
     if(t==sum)
     {
    	 System.out.println("Paliondrom number");
     }
     else
     {
    	 System.out.println("Not palindrom number");
     }
     
   
	}
	  public static void main(String[] args)
	  {
		  isPalindromOrNot(151);
	  }
	  }


