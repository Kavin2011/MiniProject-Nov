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

public class Mini_Project6_2nd  {
	
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.findElement(By.id("inputValEnter")).sendKeys("Hangup Blue Solid Formal 2 Piece Suits");
		
		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		
		Thread.sleep(4000);
		
		WebElement w3=driver.findElement(By.xpath("//*[@placeholder='Enter your pincode']"));
		
		String s4=w3.getText();
		
		System.out.println(s4);
		
		w3.sendKeys("600089");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='pincode-check']")).click();
		
		Thread.sleep(4000);
		
		WebElement w1=driver.findElement(By.xpath("(//*[@title='Hangup Blue Solid Formal 2 Piece Suits'])[3]"));
		
		w1.click();
		
		Thread.sleep(3000);
		
		String mainwindow= driver.getWindowHandle();
		
		System.out.println("Main Window is" + mainwindow);
		
		Set<String> w2=driver.getWindowHandles();
			
		List<String> li= new ArrayList <String> (w2);
		
		driver.switchTo().window(li.get(1));
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"attribute-select-0\"]/div[2]/div/div/div[6]/div")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("add-cart-button-id")).click();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		

		driver.findElement(By.xpath("//*[text()='View Cart']")).click();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File c = t.getScreenshotAs(OutputType.FILE);
			
		File d = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\snapdeal_click4.png");
			
		FileUtils.copyFile(c, d);
			
		Thread.sleep(4000);
		
		
		
		
		
		
		
}
	
}
