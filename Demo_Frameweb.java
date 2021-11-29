package selenium_task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Frameweb {
	


	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		String n=driver.getTitle();
		
		System.out.println("Title of the Page is  "+n);
		
		String s1=driver.getCurrentUrl();
		System.out.println(s1);
		
		driver.switchTo().frame("frame1"); 
		
		WebElement w1=driver.findElement(By.xpath("//h1[@ id='sampleHeading'][1]"));
		
		String s2=w1.getText();
		
		System.out.println(s2);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[4]")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("frame1");
		
		// WebElement child=driver.findElement(By.xpath("/html/body/iframe"));
		
		WebElement child=driver.findElement(By.xpath("//iframe[contains(@srcdoc,\"Child Iframe\")]"));
		
		driver.switchTo().frame(child);
		
		WebElement name1= driver.findElement(By.xpath("//p[contains(text(),\"Child Iframe\")]"));
		
		String c = name1.getText();
		
		System.out.println(c);
		
		driver.switchTo().parentFrame();
		
		WebElement parent=driver.findElement(By.xpath("//body[contains(text(),\"Parent frame\")]"));
		
		String c2=parent.getText();
		
		System.out.println(c2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

        
    //    String a1=driver.findElement(By.id("sampleHeading")).getText();
        
   //     System.out.println(a1);


	}

}
