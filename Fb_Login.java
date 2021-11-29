package selenium_task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_Login {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("email")).sendKeys("Kavin@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("12345678");
		
		
		Thread.sleep(3000);
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File s = t.getScreenshotAs(OutputType.FILE);
		
		File d = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\fb_Error.png");
		
		FileUtils.copyFile(s, d);
		
		
	}

}
