import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class arrayofAddtoCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.getProperty("webdriver.chrome.driver",
				"/Users/hss/Documents/Nasruddin mac/Softwares/driver/chromedriver-mac-x64 2");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		String[] itemsNeeded = { "Brocolli", "Cauliflower", "Cucumber", "Beetroot", "Carrot", "Tomato", "Beans",
				"Brinjal", "Capsicum", "Mushroom" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//		Thread.sleep(3000);

		addItems(driver, itemsNeeded);
//		arrayofAddtoCart a =new arrayofAddtoCart();
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input.promoCode")));
//		driver.findElement(By.xpath("//input=[@text()='promoCode']")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//Explicit
//		WebDriverWait w = new WebDriverWait (driver,5);   //This Code is Depricated
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By.cssSelector("span.promoInfo"))));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++)

		{
			// Brocolli[0] - 1 Kg[1]

			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();

			// format it to get actual vegetable name
			// check whether name you extracted is present or not-
			// convert Array into array list for easy search

			List itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formattedName)) {
				j++;
				// Click on Add to Cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length) {
					break;
				}
			}
		}

	}
}
