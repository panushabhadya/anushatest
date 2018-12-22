package Script;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import POM.Enteractitime;
import POM.actilogin;
import generic.basetest;
import generic.getdata;

public class actitimelogin extends basetest {
	@Test
	public void login() throws Throwable
	{
		actilogin a=new actilogin(driver);
		a.setusername(getdata.getdata(ExcelPath, "sheet1", 0, 1));
		a.setpassword(getdata.getdata(ExcelPath, "sheet1", 1, 1));
		a.clicklogin();
		a.titlewait("Enter");
		//a.elementvisibility(element);
		Enteractitime e=new Enteractitime(driver);
		e.clickusers();
		e.clicklogout();

		
	}

}
