package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import CustomizedLibrary.PropertyUtility;
import DataMapping.DataTC02_RegisterAccount;
import Pages.ChildPages.AccountManagementPage;
import Pages.ChildPages.HomePage;
import Pages.ChildPages.IndexPage;
import Pages.ChildPages.LoginPage;
import Pages.ChildPages.RegisterCountryPage;
import Pages.ChildPages.RegisterNewUserPage;

public class TC02_RegisterAccount {
	
	WebDriver  driver;
	
	IndexPage indexobj;
	LoginPage loginobj;
	HomePage homeobj;
	RegisterCountryPage registerCountryobj;
	RegisterNewUserPage registerNewUserobj;
	AccountManagementPage accountobj;
	
	DataTC02_RegisterAccount data;
	
	String countryName;
	String email;
	String countryCode;
	String phoneNumber;
	String plateNumber;
	String password;
	
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
		loginobj.registerNewAccount();
		registerCountryobj = new RegisterCountryPage(driver);
		registerCountryobj.selectCountry(countryName);
		registerCountryobj.clickButtonApply();
		registerNewUserobj = new RegisterNewUserPage(driver);
		registerNewUserobj.registerNewUser(email, countryCode, phoneNumber, plateNumber, password);
		Thread.sleep(15*1000);
		homeobj = new HomePage(driver);
		homeobj.goToMenuSetting();		
		homeobj.goToAccountSetting();
		accountobj=new AccountManagementPage(driver);
		accountobj.waitPageLoadComplete();
	

	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("Test done");
		driver.close();
	}
	
	public void initiateDataForTesting() throws IOException {
		data =  new DataTC02_RegisterAccount(PropertyUtility.getDataFileNameWithPath());
		countryName=data.getCountryName();
		email=data.getEmail();
		countryCode=data.getCountryCode();
		phoneNumber=data.getPhoneNumber();
		plateNumber=data.getPlateNumber();
		password=data.getPassword();
	}
}
