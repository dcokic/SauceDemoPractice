package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutCompletePage {
	WebDriver driver;
	WebElement backHomeButton;
	WebElement textLabel;
	
	public CheckoutCompletePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getBackHomeButton() {
		return this.driver.findElement(By.id("back-to-products"));

	}
	
	// //*[@id="checkout_complete_container"]/h2
	
	
	
	public WebElement getTextLabel() {
		return this.driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));
	}

	public void clickBackHomeButton() throws InterruptedException {
		this.getBackHomeButton().click();
		Thread.sleep(1000);
	}
	
	public String textT() {
		return this.getTextLabel().getText();
	}
	
	

}
