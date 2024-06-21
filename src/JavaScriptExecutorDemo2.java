import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);
		List<WebElement> value = driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		int sum = 0;
		for (int i = 0; i < value.size(); i++) {

			Integer.parseInt(value.get(i).getText());
			sum = sum + Integer.parseInt(value.get(i).getText());
		}
		System.out.println(sum);
	}

}
