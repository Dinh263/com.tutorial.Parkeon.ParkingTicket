package Pages.ChildPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.ParentPage.BasePage;


public class LoginPage extends BasePage {
	
	@FindBy (xpath="//input[@type='email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//span[starts-with(text(),'LOG IN')]")
	WebElement btnLogin;
	
	//@FindBy(xpath="//div[@class='mainCard']/md-card/div/div[2]/div[2]/a")
	@FindBy(linkText="Register")
	WebElement linkRegister;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	private void inputEmail(String email) {
		setTextElement(txtEmail, email);
	}
	
	private void inputPassWord(String password) {
		setTextElement(txtPassword, password);
	}
	
	private void clickLogInButton() {
		clickElement(btnLogin);
	}
	
	public void loginToApp(String email, String password) {
		inputEmail(email);
		inputPassWord(password);
		clickLogInButton();
	}
	
	public void registerNewAccount() {
		clickElement(linkRegister);
	}
	
	
}
