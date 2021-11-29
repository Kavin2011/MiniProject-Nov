package selenium_task;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MiniProject_2ndhalf {
	
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Kavin2011@email.com");
		
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Kavin@123");
		
		driver.findElement(By.xpath("//*[@class='icon-lock left']")).click();
		
		Thread.sleep(4000);
		
		Actions a= new Actions(driver);
		
		WebElement move=driver.findElement(By.xpath("//a[@title='Women']"));
		
		a.moveToElement(move).perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[text()='Evening Dresses'])[1]")).click();
		
		Thread.sleep(3000);
		
		WebElement move2=driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li"));
		
		a.moveToElement(move2).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='More']")).click();
		
		Thread.sleep(3000);
		
		WebElement w4=driver.findElement(By.xpath("//i[@class='icon-plus']"));
		
		for (int i = 0; i < 4; i++) {
			
			w4.click();
			
		}
		
		Thread.sleep(2000);
		
		WebElement sel= driver.findElement(By.id("group_1"));
		
		Select s3 = new Select(sel);
		
		s3.selectByValue("2");
		
		driver.findElement(By.id("color_24")).click();
		
		driver.findElement(By.id("add_to_cart")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		
		Thread.sleep(3000);	
		
		WebElement move4=driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		
		a.moveToElement(move4).perform();
		
		move4.click();
		
		Thread.sleep(3000);
		
		WebElement move5= driver.findElement(By.xpath("//textarea[@class='form-control']"));
		
		a.moveToElement(move5).perform();
		
		move5.sendKeys("Landmark: Near World Bank");
		
		Thread.sleep(2000);
		
		WebElement move6=driver.findElement(By.name("processAddress"));
		
		a.moveToElement(move6).perform();
		
		move6.click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("cgv")).click();
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
		
		Thread.sleep(3000);
		
		WebElement move7=driver.findElement(By.xpath("//a[@class='bankwire']"));
		
		a.moveToElement(move7).perform();
		
		move7.click();
		
		Thread.sleep(2000);
		
		WebElement move8=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
		a.moveToElement(move8).perform();
		
		move8.click();
		
		Thread.sleep(3000);
		
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File s = t.getScreenshotAs(OutputType.FILE);
		
		File d = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\minipro_2ndhalf.png");
		
		FileUtils.copyFile(s, d);
		
		
		
	}
	
}	