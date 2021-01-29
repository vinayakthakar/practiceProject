package qaClick;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.accessMenus;
import pageObjects.addToCart;
import pageObjects.rsNavigateMenus;
import resources.initBrowser;

public class practiceProject1 extends initBrowser{
	
	private static final String[] item = null;
	public WebDriver driver;
	
	@Parameters({"WebDriver driver", "String[] item"})
	@Test
	
	public void validatePracticeProject() throws IOException, InterruptedException
	{
		
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
		
		accessMenus am = new accessMenus(driver);
		am.gethome().click();
		
		rsNavigateMenus cr=new rsNavigateMenus(driver);
		cr.getPracticeProjects().click();
		
		
		addToCart ac = new addToCart();
		ac.cartSelection(driver,item);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}


	

}
