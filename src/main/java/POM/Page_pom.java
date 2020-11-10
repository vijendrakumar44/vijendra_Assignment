package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_pom {

	@FindBy(id="text1")
	private WebElement text1;
	
	@FindBy(id="text2")
	private WebElement text2;
	
	@FindBy(xpath="//button[@onclick='myalert()']")
	private WebElement submit;

	public Page_pom(WebDriver driver) {             
		PageFactory.initElements(driver, this);
		}

	public void Text1(String value) {
		text1.sendKeys(value);
	}
	
	public void Text2(String value) {
		text2.sendKeys(value);
	}
	public void find() {
		submit.click();
	}
}
