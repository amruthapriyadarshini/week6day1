package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	ChromeDriver driver;
	@BeforeMethod
	public void preCondition(){
		//set up chrome driver.
		WebDriverManager.chromedriver().setup();
		//Open the browser
		driver = new ChromeDriver();
		
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//maximize
		driver.manage().window().maximize();
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
