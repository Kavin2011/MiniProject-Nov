package selenium_task;

		import java.io.File;
		import java.io.IOException;

		import org.apache.commons.io.FileUtils;
		import org.openqa.selenium.By;
		import org.openqa.selenium.OutputType;
		import org.openqa.selenium.TakesScreenshot;
		import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;

		public class Facebook_Screenshot {

			public static void main(String[] args) throws InterruptedException, IOException {
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				
				Thread.sleep(4000);
				
				WebElement e = driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']"));
				
				String f=e.getAttribute("placeholder");
				System.out.println(f);
				
				e.sendKeys("Kavin@gmail.com");
				
				String g = e.getAttribute("value");
				System.out.println(g);
			
			
				TakesScreenshot t = (TakesScreenshot) driver;
				File s = t.getScreenshotAs(OutputType.FILE);
				
				File d = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\facebooktest.png");
				
				FileUtils.copyFile(s, d);
				
				
					
				
			}



	}


