package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourCartPage {
	
	WebDriver driver;
	WebElement productNameLabel;
	WebElement productNameSixthLabel;
	WebElement productQuantityBox;
	WebElement removeAddedItemButton;
	WebElement checkoutButton;
	
	public YourCartPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getProductNameLabel() {
		return this.driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
		
		
	}
	
	

	public WebElement getProductNameSixthLabel() {
		return this.driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div"));
	}

	public WebElement getProductQuantityBox() {
		return this.driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[1]"));
	}
	
	public WebElement getRemoveAddedItemButton() {
		return this.driver.findElement(By.name("remove-sauce-labs-backpack"));
		
		
	}
	
	public WebElement getCheckoutButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
	}

	public String productName() {
		return this.getProductNameLabel().getText();
		
		
	}
	
	public String sixthProductName() {
		return this.getProductNameSixthLabel().getText();
	}
	public int productQuantity() {
		String stringProductQuantitiy = this.getProductQuantityBox().getText();
		int intProductQuantity = Integer.parseUnsignedInt(stringProductQuantitiy);
		return intProductQuantity;
	}
	
	public void clickRemoveButton() {
		this.getRemoveAddedItemButton().click();
		
	}
	
	public void clickCheckOutButton() {
		this.getCheckoutButton().click();
		
	}
	

}
