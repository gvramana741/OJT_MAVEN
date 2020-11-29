package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@Parameters({"URL" ,"APIKey/username"})
	@Test
	public void webloginHomeloan(String urlname,String key)
	{
		//selenium
		System.out.println("webloginhome");
		System.out.println(urlname);
		System.out.println(key);

	}
	
	@Test(groups= {"smoke"})
	public void Mobileloginhomeloan()
	{
		//Appium
		System.out.println("Mobileloginhome");

	}
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("Im no 1");
	}
	@Test
	public void LoginAPIhomeloan()
	{
		//Rest API Automation
		System.out.println("APIloginhome");

	}

}
