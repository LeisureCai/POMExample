import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageFactory.Home;
import PageFactory.Login;

public class TestLoginWithPageFactory {
	WebDriver driver;
	Login objLogin;
	Home objHome;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "E:/tools/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.testfire.net/login.jsp");
	}

	@Test
	public void test() {
		objLogin=new Login(driver);
		objLogin.loginToTest("admin", "admin");
		objHome=new Home(driver);
		assertTrue(objHome.getHomeCongratulations().contains("Congratulations"));
	}

}
