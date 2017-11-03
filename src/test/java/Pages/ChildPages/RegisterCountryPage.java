package Pages.ChildPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import Pages.ParentPage.BasePage;

public class RegisterCountryPage extends BasePage {
	
	@FindBy(name="country")
	WebElement ddListCountry;
	
	@FindBy(xpath="//span[contains(text(),'APPLY')]")
	WebElement btnApply;

	public RegisterCountryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void selectCountry(String countryName) {
		setTextForDropDownList(ddListCountry, countryName);
	}
	
	public void clickButtonApply() {
		clickElement(btnApply);
	}

}
