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
	
	
	public IndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub		
	}
	
	public void clickMenuButton() {
		waitForElemenet(btnMenu);
		clickElement(btnMenu);
	}
	
	

}
