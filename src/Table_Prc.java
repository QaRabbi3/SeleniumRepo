

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table_Prc {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\opurv\\eclipse-workspace\\Selenium1\\Driver\\geckodriver.exe");
		
		
		try {
					WebDriver driver = new FirefoxDriver();  // Ff driver class/object
			
			driver.manage().window().maximize();  // Maximize windows
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // implicit
			driver.get("https://jqueryui.com/datepicker/");
			Thread.sleep(2000); // wait
					
		
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		WebElement elm = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
		java.util.List<WebElement> rowCount = driver.findElements(By.tagName("tr"));

		for( int i= 0; i<rowCount.size(); i++) {
			java.util.List<WebElement> column= rowCount.get(i).findElements(By.tagName("td"));
				for(int j=0; j<column.size();j++) {
					String date = (column.get(j).getText());
					if(date.equalsIgnoreCase("31"))
						System.out.println(date);
						driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[5]/td[3]/a[1]")).click();
					//System.out.println(column.get(j).getText());
				}
			}
		
		
		
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
