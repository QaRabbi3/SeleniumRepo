import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web_Table {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\opurv\\eclipse-workspace\\Selenium1\\Driver\\geckodriver.exe");
		
		
		try {
					WebDriver driver = new FirefoxDriver();  // Ff driver class/object
					driver.manage().window().maximize();  // Maximize windows
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//Implicit wait  
			//		WebDriverWait explicitWait = new WebDriverWait(driver, 15); // Explicit wait object
					
			
							driver.get("https://cosmocode.io/automation-practice-webtable/");
						// element of the whole table 		
				//	WebElement table = driver.findElement(By.xpath("//table[@id='countries']//tbody"));
					
					
								
		driver.findElement(By.xpath("//strong[contains(text(),'Algeria')]/parent::td//preceding-sibling::td//input[@class='hasVisited']")).click();
		
		/// this is the method to select any webtable
		////strong[contains(text(),'Afghanistan')]
		
/*		/parent::td//preceding-sibling::td//input[@class='hasVisited']   */
		
		
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
