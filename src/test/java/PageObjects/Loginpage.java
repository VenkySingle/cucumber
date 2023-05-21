package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public WebDriver Rdriver;
	
	public Loginpage(WebDriver driver)
	{
		Rdriver=driver;
		PageFactory.initElements(Rdriver, this);
	}
	
	@FindBy(name="uname")
    WebElement Username;
	
	@FindBy(xpath="//input[@name ='pass']")
    WebElement password;
	
	@FindBy(xpath="//input[@value ='login']")
    WebElement LoginBtn;
	
	public void UName(String u){
		System.out.println(Rdriver);
		Username.sendKeys(u);
	}
	
	public void password(String p){
		password.sendKeys(p);
	}
	
	public void Loginclick(){
		LoginBtn.click();
	}
	
	

}
