package objectrepositoryofactitime;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskPage {
	@FindBy(xpath="//a[text()='Projects & Custome\\\rs']/..")
	WebElement navigateToProjectsAndCustomersPage;
	@FindBy(xpath="//a[text()='Open Tasks']/..")
	WebElement navigateToOpenTasksPage;
	@FindBy(xpath="//a[text()='Completed Tasks']/..")
    WebElement navigateToCompletedTasksPage;
	@FindBy(xpath="//a[text()='Archives']/..")
    WebElement navigateToArchiesPage;
	public void navigateToProjectsAndCustomersPage() {
		navigateToProjectsAndCustomersPage.click();
	}
	public void navigateToOpenTasksPage() {
		navigateToOpenTasksPage.click();
	}
	public void navigateToCompletedTasksPage() {
		navigateToCompletedTasksPage.click();
	}
	public void navigateToArchiesPage() {
		navigateToArchiesPage.click();
	}
}
