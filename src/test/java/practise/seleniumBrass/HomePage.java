package practise.seleniumBrass;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import pageObject.PasswordPage;

public class HomePage extends Base{

	@Test
	public void LoginTest() throws IOException {
		driver = initializeDriver();
		driver.get("https://www.amazon.com/");
		LandingPage l= new LandingPage(driver);
		l.getLogin().click();
		LoginPage lP=new LoginPage(driver);
		dataDriven d = new dataDriven();
		ArrayList<String> email= d.getData("Login");
		lP.getEmail().sendKeys(email.get(1));
		lP.getContinue().click();
		PasswordPage pP=new PasswordPage(driver);
		pP.getPass().sendKeys(email.get(2));
		pP.getContinue().click();
		
	}
	
	
	
	
}
