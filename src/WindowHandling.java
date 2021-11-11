import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\opurv\\eclipse-workspace\\Selenium1\\Driver\\geckodriver.exe");
		
		
		try {
					WebDriver driver = new FirefoxDriver();  // Ff driver class/object
			
			driver.manage().window().maximize();  // Maximize windows
			
			driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
			Thread.sleep(2000); // wait
			
			WebElement elm = driver.findElement(By.tagName("a"));
			elm.click(); // clicks on the Help to open new window
			

			WebElement elm1 = driver.findElement(By.linkText("Privacy"));
			elm1.click();
			
			driver.findElement(By.linkText("Terms")).click();
			
			
				Set<String> windowHandling = driver.getWindowHandles();// this method handels the window
				Iterator<String> IterateHandling = windowHandling.iterator(); // set collections uses Iterator to go through the object
				String mainWin = IterateHandling.next();
				String childwin = IterateHandling.next();
				String childwin1=IterateHandling.next();
				String Childwin2= IterateHandling.next();
				
				System.out.println(mainWin + ""+ childwin+" "+ childwin1+ " "+ Childwin2); // prints out the id of window 
				
//				driver.switchTo().window(childwin);
//				System.out.println(driver.getTitle());
//				
//				driver.switchTo().window(childwin1);
//				System.out.println(driver.getTitle());
//				
//				driver.switchTo().window(Childwin2);
//				System.out.println(driver.getTitle());
//				
				// switiching 
				
				
			
			driver.switchTo().window(mainWin);
			System.out.println(driver.getTitle());
			
			
			Thread.sleep(2000);
			driver.switchTo().window(Childwin2);
			System.out.println(driver.getTitle());
			//driver.close();
			Thread.sleep(2000);
			
			driver.switchTo().window(mainWin);
			System.out.println(driver.getTitle());
					
		
		
		
		
		
		
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
