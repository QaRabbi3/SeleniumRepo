import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BroswerCommands {
	 /*Browser Commands 
    	- Get command
		- getTittle Command 
		- getCurrent Url command
		- get page source command
		- close Command
		- quit command */

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\opurv\\eclipse-workspace\\Selenium1\\Driver\\geckodriver.exe");
			try {
					WebDriver driver = new FirefoxDriver();  // Ff driver class/object
				driver.manage().window().maximize();  // Maximize windows
			
			
		// get command 
				/* String Url = "https://demoqa.com/";
				   driver.get(Url); */
		
				driver.get("https://demoqa.com/");  
				
			
			Thread.sleep(2000); // wait
				
		// getTittle Command
			/* System.out.println("The title is :" + driver.getTitle()); */
				
				String title =driver.getTitle();
				int titleLength = driver.getTitle().length(); // length
				System.out.println("The title is :"+title);
				System.out.println("The title Length is :"+titleLength);
		// verify
				String expectedTitle ="ToolsQA";
			if(title.equalsIgnoreCase(expectedTitle)) {
				System.out.println("Title Successfully verfied");
			}else {
				System.out.println("FAIL Title ");
			}
			
		//getCurrent Url command
				//option1
			//	System.out.println("The URL is :" + driver.getCurrentUrl());
		
		//option2
				String CurrentUrl = driver.getCurrentUrl();
				System.out.println("The URL is :" +CurrentUrl);
		// Verify URL
				String ExpectedUrl= "https://demoqa.com/";
			if(CurrentUrl.equalsIgnoreCase(ExpectedUrl)) {
				System.out.println("Successful URL");
			}else {
				System.out.println("Fail URL");
			}
				
				
			
		// get page source command	
			//	option 1
				//System.out.println("the page source is :"+ driver.getPageSource());
				
			//  Option 2
				String pageSource = driver.getPageSource();
				System.out.println("The page source  is :" +pageSource);
			System.out.println("The length of PageSource is : "+ pageSource.length());	
				
				
		// close Command
			driver.close();
				
		//quit command	
			//driver.quit();
				
		
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}



