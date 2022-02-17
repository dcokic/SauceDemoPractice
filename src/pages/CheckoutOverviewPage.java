package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewPage {
	WebDriver driver;
	WebElement finishButton;
	public CheckoutOverviewPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getFinishButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"finish\"]"));
	}
	
	public void clickButtonFinish() throws InterruptedException {
		this.getFinishButton().click();
		Thread.sleep(1000);
	}

}

