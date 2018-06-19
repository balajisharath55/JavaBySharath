package com.MavenProject.Bharat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ActitimeApp{
	@Test
	
	public void OPenApp() {
		WebDriver driver=new FirefoxDriver();
		driver.get("admin-pc/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
    String str=driver.getCurrentUrl();
    System.out.println(str);
    driver.findElement(By.xpath("//a[contains(text(),'Logout')]/..")).click();
	}
	
}



