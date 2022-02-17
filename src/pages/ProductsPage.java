package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
	WebDriver driver;
	WebElement backPackProductNameLabel;
	WebElement addFirstItemToCardButton;
	WebElement addSecondItemToCardButton;
	WebElement addThirdItemToCardButton;
	WebElement addFourthItemToCardButton;
	WebElement addFifthItemToCardButton;
	WebElement addSixthItemToCardButton;
	
	
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getBackPackProductNameLabel() {
		return this.driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
	}
	
	public WebElement getAddFirstItemToCardButton() {
		return this.driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));

	}
	
	public WebElement getAddSecondItemToCardButton() {
		return this.driver.findElement(By.name("add-to-cart-sauce-labs-bike-light"));
	}
	
	public WebElement getAddThirdItemToCardButton() {
		return this.driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt"));
	}

	public WebElement getAddFourthItemToCardButton() {
		return this.driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket"));
	}
	
	public WebElement getAddFifthItemToCardButton() {
		return this.driver.findElement(By.name("add-to-cart-sauce-labs-onesie"));
	}
	
	public WebElement getAddSixthItemToCardButton() {
		return this.driver.findElement(By.name("add-to-cart-test.allthethings()-t-shirt-(red)"));
	}

	public String getBackPackProductNameLabelText() {
		return this.getBackPackProductNameLabel().getText();
	}
	
	public void clickFirstElementAddToCartButton() throws InterruptedException {
		this.getAddFirstItemToCardButton().click();
		Thread.sleep(1000);
		
	}
	
	public void clickSecondElementAddToCartButton() throws InterruptedException {
		this.getAddSecondItemToCardButton().click();
		Thread.sleep(1000);
	}
	
	public void clickThirdElementAddToCartButton() throws InterruptedException {
		this.getAddThirdItemToCardButton().click();
		Thread.sleep(1000);
	}
	
	public void clickFourthElementAddToCartButton() throws InterruptedException {
		this.getAddFourthItemToCardButton().click();
		Thread.sleep(1000);
	}
	
	public void clickFifthElementAddToCartButton() throws InterruptedException {
		this.getAddFifthItemToCardButton().click();
		Thread.sleep(1000);
	}
	
	public void clickSixthElementAddToCartButton() throws InterruptedException {
		this.getAddSixthItemToCardButton().click();
		Thread.sleep(1000);
	}
}
