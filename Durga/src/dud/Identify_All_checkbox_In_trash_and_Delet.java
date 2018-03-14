package dud;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Identify_All_checkbox_In_trash_and_Delet {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			WebDriver w=new FirefoxDriver();
			w.get("https://www.gmail.com");
			
			w.findElement(By.id("identifierId")).sendKeys("sharathbalaji1992",Keys.ENTER);
			Thread.sleep(2000);
			w.findElement(By.name("password")).sendKeys("9985071067",Keys.ENTER);
			Thread.sleep(11000);
		    	w.findElement(By.xpath("//div[text()='Promotions']/../../..")).click();
				String y="//table[@class='F cf zt']/tbody/tr[*]/td[2]/div";
				List<WebElement> lis=w.findElements(By.xpath(y));
			    System.out.println(lis.size());
			    for(int j=0;j<lis.size();j++){
			    	lis.get(j).click();
			    }
			    Thread.sleep(2000);
			    	w.findElement(By.xpath("//div[@class='ar9 T-I-J3 J-J5-Ji']")).click();
			    	Thread.sleep(4000);
			    	w.findElement(By.xpath("//div[text()='Updates']/../../..")).click();
					String z="//table[@class='F cf zt']/tbody/tr[*]/td[2]/div";
					List<WebElement> lit=w.findElements(By.xpath(z));
				    System.out.println(lit.size());
				    for(int k=0;k<lit.size();k++){
				    	lit.get(k).click();
				    }
				    Thread.sleep(2000);
				    	w.findElement(By.xpath("//div[@class='ar9 T-I-J3 J-J5-Ji']")).click();
		    	
		 
		    }

}
