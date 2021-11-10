import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementCommands {
	/*Clear Command
	SendKeys Command
	Click Command
	IsDisplayed Command - boolean
	IsEnabled Command - boolean
	IsSelected Command - boolean
	GetText Command
	getAttribute Command*/

	public static void main(String[] args) {
			
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\opurv\\eclipse-workspace\\Selenium1\\Driver\\geckodriver.exe");
		
		
		try {
					WebDriver driver = new FirefoxDriver();  // Ff driver class/object
			
			driver.manage().window().maximize();  // Maximize windows
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // implicit
			driver.get("https://demoqa.com/text-box");
		
					/// textbox verification user Name
					WebElement elm = driver.findElement(By.id("userName"));
					boolean dis = elm.isDisplayed();  // is displayed method 
					
					System.out.println(dis);
					/// verifying element with Isdisplayed and IsEnabled
					if(dis) {
					
						boolean e1= elm.isEnabled(); // isEnable method 
						
						if(e1) {
							elm.clear();
							
							elm.sendKeys("golam rabi");
						} else {
							System.out.println(" element is not enabled ");
						}
					}else {
						System.out.println("element is not displayed ");
					}
				
					/// verifying user email element	
			WebElement elm1= driver.findElement(By.id("userEmail"));
			
			boolean dis1= elm1.isDisplayed();
			System.out.println(dis1);
			if(dis1) {
				boolean e2= elm1.isEnabled();
				
				if(e2) {
					elm1.clear();
					elm1.sendKeys("nfjndvjdn@yahoo.com");
			} else {
				System.out.println("not enabled");
			}
		
			}else {
				System.out.println("not displayed ");
			}
		
		// send keys to Current Address
		WebElement elm3 = driver.findElement(By.id("currentAddress"));
		elm3.sendKeys("brooklyn");
	
		// send keys to Permanent Address
		WebElement elm4 = driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]"));
		elm4.sendKeys("new york");
		
		Thread.sleep(2000);
		
		// verifying submit button
		// ask teacher why the verication does not work here 
		WebElement elm5 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[5]/div[1]/button[1]"));
	elm.click();
	
		/*boolean disStatus = elm5.isDisplayed();
		
		if(disStatus) {
			boolean enbleStatus = elm5.isEnabled();
			if(enbleStatus) {
				elm.click();
			}else {
				System.out.println("Submit button is not enabled");
			}
				
		}else {
			System.out.println("Submit button is not Displayed ");
		}*/
		
		
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
