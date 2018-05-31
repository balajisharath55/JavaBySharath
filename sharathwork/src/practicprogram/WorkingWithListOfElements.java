package practicprogram;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WorkingWithListOfElements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://timesofindia.indiatimes.com/home/headlines");
		driver.findElement(By.xpath("//a[text()='Not Now']")).click();
		List<WebElement> ele=driver.findElements(By.xpath("//ul[@class='clearfix']/li/span[@class='w_tle']"));
		System.out.println(ele.size());
		for(int i=0;i<19;i++) {
			System.out.println(ele.get(i).getText());
		}

	}

}
