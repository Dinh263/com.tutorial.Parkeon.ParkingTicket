package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CustomizedLibrary.PropertyUtility;

import DataMapping.DataTC03_UpdatePassword;
import Pages.ChildPages.AccountManagementPage;
import Pages.ChildPages.HomePage;
import Pages.ChildPages.IndexPage;
import Pages.ChildPages.LoginPage;


public class TC03_UpdatePassword {
	
	WebDriver driver;
	IndexPage indexobj;
	LoginPage loginobj;
	HomePage homeobj;
	AccountManagementPage accountobj;
	
	DataTC03_UpdatePassword data;
	String email="";
	String oldpassword= "";
	String newpassword= "";
	
	@BeforeTest
	public void openBrowserAndGoToWebsite() throws IOException {
		initiateDataForTesting();
		System.setProperty("webdriver.gecko.driver",PropertyUtility.getGeckoDriverPath());
		driver = new FirefoxDriver();		
		indexobj = new IndexPage(driver);
		indexobj.loadPage(PropertyUtility.getBaseUrl());
		indexobj.maximazieWindow();
		
		
	}
	
	@Test
	public void loginToAccount() throws InterruptedException {
		indexobj.goToMenuSetting();
		indexobj.logIn();
		loginobj = new LoginPage(driver);
		loginobj.loginToApp(email, oldpassword);
		homeobj = new HomePage(driver);
		homeobj.goToMenuSetting();
		Thread.sleep(15*1000);
		homeobj.goToAccountSetting();
		accountobj= new AccountManagementPage(driver);
		accountobj.waitPageLoadComplete();
		accountobj.UpdatePassword(oldpassword, newpassword);
		accountobj.goToMenuSetting();
		accountobj.logOutApplication();
		loginobj.loginToApp(email, newpassword);
		
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("Test done");
	}
	
	public void initiateDataForTesting() throws IOException {
		data =  new DataTC03_UpdatePassword(PropertyUtility.getDataFileNameWithPath());
		email=data.getEmail();
		oldpassword=data.getOldPassword();
		newpassword=data.getNewPassword();
		
		
	}
}
