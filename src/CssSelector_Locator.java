import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector_Locator {

	public static void main(String[] args) {

		
System.setProperty("webdriver.gecko.driver", "C:\\Users\\opurv\\eclipse-workspace\\Selenium1\\Driver\\geckodriver.exe");
		
		
		try {
					WebDriver driver = new FirefoxDriver();  // Ff driver class/object
			
			driver.manage().window().maximize();  // Maximize windows
			
			driver.get("https://www.amazon.com/");
			Thread.sleep(2000); // wait
					
			/// CSS selector Locator
				
				// Css with id values ==>	#id values
			driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Rich dad poor dad");
		
				//Custom Css without tag name==>
			driver.findElement(By.cssSelector("[id='nav-search-submit-button']")).click();
			
				//Custom Css with tagname==>
			driver.findElement(By.cssSelector("span[class='a-size-medium a-color-base a-text-normal']")).click();
			
				// Css with class ==> .class value
			driver.findElement(By.cssSelector(".a-button-input")).click();
			
			driver.findElement(By.cssSelector("#nav-cart-count-container")).click(); /// works with css selector but not xpath
		Thread.sleep(2000);
			
		driver.findElement(By.cssSelector("[class='a-button-input']")).click();
		
		driver.findElement(By.cssSelector("input[id='ap_email']")).sendKeys("sheaim98@gmail.com");
		
		driver.findElement(By.cssSelector(".a-button-input")).click();
		
		driver.findElement(By.cssSelector("#ap_password")).sendKeys("Rabbi5566");
		
		driver.findElement(By.cssSelector("[id='signInSubmit']")).click();
		
		
		}catch(Exception e) {
			System.out.println(e);
		}
		

	} 

}
