package selenium_task;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Pro {
	
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("email_create")).sendKeys("Kavin2010@email.com");
		
		driver.findElement(By.name("SubmitCreate")).click();
		
		Thread.sleep(3000);
		
	    String s1=driver.getCurrentUrl();
	    
	    System.out.println(s1);

	    String s2="http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
	    
	    s2.equalsIgnoreCase(s1);
	    
	    System.out.println("Its Match");
	    
	    boolean b1= driver.findElement(By.name("SubmitCreate")).isDisplayed();
	    
	    System.out.println(b1);
	    
	    Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();

	    driver.findElement(By.name("customer_firstname")).sendKeys("Kavin");
	    
	    driver.findElement(By.name("customer_lastname")).sendKeys("Kumar");
	    
	    driver.findElement(By.id("passwd")).sendKeys("Kavin@123");
	    
        WebElement date= driver.findElement(By.id("days"));
		
		Select s3 = new Select(date);
		
		s3.selectByValue("20");
		
		WebElement month= driver.findElement(By.id("months"));
		
		Select s4 = new Select(month);
		
		s4.selectByIndex(11);
		
		
		WebElement year= driver.findElement(By.id("years"));
		
		Select s5 = new Select(year);
		
		s5.selectByValue("1993");
		
		Thread.sleep(3000);

	    driver.findElement(By.id("company")).sendKeys("HCL Technologies");
	    
	    driver.findElement(By.id("address1")).sendKeys("DLF Tech Park,1st street");
	    
	    driver.findElement(By.id("address2")).sendKeys("Los Angeles");
	    
	    driver.findElement(By.id("city")).sendKeys("California");
	    
        WebElement state= driver.findElement(By.id("id_state"));
		
		Select s7= new Select(state);
		
		s7.selectByIndex(5);
		
		driver.findElement(By.id("postcode")).sendKeys("90011");
		
		WebElement country= driver.findElement(By.id("id_country"));
		
		Select s8=new Select(country);
		
		s8.selectByValue("21");
		
		driver.findElement(By.id("other")).sendKeys("+16692380154");
		
		driver.findElement(By.name("phone_mobile")).sendKeys("16692380155");
		
		driver.findElement(By.id("alias")).sendKeys("Mexican city");
				
		Thread.sleep(3000);
		
		WebElement w3=driver.findElement(By.xpath("//button[@id='submitAccount']"));
		
		w3.click();
		

		TakesScreenshot t = (TakesScreenshot) driver;
		File s = t.getScreenshotAs(OutputType.FILE);
		
		File d = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\mini_project.png");
		
		FileUtils.copyFile(s, d);
		
		
		
		
		
				
				
		
		
		
	    
	    
	    
	    
}

	
}