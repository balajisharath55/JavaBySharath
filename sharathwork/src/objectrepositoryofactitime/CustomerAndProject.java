package objectrepositoryofactitime;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerAndProject {
	@FindBy(xpath="//input[@value='Create New Customer']")
	WebElement navigateCreateNewCustomer;
	@FindBy(xpath="//input[@value='Create New Project']")
	WebElement navigateCreateNewProject;
	public void navigateCreateNewCustomer() {
		navigateCreateNewCustomer.click();
	}
	public void navigateCreateNewProject() {
		navigateCreateNewProject.click();
	}

}
