package dud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextCase_For_Facebook {
	public static void main(String[] args) throws InterruptedException {
		String expPage="Facebook";
		String expHomePage="Facebook";
		WebDriver f=new FirefoxDriver();
		f.get("https://facebook.com");
		String actualPage=f.getTitle();
		String url=f.getCurrentUrl();
		System.out.println(url);
		System.out.println(actualPage);
		if(actualPage.contains(expPage)){
			System.out.println("login page is verified=pass");
		}else {
			System.out.println("login page is not verified=fail");
		}
	f.findElement(By.id("email")).sendKeys("8500960185");		
	f.findElement(By.id("pass")).sendKeys("Sarath@55");
	f.findElement(By.id("loginbutton")).click();
	String actualHomePage=f.getTitle();
	System.out.println(actualHomePage);
	System.out.println(actualHomePage);
	if(actualHomePage.contains(expHomePage)){
		System.out.println("login page is verified=pass");
	}else {
		System.out.println("login page is not verified=fail");
	}
Thread.sleep(5000);		
f.findElement(By.id("userNavigationLabel")).click();
Thread.sleep(2000);	
f.findElement(By.xpath("//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem']")).click();
		
	}

}
