package selenium_task;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Guru {



	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");


		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();
		
		WebElement name1= driver.findElement(By.xpath("//input[@name='cusid']"));
		
		name1.getText();
		
		name1.sendKeys("34257106");
		
		System.out.println(name1.getAttribute("value"));
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		WebElement w1=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td"));
		
		String s1=w1.getText();
		
		System.out.println(s1);
		
		
		
		
		
		
		
		
		
		
	}
	
}	