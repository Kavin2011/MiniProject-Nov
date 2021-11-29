package selenium_task;

		
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Demo_Web {

			public static void main(String[] args) throws InterruptedException {

				System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://demo.automationtesting.in/Register.html");
				
				Thread.sleep(4000);
				
			driver.findElement(By.name("firstname")).sendKeys("Kavin");
			driver.findElement(By.name("lastname")).sendKeys("Kumar");
				
			WebElement b=driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
			b.sendKeys("Kavin@gmail.com");
				
			WebElement c=driver.findElement(By.xpath("//input[@aria-label='New password']"));
			c.sendKeys("87654321");
				
			driver.findElement(By.xpath("//input[@type='radio'and @value='2']")).click();
	
		

	}

}
