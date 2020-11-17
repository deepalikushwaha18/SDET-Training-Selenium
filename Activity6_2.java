import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6_2 {
	
	/*
	 * 

    Create a Class and a main() method
    Create a WebDriver instance, named driver, with the FirefoxDriver().
    Open the browser with https://training-support.net/selenium/tables using get() method.
    Use findElements() in combination with xpath() to find the number of columns and rows (not counting the table header) and print them.
    Find and print the cell value at the second row and second column.
    Click the header of the first column to sort by name.
    Find and print the cell value at the second row and second column again.
    Print the cell values of the table footer.
    Close the browser.


	 */

	public static void main(String[] args) {
		 // Create a new instance of the Firefox driver
   		
			String path = "C:\\Driver\\geckodriver.exe";
		    System.setProperty("webdriver.gecko.driver",path);
		    WebDriver driver=new FirefoxDriver();

	}

}
