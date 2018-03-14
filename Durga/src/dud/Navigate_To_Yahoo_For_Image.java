package dud;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate_To_Yahoo_For_Image {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver y=new FirefoxDriver();
	    y.get("https://login.yahoo.com");
	    WebElement wei=y.findElement(By.xpath("//div[@class='login-logo']"));
	    boolean status = wei.isDisplayed();
	    System.out.println(status);
	    Point location = wei.getLocation();
	    		System.out.println("x coordinate is ="+location.getX());
	    		System.out.println("y coordinate is ="+location.getY());
	    		System.out.println("x coordinate is ="+location.x);
	    		System.out.println("y coordinate is ="+location.y);
	    	Dimension dem = wei.getSize();
	    	System.out.println("heigth of image is ="+dem.getHeight());
	    	System.out.println("width of image is ="+dem.getWidth());
	    	System.out.println(dem.height);
	    	System.out.println(dem.width);
	    	int count=y.findElements(By.xpath("//img[@class='logo']")).size();
	    	System.out.println("logo count="+count);
	    	Thread.sleep(2000);
	    	String logo=y.findElement(By.xpath("//img[@class='logo']")).getAttribute("value");
	    	System.out.println(logo);
	    	y.close();
	    
		

	}

}
