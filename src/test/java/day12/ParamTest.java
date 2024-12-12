package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters("browser")
	void setup(String br) throws InterruptedException {
		
		switch(br) {
		
		case "chrome" : driver = new ChromeDriver(); break;
		case "edge" : driver = new EdgeDriver(); break;
		case "firefox": driver = new FirefoxDriver(); break;
		default : System.out.println("Invalid browser"); return;
		
			}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
	}

	@Test(priority = 1)
	void testLogo() {
		
		boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(logo, true);
		
	}
	
	@Test(priority = 2)
	void testTitle() {
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
		
	}
	
	@Test(priority = 3)
	void testURL() {
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterClass
	void tearDown() {
		driver.close();
	}
	
	
}
