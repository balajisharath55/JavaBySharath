package dud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Vodafone_plan_Rental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver v=new FirefoxDriver();
		v.get("https://www.vodafone.in/home-mumbai");
		v.findElement(By.xpath("//a[@class='closeBtn mv_closeBtn']")).click();
		v.findElement(By.xpath("//a[@title=\"Vodafone RED - India's best Postpaid plan\"]")).click();
		String r=v.findElement(By.xpath("//p[text()='RED Traveler R']/../following-sibling::li[1]")).getText();
		System.out.println(r);
		String m=v.findElement(By.xpath("//p[text()='RED Traveler M']/../following-sibling::li[1]")).getText();
		System.out.println(m);
		String l=v.findElement(By.xpath("//p[text()='RED Traveler L']/../following-sibling::li[1]")).getText();
		System.out.println(l);

	}

}
