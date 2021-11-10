import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsS {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\opurv\\eclipse-workspace\\Selenium1\\Driver\\geckodriver.exe");
		
		
		try {
					WebDriver driver = new FirefoxDriver();  // Ff driver class/object
			
			driver.manage().window().maximize();  // Maximize windows
			
			driver.get("https://www.walmart.com/");
			Thread.sleep(2000); // wait
			
			driver.findElement(By.xpath("//span[@class='b_a ae_b b_g b_b b_p z_a z_h z_i']")).click();  //clicks on Account Element xpath
	
			driver.findElement(By.linkText("Sign In")).click();  // clicks sign in element Linktext 
			
			driver.findElement(By.cssSelector("button[class='button ghost text-inherit']")).click(); // create account elemnt css selector
			
			driver.findElement(By.id("first-name-su")).sendKeys("golam"); // ByID locators 
			
			driver.findElement(By.name("lastName")).sendKeys("rabi"); // 
			
			//driver.findElement(By.name("email")).sendKeys("golamrabbi610@gmail.com"); // sends keys using ByName locators! // Did not work
			driver.findElement(By.id("email-su")).sendKeys("golam@yahoo.com");
			
			//driver.findElement(By.className("password-strength password-field")).sendKeys("YY45H"); // className locators did not work
			//driver.findElement(By.name("password")).sendKeys("YY45H");// did not work
			driver.findElement(By.id("password-su")).sendKeys("Wfg6f4FH"); // SENDS KEYS USING id
		
			// Show emelemnt ///*ask teacher what to do when none of the locators works?
			//driver.findElement(By.className("button-link show-hide password-show-hide-btn show")).click();/// did not work
			//driver.findElement(By.cssSelector("button[class='button-link show-hide password-show-hide-btn hide']")).click();  // did not work
			//driver.findElement(By.cssSelector("[class='button-link show-hide password-show-hide-btn hide']")).click();
		  driver.findElement(By.xpath("button[@class='button-link show-hide password-show-hide-btn hide']")).click();
		
		
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
