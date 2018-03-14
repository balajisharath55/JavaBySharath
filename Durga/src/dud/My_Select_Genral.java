package dud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class My_Select_Genral  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver m=new FirefoxDriver();
m.get("file:///C:/Users/admin/Desktop/sarath.html");
Select sel=new Select(m.findElement(By.xpath("//select[@multiple='multiple']")));
boolean staf=sel.isMultiple();
if(staf){
for(int i=0;i<8;i++){
	sel.selectByIndex(i);
	}
}
else{
	System.out.println("its not a multiselect dropdown");
}
sel.deselectAll();
	}

}
