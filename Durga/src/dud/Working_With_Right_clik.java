package dud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Right_clik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://google.com");
		WebElement lnkwb=driver.findElement(By.xpath("//a[text()='Gmail']"));
Actions act=new Actions(driver);
act.contextClick(lnkwb).sendKeys("T").build().perform();
	}


}
