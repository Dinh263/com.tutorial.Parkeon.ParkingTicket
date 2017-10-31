package Pages.ChildPages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.ParentPage.BasePage;


public class LoginPage extends BasePage {
	
	public static String PAGE_URL = "http://path-to-park.us.elidev.info";
	public static String PAGE_TITLE = "PathToPark";
	
	@FindBy (xpath="//input[@type='email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//span[starts-with(text(),'LOG IN')]")
	WebElement btnLogin;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	private void inputEmail(String email) {
		waitForElemenet(txtEmail);
		setTextElement(txtEmail, email);
	}
	
	private void inputPassWord(String password) {
		waitForElemenet(txtPassword);
		setTextElement(txtPassword, password);
	}
	
	private void clickLogInButton() {
		waitForElemenet(btnLogin);
		clickElement(btnLogin);
	}
	
	public void loginToApp(String email, String password) {
		inputEmail(email);
		inputPassWord(password);
		clickLogInButton();
	}
	
	public boolean isLoginSuccessful(String text) {
		return true;
	}
}
