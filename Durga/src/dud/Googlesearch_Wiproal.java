package dud;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googlesearch_Wiproal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("wipro jobs");
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(list.size());
for(int i=0;i<list.size()-1;i++){
	System.out.println(list.get(i).getText());
}
list.get(1).click();
	}

}
