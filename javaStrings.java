package ElevateWings1;

public class javaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String is an object that represents sequence of characters.
		// There are two ways
		
		//Way 1: (String Literal) If the string stored are same , s1 data will not be stored, it will just point toward "s" string i.e only one object will be created.
		
		String s = "Satyam is amazing person";
		String s1 = "satyam is damn mazing";
		
		
		// Even though the content is same, new objects will be created.
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		String s4 = new String("Welcome44");
		
		String[] splittedstring= s.split(" ");
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
		System.out.println(splittedstring[2]);
		
		//For Printing individual characters in right order
		
		for (int i =0 ; i <s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
		
		//For Printing individual characters in reverse order
		for (int  i=s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		}
	}

}
