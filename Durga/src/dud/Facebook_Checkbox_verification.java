package dud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Checkbox_verification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	long starttime=System.currentTimeMillis();
	System.out.println(starttime);
		WebDriver f=new FirefoxDriver();
		f.get("https://facebook.com");
		WebElement dtx=f.findElement(By.id("month"));
		Select sel=new Select(dtx);
		sel.selectByVisibleText("Mar");
		long endtime=System.currentTimeMillis();
		System.out.println(endtime);
		System.out.println("total time ="+(endtime-starttime));
		

	}

}
