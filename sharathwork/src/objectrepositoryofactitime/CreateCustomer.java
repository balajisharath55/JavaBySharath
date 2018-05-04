package objectrepositoryofactitime;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCustomer {
@FindBy(xpath="//td[contains(text(),'Customer Name:')]/../td/input")
WebElement editeName;
@FindBy(xpath="//td[contains(text(),'Customer Description:')]/../td/textarea")
WebElement editDescription;
@FindBy(id="add_more_customers_action")
WebElement clickOnMoreCustomer;
@FindBy(xpath="//input[@name='createCustomerSubmit']")
WebElement ClickOnCreateCustomerButton;
@FindBy(xpath="//input[contains(@value,'Cancel')]")
WebElement clickOnCancelButton;
public void editeName(String name) {
	editeName.sendKeys(name);
}
public void editDescription(String Description) {
	editDescription.sendKeys(Description);
	
}
public void clickOnMoreCustomer() {
	clickOnMoreCustomer.click();
	
}
public void ClickOnCreateCustomerButton() {
	ClickOnCreateCustomerButton.click();
	
}
public void clickOnCancelButton() {
	clickOnCancelButton.click();
	
}
}
