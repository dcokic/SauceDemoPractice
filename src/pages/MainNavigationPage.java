package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainNavigationPage {
	WebDriver driver;
	WebElement cartIcon;
	WebElement menuHamburger;
	WebElement resetAppStateButton;
	public MainNavigationPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getCartIcon() {
		return this.driver.findElement(By.id("shopping_cart_container"));
	}
	public WebElement getMenuHamburger() {
		return this.driver.findElement(By.id("react-burger-menu-btn"));
	}
	public WebElement getResetAppStateButton() {
		return this.driver.findElement(By.id("reset_sidebar_link"));
	}
	
	public void cartIconClick() throws InterruptedException {
		this.getCartIcon().click();
		Thread.sleep(1000);
	}
	
	public void clickOnHamburgerMenu() throws InterruptedException {
		this.getMenuHamburger().click();
		Thread.sleep(1000);
	}
	
	public void clickOnResetAppStateItem() throws InterruptedException {
		this.getResetAppStateButton().click();
		Thread.sleep(1000);
	}
	
	public int returnQuantityFromCartIcon() {
		String numberString = this.getCartIcon().getText();
		if(numberString.equals("")) {
		return 0;
		}else{
		int numberInt = Integer.parseInt(numberString);
		return numberInt;
			
	}
	}
}
