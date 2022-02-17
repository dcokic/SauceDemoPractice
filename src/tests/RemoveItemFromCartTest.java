package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveItemFromCartTest extends BaseTest {
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		super.driver.navigate().to(super.webSiteUrl);
		Thread.sleep(1000);
	}
	@Test
	public void removeItemFromCart() throws InterruptedException {
		super.logInValidCredentials();
		productsPage.clickFirstElementAddToCartButton();
		mainNavigationPage.cartIconClick();
		yourCartPage.clickRemoveButton();
		int text = mainNavigationPage.returnQuantityFromCartIcon();
		assertEquals(text, 0);
		System.out.println("Vrednost iz korpe je"+text);
		Thread.sleep(1000);
		
		
	}
	
	@AfterMethod
    public void afterMethod() throws InterruptedException {
		mainNavigationPage.clickOnHamburgerMenu();
		mainNavigationPage.clickOnResetAppStateItem();
	}

}
