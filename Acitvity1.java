import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Acitvity1 {

	public static void main(String[] args) {
		
		
//		String path = "C:\\Users\\IBMADMI\\Documents\\Selenium Learning\\Driver\\geckodriver.exe";
		

        System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
		
		//Open the browser
		
		driver.get("https://www.training-support.net");
		
			
		
		//Close the browser
		
		driver.close();
		
	}

}
