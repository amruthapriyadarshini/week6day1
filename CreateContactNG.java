package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactNG extends BaseClass{
	//ChromeDriver driver;
	
	@Test
	public void main() {
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("(//div[@class='x-panel-header'])[3]/a")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionBody']//li[2]")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Amrutha");
		driver.findElement(By.id("lastNameField")).sendKeys("T");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("aaa");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("lll");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("CSE");
		//driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("ddd");
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("desc");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("aaa@gmail.com");
		WebElement ddGenState =driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']")); 
		Select	 ddGenOption = new Select(ddGenState);
				 ddGenOption.selectByVisibleText("New York");
	
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[1]")).click();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("note");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println("Title is "+driver.getTitle());
				
	}
}
