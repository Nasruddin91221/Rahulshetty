import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Miscelleanous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("asdf"); // Click on the link and // login page - Verify Login URL
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",
		Arrays.asList("disable-popup-blocking"));
		driver.get("http://google.com");
		System.out.println(driver.getCurrentUrl());
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users/hss/Documents/Zoom/screenshot.png"));
		
	}

}
