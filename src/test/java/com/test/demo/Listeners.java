package com.test.demo;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.base.test.BaseTest;
import com.utility.GetScreenshot;

public class Listeners extends BaseTest implements ITestListener{
	
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
		  
		  

	        if (result.getStatus() == ITestResult.FAILURE)
	        {
	            String screenShotPath="";
				
	            extentTest.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
	            extentTest.fail(result.getThrowable());
	            try {
					extentTest.fail("Snapshot below: " + extentTest.addScreenCaptureFromPath(screenShotPath));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	        else if(result.getStatus() == ITestResult.SUCCESS)
	        {
	        	extentTest.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
	        }
	        else
	        {
	        	extentTest.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
	        	extentTest.skip(result.getThrowable());
	        }
	        extentReports.flush();
		  }
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("On Skipped............");
	  }
	
	
}
