package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddProductsToCartTest extends BaseTest{
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		super.driver.navigate().to(super.webSiteUrl);
		Thread.sleep(1000);
		
	}
	
    @Test
	public void addOneProductToCart() throws InterruptedException {
    	String actualText;
    	String expectedText = excelReader.returnStringDataFromExcel("Add product to cart", 7, 4);
    	int actualQuantity;
    	int expectedQuantity = (int) excelReader.returnDoubleDataFromExcel("Add product to cart", 8, 2);
    	
    	super.logInValidCredentials();
    	productsPage.clickFirstElementAddToCartButton();
    	mainNavigationPage.cartIconClick();
    	actualText = yourCartPage.productName();
    	actualQuantity = yourCartPage.productQuantity();
    	assertEquals(actualText, expectedText);
    	assertEquals(actualQuantity, expectedQuantity);
		
	}
    
    @Test
	public void addAllProductstoCart() throws InterruptedException {
    	String actualText;
    	String expectedText = excelReader.returnStringDataFromExcel("Add all products to cart", 13, 4);
    	
		super.logInValidCredentials();
		productsPage.clickFirstElementAddToCartButton();
		productsPage.clickSecondElementAddToCartButton();
		productsPage.clickThirdElementAddToCartButton();
		productsPage.clickFourthElementAddToCartButton();
		productsPage.clickFifthElementAddToCartButton();
		productsPage.clickSixthElementAddToCartButton();
		mainNavigationPage.cartIconClick();
		actualText = yourCartPage.sixthProductName();
		assertEquals(actualText, expectedText);
	}
	
    
    @AfterMethod
    public void afterMethod() throws InterruptedException {
		mainNavigationPage.clickOnHamburgerMenu();
		mainNavigationPage.clickOnResetAppStateItem();
	}

}
