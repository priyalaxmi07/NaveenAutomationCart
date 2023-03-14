package Resource;


import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class CommonMethods {

	  public  WebDriver driver;
	  public static void forloop(List<WebElement> Elements, String y) {
	    
	    for(WebElement a:Elements) {
	      if(a.getText().equalsIgnoreCase(y)) {
	        a.click();
	        break;
	      }
	    }}
	  public static void handleAssertions(String actual, String Expected, String message) {
	    
	  SoftAssert a=new SoftAssert();
	  
	  String ac=actual;
	  String exp=Expected;
	  
	  a.assertEquals(ac, exp, message);
	  a.assertAll();
	  
	  }
	  {
	
		
		  /* 
	  driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).click();
	  
	 // String alertText=driver.switchTo().alert().getText(); 
	    
	  driver.switchTo().alert().accept();  
	  driver.switchTo().alert().dismiss();  //To dismiss the alert
	 
	  driver.switchTo().alert().sendKeys("xyz@gmail.com");  //send input
	  driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	 */
	  
	  
	 }

	}


