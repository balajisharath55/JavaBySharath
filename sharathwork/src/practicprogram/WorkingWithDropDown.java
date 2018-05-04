package practicprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class WorkingWithDropDown  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://admin-pc:8080/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[text()='Tasks']/../..")).click();
		driver.findElement(By.xpath("//a[text()='Projects & Customers']/..")).click();
		driver.findElement(By.xpath("//td/input[@value='Create New Project']")).click();
Select sel=new Select(driver.findElement(By.name("customerId")));
sel.selectByVisibleText("dfhj");

	}

}
