package selenium_task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Pro2 {



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

		//  driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("billing_first_name")).sendKeys("Kavin");

		driver.findElement(By.id("billing_last_name")).sendKeys("Kumar");

		driver.findElement(By.id("billing_company")).sendKeys("CTS");

		driver.findElement(By.id("billing_email")).sendKeys("Kavin20@gmail.com");

		driver.findElement(By.id("billing_phone")).sendKeys("9786633166");

		WebElement country=driver.findElement(By.xpath("//*[@id='select2-chosen-1']"));

		country.click();

		driver.findElement(By.xpath("//div[text()='India']")).click();

		//    driver.findElement(By.xpath("//a[contains(text(),'India')")).click();

		//  driver.findElement(By.xpath("//div[@id='select2-result-label-1386']")).click();

		//   country.sendKeys("India");



		//    Select c1=new Select(country);

		//    c1.selectByValue("1");



		//WebElement country=driver.findElement(By.id("select2-chosen-1"));

		//  Select c1= new Select(country);

		//    c1.selectByValue("1");

		Thread.sleep(3000);

		driver.findElement(By.id("billing_address_1")).sendKeys("Mowlivakkam Porur");

		driver.findElement(By.id("billing_address_2")).sendKeys("Tamarai Flats");

		driver.findElement(By.id("billing_city")).sendKeys("CHENNAI");


		//    driver.findElement(By.xpath("//*[@id=\"s2id_billing_state\"]/a/span[2]/b")).click();


		// WebElement state=driver.findElement(By.xpath("//*[@id='select2-chosen-2']"));

		//state.click();

		//  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/form[3]/div[1]/div[1]/div/p[10]/div/a/span[1]")).click();

		//    driver.findElement(By.xpath("//span[@id=\"select2-chosen-2\"]")).click();

		//     driver.findElement(By.xpath("//span[text()='Tamil Nadu']")).click();

		//   WebElement b1=driver.findElement(By.xpath("//*[@id=\"s2id_billing_state\"]/a/span[2]/b"));

		driver.findElement(By.xpath("//div[@id=\"s2id_billing_state\"]")).click();

		driver.findElement(By.xpath("//*[text()='Andhra Pradesh']")).click();



		//	   Select button=new Select(b1);

		//	   button.selectByVisibleText("Andhra Pradesh");



		//   driver.findElement(By.xpath("//*[text()='Andhra Pradesh']")).click();

		//   WebElement state=driver.findElement(By.id("billing_state"));

		//   Select c2= new Select(state);

		//   c2.selectByVisibleText("Andhra Pradesh");

		driver.findElement(By.id("billing_postcode")).sendKeys("600116");

		driver.findElement(By.id("createaccount")).click();

		driver.findElement(By.id("account_password")).sendKeys("Kavinkumar@20");

		driver.findElement(By.id("place_order")).click();

		Thread.sleep(3000);










	}


}