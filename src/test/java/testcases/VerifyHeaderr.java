package testcases;


import org.testng.annotations.Test;

import PageObjectModel.HeaderObjectM;
import Resource.Baseclass;
import Resource.CommonMethods;
import Resource.Constant;

public class VerifyHeaderr extends Baseclass {
	@Test
	public void Header() throws InterruptedException {	
	HeaderObjectM obj1=new HeaderObjectM(driver);

	driver.manage().window().maximize();
	obj1.ClickCurrency().click();
    CommonMethods.forloop(obj1.select(), "$ US Dollar");
    Thread.sleep(3000);
    System.out.println(obj1.checkPhone().getText());
    CommonMethods.handleAssertions(obj1.checkPhone().getText(), Constant.Phone, "Not Matching");
    //Register
    obj1.OpenAc().click();
	obj1.ClickRegister().click();
	obj1.clkname().sendKeys(Constant.Firstname);
	obj1.clklastname().sendKeys(Constant.Lastname);
	obj1.clkemail().sendKeys(Constant.Email);
	obj1.entertelepho().sendKeys(Constant.Telephone);
	obj1.enterpass().sendKeys(Constant.Pass);
	obj1.enterrepas().sendKeys(Constant.ReEnterPassword);
	obj1.clkaccept().click();
	obj1.clkcontinue().click();
	//Login
	obj1.OpenAc().click();
	obj1.clklogin().click();
	obj1.enterlogineMail().sendKeys(Constant.Email);
	obj1.enterlogineMail().sendKeys(Constant.Pass);
	obj1.clklogin().click();
	obj1.ClickloginPage();
	//obj1.clklogout().click();
	obj1.clkcart();
obj1.ClickChekout().click();

	}
}


