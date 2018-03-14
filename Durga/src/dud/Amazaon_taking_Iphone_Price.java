package dud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazaon_taking_Iphone_Price {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver a=new FirefoxDriver();
a.get("https://amazon.in");
a.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 7 moblie");
Thread.sleep(3000);
a.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
Thread.sleep(4000);
String x="//h2[text()='Apple iPhone 7 (Jet Black, 32GB)']/../../../../div[2]/div[1]/div[1]/a/span/span[2]";
String weg=a.findElement(By.xpath(x)).getText();
System.out.println(weg);
	}

}
