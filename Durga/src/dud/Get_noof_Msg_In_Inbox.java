package dud;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_noof_Msg_In_Inbox {
	public static void main(String[] args) throws InterruptedException{
		WebDriver w=new FirefoxDriver();
		w.get("https://www.gmail.com");		
		w.findElement(By.id("identifierId")).sendKeys("sharathbalaji1992",Keys.ENTER);
		Thread.sleep(2000);
		w.findElement(By.name("password")).sendKeys("9985071067",Keys.ENTER);
		Thread.sleep(11000);
		String str=w.findElement(By.xpath("//a[contains(text(),'Inbox')]")).getText();
		System.out.println(str.substring(7, str.length()-1));
		Thread.sleep(2000);
		String st=w.findElement(By.xpath("//span[contains(text(),'15 GB')]/..")).getText();
		System.out.println(st.substring(1, st.length()-19));
		
}
}