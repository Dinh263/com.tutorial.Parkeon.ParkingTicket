package Testcases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CustomizedLibrary.PropertyUtility;
import Pages.ChildPages.IndexPage;

public class TC01_Login {
	
	IndexPage indexobj;
	WebDriver driver;
	final static String URL = "http://path-to-park.us.elidev.info";
	
	@BeforeTest
	public void openBrowserAndGoToWebsite() throws IOException {
		System.setProperty("webdriver.gecko.driver",PropertyUtility.getGeckoDriverPath());
		driver = new FirefoxDriver();
		indexobj =  new IndexPage(driver);
		indexobj.loadPage(URL);
		indexobj.maximazieWindow();
		
	}
	
	@Test
	public void loginToAccount() {
		indexobj.goToMenuButton();
		indexobj.logIn();
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("Test done");
	}


}
