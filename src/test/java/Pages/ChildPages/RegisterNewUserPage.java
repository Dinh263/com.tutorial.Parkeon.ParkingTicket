package Pages.ChildPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.ParentPage.BasePage;

public class RegisterNewUserPage extends BasePage {

	@FindBy(xpath="//input[@placeholder='Email*']")
	WebElement txtEmail;
	
	@FindBy(xpath="//select[@placeholder='Country*']")
	WebElement ddPhoneCode;
	
	@FindBy(xpath="//input[@formcontrolname='phoneNumber']")
	WebElement txtPhoneNumber;
	
	@FindBy(xpath="//input[@formcontrolname='plateNumber']")
	WebElement txtPlateNumber;
	
	@FindBy(xpath="//input[@formcontrolname='password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@formcontrolname='confirmPassword']")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath="//*[contains(text(),'REGISTER')]")
	WebElement btnRegister;
	
	public RegisterNewUserPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private void inputEmailAddress(String email) {
		setTextElement(txtEmail, email);
	}
	
	private void inputPhoneCode(String phonecode) {
		setTextForDropDownList(ddPhoneCode, phonecode);
	}
	
	private void inputPhoneNumber(String phoneNumber) {
		setTextElement(txtPhoneNumber, phoneNumber);
	}
	
	private void inputPlateNumber(String plateNumber) {
		setTextElement(txtPlateNumber, plateNumber);
	}
	
	private void inputPassword(String password) {
		setTextElement(txtPassword, password);
	}
	
	private void inputConfirmPassword(String password) {
		setTextElement(txtConfirmPassword, password);
	}
	
	private void clickRegisterButon() {
		clickElement(btnRegister);
	}
	
	
	
	public void registerNewUser(String email, String phoneCode, String phoneNumber, String plateNumber, String password) {
		inputEmailAddress(email);
		inputPhoneCode(phoneCode);
		inputPhoneNumber(phoneNumber);
		inputPlateNumber(plateNumber);
		inputPassword(password);
		inputConfirmPassword(password);
		clickRegisterButon();
	}
	
	
	
	
	

}
