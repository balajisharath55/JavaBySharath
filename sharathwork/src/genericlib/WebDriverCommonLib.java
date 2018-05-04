package genericlib;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WebDriverCommonLib  {
	public static WebDriver driver;
	public Object explicityWait(By locator1) {
	By locator=null;
		WebDriverWait wait=new WebDriverWait(driver, 20);
		By locor=(By) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		return locor;
		
	}
	public Select dropDownoperation(By element) {
		Select sel=new Select((WebElement) element);
		return sel;
		
	}
	public Actions mouseControl(WebElement element) {
		Actions act=new Actions(driver);
      return act;
			
		}
	public void waitForPageLoad() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void waitForElement(WebElement element)
	{
		int wait=0;
		while(wait<40) {
			try {
				element.click();
				break;
			}
			catch(Throwable t) {
				try {
				Thread.sleep(1000);
				wait++;
				}
				catch(InterruptedException e) {
					
				}
			}
		}
	}
	public void handleAlert() {
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
	}
	public static String parentID="";
	public void switchToChildWindow() {
		Set<String> set=driver.getWindowHandles();
		Iterator<String > it=set.iterator();
		parentID =it.next();
		String childID=it.next();
		driver.switchTo().window(childID);
	}
	public void switchBackToParentWindow() {
		driver.switchTo().window(parentID);
	}
	}
	


