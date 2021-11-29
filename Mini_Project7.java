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

public class Mini_Project7 {
	
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.myntra.com/");
		
		String s1=driver.getCurrentUrl();
		
		System.out.println(s1);
		
		String s2=driver.getTitle();
		
		System.out.println(s2);
				
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		WebElement down=driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div/div[8]/div/h4[1]"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,2300)", down);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions a = new Actions(driver);
		
		WebElement move=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/div/div[10]/div/div/div/div/div[5]/div/div/div/div/div/div/div/div/div/div/a/picture/img"));
		
		a.moveToElement(move).click().perform();
		
		Thread.sleep(3000);
		
		WebElement w1=driver.findElement(By.xpath("(//*[@type='radio'])[4]"));
		
		String s3=w1.getAttribute("value");
		
		System.out.println(s3);
		
		a.moveToElement(w1).click().perform();
		
		Thread.sleep(3000);
		
		WebElement w2=driver.findElement(By.xpath("(//*[@class='price-input'])[1]"));
		
		String s4=w2.getAttribute("value");
		
		System.out.println(s4);
		
		a.moveToElement(w2).click().perform();
		
		Thread.sleep(3000);
		
		WebElement w3=driver.findElement(By.xpath("//*[text()='Color']"));

		js.executeScript("window.scrollBy(0,300)", w3);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement w4=driver.findElement(By.xpath("(//*[@class='common-checkboxIndicator'])[10]"));
		
		String s7=w4.getAttribute("value");
		
		System.out.println(s7);
		
		a.moveToElement(w4).click().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//*[@class='img-responsive'])[3]")).click();
		
		String mainwindow= driver.getWindowHandle();
		
		System.out.println("Main Window is" + mainwindow);
		
		Set<String> q1=driver.getWindowHandles();
			
		List<String> li= new ArrayList <String> (q1);
		
		driver.switchTo().window(li.get(1));
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[text()='ADD TO BAG']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[text()='GO TO BAG']")).click();
		
		Thread.sleep(3000);
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File c = t.getScreenshotAs(OutputType.FILE);
			
		File d = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\Myntra_click.png");
			
		FileUtils.copyFile(c, d);
			
		Thread.sleep(4000);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}