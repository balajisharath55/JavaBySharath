package dud;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo_Top_Ten_News {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver y=new FirefoxDriver();
	    y.get("https://yahoo.com");
	    String x="//span[@data-category='trending news']/../../ul/li/ul/li[*]";
	    List<WebElement> list=y.findElements(By.xpath(x));
	    System.out.println(list.size());
	    for(int i=0;i<list.size();i++){
	    	String links=list.get(i).getText();
	    	System.out.println(links);
	    	
	    }
}

}
