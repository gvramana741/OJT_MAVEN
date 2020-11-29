package test;

import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

//ITestListener interface which implements Testng listeners
public class Listener implements ITestNGListener{
	
    public void onTestSuccess(ITestResult result) {
System.out.println("successful");
	}
}

