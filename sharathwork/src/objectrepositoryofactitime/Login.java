package objectrepositoryofactitime;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	@FindBy(name="username")
	WebElement usernameEdit;
	@FindBy(name="pwd")
	WebElement passwordEdit;
	@FindBy(id="loginButton")
	WebElement loginButton;
	public void login(String username,String password) {
		usernameEdit.sendKeys(username);
		passwordEdit.sendKeys(password);
		loginButton.click();
	}

}
