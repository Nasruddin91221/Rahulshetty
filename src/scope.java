import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Give me the count of link on the page
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		// count the no. of links in the footer section(Limiting Webdriver-scope)
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));  //Limiting Web driver scope
		List<WebElement> link1 = footerdriver.findElements(By.tagName("a"));
		System.out.println(link1.size());
		// count the no.of links in the footer 1st column
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		List<WebElement> link2 = columndriver.findElements(By.tagName("a"));
		int link2a = link2.size();
		System.out.println(link2a);
		// In the Footer Column to check the pages are opening or not by clicking
		// click on each link in the column and check if the pages or opening or not ?
		for (int i = 1; i < link2a; i++) {
			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			link2.get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
			// Open All the Tabs
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}
		}
	}

}
