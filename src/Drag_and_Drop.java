import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\opurv\\eclipse-workspace\\Selenium1\\Driver\\geckodriver.exe");
		
		
		try {
					WebDriver driver = new FirefoxDriver();  // Ff driver class/object
					driver.manage().window().maximize();  // Maximize windows
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//Implicit wait  
			//		WebDriverWait explicitWait = new WebDriverWait(driver, 15); // Explicit wait object
					
			
							driver.get("https://demoqa.com/droppable");
						// WebElement for Drag
						WebElement SourceLocator = driver.findElement(By.cssSelector("#draggable"));
						//WebElement for Droppable
						WebElement DestinationLocator= driver.findElement(By.cssSelector("#droppable"));
						// Actions class to use drag&drop method 
						Actions Actionsobj= new Actions(driver);
						
						Actionsobj.dragAndDrop(SourceLocator, DestinationLocator).build().perform();
								
					
		
								
								
		
		
		
		
		
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
