package dud;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	public class Flipkart_Iphone_7_Mobile_Price {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver f=new FirefoxDriver();
			f.get("http://filpkart.com");
			f.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("Iphone 7 Mobile");
	f.findElement(By.xpath("//div/button[@type='submit']")).submit();
	Thread.sleep(5000);
	String x="//a[text()='Apple iPhone 7 (Jet Black, 256 GB)']/../a[@target='_blank' and @class='_1Vfi6u']/div/div[@class='_1vC4OE']";
	String wep=f.findElement(By.xpath(x)).getText();
	System.out.println(wep.substring(1));
	}
}
