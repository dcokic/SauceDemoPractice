package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CreatOrderTests extends BaseTest {
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		super.driver.navigate().to(super.webSiteUrl);
		Thread.sleep(1000);
	}
	@Test
	public void createOrderForOneProduct() throws InterruptedException {
		String firstName = excelReader.returnStringDataFromExcel("Sheet2", 9, 2);
		String lastName = excelReader.returnStringDataFromExcel("Sheet2", 10, 2);
		double zipCode = excelReader.returnDoubleDataFromExcel("Sheet2", 11, 2);
		int zip = (int)zipCode;
		String zipCOdeString =Integer.toString(zip);
		String actualText;
    	String expectedText = excelReader.returnStringDataFromExcel("Creating order", 15, 4);
		
		super.logInValidCredentials();
		productsPage.clickFirstElementAddToCartButton();
		mainNavigationPage.cartIconClick();
		yourCartPage.clickCheckOutButton();
		checkoutYourInformationPage.insertFirstName(firstName);
		checkoutYourInformationPage.insertLastName(lastName);
		checkoutYourInformationPage.insertZipCode(zipCOdeString);
		Thread.sleep(1000);
		checkoutYourInformationPage.clickButtonContinue();
		Thread.sleep(1000);
		checkoutOverviewPage.clickButtonFinish();
		Thread.sleep(1000);
		
		actualText = checkoutCompletePage.textT();
		assertEquals(actualText, expectedText);
		
		
		
	}
	
	 @AfterMethod
	    public void afterMethod() throws InterruptedException {
			mainNavigationPage.clickOnHamburgerMenu();
			mainNavigationPage.clickOnResetAppStateItem();
		}


}
