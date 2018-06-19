package practicprogram;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
Actions act= new Actions(driver);
act.keyDown(Keys.F4).keyDown(Keys.ALT).build().perform();

	}

}
