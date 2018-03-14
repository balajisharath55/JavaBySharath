package dud;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Textcase_for_GmaliExecution{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expPage="Gmail";
		String expHomePage="Inbox";
			WebDriver w=new FirefoxDriver();
			w.get("https://www.gmail.com");
			String title=w.getTitle();
			System.out.println(title);
			String ulr=w.getCurrentUrl();
			System.out.println(ulr);
			if(title.equals(expPage)){
				System.out.println("login page is verified=pass");
			}else{
				System.out.println("login page is not verified=fail");
			}
			long starttime=System.currentTimeMillis();
			System.out.println(starttime);
			w.findElement(By.id("identifierId")).sendKeys("sharathbalaji1992");
			w.findElement(By.xpath("//span[text()='Next']")).click();
			Thread.sleep(2000);
			w.findElement(By.name("password")).sendKeys("9985071067");
			w.findElement(By.xpath("//span[text()='Next']")).click();
			long endtime=System.currentTimeMillis();
			System.out.println(endtime);
			System.out.println("total time ="+(endtime-starttime));
			Thread.sleep(11000);
			String actualPage=w.getTitle();
			if(actualPage.contains(expHomePage)){
				System.out.println("Home page is verified=pass");
	}else{
		System.out.println("Home page is not verified=fail");
	}
			w.findElement(By.xpath("//span[@class='gb_ab gbii']")).click();
			w.findElement(By.id("gb_71")).click();
		}

}
