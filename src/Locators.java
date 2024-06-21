import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.getProperty("webdriver.chrome.driver","/Users/hss/Documents/Nasruddin mac/Softwares/driver/chromedriver-mac-x64 2");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshetty");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']" )).sendKeys("Rahul");
		driver.findElement(By.cssSelector("input[placeholder='Email'")).sendKeys("rahul@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();			// By using indexing method to find the element
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("rahul123@gmail.com");  // 
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("12345678");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).clear();
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9014313457");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Nasruddin");
		driver.findElement(By.cssSelector("input[type*='pass'")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		driver.close();
//		driver.findElement(By.cssSelector("go-to-login-btn")).click();

		
		
	}

}
