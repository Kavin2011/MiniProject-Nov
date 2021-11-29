package selenium_task;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_Signup {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("firstname")).sendKeys("Kavin");
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		
		WebElement b=driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		b.sendKeys("Kavin@gmail.com");
		
		WebElement c=driver.findElement(By.xpath("//input[@aria-label='New password']"));
		c.sendKeys("87654321");
		
		driver.findElement(By.xpath("//input[@type='radio'and @value='2']")).click();
		
		WebElement date= driver.findElement(By.id("day"));
		
		Select s3 = new Select(date);
		
		s3.selectByValue("20");
		
		WebElement month= driver.findElement(By.id("month"));
		
		Select s1 = new Select(month);
		
		s1.selectByIndex(10);
		
		s1.getFirstSelectedOption();
		
		WebElement year= driver.findElement(By.id("year"));
		
		Select s2 = new Select(year);
		
		s2.selectByVisibleText("1993");
		
		boolean m=s2.isMultiple();
		System.out.println(m);
		
	List<WebElement> li=s1.getOptions();
		
	int si = li.size();
		
	System.out.println(si);
		
	for (int i=10 ; i<si ; i++)
			
	{
		if(i==11)
		{
			break;
		}
        
		System.out.println(li.get(i).getText());
		}
		
		
		Thread.sleep(3000);
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File s = t.getScreenshotAs(OutputType.FILE);
		
		File d = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\facebook_signup.png");
		
		FileUtils.copyFile(s, d);
		
		

	
		   
		
	
			

	}

}
