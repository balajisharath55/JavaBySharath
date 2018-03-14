package dud;





import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	public class My_Select_By_Arrays {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	WebDriver m=new FirefoxDriver();
	m.get("file:///C:/Users/admin/Desktop/sarath.html");
	Select sel=new Select(m.findElement(By.xpath("//select[@multiple='multiple']")));
List<WebElement> list=sel.getOptions();
System.out.println(list.size());
for(int i=0;i<list.size();i++){
	System.out.println(list.get(i).getText());
	sel.selectByIndex(i);
}

}}
