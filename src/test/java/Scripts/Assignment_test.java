package Scripts;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Generic.Generic_test;
import POM.Page_pom;

public class Assignment_test extends Generic_test  {
	
@Test
@Parameters({"value1","value2"})
public void occurance(String val1,String val2) {
	Page_pom pp=new Page_pom(driver);
	pp.Text1(val1);
	pp.Text2(val2);
	pp.find();
	Alert al=driver.switchTo().alert();
	String a = al.getText();
	Assert.assertEquals(a, "2");
	System.out.println(val1+" occured "+a+ " times");
	}
	
	
	
}

