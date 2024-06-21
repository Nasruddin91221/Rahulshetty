import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://staging.s9trucks.com/admin/login");
		driver.findElement(By.id("mat-input-0")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.id("mat-input-1")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		System.out.println("Admin has logged in successfuly ");
		JavascriptExecutor JS = (JavascriptExecutor) driver;
//		Thread.sleep(3000);
//		JS.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);
		JS.executeScript("document.querySelector(\".mat-drawer-inner-container.ng-tns-c49-31\").scrollTop=5000");

	}
}
// document.querySelector(".mat-drawer-inner-container.ng-tns-c49-31").scrollTop=5000
