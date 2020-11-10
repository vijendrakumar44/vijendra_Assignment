package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Generic_test implements constant {
	public WebDriver driver;
@BeforeMethod
@Parameters({"browser"})
public void login(String browser) {
	if(browser.equals("chrome")) {
	System.setProperty(Chrome_key, chrome_value);
	driver=new ChromeDriver();
	}else {
		System.setProperty(fire_key, fire_value);
		driver=new FirefoxDriver();
	}
	driver.get(url);
}
@AfterMethod
public void close() {
	//driver.quit();
	
}

}
