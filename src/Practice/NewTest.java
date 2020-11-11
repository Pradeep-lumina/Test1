package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://lfcn.luminad.com/#/");
		Thread.sleep(2000);
		
		WebElement userid = driver.findElement(By.xpath("//input[@formcontrolname='emailid']"));
		userid.sendKeys("admin@yopmail.com");
		Thread.sleep(2000);
		
		WebElement pwd = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
		pwd.sendKeys("1234");
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//button[text()='Sign In']"));
		login.click();
		Thread.sleep(2000);
		
		WebElement user = driver.findElement(By.xpath("//a[text()=' User Management ']"));
		user.click();
		Thread.sleep(2000);		
		
  }
}
