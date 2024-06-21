import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// AutoSuggestivedropdown
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a "));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}

		// Count and Check=in the Check Boxes

		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		// Select static Dropdown to add the more adults
		driver.findElement(By.id("divpaxinfo")).click(); // multiple adults
		Thread.sleep(2000);
		// While loop
//		int i=1;
//		while(i<=5) {
//			driver.findElement(By.id("hrefIncAdt")).click();   //5 times 
//			++i;
//		}
		// For loop
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for (int i = 1; i <= 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "6 Adult");
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		Thread.sleep(2000);
		WebElement StaticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(StaticDropdown);
		// Select Dropdown for Currency
		WebElement StaticDropdown1 = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown1 = new Select(StaticDropdown1);
		dropdown1.selectByIndex(2);
//		System.out.println(dropdown1.getFirstSelectedOption().getText());;
		dropdown1.selectByVisibleText("USD");
//		System.out.println(dropdown1.getFirstSelectedOption().getText());
		dropdown1.selectByValue("INR");
//		System.out.println(dropdown1.getFirstSelectedOption().getText());

		// Radio Button
		// Calender Select

//				System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//				System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("It's Enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		// Select Dropdown From To Location
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='IXG']")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();

	}

}
