package qaClick;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.accessMenus;
import pageObjects.rsNavigateMenus;
import resources.initBrowser;

public class openHomePage extends initBrowser{
	
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
		
		String title = driver.getTitle();
		String pageTitle = "Rahul Shetty Academy";
		
		rsNavigateMenus nm = new rsNavigateMenus(driver);
		
		if(title.equalsIgnoreCase(pageTitle))
		{
			Assert.assertEquals(nm.gethome().getText(), "Home");						
		}else
		{
			System.out.println("Home not found");
		}
		
				
			
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		
	}
	

}
