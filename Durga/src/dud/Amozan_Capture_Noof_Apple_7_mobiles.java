package dud;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amozan_Capture_Noof_Apple_7_mobiles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver a=new FirefoxDriver();
		a.get("https://amazon.in");
		a.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 7 moblie",Keys.ENTER);
		Thread.sleep(3000);
		String dtext=a.findElement(By.id("s-result-count")).getText();
		System.out.println(dtext);
		
		a.findElement(By.xpath("//span[contains(text(),'2 GB')]/../../input")).click();
		Thread.sleep(4000);
		String dt=a.findElement(By.id("s-result-count")).getText();
		System.out.println(dt);
		a.findElement(By.xpath("//span[contains(text(),'32 GB')]/../../input")).click();
		Thread.sleep(4000);
		String dte=a.findElement(By.id("s-result-count")).getText();
		System.out.println(dte);
		
		

	}

}
