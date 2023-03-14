package testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.ProductCart_ObjectModel;
import Resource.Baseclass;

public class Verify_Cart extends Baseclass{

	@Test
	public void cart() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	ProductCart_ObjectModel pom = new 	ProductCart_ObjectModel(driver);
		driver.manage().window().maximize();
		
		//HTC_Touch_HD
		pom.clksearch().sendKeys("HTC_Touch");
		pom.clkbutton().click();
		// Thread.sleep(3000);
		String HTC_Touch = pom.clkprice().getText();
		String[] price = HTC_Touch.split("\\s+");
		String dollar = price[0];
		String replace = dollar.replaceAll("[$,]", "");
	
		double d1 = Double.parseDouble(replace);
		System.out.println(d1);
		pom.clkadd().click();
		pom.clksearch().clear();
		pom.clksearch().sendKeys("samsung");
		pom.clkbutton().click();
		
		String samsung = pom.textHTC().getText(); 
		String[] tabprice = samsung.split("\\s+");
        String seprate = tabprice[0];
	
		String removedollar = seprate.replaceAll("[$,]", "");

		double d2 = Double.parseDouble(removedollar);
		pom.textsamsung().click();
		Thread.sleep(2000);
		pom.clkcart().click();

		double d = d1 + d2;
		String values = pom.totaltext().getText();
		String totaldollar = values.replaceAll("[$,]", "");
	    double d3 = Double.parseDouble(totaldollar);
		

		if (d == d3) {
			System.out.println("total is matching");
			
		}

	}

}
