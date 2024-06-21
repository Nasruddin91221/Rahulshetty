import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;



public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option =new ChromeOptions();
		FirefoxOptions option1= new FirefoxOptions();
		Proxy proxy=new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		option.setCapability("proxy", proxy);
		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("download.default_directory", "/directory/path");

		option.setExperimentalOption("prefs", prefs);
		WebDriver driver= new ChromeDriver(option);
//		WebDriver driver= new FirefoxDriver(option1);
		option.setAcceptInsecureCerts(true);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

		
	}

}
