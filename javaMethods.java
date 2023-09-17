package ElevateWings1;

public class javaMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//accessing from outside main function. 
		javaMethods d = new javaMethods();
		String name = d.getData();
		System.out.println(name);
		
		//Accessing from different class
		javaMethods2 e = new javaMethods2();
		e.getUserData();
		
		getData1();
		String name1 = d.getData1();
		System.out.println(name1);

	}
	
	public String getData()
	{
		System.out.println("Hello");
		return "satyam is amazing";
	}
	
	//When a method is marked as Static, it becomes part of the class and can be called directly
	public static String getData1()
	{
		System.out.println("Hello static Method");
		return "satyam static method";
	}
}
