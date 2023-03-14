package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenubarObjectModel {
	public WebDriver driver;

		private By Desktop=By.linkText("Desktops");
		private By See=By.linkText("Show All Desktops");
		private By Laptop=By.linkText("Laptops & Notebooks");
		private By Component=By.linkText("Components");
		private By Tablet=By.linkText("Tablets");
		private By Software=By.linkText("Software");
		private By Phone=By.linkText("Phones & PDAs");
		private By Camera=By.linkText("Cameras");
		private By Mp3=By.linkText("MP3 Players");

		public MenubarObjectModel(WebDriver driver2) {
			this.driver=driver2;
			}
		
		public WebElement  ClickDesktop() {
			return driver.findElement(Desktop);
}
		public WebElement  Clicksee(){
			return driver.findElement(See);		
}
		public WebElement  ClickLaptop() {
			return driver.findElement(Laptop);
		}
		public WebElement  ClickComponent() {
			return driver.findElement(Component);
			}
		
		public WebElement  ClickTablet() {
			return driver.findElement(Tablet);	
		}
		public WebElement  ClickSoftware() {
			return driver.findElement(Software);		
		}
		public WebElement  ClickPhone() {
			return driver.findElement(Phone);
		}
		public WebElement  ClickCamera() {
			return driver.findElement(Camera);
			}
		public WebElement  ClickMp3() {
			return driver.findElement(Mp3);
			}
			
}

	