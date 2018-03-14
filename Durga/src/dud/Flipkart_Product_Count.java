package dud;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart_Product_Count {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver f=new FirefoxDriver();
		f.get("http://filpkart.com");
		Thread.sleep(3000);
		f.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(4000);
		String x="//a[text()='Signup']";
		String stext=f.findElement(By.xpath(x)).getText();
		System.out.println(stext);
	String x1="//input[@title='Search for products, brands and more']";
		f.findElement(By.xpath(x1)).sendKeys("Iphone 7 Mobile",Keys.ENTER);
		Thread.sleep(2000);
		String x2="//span[contains(text(),'Showing')]";
		String dtext=f.findElement(By.xpath(x2)).getText();
		System.out.println(dtext);
		

	}

}
