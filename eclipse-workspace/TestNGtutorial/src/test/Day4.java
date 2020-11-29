package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day4 {
	@Test
	public void weblogincarloan()
	{
		//selenium
		System.out.println("weblogincar");
	}
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("I will execute before every test method in day3 class");
	}
	@Test
	public void Mobilelogincarloan()
	{
		//Appium
		System.out.println("Mobilelogincar");

	}
	@Test(enabled=false)
	public void Mobileloginmcarloan()
	{
		//Appium
		System.out.println("Mobile SIGIN");

	}
	@Test(dataProvider="getData")
	public void Mobilesignoutmcarloan(String username,String password)
	{
		//Appium
		System.out.println("Mobile SIGNOUT");
		System.out.println("username");
		System.out.println("password");



	}
	@Test()
	public void LoginAPIcarloan()
	{
		
		//Rest API Automation
		//dependsOnMethods={"weblogincarloan","Mobilesignoutmcarloan"});
		System.out.println("APIlogincar");
	}
		@DataProvider
		public Object[][] getData()
		{
			//1stt combination -username password-good credit history=row
			//2nd -username password -no credit history
			//3rd -username password -fraudelent credit history 
			Object[][]data=new Object[3][2];
			//1st set
			data[0][0]="firstsetusername";
			data[0][1]="firstpassword";
			//columns in the row are nothing but values for that purticular combination(row)
			//2nd set
			data[1][0]="secondsetusername";
			data[1][1]="secondpassword";
			//3rd set
			data[2][0]="thirdsetusername";
			data[2][1]="thirdpassword";
			return data;
	}
		

}
