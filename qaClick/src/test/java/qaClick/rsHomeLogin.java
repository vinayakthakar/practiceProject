package qaClick;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.accessMenus;
import pageObjects.rsHomeOptions;
import resources.initBrowser;

public class rsHomeLogin extends initBrowser{
	
	public WebDriver driver;
	
	
	@Test
	public void rsLogin() throws IOException, InterruptedException
	{
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
		
		accessMenus am = new accessMenus(driver);
		am.gethome().click();
		
		rsHomeOptions lg = new rsHomeOptions(driver);
		lg.getLogIn().click();
		
		lg.getloginEmail().sendKeys("anudi");
		lg.getloginPassword().sendKeys("   ");
		lg.getloginSubmit().click();
		
		driver.close();
		
		
		
	}

}
