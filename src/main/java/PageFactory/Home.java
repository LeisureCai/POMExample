package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	@FindBy(xpath="/html/body/table[2]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/span/table/tbody/tr[1]/td/h2")
	WebElement homeCongratulations;
	
	public Home (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getHomeCongratulations() {
		return homeCongratulations.getText();
	}
}
