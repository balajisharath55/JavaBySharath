package practicprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithCalander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day="10";
		String month="2";
		String year="2019";
WebDriver driver =new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("https://www.makemytrip.com/");
driver.findElement(By.id("hp-widget__depart")).click();
while (true)
{
	try {
		driver.findElement(By.xpath("//td[@data-year=" +year+" and @data-month="+month+"]/a[text()="+day+"]")).click();
		break;
	}
	catch(Exception e){
		driver.findElement(By.xpath("//span[text()='Next'][1]")).click();
		
	}

}
System.out.println("done=======");
	}

}
