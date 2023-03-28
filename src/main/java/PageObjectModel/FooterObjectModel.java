package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterObjectModel {
	public WebDriver driver;
//Information
	private By About=By.linkText("About Us");
	private By Delivery=By.linkText("Delivery Information");
	private By PrivacyPolicy=By.linkText("Privacy Policy");
	private By TermsConditions=By.linkText("Terms & Conditions");
	//Customer_Services
	private By Contact=By.linkText("Contact Us");
	private By Name=By.xpath("//input[@id='input-name']");
	private By Email_id=By.xpath("//input[@id='input-email']");
	private By Enqury=By.xpath("//div[@class='form-group required'][3]");
    private By Submit=By.xpath("//input[@type='submit']");
	private By Site_map=By.linkText("Site Map");
	private By Returns=By.linkText("Returns");
	//Extras
	private By Brand=By.linkText("Brands");
	private By GiftCertificates=By.linkText("Gift Certificates");
	private By Affiliate=By.linkText("Affiliate");
	//My_Account
	private By News=By.linkText("Newsletter");
	private By Order=By.linkText("Order History");


	public FooterObjectModel(WebDriver driver2) {
		this.driver=driver2;
	}
        public WebElement clkAbout() {
		return driver.findElement(About);
	}
	    public WebElement  Clickdelivery() {
		return driver.findElement(Delivery);
	}
	   public WebElement  clickPrivecypolicy() {
		return driver.findElement(PrivacyPolicy);
	}
	  public WebElement  ClickTermCondition() {
	return driver.findElement(TermsConditions);
	}
	public WebElement clkContact() {
		return driver.findElement(Contact);
	}
	public WebElement ClickSiteMap() {
		return driver.findElement(Site_map);
	}
	
	public WebElement ClickReturns() {
		return driver.findElement(Returns);
	}
	
	public WebElement clkBrand() {
		return driver.findElement(Brand);
	}
	public WebElement clickAffiliate() {
	return driver.findElement(Affiliate);
	 }
	 public WebElement clkNews() {
	return driver.findElement(News);
	  }
	  public WebElement  ClickOrder() {
	  return driver.findElement(Order);
	  }
	  public WebElement  ClickGiftCertificates() {
	  return driver.findElement(GiftCertificates);
      }
	  public WebElement  enterName() {
	 return driver.findElement(Name);
       }
	   public WebElement  enterMail() {
	 return driver.findElement(Email_id);
	     }
	  public WebElement  enterEnqury() {
	 return driver.findElement(Enqury);
	     }
	   public WebElement ClickSubmit() {
	   return driver.findElement(Submit);
}
}