package selenium_task;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mini_Project4 {
	
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		String s1=driver.getTitle();
		
		System.out.println(s1);
		
		driver.manage().window().maximize();
		
		WebElement w1 =driver.findElement(By.xpath("//input[@id='search']"));
		
		w1.sendKeys("selenium");
		
		System.out.println(w1.getAttribute("value"));
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		WebElement j1 = driver.findElement(By.xpath("(//*[@id='continuations'])[4]"));
		
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        js.executeScript("window.scrollBy(0,300)", j1);
		
		WebElement w2 =driver.findElement(By.xpath("(//*[@class='yt-simple-endpoint style-scope ytd-video-renderer'])[1]"));
		
		String s2=w2.getText();
		
		System.out.println("Text from Search: ");
		
		System.out.println(s2);
		
		w2.click();
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@title='Pause (k)']")).click();
		
		Thread.sleep(2000);
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File c = t.getScreenshotAs(OutputType.FILE);
			
		File d = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\youtube_pause2.png");
			
		FileUtils.copyFile(c, d);
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		WebElement w3 =driver.findElement(By.xpath("(//*[@class='style-scope ytd-video-primary-info-renderer'])[1]"));
		
		String s3=w3.getText();
		
		System.out.println("Text from Content: ");
		
		System.out.println(s3);
		
		System.out.println("Its Match :  "+ s3.equalsIgnoreCase(s2));
		
		
		Thread.sleep(3000);												
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
	
	
}