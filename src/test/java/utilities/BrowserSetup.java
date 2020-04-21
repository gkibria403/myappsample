package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSetup implements Logs{
	public static final String driverPath=".\\src\\test\\resources\\drivers\\";
	
	public static WebDriver getBrowser(String browserType) {
		
		WebDriver driver;
		
		switch (browserType) {
		case "firefox":
			System.setProperty("webdriver.gecko.driver", driverPath+"firefoxdriver.exe");
			driver= new FirefoxDriver();
			break;
		case "chrome":
			Log.debug("Chrome is Loading");
			System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
            driver = new ChromeDriver();
            break;
		case "IE":
			System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		default:
			System.out.println("Browser " + browserType + " not found, Launching Firefox as browser of choice..");
			System.setProperty("webdriver.gecko.driver", driverPath+"firefoxdriver.exe");
			driver = new FirefoxDriver();
		}
		ManageBrowser(driver);
		return driver;
	}
	
	public static void ManageBrowser(WebDriver driver) {		
		Log.debug("Browser properties initialized");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	}

}
