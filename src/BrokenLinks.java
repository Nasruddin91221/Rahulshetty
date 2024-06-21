//import java.io.IOException;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.asserts.SoftAssert;
//
//public class BrokenLinks {
//
//	public static void main(String[] args) throws MalformedURLException, IOException {
//		// TODO Auto-generated method stub
//
//		WebDriver driver = new ChromeDriver();
//		// broken URL
//		// java method will call URL's and get the status code for you
//		// if the status code is 404 then URL is not working > Link which tied to url is
//		// broken
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
////		SoftAssert a = new SoftAssert();
//		for (WebElement link : links) {
//			String url = link.getAttribute("href");
////			 String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
////			 String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
//			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
//			conn.setRequestMethod("HEAD");
//			conn.connect();
//			int responseCode = conn.getResponseCode();
//			System.out.println(responseCode);
//			a.assertTrue(responseCode < 400,
//					"The link with Text" + link.getText() + " is broken with code " + responseCode);
//			// This if condition is used only if we did not use
//			// Assert.AssertTrue(true,Message);
////			if (responseCode > 400) {
////				System.out.println("The link with Text" + link.getText() + " is broken with code " + responseCode);
////				Assert.assertTrue(false);
////			}
//
//		}
//
//	}
//}