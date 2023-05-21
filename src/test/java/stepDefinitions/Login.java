package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.collections.Objects;

import PageObjects.DriverLaunch;
import PageObjects.Loginpage;
import io.cucumber.java.en.*;

public class Login extends DriverLaunch {
	
	
  Loginpage page = new Loginpage(driver);

	
	@Given("Launch Chrome Browser with {string}")
	public void launch_chrome_browser_with(String lau) {
	   

		driver.navigate().to(lau);
		driver.manage().window().maximize();
	
	}

	@Then("Verify Login Page is opened")
	public void verify_login_page_is_opened() {

		System.out.println("Navigated");
	}

	@When("Enter Username as {string}")
	public void enter_username_as(String v) {
	  
		page.UName(v);
	}

	@When("Enter Password as {string}")
	public void enter_password_as(String w) {
		page.password(w);
	}

	@Then("HomePage is displayed")
	public void home_page_is_displayed() {
		page.Loginclick();
		System.out.println("done");
	}



}
