import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_Popup {
/*	Simple Alert
	Prompt Alert.
	Confirmation Alert.
		*****Handling Alert*******
	///switchTo() to alert()
Alert simpleAlert = driver.switchTo().alert();
	///accept() To accept the alert
	//dismiss() To dismiss the alert
	//getText() To get the text of the alert
	//sendKeys() To write some text to the alert
*/
public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\opurv\\eclipse-workspace\\Selenium1\\Driver\\geckodriver.exe");
		try {
			WebDriver driver = new FirefoxDriver();  // Ff driver class/object
			driver.manage().window().maximize();  // Maximize windows
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//Implicit wait  
			WebDriverWait explicitWait = new WebDriverWait(driver, 15); // Explicit wait object
			
	
					driver.get("https://demoqa.com/alerts");
				
						// clicks on the alert using webelement locator 
			WebElement elm= driver.findElement(By.xpath("//button[@id='alertButton']"));
			elm.click();
			
			// this Alert object uses switchTo() to take control of the alert 
			Alert SimpleAlert = driver.switchTo().alert(); 
			
			Thread.sleep(2000);
			// this accepts the alert
			SimpleAlert.accept(); 
			
          
			///////////////////////////////Timer Alert////////////////////////////////////////////////////////
			explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='timerAlertButton']")));
			
			 driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();;
			
			Alert TimerAlert = driver.switchTo().alert();
			Thread.sleep(2000);
			// this gets the text inside the Alert 
			TimerAlert.getText();
			
			// this accepts the Alert
			TimerAlert.accept();
			
			           
						

///////////////////////////////Confirm  Alert//////////////////////////////////////////////////////////
			
			driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
			
			Alert Confirmation = driver.switchTo().alert();
			//Storing String alert text
		String text=Confirmation.getText();
	
		/// verfying and validating Alert
		if(text.equalsIgnoreCase("Do you confirm action?")) {
			System.out.println("correct Alert");
		}else {
			System.out.println("incorrect alert");
		}
		
		/// Dismissing the Alert after switching to it
			Confirmation.dismiss();

			
///////////////////////////////Prompt  Alert//////////////////////////////////////////////////////////
			// clicking the webElement
			driver.findElement(By.xpath("//button[@id='promtButton']")).click();
			// creating the ALert object
			Alert Prompt = driver.switchTo().alert();
			// sending keys to the prompt 
			Prompt.sendKeys("haha");
			//storing the text in String varible
			String text1= Prompt.getText();
			// Verfying
			if(text1.equalsIgnoreCase("Please enter your name")) {
				System.out.println("Correct Alert");
			}else {
				System.out.println("Incorrect Alert");
			}
			// Accepting the Alert
			Prompt.accept();


}catch(Exception e) {
	System.out.println(e);
}

	}

}
