import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Movement {
	/* 
	 *  Create Actions Class
	 * 	use Actions class object to perform Actions 
	 * after every actions must use build() and perfrom()
	 * 
	 * */
	
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\opurv\\eclipse-workspace\\Selenium1\\Driver\\geckodriver.exe");
		
		
		try {
					WebDriver driver = new FirefoxDriver();  // Ff driver class/object
					driver.manage().window().maximize();  // Maximize windows
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//Implicit wait  
			//		WebDriverWait explicitWait = new WebDriverWait(driver, 15); // Explicit wait object
					
			
							driver.get("https://www.amazon.com/");
							
							// use actions class to use build in method to perfom Actions
							Actions obj= new Actions(driver);
							
							
							// using Actions class object to mouse hover to a element on mazon. must use build and perfrom method
							obj.moveToElement(driver.findElement(By.linkText("Prime"))).build().perform();
							
							// in this case we need to use thread.sleep wait as it takes time fore driver to locate 
							// the element inside after hovering to element
							Thread.sleep(3000);
							driver.findElement(By.linkText("Try Prime")).click();
					
							// right clicks on the element using Action class object
							obj.contextClick(driver.findElement(By.linkText("Delivery"))).build().perform();
								
								
		
		 
		
		
		
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
