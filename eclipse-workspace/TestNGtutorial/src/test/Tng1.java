package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Tng1 {
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I eill execute last");
	}
	@Test
	public void Demo()
	{
		System.out.println("hello");
	}

	@AfterSuite
	public void afsuite()
	{
		System.out.println("Im the no 1 from last");
	}
@Test(groups= {"smoke"})

public void secondTest()
{
	System.out.println("bye");
}

}