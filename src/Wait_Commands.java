import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Commands {
	
	/*
	Implicit Waits -
	Explicit Waits - // ExpectedConditions -> elementToBeClickable, presenceOfElementLocated, visibilityOf
	Fluent Waits-
	Thread.sleep()
	*/

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\opurv\\eclipse-workspace\\Selenium1\\Driver\\geckodriver.exe");
		
		
		try {
					WebDriver driver = new FirefoxDriver();  // Ff driver class/object
					driver.manage().window().maximize();  // Maximize windows
					
					//Implicit wait   // used for all WebElement in page
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					
					// pageload time, similiar to Implicit wait, but not a wait command
					//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
					
					// wait
					//Thread.sleep(2000);
			
			
					driver.get("https://www.amazon.com/");
					//Explicit Wait
					
					WebDriverWait explicitWait = new WebDriverWait(driver, 15);//* must have  WebdriverWait interface and object
					
			/*		// elementToBeClickable condition can use bit locator and Webelement varible
					 driver.findElement(By.id("glow-ingress-line2")).click();
					explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("glow-ingress-line2")));
					
			
				// visibilityOf  condition uses only Webelement varible 
					WebElement elm1 = driver.findElement(By.id("glow-ingress-line2"));
					explicitWait.until(ExpectedConditions.visibilityOf(elm1)); // use of explixit wait
					elm.click();  // click on the webelement 
					
				**/
					
					// presenceOfElementLocated   condidition uses only locator
					driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
					explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[@class='hm-icon nav-sprite']")));
					
					
					
		
		
		
		
		
		
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
