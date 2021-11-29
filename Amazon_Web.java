package selenium_task;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Web {



	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");


		WebDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in//");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		Actions a = new Actions(driver);
		
		WebElement move1=driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		
		String s1=move1.getText();
		
		System.out.println(s1);
		
		a.moveToElement(move1).perform();
		
		a.contextClick(move1).perform();
		
		Thread.sleep(2000);
		
		Robot r= new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(1000);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		WebElement move2=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		String s2=move2.getText();
		
		System.out.println(s2);
		
		a.moveToElement(move2).perform();
		
		a.contextClick(move2).perform();
		
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(1000);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		WebElement move3=driver.findElement(By.xpath("//a[text()='Fashion']"));
		
		String s3=move3.getText();
		
		System.out.println(s3);
		
		a.moveToElement(move3).perform();
		
		a.contextClick(move3).perform();
		
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(1000);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
	//	TakesScreenshot t = (TakesScreenshot) driver;
	//	File c = t.getScreenshotAs(OutputType.FILE);
		
	//	File d = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\amazon_click.png");
		
	//	FileUtils.copyFile(c, d);
		
		
	//	Thread.sleep(2000);
		
		
		
	}
	
	
}