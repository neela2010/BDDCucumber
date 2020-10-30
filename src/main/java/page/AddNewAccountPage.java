package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class AddNewAccountPage extends BasePage {

	WebDriver driver;

	public AddNewAccountPage(WebDriver driver) {
		this.driver = driver;

	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Bank & Cash')]")
	WebElement BANK_AND_CASH_BUTTON;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Account')]")
	WebElement NEW_ACCOUNT;
	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Add New Account')]")
	WebElement ADD_NEW_ACCOUNT_PAGE_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@name='account']")
	WebElement ACCOUNT_TITLE_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@name='description']")
	WebElement DESCRIPTION_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@name='balance']")
	WebElement INITIAL_BALANCE_FIELDE;
	@FindBy(how = How.XPATH, using = "//input[@name='account_number']")
	WebElement ACCOUNT_NUMBER_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@name='contact_person']")
	WebElement CONTACT_PERSON_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@name='contact_phone']")
	WebElement PHONE_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@name='ib_url']")
	WebElement IB_URL_FIELD;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),' Submit')]")
	WebElement SUBMIT_BUTTON_LOCATOR;

	// Interactive Methods

	public void clickBankAndCash() {
		BANK_AND_CASH_BUTTON.click();
	}

	public void clickNewAccount() {
		NEW_ACCOUNT.click();
	}

	public void validateAddNewAccountPage() {
		//WebElement ADD_NEW_ACCOUNT_PAGE_LOCATOR = driver.findElement(By.xpath("//h5[contains(text(),'Add New Account')]"));

		String NewAccountactualTitle = ADD_NEW_ACCOUNT_PAGE_LOCATOR.getText();
		System.out.println(NewAccountactualTitle);
		

	}
	
	public void fillUpAddNewAccountFormFields(String accountTitle, String description, String initialBalance,
			String accountNumber, String contactPerson, String phone, String internetBankingURL) {
		ACCOUNT_TITLE_FIELD.sendKeys(accountTitle + randomGenerator());
		DESCRIPTION_FIELD.sendKeys(description);
		INITIAL_BALANCE_FIELDE.sendKeys(initialBalance);
		ACCOUNT_NUMBER_FIELD.sendKeys(accountNumber);
		CONTACT_PERSON_FIELD.sendKeys(contactPerson);
		PHONE_FIELD.sendKeys(phone + randomGenerator());
		IB_URL_FIELD.sendKeys(internetBankingURL);
	}

	public void clickOnSubmitButton() throws InterruptedException {
		Thread.sleep(2000);
		SUBMIT_BUTTON_LOCATOR.click();
	}

}
