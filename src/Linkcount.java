import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linkcount {

	public static void main(String[] args) {
		
		// for count of any tagname , in this case Linkcount 
			// use these steps 
				// List collection
				// By.tagName() method
				// for loop

System.setProperty("webdriver.gecko.driver", "C:\\Users\\opurv\\eclipse-workspace\\Selenium1\\Driver\\geckodriver.exe");
		
		
		try {
					WebDriver driver = new FirefoxDriver();  // Ff driver class/object
					driver.manage().window().maximize();  // Maximize windows
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//Implicit wait  
			//		WebDriverWait explicitWait = new WebDriverWait(driver, 15); // Explicit wait object
					
			
							driver.get("https://www.amazon.com/");
								Thread.sleep(2000); // wait
						
						// List collection
						java.util.List<WebElement>	linkCount = driver.findElements(By.tagName("a"));
						
							// prints # of links in page
						System.out.println("# of links in page: "+ linkCount.size());
						
						  // loops through the tagname and prints all links text
						for(int i=1; i<linkCount.size(); i++) {
							System.out.println(linkCount.get(i).getText());
						}
					
		
								
			
						
						
		
		
		
		
		
		}catch(Exception e) {
			System.out.println(e);
		}
		
		

	}

}
