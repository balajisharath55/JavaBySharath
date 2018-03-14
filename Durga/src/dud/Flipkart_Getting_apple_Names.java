package dud;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Flipkart_Getting_apple_Names {

	public static void main(String[] args)    {
		// TODO Auto-generated method 
		
	System.setProperty("webdriver.chrome.driver", "C:/selenium 2018/chromedriver.exe");
		WebDriver f=new ChromeDriver();
		f.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		f.get("https://flipkart.com");
		f.findElement(By.xpath("//input[@name='q']")).sendKeys("apple iphone 7",Keys.ENTER);	
	WebElement price=f.findElement(By.xpath("//option[@value='Min']/.."));
	Select sel=new Select(price);
	sel.selectByIndex(6);
	int count=0;
	for(int j=0;j<3;j++){
		WebDriverWait wait=new WebDriverWait(f,15);
		String x="//a[@target='_blank']/../a[contains(text(),'Apple iPhone') or contains(text(),'Apple IPhone') or contains(text(),'Mobile')]";
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(x)));
	List<WebElement> list=f.findElements(By.xpath(x));
	System.out.println(list.size());
	for(int i=0;i<list.size();i++){                    
		System.out.println(list.get(i).getText());
		count++;
			}	
if(j<2){
	f.findElement(By.xpath("//span[text()='Next']")).click();
}
	}
	System.out.println(count);
	}
}
