package SeleniumTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPOM {

	WebDriver driver;
	public SignUpPOM(WebDriver driver)
	{
		this.driver = driver;
		
	}
	By signInBtn = By.linkText("Sign in");
	By emailCreateTb = By.id("email_create");
	By emailTb = By.id("email");
	By submitBtn = By.id("SubmitCreate");
	By genderRadio = By.id("id_gender2");
	By firstNameTb = By.id("customer_firstname");
	By lastNamTb = By.id("customer_lastname");
	By passwordTb = By.id("passwd");
	By address1Tb = By.id("address1");
	By cityTb = By.id("city");
	By stateDropdown = By.id("id_state");
	By postCodeTb = By.id("postcode");
	By mobileTb = By.id("phone_mobile");
	By submitSignUpBtn = By.id("submitAccount");
	By signOutBtn = By.linkText("Sign out");
	By submitLogin = By.id("SubmitLogin");
	
	public void SignUp(String email, String firstName, String lastName, String password,
			String address1, String city, String state, String postcode, String mobileNo) throws InterruptedException 
	{
		  driver.findElement(signInBtn).click(); 
		  Thread.sleep(5000);
		  driver.findElement(emailCreateTb).sendKeys(email); 
		  driver.findElement(submitBtn).click(); 
		  Thread.sleep(5000);
		  driver.findElement(genderRadio).click();
		  driver.findElement(firstNameTb).sendKeys(firstName);
		  driver.findElement(lastNamTb).sendKeys(lastName);
		  driver.findElement(passwordTb).sendKeys(password);
		  driver.findElement(address1Tb).sendKeys(address1);
		  driver.findElement(cityTb).sendKeys(city); 
		  Select states = new Select(driver.findElement(stateDropdown));
		  states.selectByVisibleText(state);
		  driver.findElement(postCodeTb).sendKeys(postcode);
		  driver.findElement(mobileTb).sendKeys(mobileNo);
		  driver.findElement(submitSignUpBtn).click();
		  driver.findElement(signOutBtn).click();
	}
	
	public void SignIn(String email, String password)
	{
		driver.findElement(signInBtn).click();
	    driver.findElement(emailTb).sendKeys(email);
	    driver.findElement(passwordTb).sendKeys(password);
	    driver.findElement(submitLogin).click();
	}
	
	public void SignOut()
	{
		driver.findElement(signOutBtn).click();
	}
}
