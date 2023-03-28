package Resource;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import com.Extends.ExtentManager;

   public class Baseclass {
	public WebDriver driver;
	public Properties prop;


	public void driverIni() throws IOException {
		FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resource\\data.Properties");
		prop=new Properties();
		prop.load(fs);

		String browserName=prop.getProperty("browser");

		if(browserName.equalsIgnoreCase("chrome")) {

			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}else {System.out.println("Make sure you have correct browser");
	}}

	@BeforeMethod
	public void openUrl() throws IOException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driverIni();
		driver.manage().window().maximize();
		String urlName=prop.getProperty("url");
		driver.get(urlName);
	}

	@AfterMethod
	 public void close() {
		driver.quit();

}
	 @BeforeSuite
	 public void beforeSuite() {
		ExtentManager.setup();
	}
	@AfterSuite
	    public void afterSuite() {
		ExtentManager.endReport();
	}
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {

		 String dateFormat = new SimpleDateFormat("yyyy.MM.dd.hh:mm:ss").format(new Date());

		  TakesScreenshot ts = (TakesScreenshot) driver;

		  File source = ts.getScreenshotAs(OutputType.FILE);

		  String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateFormat + ".png";

		  File finalDestination = new File(destination);
		  try {
		  FileUtils.copyFile(source, finalDestination);
		  }catch(Exception e) {
			  e.getMessage();
		  }
		 return destination;
}

	public static String getScreenshot(Class<Baseclass> class1, String screenshotPath) {
		// TODO Auto-generated method stub
		return null;
	}

}
