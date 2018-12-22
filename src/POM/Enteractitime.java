package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.basepage;

public class Enteractitime extends basepage
{
	@FindBy(xpath="//div[text()='USERS']")
	private  WebElement users;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public  Enteractitime(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
		
		public void clicklogout()
		{
			this.logout.click();
		}
		public void clickusers() {
			this.users.click();
		}
		



}