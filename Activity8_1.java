import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8_1 {

	/** 

    Create a Class and a main() method
    For this activity import the following classes
        org.openqa.selenium.support.ui.ExpectedConditions
        org.openqa.selenium.support.ui.WebDriverWait
    Create a WebDriver instance, named driver, with the FirefoxDriver().
    Open a browser with https://training-support.net/selenium/dynamic-controls
    Get the title of the page using driver.getTitle() and print out the title.
    Find the checkbox toggle button and click it.
    Wait till the checkbox disappears.
    Click the button again. Wait till it appears and check the checkbox.
    Finally, close the browser.

**/
	public static void main(String[] args) {
		
		//initialize firefoxDriver
		String path = "C:\\Driver\\geckodriver.exe";
	    System.setProperty("webdriver.gecko.driver",path);
	    WebDriver driver=new FirefoxDriver();
	    
	    //open url
	    driver.get("https://training-support.net/selenium/dynamic-controls");
	    System.out.println("Title of page: "+driver.getTitle());
	    WebDriverWait wait = new WebDriverWait(driver, 20);
	    WebElement checkbox = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
	    WebElement toggleCheckboxButton = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
	    toggleCheckboxButton.click();
    	
        
    	
        //Wait for checkbox to disappear
	
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
	
        
	
        //Click toggle button again
	
        toggleCheckboxButton.click();
	
        
	
        //Wait for checkbox to appear
	
        wait.until(ExpectedConditions.visibilityOf(checkbox));
	
        checkbox.click();
	
        
	    driver.close();

	}

}
