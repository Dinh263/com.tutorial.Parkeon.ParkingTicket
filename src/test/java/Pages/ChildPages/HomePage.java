package Pages.ChildPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.ParentPage.BasePage;

public class HomePage extends BasePage {
	
	@FindBy(xpath="//div[@class='toogleButton-container']/button")
	WebElement btnMenu;
	
	@FindBy(xpath="//div[@class='cdk-focus-trap-content']/md-nav-list[1]/md-list-item[7]/div")
	WebElement btnLogOut;

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void goToMenuSetting() {
		clickElement(btnMenu);
	}
	
	
	public boolean isLogInSuccessful() {
		return pageContainElement(btnLogOut);
	}
	
	
	
	
	
	

}
