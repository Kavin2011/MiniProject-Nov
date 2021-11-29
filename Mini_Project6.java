package selenium_task;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mini_Project6 {
	
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");


		WebDriver driver=new ChromeDriver();

		driver.get("https://www.snapdeal.com/");
		
		String s1=driver.getCurrentUrl();
		
		System.out.println(s1);
		
		String s2=driver.getTitle();
		
		System.out.println(s2);
				
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		Actions a= new Actions(driver);
		
		WebElement w1=driver.findElement(By.xpath("(//span[@class='catText'])[3]"));
		
		a.moveToElement(w1).perform();
		
		Thread.sleep(2000);
		
		WebElement w2=driver.findElement(By.xpath("//span[text()='DTH Services']"));
		
		String s3=w2.getText();
		
		System.out.println(s3);
		
		w2.click();
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		WebElement w3=driver.findElement(By.xpath("//*[@placeholder='Enter your pincode']"));
		
		String s4=w3.getText();
		
		System.out.println(s4);
		
		w3.sendKeys("600089");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='pincode-check']")).click();
		
		Thread.sleep(4000);
				
		WebElement w4=driver.findElement(By.xpath("//*[@id=\"685974421532\"]/div[2]/a/picture/img"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", w4);
		
		w4.click();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		String mainwindow= driver.getWindowHandle();
		
		System.out.println("Main Window is" + mainwindow);
		
		Set<String> w5=driver.getWindowHandles();
		
		System.out.println("Child window is" +s1);
		
		List<String> li= new ArrayList <String> (w5);
		
		driver.switchTo().window(li.get(1));
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("add-cart-button-id")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[text()='View Cart']")).click();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File c = t.getScreenshotAs(OutputType.FILE);
			
		File d = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\snapdeal_click3.png");
			
		FileUtils.copyFile(c, d);
			
		Thread.sleep(4000);
		
		
		
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}