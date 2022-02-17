package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutYourInformationPage {
	WebDriver driver;
	WebElement firstNameInputField;
	WebElement lastNameInputField;
	WebElement zipCodeInputField;
	WebElement continueButton;

	public CheckoutYourInformationPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getFirstNameInputField() {
		return this.driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
	}

	public WebElement getLastNameInputField() {
		return this.driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
	}

	public WebElement getZipCodeInputField() {
		return this.driver.findElement(By.xpath("//*[@id=\"postal-code\"]"));
	}

	public WebElement getContinueButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"continue\"]"));
	}
	
	public void insertFirstName(String firstName) throws InterruptedException {
		this.getFirstNameInputField().sendKeys(firstName);
		Thread.sleep(1000);
	}
	
	public void insertLastName(String lastName) throws InterruptedException {
		this.getLastNameInputField().sendKeys(lastName);
		Thread.sleep(1000);
	}
	
	public void insertZipCode(String zipCode) throws InterruptedException {
		this.getZipCodeInputField().sendKeys(zipCode);
		Thread.sleep(1000);
	}
	
	public void clickButtonContinue() {
		this.getContinueButton().click();
	}

}
