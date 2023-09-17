package stupid;


import org.testng.annotations.Test;

public class TestNGAttribute {


		
		@Test(enabled=false)
		public void enabled()
		{
			System.out.println("This method has been disblaed");
		}
		
		@Test(description="This is descriptiontestcase")
		public void description()
		{
			System.out.println("This is description testcase");
		}

		@Test(dependsOnMethods= {"Dependent","Dependent2"}) 
		public void dependsOnMethods()
		{
			System.out.println("depends On Method Dependent and Dependent2 ");
		}

		@Test
		public void Dependent()
		{
			System.out.println("Dependent method 1");
		}

		@Test
		public void Dependent2()
		{
			System.out.println("Dependent method 2");
		}

		@Test(priority=2)  
		public void priority2()
		{
			System.out.println("priority is 2");
		}

		@Test(priority=-1) 
		public void priorityNeg1()
		{
			System.out.println("priority is -1");
		}
		
		@Test(priority=1) 
		public void priority1()
		{
			System.out.println("priority is 1");
		}


		@Test(groups= {"software"})  

		public void Grouping1()
		{
			System.out.println("Grouping1");
		}
		@Test (groups= {"software"}) 
		public void Grouping2()
		{
			System.out.println("Grouping2");
		}
		
		@Test(timeOut=200)  
		public void timeOut()
		{
			System.out.println("timeOut for 2 seconds");
		}
		
		@Test
		public void excluded()
		{
			System.out.println("excluded");
		}
		
		@Test
		public void included()
		{
			System.out.println("included");
		}
		
		@Test
		public void RegularExpression1()
		{
			System.out.println("RegularExpression1");
		}
		
		@Test
		public void RegularExpression2()
		{
			System.out.println("RegularExpression2");
		}
}


