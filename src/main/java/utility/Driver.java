package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Driver {
	
	private static WebDriver driver;
	
	public static final WebDriver getDriver() {
		
		if (driver == null) {
			String browser = System.getProperty("browser") != null ? System.getProperty("browser")
					: ConfigurationReader.getProperty("browser");
			
			switch (browser) {
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "ie":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			case "headless":
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setJavascriptEnabled(true);
				WebDriverManager.phantomjs().setup();
				driver = new PhantomJSDriver(caps);
				break;
			}
		}
		return driver;
	}
	public static void closerDriver() {
		if (driver != null) {
			driver.close();
		}
	}

}