package dud;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Element_Selectiont_in_yohoo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver y=new FirefoxDriver();
	    y.get("https://yahoo.com");
	    String x="//a";
	    List<WebElement> list=y.findElements(By.xpath(x));
	    System.out.println(list.size());
	    for(int i=0;i<list.size();i++){
	    	String links=list.get(i).getText();
	    	System.out.println(links);
	    	
	    }
}
}