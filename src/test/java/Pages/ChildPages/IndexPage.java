package Pages.ChildPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.ParentPage.BasePage;

public class IndexPage extends BasePage {
	
	private static String PAGEURL = "http://path-to-park.us.elidev.info/";
	private static String PAGETITLE = "PathToPark";
	
	@FindBy(xpath="//div[@class='toogleButton-container']/button")
	WebElement btnMenu;
	
	@FindBy(xpath="//[text()='Log in']")
	WebElement btnLogIn;
	
	public IndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub		
	}
	
	public void goToMenuButton() {
		waitForElemenet(btnMenu);
		clickElement(btnMenu);
	}
	
	public void logIn() {
		waitForElemenet(btnLogIn);
		clickElement(btnLogIn);
	}

}
