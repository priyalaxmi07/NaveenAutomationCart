package testcases;
import org.testng.annotations.Test;


import PageObjectModel.FooterObjectModel;
import Resource.Baseclass;
import Resource.Constant;

public class VerifyFooter extends Baseclass {


	@Test

	public void footer() {
	
	FooterObjectModel fom=new 	FooterObjectModel(driver);
driver.manage().window().maximize();
 fom.clkAbout().click();
 fom.Clickdelivery().click();
 fom.clickPrivecypolicy().click();
 fom.ClickTermCondition().click();
 fom.clkBrand().click();
 fom.clkContact().click();
 fom.enterName().sendKeys(Constant.Your_Name);
 fom.enterMail().sendKeys(Constant.Email_Add);
//fom.enterEnqury().sendKeys(Constant.Enqury);
 fom.ClickSubmit().click();
 fom.ClickOrder().click();
 fom.clkNews().click();

}
}