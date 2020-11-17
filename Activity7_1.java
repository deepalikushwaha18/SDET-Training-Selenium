import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_1 {
	/*
	 * 
Activity 7-1

    Create a Class and a main() method
    Create a WebDriver instance, named driver, with the FirefoxDriver().
    Open the browser with https://training-support.net/selenium/selects using the get() method.
    Use findElement() to find the dropdown WebElement on the page.
    Create a new Select class object with the WebElement.
    On the dropdown,
        Select the second option using selectByVisibleText()
        Select the third option using selectByIndex()
        Select the fourth option using selectByValue()
        Finally, get all the options in the dropdown and print them one by one.


	 */

	public static void main(String[] args) {
		 // Create a new instance of the Firefox driver
   		
		String path = "C:\\Driver\\geckodriver.exe";
	    System.setProperty("webdriver.gecko.driver",path);
	    WebDriver driver=new FirefoxDriver();

	}

}
