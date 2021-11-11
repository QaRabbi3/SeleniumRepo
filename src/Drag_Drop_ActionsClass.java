import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_ActionsClass {
////////// does not work///////////////////////////////////////////////////////////
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\opurv\\eclipse-workspace\\Selenium1\\Driver\\geckodriver.exe");
		
		
		try {
					WebDriver driver = new FirefoxDriver();  // Ff driver class/object
					driver.manage().window().maximize();  // Maximize windows
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//Implicit wait  
			//		WebDriverWait explicitWait = new WebDriverWait(driver, 15); // Explicit wait object
					
			
							driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
							
						
							WebElement drag1 = driver.findElement(By.xpath("//span[contains(text(),'Draggable 1')]"));
							
							WebElement drag3 = driver.findElement(By.xpath("//span[contains(text(),'Draggable 3')]"));
							
							WebElement droppable= driver.findElement(By.cssSelector("#mydropzone"));
							Actions objAction = new Actions(driver);
							
							//objAction.dragAndDrop(drag1, droppable).build().perform(); 
						//	objAction.dragAndDrop(drag3, droppable).build().perform();
							
					//Action class build
							
					objAction.clickAndHold(drag1).moveToElement(droppable).release().build().perform();		
		
								
								
		
		
		
		
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
