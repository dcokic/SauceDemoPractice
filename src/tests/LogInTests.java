package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTests extends BaseTest{
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		super.driver.navigate().to(super.webSiteUrl);
		Thread.sleep(1000);
	}
	@Test
	public void logInValidCredentials() throws InterruptedException {
		String username = excelReader.returnStringDataFromExcel("Log in", 5, 2);
		String password = excelReader.returnStringDataFromExcel("Log in", 6, 2);
		String expectedText = excelReader.returnStringDataFromExcel("Log in", 10, 3);
		String actualText;
		
		logInPage.insertUsername(username);
		logInPage.insertPassword(password);
		logInPage.clickLogIn();
		actualText = productsPage.getBackPackProductNameLabelText();
		assertEquals(actualText, expectedText);
	}
	
	@Test
	public void logInInvalidCredentials() throws InterruptedException {
		String username = excelReader.returnStringDataFromExcel("Log in", 15, 2);
		String password = excelReader.returnStringDataFromExcel("Log in", 16, 2);
		String expectedText = excelReader.returnStringDataFromExcel("Log in", 20, 3);
		String actualText;
		
		logInPage.insertUsername(username);
		logInPage.insertPassword(password);
		logInPage.clickLogIn();
		
		actualText = logInPage.getCredentialsErrorTosterMessageText();
		
		assertEquals(actualText, expectedText);
	}
	
	@Test
	public void logInWithValidUsername() throws InterruptedException{
		String username = excelReader.returnStringDataFromExcel("Log in", 28, 2);
		String password = "";
		String expectedText = excelReader.returnStringDataFromExcel("Log in", 33, 3);
		String actualText;
		logInPage.insertUsername(username);
		logInPage.insertPassword(password);
		logInPage.clickLogIn();
		
		actualText = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
		assertEquals(actualText, expectedText);
		
	}
	
	@Test
	public void logInWithValidPassword() throws InterruptedException{
		String username = "";
		String password = excelReader.returnStringDataFromExcel("Log in", 41, 2);
		String expectedText = excelReader.returnStringDataFromExcel("Log in", 45, 3);
		String actualText;
		logInPage.insertUsername(username);
		logInPage.insertPassword(password);
		logInPage.clickLogIn();
		
		actualText = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
		assertEquals(actualText, expectedText);
	
	}
}
