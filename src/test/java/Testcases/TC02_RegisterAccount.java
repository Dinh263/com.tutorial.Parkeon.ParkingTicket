package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sun.jna.platform.unix.X11.XClientMessageEvent.Data;

import CustomizedLibrary.PropertyUtility;
import DataMapping.DataTC02_RegisterAccount;
import Pages.ChildPages.HomePage;
import Pages.ChildPages.IndexPage;
import Pages.ChildPages.LoginPage;
import Pages.ChildPages.RegisterCountryPage;

public class TC02_RegisterAccount {
	
	WebDriver  driver;
	
	IndexPage indexobj;
	LoginPage loginobj;
	RegisterCountryPage registerAccountobj;
	
	DataTC02_RegisterAccount data;
	
	String countryName;
	
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
		registerAccountobj = new RegisterCountryPage(driver);
		registerAccountobj.selectCountry(countryName);
		registerAccountobj.clickButtonApply();
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("Test done");
	}
	
	public void initiateDataForTesting() throws IOException {
		data =  new DataTC02_RegisterAccount(PropertyUtility.getDataFileNameWithPath());
		countryName=data.getCountryName();
	}
}
