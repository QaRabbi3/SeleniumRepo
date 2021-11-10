import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\opurv\\eclipse-workspace\\Selenium1\\Driver\\geckodriver.exe");
	
	
	try {
				WebDriver driver = new FirefoxDriver();  // Ff driver class/object
				driver.manage().window().maximize();  // Maximize windows
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//Implicit wait  
		//		WebDriverWait explicitWait = new WebDriverWait(driver, 15); // Explicit wait object
				
		
						driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
			
						//********************************* SINGLE Check Box****************************///
						
	/*	WebElement singleCheckBox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
		boolean checkbox1 = singleCheckBox.isSelected();
		if(checkbox1==false) {
			singleCheckBox.click();
			System.out.println(singleCheckBox.getText());
		}else {
			System.out.println("Checkbox is selected");
		}
			*/	
	
				//********************************* Multiple Check Box****************************///
						
	// cannot use verify isSelected method with List collection unless we use get() for indexing, 
	//only in WebElement interface
	
		java.util.List<WebElement> multipleCheckbox = driver.findElements(By.xpath("//input[@class='cb1-element']"));
	
		int checkboxSize =  multipleCheckbox.size();
		
		System.out.println(checkboxSize);
		
		for(int i=0; i<checkboxSize; i++) {
			multipleCheckbox.get(i).click();
			
			
			Thread.sleep(2000);
			
		} multipleCheckbox.get(0).click();
		
		
		
		
		
		
		
		
		
	/*	// checkbox with vlaue // ask teacher
		for(int i=0; i<checkboxSize; i++) {
		String svlaue=multipleCheckbox.get(i).getAttribute("value");
			 if(svlaue.equalsIgnoreCase("Option 3")) {
				 multipleCheckbox.get(i).click();
				 break;
			 }
		}
			*/	
	
	
	
	}catch(Exception e) {
		System.out.println(e);
	}
		
		

	}

}
