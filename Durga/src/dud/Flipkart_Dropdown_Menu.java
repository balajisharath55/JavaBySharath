package dud;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_Dropdown_Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://flipkart.com");
		WebElement wtab=driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act=new Actions(driver);
	act.moveToElement(wtab).perform();
driver.findElement(By.xpath("//a[@title='Samsung']")).click();
	

	}

}
