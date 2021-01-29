package qaClick;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.validatePracticeProject2;
import resources.initBrowser;

public class practiceProject2 extends initBrowser{
	
	private static final String name = null;
	public WebDriver driver;
	
	@BeforeTest
	public void openBrowser() throws IOException
	{
		driver = initializeBrowser();
		driver.get(prop.getProperty("rsurl"));
		
	}
	
	@Parameters({"WebDriver driver"})
	@Test	
	public void validateSwitchWindow() throws InterruptedException 
	{
		
		validatePracticeProject2 sw = new validatePracticeProject2();
		sw.windowSwitch(driver);
		
	}
	
	@Parameters({"WebDriver driver"})
	@Test
	
	public void validateSwitchTab() throws InterruptedException 
	{
		
		validatePracticeProject2 st = new validatePracticeProject2();
		st.tabSwitch(driver);
		
	}
	
	
	@Parameters({"WebDriver driver"})
	@Test
	
	public void validateAlert() throws InterruptedException 
	{
		
		validatePracticeProject2 am = new validatePracticeProject2();
		am.validateAlertMessage(driver);
	}
	
	@Parameters({"WebDriver driver"})
	@Test
	
	public void validateConfirmation() throws InterruptedException 
	{
		
		validatePracticeProject2 cm = new validatePracticeProject2();
		cm.validateConfirmMessage(driver);
	}
	
	@Parameters({"WebDriver Driver"})
	@Test
	public void redioButton()
	{
		validatePracticeProject2 rb = new validatePracticeProject2();
		rb.selectRedioButton(driver);
		
	}
	
	@Parameters({"WebDriver Driver"})
	@Test
	public void autoSuggestiveDropdown() throws InterruptedException
	{
		validatePracticeProject2 dd = new validatePracticeProject2();
		dd.suggestiveDropdown(driver);
	}
	
	@Parameters({"WebDriver Driver"})
	@Test
	public void selectStaticDropdown() throws InterruptedException
	{
		validatePracticeProject2 sd = new validatePracticeProject2();
		sd.staticDropdown(driver);
	}
	
	@Parameters({"WebDriver Driver"})
	@Test
	public void selectCheckBox() throws InterruptedException
	{
		validatePracticeProject2 cb = new validatePracticeProject2();
		cb.checkBox(driver);
	}
	
	@Parameters({"WebDriver Driver"})
	@Test
	public void validateTable() throws InterruptedException, FileNotFoundException
	{
				
		validatePracticeProject2 tc = new validatePracticeProject2();
		tc.tableContents(driver);
		
	}
	
	@Parameters({"WebDriver Driver"})
	@Test
	public void elementHideShow() throws InterruptedException, FileNotFoundException
	{
				
		validatePracticeProject2 hs = new validatePracticeProject2();
		hs.elementDisplayed(driver);
		
	}
	
	@Parameters({"WebDriver Driver", "String name"})
	@Test
	public void fixedHeader() throws InterruptedException, FileNotFoundException
	{
				
		validatePracticeProject2 fh = new validatePracticeProject2();
		fh.tableFixedHeaders(driver, name);
		
		
	}
	
	@Parameters({"WebDriver Driver"})
	@Test
	public void mouseAction() throws InterruptedException, FileNotFoundException
	{
				
		validatePracticeProject2 ma = new validatePracticeProject2();
		ma.validateMouseAction(driver);
			
	}
	
/*	@Parameters({"WebDriver Driver"})
	@Test
	public void frameSwitch() throws InterruptedException, FileNotFoundException
	{
				
		validatePracticeProject2 fs = new validatePracticeProject2();
		fs.validateFrameSwitch(driver);
			
	}*/
	
	
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
	}


	

}
