package dud;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Bookmyshow_Telugumovies {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver b=new FirefoxDriver();
			b.get("https://in.bookmyshow.com/hyderabad");
			b.findElement(By.id("btn-dd-search")).click();
			Thread.sleep(2000);
			String x="//div[@class='grid']/div/ul/li";
			List<WebElement> list=b.findElements(By.xpath(x));	
			int count=0;
			for(int i=0;i<list.size();i++){
				String links=list.get(i).getText();
				if(links.contains("HINDI")){
					break;
				}
				count++;
			System.out.println(links);
			}
			System.out.println(count-1);
			
}
}