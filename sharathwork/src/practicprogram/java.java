/**
 * @author admin



 *
 */
package practicprogram;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class java{
	
	public static void main (String []args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://admin-pc/login.do");
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		// To enter username
		JS.executeScript("document.getElementByname(\"username\").value='SoftwareTestingMaterial.com'");
		// To enter password
		JS.executeScript("document.getElementByname(\"pwd\").value='tester'");
	
	}	
}
	
