package selenium_task;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Droptask {



	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");


		WebDriver driver=new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Static.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		Actions a = new Actions(driver);
		
		WebElement drag1= driver.findElement(By.xpath("//img[@id='angular']"));
		
		WebElement drop1=driver.findElement(By.xpath("//div[@class='dragged']"));
		
		a.dragAndDrop(drag1, drop1).perform();


	}
	
	
}	

















