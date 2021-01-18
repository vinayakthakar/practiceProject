package qaClick;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.accessMenus;
import pageObjects.rsNavigateMenus;
import resources.initBrowser;

public class courseList extends initBrowser{
	
	public WebDriver driver;
	
	@Test
	public void grabCourseList() throws IOException, InterruptedException {
		
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
		
		accessMenus am = new accessMenus(driver);
		am.gethome().click();
		
		rsNavigateMenus cr=new rsNavigateMenus(driver);
		cr.getcourses().click();
		
		
		// Creating a File object that represents the disk file. 
        PrintStream o = new PrintStream(new File("A.txt")); 
  
        // clear the previously saved data of the file
        o.flush();
  
        // Assign o to output stream 
        System.setOut(o); 
		
			
		List<WebElement> list = driver.findElements(By.cssSelector("div[class^=course-listing-title]"));
		//List element= driver.findElements(By.cssSelector("div[class^=course-listing-title]"));
		list.stream().map(s->s.getText()).forEach(s->System.out.println(s));
		
		
		
	}
	
	

}
