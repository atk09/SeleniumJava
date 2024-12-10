import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// ChromeDriver, FirefoxDriver etc all would implement WebDriver interface to use
// WebDriver methods
public class SeleniumIntro {

	public static void main(String[] args) {
		
		// Chrome -> Chrome driver -> close methods
		// WebDriver methods + class methods 
		// driver object has knowledge of WebDriver implementation of ChromeDriver
		
	
		// first get the chromedriver.exe that invokes chrome browser
		// webdriver.chrome.driver -> value of path of chromedriver.exe
		// gecko.driver is for firefox browser
		// edge.driver is for msedgedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\API+Concepts+Testing\\SeleniumAutomation\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
		System.out.println(driver.getTitle());
		
		driver.close();  // to close only one current tab window
		driver.quit();   // to quit all associated windows
		
		
		
		
		
		 

	}

}
