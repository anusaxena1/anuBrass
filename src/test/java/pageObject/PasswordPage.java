package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PasswordPage {

public WebDriver driver;
	
	By pass=By.id("ap_password");
	By sign=By.id("signInSubmit");
	
	public PasswordPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getPass() {
		return driver.findElement(pass);
	}
	
	public WebElement getContinue() {
		return driver.findElement(sign);
	}
}
