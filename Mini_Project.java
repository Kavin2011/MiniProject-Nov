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

public class Mini_Project {
	
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement n2=driver.findElement(By.name("email_create"));
		
		n2.sendKeys("Thara@gmail.com");
		
		System.out.println(n2.getAttribute("value"));
		
		WebElement n3=driver.findElement(By.xpath("//*[@name='SubmitCreate']"));
		
	    boolean b1= n3.isDisplayed();
	    	    
	    System.out.println(b1);
		
		n3.click();
		
		Thread.sleep(3000);
		
	    String s1=driver.getCurrentUrl();
	    
	    System.out.println(s1);
	    	    
	    Thread.sleep(4000);
	    
	    WebElement n1=driver.findElement(By.xpath("//*[text()='Your personal information']"));
		
		String s=n1.getText();
		
		System.out.println(s);
		
		
		driver.findElement(By.xpath("//input[@id='id_gender2']")).click();

	    WebElement w1=driver.findElement(By.name("customer_firstname"));
	    
	    w1.sendKeys("Thara");
	    
	    System.out.println(w1.getAttribute("value"));
	    
	    WebElement w2=driver.findElement(By.name("customer_lastname"));
	    
	    w2.sendKeys("N");
	    
	    driver.findElement(By.id("passwd")).sendKeys("Thara@1997");
	    
        WebElement date= driver.findElement(By.id("days"));
		
		Select s3 = new Select(date);
		
		s3.selectByValue("14");
		
		WebElement month= driver.findElement(By.id("months"));
		
		Select s4 = new Select(month);
		
		s4.selectByIndex(7);
		
		
		WebElement year= driver.findElement(By.id("years"));
		
		Select s5 = new Select(year);
		
		s5.selectByValue("1997");
		
		Thread.sleep(3000);

	    WebElement a1= driver.findElement(By.id("company"));
	    
	    a1.sendKeys("Greens Technologies");
	    
	    System.out.println(a1.getAttribute("value"));
	    
	    WebElement a2=driver.findElement(By.id("address1"));
	    
	    a2.sendKeys("Tech Park");
	    
	    System.out.println(a2.getAttribute("value"));
	    
	    WebElement a3=driver.findElement(By.id("address2"));
	    
	    a3.sendKeys("Manhattan");
	    
	    System.out.println(a3.getAttribute("value"));
	    
	    WebElement a4=driver.findElement(By.id("city"));
	    
	    a4.sendKeys("New York City");
	    
	    System.out.println(a4.getAttribute("value"));
	    
        WebElement state= driver.findElement(By.id("id_state"));
		
		Select s7= new Select(state);
		
		s7.selectByIndex(32);
		
		driver.findElement(By.id("postcode")).sendKeys("10301");
		
		WebElement country= driver.findElement(By.id("id_country"));
		
		Select s8=new Select(country);
		
		s8.selectByValue("21");
		
		driver.findElement(By.id("other")).sendKeys("Home");
		
		WebElement a7=driver.findElement(By.name("phone_mobile"));
				 
	    a7.sendKeys("9876543210");
		
		driver.findElement(By.id("alias")).sendKeys("New York City");
				
		Thread.sleep(3000);
		
		WebElement w3=driver.findElement(By.xpath("//button[@id='submitAccount']"));
		
		w3.click();
		

		TakesScreenshot t = (TakesScreenshot) driver;
		File c = t.getScreenshotAs(OutputType.FILE);
		
		File d = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\miniproid.png");
		
		FileUtils.copyFile(c, d);
		
		
	}
	
}