import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;



public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name="Nasruddin";
		System.getProperty("webdriver.chrome.driver","/Users/hss/Documents/Nasruddin mac/Softwares/driver/chromedriver-mac-x64 2");
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
//		System.getProperty("geckodriver.gecko.driver","/Users/hss/Documents/Nasruddin mac/Softwares/driver/geckodriver 2");
//		WebDriver driver = new EdgeDriver();
//		System.getProperty("webdriver.edge.driver","/Users/hss/Documents/Nasruddin mac/Softwares/driver/msedgedriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		String password=getPasssword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");		// Assertion is for the compare both messages and if it is match it will be pass 
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
		
	}
	
	public static String getPasssword(WebDriver driver) throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText=(driver.findElement(By.cssSelector("form p")).getText());
		//Please use temporary password 'rahulshettyacademy' to Login.
		String [] passwordArray=passwordText.split("'");
//		String [] passwordArray2=passwordArray[1].split("'");
//		passwordArray2[0]
		String password=passwordArray[1].split("'")[0];
		return password;

		
		// 0th index-Please use temporary password 
		// 1st index -'rahulshettyacademy' to Login.
		
		// 0th index-'rahulshettyacademy' 
		// 1st index -to Login.


	}

}
