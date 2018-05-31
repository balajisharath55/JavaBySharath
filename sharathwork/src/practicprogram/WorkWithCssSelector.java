package practicprogram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkWithCssSelector{
	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
		d.get("https://accounts.google.com");
		d.findElement(By.cssSelector("input[id=identifierId]")).sendKeys("balajisharat19");
	}
}
//mar@2018