package generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot  {
	public static void getscreenshoy(WebDriver driver,String name)
	{
		TakesScreenshot t=(TakesScreenshot)driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/"+name+".png");
		try {
		FileUtils.copyFile(src,dest);
	}
		catch(IOException e)
		{
			
		}

}
}
