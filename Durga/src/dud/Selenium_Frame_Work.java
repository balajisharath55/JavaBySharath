package dud;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Frame_Work {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver c=new FirefoxDriver();
c.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
c.switchTo().frame("classFrame");
Thread.sleep(2000);
c.findElement(By.linkText("org.openqa.selenium")).click();
Thread.sleep(2000);
c.switchTo().defaultContent();
Thread.sleep(2000);
c.switchTo().frame("packageFrame");
Thread.sleep(2000);
c.findElement(By.linkText("AbstractFindByBuilder")).click();
Thread.sleep(2000);
c.switchTo().defaultContent();
}
}