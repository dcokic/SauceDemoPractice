package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
	WebDriver driver;
	WebElement usernameInputField;
	WebElement passwordInputField;
	WebElement logInButton;
	WebElement credentialsErrorTosterMessage;
	
	public LogInPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUsernameInputField() {
		return this.driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
	}

	public WebElement getPasswordInputField() {
		return this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
	}

	public WebElement getLogInButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
	}

	public WebElement getCredentialsErrorTosterMessage() {
		return this.driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));
	}

	public void insertUsername(String username) throws InterruptedException {
		this.getUsernameInputField().sendKeys(username);
		Thread.sleep(1000);
		
	}
	
	public void insertPassword(String password) throws InterruptedException {
		this.getPasswordInputField().sendKeys(password);
		Thread.sleep(1000);
	}
	
	public void clickLogIn() throws InterruptedException {
		this.getLogInButton().click();
		Thread.sleep(1000);
	}
	
	public String getCredentialsErrorTosterMessageText() {
		return this.getCredentialsErrorTosterMessage().getText();
	}
}