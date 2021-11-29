package selenium_task;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mini_Project1 {
	


	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Kavin");
		
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kumar");
		
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea")).sendKeys("Porur Chennai");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Kavintest2@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9786633166");
		
		driver.findElement(By.xpath("//input[@name='radiooptions']")).click();
		
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']")).click();
		
		driver.findElement(By.xpath("//a[text()='English']")).click();
		
		driver.findElement(By.xpath("//a[text()='Arabic']")).click();
		
		driver.findElement(By.id("secondpassword")).click();
		
		driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
		
		driver.findElement(By.xpath("//*[text()='India']")).click();
		
		//driver.findElement(By.xpath("//li[@aria-selected='true']")).click();
		
		driver.findElement(By.id("secondpassword")).click();
		
		Thread.sleep(3000);
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File c = t.getScreenshotAs(OutputType.FILE);
		
		File d = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\automation.png");
		
		FileUtils.copyFile(c, d);
		
		
		
		

		
		
		
		
		
		
}

	
}