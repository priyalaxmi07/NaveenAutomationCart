package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderObjectM {
	public WebDriver driver;
	private By Currency=By.xpath("//button[@class='btn btn-link dropdown-toggle']");
	private By dropdown=By.xpath("//button[@class='currency-select btn btn-link btn-block']");
	//Contact-us
	private By Phone=By.xpath("//ul[@class='list-inline']/li/span");

	//Account
	private By Account=By.xpath("//span[@class='caret']");
	private By Register=By.linkText("Register");
	private By Login=By.linkText("Login");
	
	//MyAccount_Register
	private By Firstname=By.xpath("//input[@id='input-firstname']");
	private By Lastname=By.xpath("//input[@id='input-lastname']");
	private By Emailid=By.xpath("//input[@id='input-email']");
	private By Telephone=By.xpath("//input[@id='input-telephone']");
	private By Pass=By.xpath("//input[@id='input-password']");
	private By Repassword=By.xpath("//input[@id='input-confirm']");
	private By Accept=By.xpath("//input[@name='agree']");
	private By conti=By.xpath("//input[@value='Continue']");
	
	//MyAccount_Login
	private By Loginemail=By.xpath("//input[@id='input-email']");
	private By Loginpass=By.xpath("//input[@id='input-password']");
	private By Loginpage=By.xpath("//input[@value='Login']");


	private By Cart=By.xpath("(//i[@class='fa fa-shopping-cart'])[1]");
	private By Checkout=By.xpath("//i[@class='fa fa-share']");

	
	public HeaderObjectM(WebDriver driver2) {
		this.driver=driver2;
	}
	
	    public WebElement ClickCurrency() {
		return driver.findElement(Currency);
	}
	   public List<WebElement> select(){
		return driver.findElements(dropdown);
	}
	   public WebElement checkPhone() {
		return driver.findElement(Phone);
	}
	    public WebElement OpenAc() {
		return driver.findElement(Account);
	}
	   public WebElement ClickRegister() {
		return driver.findElement(Register);
	}
	   public WebElement clklogin() {
		return driver.findElement(Login);
	}
	    public WebElement clkcart() {
		return driver.findElement(Cart);
	}
	  
	    public WebElement enterlogineMail() {
		return driver.findElement(Loginemail);
	}
	     public WebElement enterloginpass() {
		return driver.findElement(Loginpass);
	} 
	   public WebElement ClickloginPage() {
		return driver.findElement(Loginpage);
	}
	    public WebElement ClickChekout() {
		return driver.findElement(Checkout);
	}
	   public WebElement clkname() {
			return driver.findElement(Firstname);
		}
		   public WebElement clklastname() {
			return driver.findElement(Lastname);
		}
		    public WebElement clkemail() {
			return driver.findElement(Emailid);
		} 
		  public WebElement entertelepho() {
			return driver.findElement(Telephone);
		}
		   public WebElement enterpass() {
			return driver.findElement(Pass);
		}
		    public WebElement enterrepas() {
			return driver.findElement(Repassword);
		}
		    public WebElement clkaccept() {
			return driver.findElement(Accept);
		}
		    public WebElement clkcontinue() {
			return driver.findElement(conti);
		}


       }


