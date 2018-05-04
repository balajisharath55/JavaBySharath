package objectrepositoryofactitime;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath="//div[text()='Tasks']")
	WebElement tasksImg;
	@FindBy(xpath="//div[text()='Users']")
	WebElement usersImg;
	public void navigateToTasksPage()
	{
		tasksImg.click();
	}
	public void navigateToUserssPage()
	{
		usersImg.click();
	}


}
