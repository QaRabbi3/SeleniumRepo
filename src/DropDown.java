import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	//we need to create a new Select Object of class Select.
		//selectByVisibleText(“text”);
		//selectByIndex(int);
		//selectByValue(“text”);
  //	getOptions( ) : List<WebElement>
	
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\opurv\\eclipse-workspace\\Selenium1\\Driver\\geckodriver.exe");
		
		
		try {
					WebDriver driver = new FirefoxDriver();  // Ff driver class/object
					driver.manage().window().maximize();  // Maximize windows
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//Implicit wait  
			//		WebDriverWait explicitWait = new WebDriverWait(driver, 15); // Explicit wait object
					
			
							driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
						
							
						WebElement elm= driver.findElement(By.xpath("//select[@id='select-demo']"));
						
						// Select object created to use Dropdown
						Select dropdown = new Select(elm);
			/*			
					dropdown.selectByVisibleText("Tuesday"); // visible text
					dropdown.selectByIndex(5);  // index
					dropdown.selectByValue("Saturday");	 // by value     */
		
								
				///////////////////////////	//	getOptions( ) : List<WebElement>	////////////////////////////////
						
						
			java.util.List<WebElement> DropdownCount = dropdown.getOptions();
			
		int size= DropdownCount.size(); // gets the size of the dropdown
			boolean DDStatus = DropdownCount.get(1).isSelected();
			for(int i= 0; i<size; i++) {
				if(DDStatus==false) {
					DropdownCount.get(4).click(); // clicks on the vlaue by index
				}
			}
		
			
			// Prints out all the text in the DropDown
			 
			
		for(int j=0; j<size;j++) {
			String dropdowntext = DropdownCount.get(j).getText();
				System.out.println(dropdowntext);
			}
		
		
		
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
