package com.hra.GenericUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementClass implements ITestListener {
	ExtentReports report;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		test=report.createTest(methodname);
		Reporter.log(methodname+"....>TestScript execution started");
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		test.log(Status.PASS, methodname+"....>Passed");
		Reporter.log(methodname+".....>TestScript execution started");
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String FailScript = result.getMethod().getMethodName();
		String FailedScript = FailScript+new JavaUtility().getSystemDateFormate();
		EventFiringWebDriver edriver=new EventFiringWebDriver(BaseClass.sdriver);
		File src = edriver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShot/"+FailedScript+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		test.log(Status.FAIL, FailScript+"....>failed");
		test.log(Status.FAIL, result.getThrowable());
		Reporter.log(FailScript+".....>TestScript failed");
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		test.log(Status.SKIP,methodname+".....>Skipped");
		test.log(Status.SKIP,result.getThrowable());
		Reporter.log(methodname+".....>TestScript Skipped");
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		ExtentSparkReporter htmlreport=new ExtentSparkReporter("./ExtentReport/report.html");
		
		htmlreport.config().setDocumentTitle("SDETReport");
		htmlreport.config().setTheme(Theme.STANDARD);
		htmlreport.config().setReportName("Home Rental");
		 report=new ExtentReports();
		 report.attachReporter(htmlreport);
		 report.setSystemInfo("OS", "WINDOWS");
		 report.setSystemInfo("Base-Browser", "chrome");
		 report.setSystemInfo("Base-url", "http://rmgtestingserver/domain/House_Rental_Application/");
		 report.setSystemInfo("reportername", "ArshadAyyub");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		//consolidate the report
		report.flush();
	
	}
	
	

}
