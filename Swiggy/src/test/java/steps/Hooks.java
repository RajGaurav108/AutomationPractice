package steps;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver driver;
	@Before
	public void beforescenario() {
		System.out.println("Open url");
//		System.setProperty("webdriver.chrome.driver", "C:\\DownloadedApp\\chromedriver_win32_96\\chromedriver.exe");
		
//		Dont create driver variable here bec, it will open chrome browser before every test
//		driver = new ChromeDriver();
	}
	
	@After
	public void afterscenario() {
		System.out.println("close browser");
		
	}

}
