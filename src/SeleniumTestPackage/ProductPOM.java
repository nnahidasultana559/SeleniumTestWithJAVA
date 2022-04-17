package SeleniumTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ProductPOM {

	WebDriver driver;
	public ProductPOM(WebDriver driver)
	{
		this.driver = driver;
	}
	By hoverDress = By.xpath("(//a[@title='Dresses'])[2]");
	By casualDress = By.xpath("(//a[@title='Casual Dresses'])[2]");
	By dress1 = By.xpath("//img[@title='Printed Dress']");
	By addToCartBtn = By.cssSelector(".ajax_add_to_cart_button > span");
	By continueShoppingBtn = By.xpath("//span[@title='Continue shopping']//span[1]");
	By tshirts = By.xpath("(//a[@title='T-shirts'])[2]");
	By blueFilter = By.id("layered_id_attribute_group_14");
	By dress2 = By.xpath("//img[@title='Faded Short Sleeve T-shirts']");
	By addToCartDress2 = By.cssSelector(".ajax_add_to_cart_button > span");
	By checkOut = By.xpath("//a[@title='Proceed to checkout']//span[1]");
	
	public void AddToCart() throws InterruptedException
	{
		//hover to casual dress section
		Actions actionsHover = new Actions(driver);
		actionsHover.moveToElement(driver.findElement(hoverDress));
		actionsHover.build().perform();
		driver.findElement(casualDress).click();
		//Thread.sleep(5000);
		
		//select the dress and add to cart
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(dress1));
		actions.build().perform();
		driver.findElement(addToCartBtn).click();
		Thread.sleep(5000);
		
		//continue shopping for another dress
		driver.findElement(continueShoppingBtn).click();
		Thread.sleep(5000);
		
		//click to tshirt section
		driver.findElement(tshirts).click();
		Thread.sleep(5000);
		
		//select the dress and add to cart and click checkout
		driver.findElement(blueFilter).click();
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(driver.findElement(dress2));
		actions2.build().perform();
		driver.findElement(addToCartDress2).click();
		Thread.sleep(5000);
		driver.findElement(checkOut).click();
	}
}
