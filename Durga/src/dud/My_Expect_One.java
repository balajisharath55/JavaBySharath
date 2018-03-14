package dud;

import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	public class My_Expect_One {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	WebDriver m=new FirefoxDriver();
	m.get("file:///C:/Users/admin/Desktop/sarath.html");
	Select sel=new Select(m.findElement(By.xpath("//select[@multiple='multiple']")));
List<WebElement> list=sel.getOptions();
String a[]={"JAVA","SD","C#","PYTAN"};
System.out.println(list.size());
for(int j=0;j<a.length;j++){
	boolean flage=false;
for(int i=0;i<list.size();i++){
		if(a[j].equals(list.get(i).getText())){
			sel.selectByVisibleText(a[j]);
			flage=true;
		System.out.println("pass");	
		break;
		}
}
if(!flage)
	System.out.println("fail");
	
}
}
}