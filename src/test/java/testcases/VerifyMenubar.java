package testcases;

import org.testng.annotations.Test;

import PageObjectModel.MenubarObjectModel;
import Resource.Baseclass;

public class VerifyMenubar extends Baseclass {
	@Test
	public void Menubar() {
		
		MenubarObjectModel obj1=new MenubarObjectModel(driver);

		driver.manage().window().maximize();
		obj1.ClickDesktop().click();
		obj1.Clicksee().click();
		obj1.ClickLaptop().click();
		obj1.ClickComponent().click();
		obj1.ClickSoftware().click();
		obj1.ClickTablet().click();
		obj1.ClickPhone().click();
		obj1.ClickCamera().click();
		obj1.ClickMp3().click();
		driver.close();
		

		
	
	
	
		
			
		}
	}
 