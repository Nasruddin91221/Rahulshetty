import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);
		JS.executeScript("document.querySelector('.tableFixHead').scrollTop=8000");
		List<WebElement>values= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<values.size();i++)
			
		{ 
			//System.out.println(Integer.parseInt(values.get(i).getText()));
			sum=sum+Integer.parseInt(values.get(i).getText());
			

		}
		System.out.println(sum);
		driver.findElement(By.cssSelector(".totalAmount")).getText();
		int total=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		//System.out.println(total);
		Assert.assertEquals(sum, total);

	}

}
