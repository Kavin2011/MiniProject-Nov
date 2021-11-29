package selenium_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mini_Project2 {



	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");


		WebDriver driver=new ChromeDriver();

		driver.get("http://practice.automationtesting.in/");

		String s1=driver.getCurrentUrl();

		System.out.println(s1);

		driver.manage().window().maximize();

		driver.findElement(By.id("menu-item-40")).click();

		String s2=driver.getTitle();

		System.out.println(s2);

		WebElement e1=driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[2]/a[2]"));

		e1.click();
		
		System.out.println(e1.getText());

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[3]/a[2]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[4]/a[2]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"wpmenucartli\"]/a/i")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[5]/div/input")).click();

		driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[5]/div/input")).sendKeys("2");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='update_cart']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@id=\"page-34\"]/div/div[1]/div[2]/div/div/a")).click();
		
		Thread.sleep(3000);

		driver.findElement(By.id("billing_first_name")).sendKeys("Kavin");

		driver.findElement(By.id("billing_last_name")).sendKeys("Kumar");

		driver.findElement(By.id("billing_company")).sendKeys("CTS");

		driver.findElement(By.id("billing_email")).sendKeys("Kavin20@gmail.com");

		driver.findElement(By.id("billing_phone")).sendKeys("9786633166");

		WebElement country=driver.findElement(By.xpath("//*[@id='select2-chosen-1']"));

		country.click();

		driver.findElement(By.xpath("//div[text()='India']")).click();
		
		Thread.sleep(3000);

		driver.findElement(By.id("billing_address_1")).sendKeys("Mowlivakkam Porur");

		driver.findElement(By.id("billing_address_2")).sendKeys("Tamarai Flats");

		driver.findElement(By.id("billing_city")).sendKeys("CHENNAI");
		
		Thread.sleep(4000);
		
		
		driver.findElement(By.id("s2id_billing_state")).click();
		

		driver.findElement(By.xpath("//*[text()='Tamil Nadu']")).click();
		
		driver.findElement(By.xpath("//input[@class='select2-input']")).click();
		
		WebElement c1=driver.findElement(By.id("billing_postcode"));
		
		c1.click();
		
		c1.sendKeys("638901");

		driver.findElement(By.id("createaccount")).click();

		driver.findElement(By.id("account_password")).sendKeys("Kavinkumar@20");

		driver.findElement(By.id("place_order")).click();

		Thread.sleep(3000);
		
	}		
}
