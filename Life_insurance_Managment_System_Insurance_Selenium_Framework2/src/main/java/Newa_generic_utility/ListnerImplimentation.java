package Newa_generic_utility;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;
import com.mysql.cj.protocol.a.LocalDateTimeValueEncoder;

import net.bytebuddy.implementation.bind.MethodNameEqualityResolver;

public class ListnerImplimentation implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result) 
	{
		
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{		
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String methodname = result.getMethod().getMethodName();
		TakesScreenshot tss = (TakesScreenshot)Baseclass.sdriver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		LocalDateTime ldt = LocalDateTime.now();
		String dateTime= ldt.toString().replace(" ","_").replace(":","_");
		File dst=new File("./ScreenShot/"+methodname+"_"+dateTime +".png");		
		try 
		{
			FileUtils.copyFile(src, dst);
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{		
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{
		
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context)
	{
		
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) 
	{

		ITestListener.super.onFinish(context);
	}
   
}
