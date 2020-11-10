package Generic;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot implements constant{

	public static void capture(WebDriver driver,String name) {
		String date=new Date().toString().replace(":","-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo_path+date+name);
		try {
			FileHandler.copy(src, dst);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("handled");
		}
		}
		
	}
