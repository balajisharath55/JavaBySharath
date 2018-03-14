package dud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify_Next_Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver y=new FirefoxDriver();
		y.get("https://login.yahoo.com");
		WebElement wen=y.findElement(By.id("login-signin"));
		String actual=wen.getAttribute("value");
		System.out.println(actual);
		String actcolor=wen.getCssValue("background-color");
		System.out.println(actcolor);
		boolean status = y.findElement(By.id("persistent")).isSelected();
		System.out.println(status);
y.close();
	}

}
