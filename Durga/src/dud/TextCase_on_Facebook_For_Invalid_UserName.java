package dud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextCase_on_Facebook_For_Invalid_UserName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expMsg="The email address or phone number that you've entered doesn't match any account. Sign up for an account.";
		String expColor="rgba(255, 255, 255, 1)";
		WebDriver f=new FirefoxDriver();
		f.get("https://facebook.com");
		f.findElement(By.id("email")).sendKeys("rsm");		
		f.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		WebElement wee=f.findElement(By.xpath("//div[@class='_4rbf _53ij']"));
		String actMsg=wee.getText();
		String actColor=wee.getCssValue("color");
		System.out.println(actMsg);
		System.out.println(actColor);
		if(actMsg.equals(expMsg)){
			System.out.println("error msg is displayed=pass");
		}else {
			System.out.println("error msg is not displayed=fail");
		}
		if(actColor.equals(expColor)){System.out.println("color  is verified=pass");
		}else {
			System.out.println("error msg is not displayed=fail");
		}
	}

}
