import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\opurv\\eclipse-workspace\\Selenium1\\Driver\\geckodriver.exe");
		
		
		try {
					WebDriver driver = new FirefoxDriver();  // Ff driver class/object
					driver.manage().window().maximize();  // Maximize windows
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//Implicit wait  
			//		WebDriverWait explicitWait = new WebDriverWait(driver, 15); // Explicit wait object
					
			
							driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
							
				
					/////////////// Radio button using WebElement//////////////////////////
		
							
	/*	WebElement radioB = driver.findElement(By.xpath("//body/div[@id='easycont']/div[@class='row']/div[@class='col-md-6 text-left']/div[@class='panel panel-default']/div[@class='panel-body']/label[2]"));
			boolean buttonStatus = radioB.isSelected();
			if(buttonStatus) {
				System.out.println("Radiobutton is selected");
			}else {
				radioB.click();
				driver.findElement(By.id("buttoncheck")).click();
			}
		*/			
		
			
							
		///////////	// Radiobutton using List collection////////////////////////////////////////////
		
				
		/*		java.util.List<WebElement> radioB1= driver.findElements(By.name("optradio"));	
		
			boolean Status1=radioB1.get(0).isSelected();
			
			if(Status1) {
				System.out.println("Selected");
				
			}else {
				radioB1.get(0).click();
				//radioB1.get(1).click(); // second/female button
				
			}   	*/ 
		
			
			///////////	//  Group radiobutton using List collection////////////////////////////////////////////
			java.util.List<WebElement> GenderRadioButton  = driver.findElements(By.name("gender"));
			java.util.List<WebElement> AgeRadioButton= driver.findElements(By.name("ageGroup"));	
			
				System.out.println(AgeRadioButton.size());
						
				for(int i=0; i<GenderRadioButton.size();i++) {
					GenderRadioButton.get(1).click();
				
					for(int j= 0; j<AgeRadioButton.size(); j++) {
					AgeRadioButton.get(2).click();
			
					}
			}
				
				driver.findElement(By.xpath("//button[contains(text(),'Get values')]")).click();
		
		
			
							
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}














//////////////////////ignore//////////////////////////
/*	java.util.List<WebElement> GenderRadioButton  = driver.findElements(By.xpath("//div[@class='panel-body']//div//label[@class='radio-inline'][contains(text(),'Male')]"));
//driver.findElements(By.name("gender"));
java.util.List<WebElement> AgeRadioButton= driver.findElements(By.name("ageGroup"));	
			
//	System.out.println(AgeRadioButton.size());
						
	boolean RBS= GenderRadioButton.get(0).isSelected();
	if(RBS==false) {
		GenderRadioButton.get(0).click();
					for(int j= 0; j<AgeRadioButton.size(); j++) {
					AgeRadioButton.get(1).click();
				}
			}					
			
	*/	
