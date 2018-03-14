package dud;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cricket_Live_Score {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver c=new FirefoxDriver();
c.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
c.get("http://cricbuzz.com");
c.findElement(By.xpath("//a[text()='Live Scores']")).click();
c .findElement(By.xpath("//a[contains(text(),'RSA vs IND')]")).click();
String score=c.findElement(By.xpath("//h2[contains(text(),'Ovs')]")).getText();
System.out.println(score);
	}

}
