package Testcases;



import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import CustomizedLibrary.PropertyUtility;
import DataMapping.DataTC01_Login;
import Pages.ChildPages.HomePage;
import Pages.ChildPages.IndexPage;
import Pages.ChildPages.LoginPage;
import CustomizedLibrary.EnviromentSetting;

public class TC01_Login {
	
	IndexPage indexobj;
	LoginPage loginobj;
	HomePage  homeobj;
	WebDriver driver;
	
	DataTC01_Login data;
	
	String username;
	String password;
	
	
	
	@BeforeTest
	public void openBrowserAndGoToWebsite() throws IOException {
		initDataForTesting();
		EnviromentSetting.setGeckoDriverPath();
		driver = new FirefoxDriver();
		indexobj =  new IndexPage(driver);
		indexobj.loadPage(PropertyUtility.getBaseUrl());
		indexobj.maximazieWindow();
		
	}
	
	@Test
	public void loginToAccount() {
		indexobj.goToMenuSetting();
		indexobj.logIn();
		loginobj = new LoginPage(driver);
		loginobj.loginToApp(username,password);
		homeobj = new HomePage(driver);
		homeobj.goToMenuSetting();
		Assert.assertTrue(homeobj.isLogInSuccessful());
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("Test done");
	}
	
	public void initDataForTesting() throws IOException {
		data = new DataTC01_Login(PropertyUtility.getDataFileNameWithPath());
		username = data.getUserName();
		password = data.getPassword();
	}


}
