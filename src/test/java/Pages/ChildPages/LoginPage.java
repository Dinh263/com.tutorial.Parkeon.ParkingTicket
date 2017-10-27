package Pages.ChildPages;

import org.openqa.selenium.WebDriver;

import Pages.ParentPage.BasePage;


public class LoginPage extends BasePage {
	
	public static String PAGE_URL = "http://path-to-park.us.elidev.info";
	public static String PAGE_TITLE = "PathToPark";
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	
}
