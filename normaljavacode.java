package ElevateWings1.javaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class normaljavacode {

	
	public  void regular() {
		// TODO Auto-generated method stub
      ArrayList<String> names = new ArrayList<String>();
      names.add("Abhijeet");
      names.add("Sunil");
      names.add("Ankur");
      names.add("Shivam");
      names.add("Satyam");
      names.add("Abhay");
      
      int count=0;
      
      for(int i=0; i<names.size();i++)
    	  {
    	  String actual = names.get(i);
    	  if(actual.startsWith("A"));
    	    {
    		  count++;
    	    }
    	  }
      System.out.println(count);
	}
	
	
@Test
 public  void streamFilter()
    {
	 ArrayList<String> names1 = new ArrayList<String>();
     names1.add("Abhijeet");
     names1.add("Sunil");
     names1.add("Ankur");
     names1.add("Shivam");
     names1.add("Satyam");
     names1.add("Abhay");
     
    long c=  names1.stream().filter(s->s.startsWith("A")).count();
    System.out.println(c);
    
    long d=Stream.of("Abhijeet","Sunil","Ankur","Shivam","Satyam","Abhay").filter(s->s.startsWith("A")).count();
    System.out.println(d);
    }

@Test

public void StreamMap()
    {
	Stream.of("Abhijeet","Sunil","Ankur","Shivam","Satyam","Abhay").filter(s->s.endsWith("m")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
	List<String> names= Arrays.asList("Abhijeet","Sunil","Ankur","Shivam","Satyam","Abhay");
	names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
    }
	
}


