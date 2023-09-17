package TestNGListners;

import org.testng.annotations.Test;

public class IExecutionListenerWithExample {

/*	As the name suggests, it monitors the beginning and end of TestNG execution. This listener is mainly used to start/stop the server while starting or ending code execution. It may also inform respective stakeholders via email that execution shall start or when it ends. It has two methods:

		onExecutionStart() – invoked before TestNG starts executing the suites
		onExecutionFinish() – invoked after all TestNG suites have finished execution
		Let’s look at an example. This example has a class with 5 methods which shall be executed after the onExecutionStart method of the IExecutionListener interface. After these methods are completed the onExecutionFinish method shall be executed. The two methods in this example highlight the start and end time of the test.
*/
	
@Test
public void method1()
{
System.out.println("this method is method 1");

}

@Test
public void method2()
{
System.out.println("this method is method 2");

}

@Test
public void method3()
{
System.out.println("this method is method 3");

}

@Test
public void method4()
{
System.out.println("this method is method 4");

}

@Test
public void method5()
{
System.out.println("this method is method 5");

}

}