package selenium_task;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mini_Project9 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");


		WebDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in//");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		
		Thread.sleep(4000);
		
		WebElement mobile=driver.findElement(By.xpath("//*[@type='email']"));
		
		mobile.sendKeys("9786633166");
		
		System.out.println(mobile.getAttribute("value"));
		
		driver.findElement(By.xpath("(//*[@id='continue'])[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//*[@id='ap_password'])[1]")).sendKeys("Kavin@20");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("signInSubmit")).click();
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		WebElement text=driver.findElement(By.id("twotabsearchtextbox"));
		
		text.sendKeys("mens shirt");
		
		System.out.println(text.getAttribute("value"));
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//*[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).click();
	
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		String mainwindow= driver.getWindowHandle();
		
		System.out.println("Main Window is" + mainwindow);
		
		Set<String> s1=driver.getWindowHandles();
		
		System.out.println("Child window is" +s1);
		
		List<String> li= new ArrayList <String> (s1);
		
		System.out.println("********************");
		
		driver.switchTo().window(li.get(1));
	
		WebElement q1=driver.findElement(By.id("buy-now-button"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(q1).perform();
		
		a.click().perform();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);	
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File s = t.getScreenshotAs(OutputType.FILE);
		
		File d = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\Amazon_task2.png");
		
		FileUtils.copyFile(s, d);
		
		
		
		
//		WebElement Down=driver.findElement(By.xpath("//*[text()='Pay on Delivery'][1]"));
//								
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		    
//		js.executeAsyncScript("window.scrollBy(0,1200);","Down");
//		
//		Thread.sleep(4000);
//		
//		driver.findElement(By.xpath("//*[text()='Pay on Delivery'][1]")).click();
//		
//		driver.findElement(By.xpath("(//*[@class='a-button-input a-button-text'])[5]")).click();
//		
//		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
	
		
		
		
	}

}