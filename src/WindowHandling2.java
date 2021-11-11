import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling2 {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\opurv\\eclipse-workspace\\Selenium1\\Driver\\geckodriver.exe");
		
		
		try {
					WebDriver driver = new FirefoxDriver();  // Ff driver class/object
					driver.manage().window().maximize();  // Maximize windows
			
			driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
			Thread.sleep(2000); // wait
			
			// opens all the child window
			
		
			driver.findElement(By.linkText("Privacy")).click();

			driver.findElement(By.linkText("Terms")).click();
			driver.findElement(By.tagName("a")).click();
		
			// Stores unique Parent window Id value in a string
			String ParentWindow = driver.getWindowHandle();
			//prints out Parent window ID
			System.out.println(ParentWindow);
			// Stores all the child windows and parent window in a set of String
			Set<String> All_Windows = driver.getWindowHandles();
			System.out.println(All_Windows);
			//Iterator will iterate through all the child windows
			Iterator<String> iteratorHandling= All_Windows.iterator();
			//String PreferredWindwow= "Google Account Help";
			
			// looping through all the windows in the iterator
			while(iteratorHandling.hasNext()) {
				
				String ChildWindow =iteratorHandling.next();
				Thread.sleep(2000); 
				
//				if(ChildWindow.contains("Google Account Help")) {
//					driver.switchTo().window(ChildWindow);
//					System.out.println(driver.getTitle());
//				}
				
				if(!ParentWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
					System.out.println(driver.getTitle());
					
					
					
					//if(ChildWindow.equalsIgnoreCase(PreferredWindwow)) {
					//	 driver.switchTo().window(ChildWindow);
						 
					 }
				}
			//}
			//
		//	driver.switchTo().window(ParentWindow);
		
		
		
		
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
