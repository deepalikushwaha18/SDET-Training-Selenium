import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {
	/*
	 * 

    Create a Class and a main() method
    Create a WebDriver instance, named driver, with the FirefoxDriver().
    Open the browser with https://training-support.net/selenium/selects using the get() method.
    Use findElement() to find the multi-select WebElement on the page.
    Create a new Select class object with the WebElement.


	 */

	public static void main(String[] args) {
		 // Create a new instance of the Firefox driver
   		
		String path = "C:\\Driver\\geckodriver.exe";
	    System.setProperty("webdriver.gecko.driver",path);
	    WebDriver driver=new FirefoxDriver();
	}

}
