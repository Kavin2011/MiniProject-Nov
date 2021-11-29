package selenium_task;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mini_Project3  {
	
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cowin.gov.in/");
		
		Thread.sleep(3000);
		
		String s1=driver.getTitle();
		
		System.out.println(s1);
		
		String s2=driver.getCurrentUrl();
		
		System.out.println("Page URL : "  +s2);		
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement w1 = driver.findElement(By.xpath("//*[text()='By District']"));
		
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        js.executeScript("window.scrollBy(0,700)", w1);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//mat-select[@id=\"mat-select-0\"]/div/div[2]")).click();
		
		Thread.sleep(2000);
		
		Robot r= new Robot();
		
		for (int i = 0; i < 31; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			
		Thread.sleep(300);
		
		    r.keyRelease(KeyEvent.VK_DOWN);	
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		WebElement e1=driver.findElement(By.xpath("//*[text()='Tamil Nadu']"));
		
		String q1= e1.getText();
		
		String q2= "Tamil Nadu";
		
		System.out.println(q1.equalsIgnoreCase(q2) +" : Selected State is Tamil Nadu");
		
	
		
		
		
		driver.findElement(By.xpath("//*[@id=\"mat-select-2\"]/div/div[2]")).click();
		
		for (int i = 0; i < 4; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			
		Thread.sleep(400);
		
		    r.keyRelease(KeyEvent.VK_DOWN);	
		    
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		System.out.println(q1.equalsIgnoreCase(q2) +" : Selected City is Chennai");
		
		driver.findElement(By.xpath("//*[@id=\"mat-tab-content-1-0\"]/div/div/div[3]/button")).click();
		
		Thread.sleep(2000);
		
		System.out.println("ANBU HOSPITAL PVT LTD ");
		
		System.out.println("No 18-4 Sasi Nagar Rd Near By Clove Dental Backside Balaji Nagar Velachery Chennai Tamil Nadu 600042, Chennai, Tamil Nadu, 600042");
		
		System.out.println();
		
		WebElement a1=driver.findElement(By.xpath("(//*[text()= '18 & Above'])[1]"));
		
		String n1=a1.getText();
		
		System.out.println(n1);
		
		a1.click();
		
		Thread.sleep(2000);
		
		Actions a= new Actions(driver);
		
		WebElement a2=driver.findElement(By.xpath("(//*[text()='Paid'])[1]"));
		
		String n2=a2.getText();
		
		System.out.println(n2);
		
		System.out.println("Covishield");
		
		a.moveToElement(a2).click().perform();
		
		Thread.sleep(3000);
		

		
	}	
		
		
				
}		
		
	
