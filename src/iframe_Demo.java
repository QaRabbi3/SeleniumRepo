import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iframe_Demo {
	// Switch to the frame in page
	//driver.switchto().frame("");
// Switches back to main page after finishing task in frame
	//driver.switchto().default content();
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\opurv\\eclipse-workspace\\Selenium1\\Driver\\geckodriver.exe");
		
		
		try {
					WebDriver driver = new FirefoxDriver();  // Ff driver class/object
					driver.manage().window().maximize();  // Maximize windows
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//Implicit wait  
			//		WebDriverWait explicitWait = new WebDriverWait(driver, 15); // Explicit wait object
					
			
							driver.get("https://demoqa.com/frames");
							
							java.util.List<WebElement> iframecount= driver.findElements(By.tagName("iframe"));
							System.out.println(iframecount.size());
					 		
							// switch to inside the frame 
							// frame by index
							driver.switchTo().frame(0);
							String text = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
							System.out.println(text);
		
								// this switch back to parent window/default content in the pge
							driver.switchTo().defaultContent();
							
								
		
		
		
		
		
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
