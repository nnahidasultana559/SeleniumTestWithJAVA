package SeleniumTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPOM {
	WebDriver driver;
	public CheckOutPOM(WebDriver driver)
	{
		this.driver = driver;
		
	}
	By summaryCheck = By.xpath("//span[text()='Proceed to checkout']");
	By addressCheck = By.xpath("//span[text()='Proceed to checkout']");
	By termsCheck = By.xpath("//label[@for='cgv']");
	By shippingCheck = By.xpath("(//button[@type='submit']//span)[2]");
	By payByCheck = By.xpath("(//span[text()='(order processing will be longer)'])[2]");
	By orderConfirmCheck = By.xpath("//span[text()='I confirm my order']");
	
	public void CheckOut() throws InterruptedException
	{
		 driver.findElement(summaryCheck).click();
		 Thread.sleep(5000);
		 driver.findElement(addressCheck).click();
		 Thread.sleep(5000);
		 driver.findElement(termsCheck).click();
		 driver.findElement(shippingCheck).click();
		 Thread.sleep(5000);
		 driver.findElement(payByCheck).click();
		 Thread.sleep(5000);
		 driver.findElement(orderConfirmCheck).click();
	}
}
