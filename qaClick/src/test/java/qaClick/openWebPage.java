package qaClick;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.accessMenus;
import resources.initBrowser;

public class openWebPage extends initBrowser{
	
	public WebDriver driver;
	
	@BeforeTest
	public void openWeb() throws IOException
	{
		
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
		
	}
	
	
	@Test
	public void accessWebPage() throws IOException
	{
		
		
		accessMenus am = new accessMenus(driver);
		
		am.gethome().click();
		/*am.getcourses().click();
		am.getvideos().click();
		am.getinterviewGuide().click();
		am.getPractice().click();
		am.getBlog().click();
		am.getAbout().click();
		am.getContact().click();*/
		
		
		
	}
	
	@AfterTest
	public void closeDriver()
	{
		
		driver.close();
		
	}

}
