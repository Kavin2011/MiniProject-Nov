
	package selenium_task;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Demo_Iframe {
		


		public static void main(String[] args) throws Throwable {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demoqa.com/frames");
			
			Thread.sleep(3000);
			
			driver.switchTo().frame("frame1"); 
			
			WebElement w1=driver.findElement(By.xpath("//h1[@ id='sampleHeading'][1]"));
			
			String s2=w1.getText();
			
			System.out.println(s2);
			
			driver.switchTo().defaultContent();
			
			Thread.sleep(4000);

}

	}