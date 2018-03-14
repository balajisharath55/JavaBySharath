package dud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextCase_on_Gmail_For_Invalid_UserName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver g=new FirefoxDriver();
		String exp="Couldn't find your Google Account";
		String color="rgba(213, 0, 0, 1)";
		g.get("https://gmail.com");
		g.findElement(By.id("identifierId")).sendKeys("s");
		g.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	WebElement wed=g.findElement(By.xpath("//div[@class='dEOOab RxsGPe'][1]"));
	Thread.sleep(2000);
	String actErrorMsg=wed.getText();
	String actcolor=wed.getCssValue("color");
	System.out.println(actcolor);
	if(actErrorMsg.equals(exp)){
		System.out.println("error msg is displayed=pass");
	}else {
		System.out.println("error msg is not displayed=fail");
	}
	if(actcolor.equals(color)){System.out.println("color  is verified=pass");
	}else {
		System.out.println("error msg is not displayed=fail");
	}
		
	}
	
	}


