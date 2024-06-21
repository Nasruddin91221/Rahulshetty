import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntro {

	public static void main(String[] args) {

		
		//Invoking Browser
		//Chrome -ChromeDriver -> Method close get
		//Firefox-FirefoxDriver -> Method close get
		//Safari-SafariDriver -> Method close get
		//WebDriver Method + classDriver method 

	//	Chromedriver.exe -> Chrome browser 
	//	ChromeDriver driver = new ChromeDriver();
		
//		System.getProperty("webdriver.chrome.driver","/Users/hss/Documents/Nasruddin mac/Softwares/driver/chromedriver-mac-x64 2");
//		WebDriver driver = new ChromeDriver();
		
		// Firefox Launch
		// geckodriver
//		WebDriver driver = new FirefoxDriver();
//		System.getProperty("geckodriver.gecko.driver","/Users/hss/Documents/Nasruddin mac/Softwares/driver/geckodriver 2");
		
		// MicrosoftEdge Launch
		// edgedriver
		WebDriver driver = new EdgeDriver();
		System.getProperty("webdriver.edge.driver","/Users/hss/Documents/Nasruddin mac/Softwares/driver/msedgedriver");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		driver.close();
//		driver.quit();
		
		
		
		
	}

}
