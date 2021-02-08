
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {
	
	public static WebDriver driver;

	
	@BeforeSuite
	public void setup()
	{
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		
	}
	
	@Test
	public void LaunchBrowser() throws InterruptedException
	{
		
		driver.get("https://www.gmail.com/");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("lovishkapoor97");
		driver.findElement(By.xpath("//div[@id='identifierNext']//div[@class='VfPpkd-dgl2Hf-ppHlrf-sM5MNb']//button[@type='button']//div[@class='VfPpkd-RLmnJb']")).click();
		driver.findElement(By.id("Passwd")).sendKeys("null");

		driver.findElement(By.id("Signin")).click();
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

	

}
