package Testcases;

import static org.testng.Assert.assertTrue;

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
import Pages.ChildPages.LoginPage;

public class TC01_Login {
	
	IndexPage indexobj;
	LoginPage loginobj;
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
		loginobj = new LoginPage(driver);
		loginobj.loginToApp("user300@gmail.com", "123456789oO");
		assertTrue(loginobj.isLoginSuccessful("PICK DURATION"));
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("Test done");
	}


}
