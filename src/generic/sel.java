package generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class sel {
	public static void selectbyindex(WebElement element, int index)
	{
	Select	s =new Select(element);
	s.selectByIndex(index);
	}
	public static void selectbyvalue(WebElement element, String value)
	{
	Select	s =new Select(element);
	s.selectByValue(value);
	}

}
