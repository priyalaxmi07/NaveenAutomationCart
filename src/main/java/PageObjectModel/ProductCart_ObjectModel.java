package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductCart_ObjectModel {
	public WebDriver driver;

	private By Search=By.xpath("//input[@name='search']");
	private By Button=By.xpath("//button[@class='btn btn-default btn-lg']");
	private By HTC_Touchprice=By.xpath("//p[@class='price']");
	private By HTC_AddCart=By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[7]");
	private By samsungprice=By.xpath("(//p[@class='price'])[2]");
	private By addsamsung=By.xpath("(//i[@class='fa fa-shopping-cart'])[5]");
	private By cart=By.xpath("(//i[@class='fa fa-shopping-cart'])[2]");
	private By total=By.xpath("(//td[@class='text-right'])[12]");


	   public ProductCart_ObjectModel(WebDriver driver2) {
		this.driver=driver2;}

	    public WebElement clksearch() {
		return driver.findElement(Search);
	}
	public WebElement clkbutton() {
		return driver.findElement(Button);
	}
	public WebElement clkprice() {
		return driver.findElement(HTC_Touchprice);
	}
	public WebElement clkadd() {
		return driver.findElement(HTC_AddCart);
	}
	public WebElement textHTC() {
		return driver.findElement(samsungprice);
	}
	public WebElement textCanon() {
		return driver.findElement(addsamsung);
	}
	   public WebElement clkcart() {
		return driver.findElement(cart);
	}
	    public WebElement totaltext() {
		return driver.findElement(total);
	}
	   public WebElement textsamsung() {
		return driver.findElement(addsamsung);
	
	}

}
