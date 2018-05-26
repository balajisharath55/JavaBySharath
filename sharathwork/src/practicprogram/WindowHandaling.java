package practicprogram;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class WindowHandaling {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// navigate to the url
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf#");	
		driver.findElement(By.xpath("//a[contains(text(),'X')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Flights')]")).click();
		Set<String> set=driver.getWindowHandles();
		System.out.println(set.size());
		for(String guid : set){
			driver.switchTo().window(guid);
			System.out.println(driver.getTitle());
		}*/
		String st="123294";
		int j=Integer.parseInt(st);
		System.out.println(st+1);
		System.out.println(j+1);
		
		/*Iterator<String> it=set.iterator();
		String parentit=it.next();
		String childid=it.next();
		System.out.println(parentit);
		System.out.println(childid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@class='hotel-stay']")).click();
		Set<String> sett=driver.getWindowHandles();
		Iterator<String> itt=set.iterator();
		String childid1=itt.next();
		String childid2=itt.next();
		driver.switchTo().window(childid2);
		System.out.println(driver.getTitle());
		driver.close();*/
		
		
		
			
		}

	}

