package qaClick;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.accessMenus;
import resources.initBrowser;

public class openWebPage extends initBrowser{
	
	public WebDriver driver;
	
	@Test
	public void accessWebPage() throws IOException
	{
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
		
		accessMenus am = new accessMenus(driver);
		
		am.gethome().click();
		am.getcourses().click();
		am.getvideos().click();
		am.getinterviewGuide().click();
		am.getPractice().click();
		am.getBlog().click();
		am.getAbout().click();
		am.getContact().click();
		
		driver.close();
		
	}

}
