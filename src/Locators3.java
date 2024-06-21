import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.getProperty("webdriver.chrome.driver","/Users/hss/Documents/Nasruddin mac/Softwares/driver/chromedriver-mac-x64 2");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Sibling-Child to parent traverse
//		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		//header/div/button[1]/following-sibling::button[1]
		// Sibling-Parent to Child traverse
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		
		driver.close();

	}

}
