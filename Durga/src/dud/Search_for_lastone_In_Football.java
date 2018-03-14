package dud;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Search_for_lastone_In_Football {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("football");
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(list.size());
for(int i=0;i<list.size()-1;i++){
	System.out.println(list.get(i).getText());
}
list.get(list.size()-3).click();
}
}