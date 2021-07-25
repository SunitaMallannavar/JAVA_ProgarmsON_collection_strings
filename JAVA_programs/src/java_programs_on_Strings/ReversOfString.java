package java_programs_on_Strings;

public class ReversOfString {

	public static void main(String[] args) {
		String str= "APPLE";
		 
		char[] ch= new char[str.length()];
		for(int i=0;i<str.length() ;i++) {
			ch[i]=str.charAt(i);
		}
		String str1=" ";

		for (int i = 0; i < str.length() ; i++) {
        	 str1= ch[i]+str1;
        }
           
 
        System.out.println(str1);

	}

}
