package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooksclass {

public static WebDriver driver;
	
	@Before
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DivyaLalwani\\Downloads\\chromedriver_win32\\chromedriver.exe");;
		driver = new ChromeDriver();
		System.out.println("Driver initialization");
	}
	
	@After
	public void quit()
	{
		driver.quit();
		System.out.println("closing driver");
	}

}
