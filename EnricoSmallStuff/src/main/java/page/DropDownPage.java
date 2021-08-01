package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {

	WebDriver driver;

	public DropDownPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(how = How.NAME, using = "country")
	WebElement CountryDropDown;

	public void SelectCountry(String value) {
		Select country = new Select(CountryDropDown);
		country.selectByVisibleText(value);

	}

}
