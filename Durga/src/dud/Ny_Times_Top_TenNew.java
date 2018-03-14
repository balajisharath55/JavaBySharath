package dud;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ny_Times_Top_TenNew {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver t=new FirefoxDriver();
		t.get("https:www.nytimes.com");
		Thread.sleep(5000);
		t.findElement(By.xpath("//a[@data-collection='todays-paper']")).click();
		Thread.sleep(3000);
		String x="//a[@name='world']/../../../../ul/li";
		List<WebElement> list=t.findElements(By.xpath(x));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++){
			String links=list.get(i).getText();
			System.out.println(links.substring(0, links.length()-19));
		}

	}

}
