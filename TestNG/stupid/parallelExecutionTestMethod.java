package stupid;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class parallelExecutionTestMethod 
{ 
@Test 
public void firstTest() 
{ 
  System.out.println("First Test Method"); 
} 
@Test 
public void secondTest() 
{ 
   System.out.println("Second Test Method"); 
  } 
}