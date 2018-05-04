package genericlib;
import java.io.File;

import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import baseclass.BaseClass;
public class SampleListener implements ITestListener {
	int count=0;
	@Override
	public void onTestFailure(ITestResult result) {
		String testname=result.getMethod().getMethodName();
		EventFiringWebDriver driver=new EventFiringWebDriver(BaseClass.driver);
		File srcfile=driver.getScreenshotAs(OutputType.FILE);
		File dstflie=new File("./sreenshots/"+testname+count+".png");
		count++;
try {
	FileUtils.copyFile(srcfile, dstflie);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
