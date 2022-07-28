package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {
	public static WebDriver driver;

	public static void main(String[] args) {
		LoginClass fly = new LoginClass();
//		fly.Home();
//		fly.MEMBER_LOGIN();
//		fly.Login();
//		fly.Nav_Home();
//		fly.Register();
//		fly.See_Bookings();

	}

	public static void Home() {
		System.setProperty("webdriver.chrome.driver", "C:\\DownloadedApp\\chromedriver_win32_96\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/FlyAway/");
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
	}
	
	public static void MEMBER_LOGIN() {
		driver.findElement(By.xpath("//a[normalize-space()='Login/Signup']")).click();
		driver.findElement(By.name("email_id")).sendKeys("rajgaurav@fly.com");
		driver.findElement(By.name("pwd")).sendKeys("password");
	}
	
	public static void Login() {
//		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();
	}
	public static void Nav_Home() {
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
	}
	public static void Register() {
		driver.findElement(By.xpath("//select[@name='source']")).sendKeys("B");
		driver.findElement(By.xpath("//select[@name='destination']")).sendKeys("H");
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Book Flight']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Click to complete booking']")).click();
	}
	public static void See_Bookings() {
		driver.findElement(By.xpath("//a[normalize-space()='See Your Bookings']")).click();
	}


}
