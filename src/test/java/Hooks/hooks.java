package Hooks;

import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.DriverLaunch;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks extends DriverLaunch {

	@Before
	public void chromeLaunch()
	{
		System.setProperty("Webdriver.chrome.driver", "/CucumberFrameWorkScratch/drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}
	@After
	public void tear()
	{
		driver.close();
	}
}
