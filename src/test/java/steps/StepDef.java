package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.AddNewAccountPage;
import page.LoginPage;
import util.BrowserFactory;

public class StepDef {
	WebDriver driver;
	LoginPage loginPage;
	AddNewAccountPage addNewAccountPage;

	@Before
	public void BeforeRun() {
		driver = BrowserFactory.startBrowser();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		addNewAccountPage = PageFactory.initElements(driver, AddNewAccountPage.class);
	}

	@Given("^User is on the TechFios Login Page$")
	public void User_is_on_the_TechFios_Login_Page() {
		driver.get("http://www.techfios.com/billing/?ng=admin/");

	}

	@When("^User enters the username as \"([^\"]*)\"$")
	public void user_enters_the_username_as(String userName) {
		loginPage.enterUserName(userName);
		// driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo@techfios.com");

	}

	@When("^User enters the password as \"([^\"]*)\"$")
	public void user_enters_the_password_as(String password) {
		// driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc123");
		loginPage.enterPassword(password);

	}

	@When("^User enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_Credentials(String userName, String password) {
		loginPage.enterCredentials(userName, password);

	}

	@When("^User clicks on the log in button$")
	public void user_clicks_on_the_log_in_button() {
		// driver.findElement(By.xpath("//button[@name='login']")).click();
		loginPage.clickSigninButton();
		}

	@Then("^User should be able to see the DashBoard Page$")
	public void user_should_be_able_to_see_the_DashBoard_Page() throws IOException {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		loginPage.takeScreenshotAtEndOfTest(driver);

		// loginPage.getPageTitle();
		// System.out.println("User landed on DashBoard page");

	}

	@Then("^User clicks on Bank & Cash button$")
	public void user_clicks_on_Bank_Cash_button() throws InterruptedException {
		Thread.sleep(1000);
		addNewAccountPage.clickBankAndCash();
	}

	@Then("^User clicks on New Account$")
	public void user_clicks_on_New_Account()  {
		addNewAccountPage.clickNewAccount();
	}
	


	@Then("^User fill up the form by entering \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_fill_up_the_form_by_enteringValuesOntheFields(String accountTitle, String description,
			String initialBalance, String accountNumber, String contactPerson, String phone,
			String internetBankingURL) throws InterruptedException {
		Thread.sleep(2000);
		addNewAccountPage.fillUpAddNewAccountFormFields(accountTitle, description, initialBalance, accountNumber,
				contactPerson, phone, internetBankingURL);

	}

	@Then("^User clicks on Submit button$")
	public void user_clicks_on_Submit_button() throws InterruptedException {
		addNewAccountPage.clickOnSubmitButton();
		Thread.sleep(2000);
	}

	@After
	public void afterRun() {
		driver.close();
		driver.quit();
	}
}
