package Pages.ParentPage;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	

	
	WebDriver driver;
	WebDriverWait driverWait;
	
	public BasePage(WebDriver driver) {		
		this.driver=driver;
		PageFactory.initElements(driver	, this);		
		driverWait=new WebDriverWait(driver,120);
	}
	
	public void loadPage(String pageURL) {
		driver.get(pageURL);
	}
	public void clickElement(WebElement element) {
		waitForElemenet(element);
		element.click();
	}
	
	public void setTextElement(WebElement element,String text) {
		waitForElemenet(element);
		element.clear();
		element.sendKeys(text);
	}
	
	private void waitForElemenet(WebElement element) {
		driverWait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void maximazieWindow() {
		driver.manage().window().maximize();
	}
	
	public boolean pageContainElement(WebElement element) {
		try {
			waitForElemenet(element);
			return true;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public void setTextForDropDownList(WebElement element, String text) {
		waitForElemenet(element);
		Select ddList = new Select(element);
		ddList.selectByVisibleText(text);
	}
	
	public String getTextOfElement(WebElement element) {
		waitForElemenet(element);
		return element.getText();
	}
	
	public void waitForPageLoad(WebElement element) {
		waitForElemenet(element);
	}

}
