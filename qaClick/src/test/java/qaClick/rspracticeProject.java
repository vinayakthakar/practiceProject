package qaClick;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.accessMenus;
import pageObjects.rsNavigateMenus;
import resources.initBrowser;

public class rspracticeProject extends initBrowser{
	
	public WebDriver driver;
	
/*	@BeforeTest
	public void openPracticeProjectPage() throws IOException, InterruptedException
	{
	driver = initializeBrowser();
	driver.get(prop.getProperty("url"));
	
	accessMenus am = new accessMenus(driver);
	am.gethome().click();
	
	rsNavigateMenus cr=new rsNavigateMenus(driver);
	cr.getPracticeProjects().click();
	}*/
	
	@Test
	
	public void validatePracticeProject() throws IOException
	{
		
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
		
		accessMenus am = new accessMenus(driver);
		am.gethome().click();
		
		rsNavigateMenus cr=new rsNavigateMenus(driver);
		cr.getPracticeProjects().click();
		
		driver.findElement(By.id("name")).sendKeys("vinayak Thakar");
		driver.findElement(By.id("email")).sendKeys("vinayak.thakar@gmail.com");
		driver.findElement(By.id("form-submit")).click();
		
		String pageTitle = driver.findElement(By.xpath("//h5[contains(text(),'OUR PROJECTS')]")).getText();

		if(pageTitle.equalsIgnoreCase("OUR PROJECTS"))
		{
			String link1 = driver.findElement(By.linkText("Automation Practise - 1")).getText();
			System.out.println(link1);
			String link2 = driver.findElement(By.linkText("Automation Practise - 2")).getText();
			System.out.println(link2);
			String link3 = driver.findElement(By.linkText("Automation Practise - 3")).getText();
			System.out.println(link3);
			
		}
	}

}
