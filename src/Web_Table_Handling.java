import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web_Table_Handling {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\opurv\\eclipse-workspace\\Selenium1\\Driver\\geckodriver.exe");
		
		
		try {
					WebDriver driver = new FirefoxDriver();  // Ff driver class/object
			
			driver.manage().window().maximize();  // Maximize windows
			
			driver.get("https://cosmocode.io/automation-practice-webtable/");
			Thread.sleep(2000); // wait
					
			
		// selecting the table
			driver.findElement(By.xpath("//strong[contains(text(),'Algeria')]/parent::td//preceding-sibling::td//input[@class='hasVisited']")).click();
			
			
		WebElement elm = driver.findElement(By.xpath("//table[@id='countries']//tbody"));
		//row
		java.util.List<WebElement> row = elm.findElements(By.tagName("tr"));
		System.out.println(row.size());
		
		
		
		for( int i= 0; i<row.size(); i++) {
			java.util.List<WebElement> column= row.get(i).findElements(By.tagName("td"));
				for(int j=0; j<column.size();j++) {
					System.out.println(column.get(j).getText());
				}
			}
		
		///html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]
		
		//column
//		java.util.List<WebElement> column= elm.findElements(By.tagName("td"));
//		System.out.println(column.size());
		
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
