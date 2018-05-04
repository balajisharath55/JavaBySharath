package objectrepositoryofactitime;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout {
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logoutbutton;
	public void logout(){
		logoutbutton.click();
	}

}
