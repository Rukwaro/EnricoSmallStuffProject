package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DropDownPage;
import util.BrowserFactory;

public class DropDownTest {

	@Test
	public void DropDown() {

		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://demo.guru99.com/test/newtours/register.php");

		DropDownPage dropDownPage = PageFactory.initElements(driver, DropDownPage.class);
		dropDownPage.SelectCountry("CHILE");

//driver.close();

//driver.quit();

	}

}
