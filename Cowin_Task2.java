package selenium_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cowin_Task2 {
	
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cowin.gov.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		String s1=driver.getTitle();
		
		System.out.println(s1);
		
		String s2=driver.getCurrentUrl();
		
		System.out.println("Page URL : "  +s2);	
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"mat-select-0\"]/div/div[2]")).click();
		
		Actions a = new Actions(driver);
		
		WebElement state=driver.findElement(By.xpath("//*[@id=\"mat-select-value-1\"]/span/span"));
		
		a.moveToElement(state).click().perform();
		
		System.out.println(driver.findElement(By.xpath("//*[@id='mat-select-value-1']")).getAttribute("name"));
		
		driver.findElement(By.xpath("//*[@id='mat-select-value-3']")).click();
		
		WebElement city=driver.findElement(By.xpath("//*[@id=\"mat-option-41\"]/span"));
		
		a.moveToElement(city).click().perform();
		
		System.out.println(driver.findElement(By.xpath("//*[@id='mat-select-value-3']")).getAttribute("name"));
		
		driver.findElement(By.xpath("//*[@id=\"mat-tab-content-1-0\"]/div/div/div[3]/button")).click();
		
		Thread.sleep(3000);
		
		
		
		
 
		
		
		
	}
	
}	