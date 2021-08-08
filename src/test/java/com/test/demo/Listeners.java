package com.test.demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	@Override
	  public  void onTestStart(ITestResult result) {
		   System.out.println("Test Started............");
		  }

	@Override
	 public void onFinish(ITestContext context) {

		  System.out.println("On Finish............");
		  }
	
	
	@Override
	 public void onTestSuccess(ITestResult result) {
		  System.out.println("On Success............");
		  }

	@Override
	 public void onTestFailure(ITestResult result) {
		  System.out.println("On Failure............");
		  }
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("On Skipped............");
	  }
	
	
}
