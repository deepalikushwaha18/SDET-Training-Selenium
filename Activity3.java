import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

//	    Create a WebDriver instance, named driver, with the FirefoxDriver().
//	    Open a browser with https://training-support.net/selenium/simple-form
//	    Get the title of the page using driver.getTitle() and print out the title.
//	    Use findElement() with name() to find the text fields - firstname and lastname.
//	    Use WebElement.sendKeys() to type in those text fields.
//	    Similarly, find and type into the email and contact number fields.
//	    Finally, submit the form by clicking the Submit button.
//	    Close the browser with driver.close()

	public static void main(String[] args) {

		String path = "C:\\\\Driver\\\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");

		String title = driver.findElement(By.xpath("//")).getText();
		System.out.println("Title: " + title);

		driver.findElement(By.xpath("//")).sendKeys("firstName");
		driver.findElement(By.xpath("//")).sendKeys("lastName");
		driver.findElement(By.xpath("//")).sendKeys("email");
		driver.findElement(By.xpath("//")).sendKeys("contactNumber");
		driver.findElement(By.xpath("//")).click();
		driver.close();

	}

}
