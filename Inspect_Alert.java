package selenium_task;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inspect_Alert {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		
		Alert al =driver.switchTo().alert();
		
		al.sendKeys("Kavin");
		
		String t=al.getText();
		
		System.out.println(t);
		
		al.accept();
		
		String name=driver.findElement(By.id("demo1")).getText();
		
		System.out.println(name);
		
		String actual="Hello Kavin How are you today";
		
		boolean c=actual.equalsIgnoreCase(name);
		
		System.out.println("Validated");
		

}

	
}