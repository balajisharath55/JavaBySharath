package dud;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actime_Appication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		WebElement usrwb=driver.findElement(By.name("username"));
		usrwb.sendKeys("admin");
		Actions act=new Actions(driver);
		act.doubleClick(usrwb).perform();
		act.sendKeys(Keys.chord(Keys.CONTROL,"c")).sendKeys(Keys.TAB).sendKeys(Keys.chord(Keys.CONTROL,"v")).sendKeys(Keys.ENTER).build().perform();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='errormsg']")));
		String msgwb=driver.findElement(By.xpath("//span[@class='errormsg']")).getText();
		System.out.println(msgwb);
		}

}
