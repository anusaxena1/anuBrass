package practise.seleniumBrass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
		
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException {
	Properties prop= new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\ANU SAXENA\\eclipse-workspace\\seleniumBrass\\src\\main\\java\\practise\\seleniumBrass\\data.properties");
	prop.load(fis);
	prop.getProperty("browser");
	System.setProperty("webdriver.chrome.driver", "D:\\work\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}
}
