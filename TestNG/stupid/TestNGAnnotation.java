package stupid;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;

public class TestNGAnnotation {
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("BeforeSuite");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("BeforeTest");
	}

	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass");
	}

	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod");
	}

	@Test
	public void test()
	{
		System.out.println("test");
	}
	
	@Test
	public void test1()
	{
		System.out.println("test1");
	}

	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod");
	}

	@AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass");
	}

	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest");
	}
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("AfterSuite");
	}

}
