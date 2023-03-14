package Resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
    public class Baseclass {
	public WebDriver driver;
	public Properties prop;
    public void driverInitilize() throws IOException {
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resource\\data.properties");
		 prop = new Properties();
		 prop. load(fis);
		 String browserName  = prop.getProperty("browser");	
    
		 if(browserName.equalsIgnoreCase("Chrome")) 
	   {
		driver=(WebDriver) new ChromeDriver(); 
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
		driver=new FirefoxDriver();
		}
	
	else if(browserName.equalsIgnoreCase("Edge")) 
	   {
			driver=new EdgeDriver();
		}
	 else {
		System.out.println("please make sure you have correct browser");
	 }     
	}
	
@BeforeMethod
  public void openurl() throws IOException {
           driverInitilize();
     String urlName= prop.getProperty("url");
       driver.get(urlName); 
}
/*
 @AfterMethod
    public void closeBrowser() {
    driver.quit();
	}  */
}