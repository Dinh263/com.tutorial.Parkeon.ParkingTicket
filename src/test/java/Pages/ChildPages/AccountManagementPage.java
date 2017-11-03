package Pages.ChildPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.ParentPage.BasePage;

public class AccountManagementPage extends BasePage {
	
	@FindBy(xpath="//div[@class='toogleButton-container']/button")
	WebElement btnMenu;
	
	@FindBy(xpath="//div[@class='cdk-focus-trap-content']/md-nav-list[1]/md-list-item[7]/div")
	WebElement btnLogOut;
	
	@FindBy(xpath="//h1[starts-with(text(),'ACCOUNT MANAGEMENT')]")
	WebElement lbelTitle;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement txtPhoneNumber;
	
	@FindBy(xpath="//input[@name='plateNumber']")
	WebElement txtPlateNumber;
	
	@FindBy(xpath="//input[@name='country']")
	WebElement txtCountry;
	
	@FindBy(xpath="//input[@name='oldPassword']")
	WebElement txtOldPassword;
	
	@FindBy(xpath="//input[@name='newPassword']")
	WebElement txtNewPassword;
	
	@FindBy(xpath="//input[@name='confirmNewPassword']")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath="//span[contains(text(),'SAVE CHANGE')]")
	WebElement btnSaveChange;

	public AccountManagementPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String getEmail() {
		return getTextOfElement(txtEmail);
	}
	
	public String getPhoneNumber() {
		return getTextOfElement(txtPhoneNumber);
	}
	
	public String getPlateNumber() {
		return getTextOfElement(txtPlateNumber);
	}
	
	public String getCountry() {
		return getTextOfElement(txtCountry);
	}
	
	
	
	public void waitPageLoadComplete() {
		waitForPageLoad(lbelTitle);
	}
	
	private void inputOldPassword(String password) {
		setTextElement(txtOldPassword, password);
	}
	
	private void inputNewPassword(String password) {
		setTextElement(txtNewPassword, password);
	}
	
	private void inputConfirmPassword(String password) {
		setTextElement(txtConfirmPassword, password);
	}
	
	private void clickSaveButton() {
		clickElement(btnSaveChange);
	}
	
	public void UpdatePassword(String oldpassword, String newpassword) {
		inputOldPassword(oldpassword);
		inputNewPassword(newpassword);
		inputConfirmPassword(newpassword);
		clickSaveButton();
	}
	
	public void goToMenuSetting() {
		clickElement(btnMenu);
	}
	
	public void logOutApplication() {
		clickElement(btnLogOut);
	}
		

}
