package selenium_task;

import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class Mini_Project10 {
	
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");


		WebDriver driver=new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		
		String s3=driver.getCurrentUrl();
		
		System.out.println(s3);
		
		String s2=driver.getTitle();
		
		System.out.println(s2);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		Actions a = new Actions(driver);
		
		WebElement move1=driver.findElement(By.xpath("//*[@class='_1_3w1N']"));
		
		String s1=move1.getText();
		
		System.out.println(s1);
		
		Thread.sleep(3000);
		
		Robot r= new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(1000);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
				
		driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("9786633166");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Kavin@20");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		WebElement move2=driver.findElement(By.xpath("//*[text()='Fashion']"));
		
		a.moveToElement(move2).perform();
		
		String w2=move2.getText();
		
		System.out.println(w2);
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("mens jackets");
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		Thread.sleep(2000);
		
		WebElement text1=driver.findElement(By.xpath("(//*[@class='IRpwTa'])[1]"));
		
		String w3=text1.getText();
		
		System.out.println(w3);
		
		text1.click();
		
		Thread.sleep(4000);
		
		String mainwindow= driver.getWindowHandle();
		
		System.out.println("Main Window is" + mainwindow);
		
		Set<String> w1=driver.getWindowHandles();
		
		System.out.println("Child window is" +s1);
		
		List<String> li= new ArrayList <String> (w1);
		
		driver.switchTo().window(li.get(1));
		
		Thread.sleep(3000);
		
		WebElement Down=driver.findElement(By.xpath("//*[text()='Size']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,300);","Down");
		
		Down.click();
		
		Thread.sleep(3000);
		
		WebElement move3=driver.findElement(By.xpath("//*[@id=\"swatch-0-size\"]/a"));
		
		a.moveToElement(move3).click().perform();
		
		Thread.sleep(3000);
				
		WebElement move4=driver.findElement(By.xpath("(//*[@type='button'])[1]"));
				
		a.moveToElement(move4).click().perform();
				
		Thread.sleep(3000);
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File c = t.getScreenshotAs(OutputType.FILE);
			
		File d = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\flipkart_click.png");
			
		FileUtils.copyFile(c, d);
			
			
		Thread.sleep(2000);
		
		
	}

}
