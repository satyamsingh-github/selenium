package ElevateWings1;

import java.lang.reflect.Array;

public class CoreJavaLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/////Variable in Java
		int num = 4;
		String text = "satyam";
		double dec = 5.6666;
		boolean choice = true;
	    System.out.println(num + text + dec + choice);
		
	    /////Declaring Array
	    //Type 1 : Declared array and allocate memory for elements(This can be used when you are getting value from browsers).
	    int[] arr = new int[5];
	    arr[0] = 1;
	    arr[1] = 2;
	    arr[2] = 3;
	    arr[3] = 4;
	    arr[4] = 7;
	    
	    System.out.println(arr[3]);
	    
	    //Type 2 : Declared array and directly enter values.
	    
	    int[] arr2 = {1,5,6,8,9};
	    
	    System.out.println(arr2[3]);
	    
	    //For loop for printing values from array.
	    for (int i=0 ;i < arr2.length ; i++)
	    {
	    	System.out.println(arr2[i]);
	    }
	    
	    
	    String[] arr3 = {"satyam", "singh"};
	    for (int i=0 ;i < arr3.length ; i++)
	    {
	    	System.out.println(arr3[i]);
	    }
	    
	    //Enhanced For Loop
	    
	    String[] name = {"rahul","suresh","mahesh","piyush","dayal"};
	    for(String s : name)
	    {
	    	System.out.println(s);
	    }
	    
	    //Enhanced For Loop using conditional statement Inside the loops.
	    int[] number = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	    for (int i = 0; i<number.length;i++)
	    {
	    	if(number[i] % 2 == 0)
	    	{
	    		System.out.println(number[i]+ "is divisible by the number");
	    		break; // After the first response the code will stop. 
	    	}
	    	else
	    	{
	    		System.out.println(number[i] + "is not divisible by the number");
	    	}
	    	
	    }
	    
	}

}
