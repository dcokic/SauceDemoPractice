package tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.CheckoutCompletePage;
import pages.CheckoutOverviewPage;
import pages.CheckoutYourInformationPage;
import pages.LogInPage;
import pages.MainNavigationPage;
import pages.ProductsPage;
import pages.YourCartPage;

public class BaseTest {
	
	WebDriver driver;
	LogInPage logInPage;
	ProductsPage productsPage;
	MainNavigationPage mainNavigationPage;
	YourCartPage yourCartPage;
	CheckoutYourInformationPage checkoutYourInformationPage;
	CheckoutOverviewPage checkoutOverviewPage;
	CheckoutCompletePage checkoutCompletePage;
	ExcelReader excelReader;
	String webSiteUrl;
	
	@BeforeClass
	public void beforeClass() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		this.driver = new ChromeDriver();
		excelReader = new ExcelReader(new File("data/TestPlan.xlsx"));
		logInPage = new LogInPage(driver);
		productsPage = new ProductsPage(driver);
		mainNavigationPage = new MainNavigationPage(driver);
		yourCartPage = new YourCartPage(driver);
		checkoutYourInformationPage = new CheckoutYourInformationPage(driver);
		checkoutOverviewPage = new CheckoutOverviewPage(driver);
		checkoutCompletePage = new CheckoutCompletePage(driver);
		driver.manage().window().maximize();
		webSiteUrl = excelReader.returnStringDataFromExcel("Log in", 4, 2);
		
	}
	
	
	@AfterClass
	public void afterClass() {
		this.driver.close();
	}
	public void logInValidCredentials() throws InterruptedException {
		String username = excelReader.returnStringDataFromExcel("Log in", 5, 2);
		String password = excelReader.returnStringDataFromExcel("Log in", 6, 2);
		
		logInPage.insertUsername(username);
		logInPage.insertPassword(password);
		logInPage.clickLogIn();
		
	}
	

}
