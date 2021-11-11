import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class NavigationCommand {
	/* Navigation commands
	 	To command -to() 
	 	Foward Command -foward()   
	 	back Command - back()
	 	refresh command - refresh()
	 */
	
		public static void main(String []args) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\opurv\\eclipse-workspace\\Selenium1\\Driver\\geckodriver.exe");
			
			
			try {
					WebDriver driver = new FirefoxDriver();  // Ff driver class/object
					driver.manage().window().maximize();  // Maximize windows
				
			// To command , alternative to get method
				driver.navigate().to("https://www.seleniumeasy.com/test/"); // launch the page 
				Thread.sleep(2000); // wait
			
				driver.findElement(By.id("at-cv-lightbox-close")).click();
			WebElement elm= driver.findElement(By.tagName("a"));
			elm.click();
						
			//back command
				driver.navigate().back();
				
			driver.findElement(By.linkText("List Box")).click();
			
			driver.findElement(By.linkText("Bootstrap List Box")).click();
			
			// back command // foward command // refresh command
				driver.navigate().back();
				driver.navigate().refresh();
				Thread.sleep(2000);
				driver.navigate().forward();
				
			
			
			
			
			
			}catch(Exception e) {
				System.out.println(e);
			}
		}

}
