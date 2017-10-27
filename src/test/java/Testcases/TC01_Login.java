package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.ChildPages.IndexPage;

public class TC01_Login {
	
	IndexPage indexobj;
	WebDriver driver;
	
	@BeforeTest
	public void openBrowserAndGoToWebsite() {
		
		driver = new FirefoxDriver();
		indexobj = new IndexPage(driver);
	}
	
	@Test
	public void loginToAccount() {
		
	}
	
	@AfterTest
	public void closeBrowser() {
		
	}


}
