package SeleniumTestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutTest {

	public static void main(String[] args) throws InterruptedException {
		
	    //SETUP
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		SignUpPOM signUpObj = new SignUpPOM(driver);
	    ProductPOM productObj = new ProductPOM(driver);
	    CheckOutPOM checkOutObj =  new CheckOutPOM(driver);
		
		//TEST
	    
			//sign up for user 1
			signUpObj.SignUp("nahidasultana14@gmail.com", "Nahida", "Sultana", "nahida", "Dhaka", "Dhaka", "Texas", "11111", "+1202-555-0410");
			Thread.sleep(5000);
			//sign up for user 2
			signUpObj.SignUp("nahidasultana15@gmail.com", "Nahida", "Sultana", "nahida", "Dhaka", "Dhaka", "Texas", "11111", "+1202-555-0410");
			Thread.sleep(5000);
			
			//sign in for user 1
			signUpObj.SignIn("nahidasultana14@gmail.com", "nahida");
			Thread.sleep(5000);
			
			//Products adding to cart
			productObj.AddToCart();
			Thread.sleep(5000);
			
			//Proceed to checkout and confirm order
			checkOutObj.CheckOut();
		    Thread.sleep(5000);
		    
		    //sign out
		    signUpObj.SignOut();
		    Thread.sleep(5000);
		    
		    //sign in for user 2
			signUpObj.SignIn("nahidasultana15@gmail.com", "nahida");
			Thread.sleep(5000);
			
			//Products adding to cart
			productObj.AddToCart();
			Thread.sleep(5000);
			
			//Proceed to checkout and confirm order
			checkOutObj.CheckOut();
		    Thread.sleep(5000);
		    
		    //sign out
		    signUpObj.SignOut();
		    Thread.sleep(5000);
		    
	    
        //EXIT
        driver.quit();
       
    }
}
