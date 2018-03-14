package dud;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Ircte_select_for_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		WebElement tweb=driver.findElement(By.xpath("//a[contains(text(),'Tourism')]"));
		Actions act=new Actions(driver);
		act.moveToElement(tweb).perform();
	driver.findElement(By.linkText("Cab")).click();

	}

}
