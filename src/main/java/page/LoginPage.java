package page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	// Element library
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement USER_NAME_LOCATE;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD_LOCATE;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SIGNIN_LOCATE;

	// Interactive method

	public void enterUserName(String userName) {
		USER_NAME_LOCATE.sendKeys(userName);
	}

	public void enterPassword(String password) {
		PASSWORD_LOCATE.sendKeys(password);
	}

	public void clickSigninButton() {
		SIGNIN_LOCATE.click();
	}

	public void enterCredentials(String userName, String password) {
		USER_NAME_LOCATE.sendKeys(userName);
		PASSWORD_LOCATE.sendKeys(password);	
	}
	
	public void clickOnSignInButton() {
		SIGNIN_LOCATE.click();
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void takeScreenshotAtEndOfTest (WebDriver driver) throws IOException {
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File("user" + "/screenshots/" + System.currentTimeMillis() + ".png"));

		
	}
	
}
