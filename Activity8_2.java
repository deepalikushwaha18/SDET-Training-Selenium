import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8_2 {
	
	/**
	 * 

    Create a Class and a main() method
    Create a WebDriver instance, named driver, with the FirefoxDriver().
    Open a browser with https://training-support.net/selenium/ajax
    Get the title of the page using driver.getTitle() and print out the title.
    Find and click the "Change content" button on the page.
    Wait for the text to say "HELLO!". Print the message that appears on the page.
    Wait for the text to change to contain "I'm late!". Print the new message on the page.
    Finally, close the browser.


	 * @param args
	 */

	public static void main(String[] args) {
		// Initialize firefox driver
		
				String path = "C:\\Driver\\geckodriver.exe";
			    System.setProperty("webdriver.gecko.driver",path);
			    WebDriver driver=new FirefoxDriver();
			    WebDriverWait wait = new WebDriverWait(driver, 10);
			    driver.get("https://training-support.net/selenium/ajax");
			    
//			   getTitle of page 
			    
			   System.out.println("title of page: "+driver.getTitle());
			   
//			   find change button and click on it .
			    WebElement changeButton = driver.findElement(By.xpath("//div[@id='ajax-content']/button"));
			    changeButton.click();
//			   Wait for the text to say "HELLO!". Print the message that appears on the page.
			    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"),"HELLO!"));
			    System.out.println("Print ajax text after clicking on button: "+driver.findElement(By.id("ajax-content")).getText());
			    
//			    Wait for the text to change to contain "I'm late!". Print the new message on the page.
			    
			    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
			    System.out.println("Print ajax late text : "+driver.findElement(By.id("ajax-content")).getText());
//		        Close browser
			    driver.close();
	
	}
	

}
