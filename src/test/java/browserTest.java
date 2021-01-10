import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class browserTest 
{
	public static WebDriver driver;
  @BeforeSuite
   public void setUp()
   {
		System.setProperty("webdriver.gecko.driver", "D:\\AutomationStuff\\workspace1\\HandlingElements\\Drivers\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
		
   }
   @Test
   public void bTest()
   {
	   driver.get("http://demo.guru99.com/test/web-table-element.php");
	  
   }
   @AfterSuite
   public void tearDown()
   {
	   driver.quit();
   }
   
}
