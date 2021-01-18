package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class initBrowser {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeBrowser() throws IOException
	{
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Vinayak Thakar\\"
				+ "eclipse-workspace-VT1\\qaClick\\src\\main\\java\\resources\\rawData.properties");
		prop.load(fis);
			
		String browser=prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Browser Drivers\\chromedriver.exe");
			
			/*FileInputStream drv = new FileInputStream("E:\\Selenium\\Browser Drivers\\chromedriver.exe");
			prop.load(drv);
			System.setProperty(prop.getProperty("chromeProperty"), "drv");*/
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Browser Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
	}

}
