package dud;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_Product_count {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver a=new FirefoxDriver();
a.get("http://amazon.in");
String x="//span[text()='Hello. Sign in']";
String stext=a.findElement(By.xpath(x)).getText();
System.out.println(stext);
Thread.sleep(2000);
a.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 7 Mobile",Keys.ENTER);
Thread.sleep(3000);
String dtext=a.findElement(By.id("s-result-count")).getText();
System.out.println(dtext);

	}

}
