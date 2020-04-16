package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	
	@FindBy(name="uid")
	WebElement userName;
	
	@FindBy(name="passw")
	WebElement password;
	
	@FindBy(name="btnSubmit")
	WebElement loginBtn;
	
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String strUserName) {
		userName.sendKeys(strUserName);
	}
	
	public void setPassword(String strPassword) {
		password.sendKeys(strPassword);
	}
	
	public void clickLogin() {
		loginBtn.click();
	}
	
	public void loginToTest(String strUserName,String strPassword) {
		this.setUserName(strUserName);
		this.setPassword(strPassword);
		this.clickLogin();
	}
}
