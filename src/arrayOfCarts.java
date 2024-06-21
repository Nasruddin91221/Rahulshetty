import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class arrayOfCarts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String[] itemsList = { "Brocolli", "Cauliflower", "Cucumber", "Beetroot", "Carrot", "Tomato", "Beans",
				"Brinjal", "Capsicum", "Mushroom" };
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		int j = 0;

		
		
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	
		List<WebElement> products = driver.findElements(By.cssSelector("product-name"));
	
		for (int i = 0; i < products.size(); i++) 
		
		{
		
			
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			
			// Format it to get it actual vegetable name
			// check weather names you extracted is present in Array or not
			// Convert Array in to arrayList for each Search
			List itemsNeededList = Arrays.asList(itemsList);

			
			if (itemsNeededList.contains(formattedName)) 
			{
				
				
				j++;
				// click to ADD THE CART
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				
				if (j == 10) {
					break;
				}
			}
		}
	}
}
