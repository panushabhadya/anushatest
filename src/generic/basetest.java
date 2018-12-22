package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public abstract class basetest implements autoconstaant {
	
static
{
	System.setProperty(Chromekey,Chromevalue);
	System.setProperty(geckokey, geckovalue);
	
}
public WebDriver driver;
@Parameters("browser")
@BeforeMethod(alwaysRun=true)
public void beforemethod(String browser)
{
	if(browser.equals("chrome"))
		driver=new ChromeDriver();
	else
		driver=new FirefoxDriver();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/");
}
@AfterMethod(alwaysRun=true)
public void aftermethod(ITestResult res)
{
	int status = res.getStatus();
	//System.out.println(status);
	String name = res.getMethod().getMethodName();
	screenshot.getscreenshoy(driver,name);
	driver.close();
}

}
