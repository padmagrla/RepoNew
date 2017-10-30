package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FF {
	@Test
	public void testFF()
	{

			WebDriver driver=new FirefoxDriver();
			driver.get("http://www.facebook.com");
			 
	        System.out.println("Application title is ============="+driver.getTitle());
	        Assert.assertTrue(false);
	        System.out.println("change");

	        driver.quit();

		}

}
