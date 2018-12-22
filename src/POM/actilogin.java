package POM;//for login page

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.basepage;

public class actilogin extends basepage {
	@FindBy(id="username")//non-static element
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement login;
	
	public actilogin(WebDriver driver)//user defined constructor  	
	{
		super (driver);//to pass driver from POM to basepage.
		PageFactory.initElements(driver, this);
		
	}
	public void setusername(String un)
	{
		this.username.sendKeys(un);
	}
	public void setpassword(String pwd)
	{
		this.password.sendKeys(pwd);
	}
	
	public void clicklogin()
	{
		this.login.click();
	}

	

}
