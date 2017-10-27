package Pages.ParentPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	protected String pageUrl;
	protected  String pageTitle;
	WebDriver driver;
	WebDriverWait driverWait;
	
	public BasePage(WebDriver driver) {
		pageUrl="";
		pageTitle="";
		this.driver=driver;
		PageFactory.initElements(driver	, this);		
		driverWait=new WebDriverWait(driver, 120);
	}
	
	public void loadPage() {
		driver.get(pageUrl);
	}
	public void clickElement(WebElement element) {
		element.click();
	}
	
	public void setTextElement(WebElement element,String text) {
		element.clear();
		element.sendKeys(text);
	}
	
	public String getPageUrl() {
		return pageUrl;
	}
	
	public void setPageUrl(String pTitle) {
		pageTitle=pTitle;
	}
	
	public void waitForElemenet(WebElement element) {
		driverWait.until(ExpectedConditions.visibilityOf(element));
	}

}
