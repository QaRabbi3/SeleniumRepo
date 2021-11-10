import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_Locators {
	// XPATH 
		// relative Xpath
		// Absolute Xpath
		// Traverse Xpath
		// Partial Xpath
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\opurv\\eclipse-workspace\\Selenium1\\Driver\\geckodriver.exe");
				
				try {
							WebDriver driver = new FirefoxDriver();  // Ff driver class/object
							driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // implicit
					driver.manage().window().maximize();  // Maximize windows
					driver.get("https://www.amazon.com/"); // loads page 
					
					
					// relative Xpath  // relative Xpath always start with Double Slash(//)
					Thread.sleep(2000);
					//driver.findElement(By.xpath(" //i[@class='hm-icon nav-sprite']")).click(); // clicks on menu element 
					
					//driver.findElement(By.xpath("//ul[@class='hmenu hmenu-visible']//li//a[@class='hmenu-item'][contains(text(),'Best Sellers')]")).click();
				// ASK TEACHER* // //*[text()='Testing']  // CHECK NOTE
					//driver.findElement(By.xpath("//*[text()='New Releases")).click();
				
					driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("airpod"); // text box xpath
				
				
				///Absolute Xpath   // Starts with single Slash(/)
					driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/span[1]/input[1]")).click();
					
					driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[3]/div[2]/div[5]/div[1]/span[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]")).click();
				
					
				//// Partial Xpath
					
					driver.findElement(By.xpath("//*[contains(@id,'add-to-cart-button')]")).click();  // Contain keyword Xpath
					
					Thread.sleep(2000);
					//driver.findElement(By.xpath("//*[starts-with(@class,'a-button-input')]")).click(); // Start with Keyword Xpath
					
					
					//driver.findElement(By.xpath("//a[contains(@class,'a-button-text a-text-center')]")).click();
					
				
					
					// add to cart
					driver.findElement(By.xpath("//span[@id='attachSiNoCoverage']//span[@class='a-button-inner']//input[@type='submit']")).click();
					
					
			
					driver.findElement(By.xpath("//a[@id='nav-cart']")).click();// does not work for clicking on cart element 
				
		//driver.findElement(By.linkText("Cart")).click(); //  only link text locator works for carts 
				
				}catch(Exception e) {
					System.out.println(e);
				}

	}

}
