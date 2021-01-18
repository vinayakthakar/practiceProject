package qaClick;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.accessMenus;
import pageObjects.rsHomeOptions;
import resources.initBrowser;

public class rsHomeCarousel extends initBrowser{
	
	public WebDriver driver;
	
	
	@Test
	public void registerPage() throws IOException 
	{
		
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
		
		accessMenus am = new accessMenus(driver);
		am.gethome().click();
		
		rsHomeOptions rg=new rsHomeOptions(driver);
		rg.getRegister().click();
		
		rg.getUserName().sendKeys("Chuche");
		rg.getUserEmail().sendKeys("chucha.com");
		rg.getPassword().sendKeys("chucha123");
		rg.getconfirmPwd().sendKeys("chucha123");
		rg.getInstructions().click();
		rg.getTerms().click();
		rg.getSignUp().click();
		
		driver.close();
	}
	
	
		
	}

