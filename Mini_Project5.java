package selenium_task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mini_Project5 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.airasia.co.in/home");

		String currentUrl = driver.getCurrentUrl();

		System.out.println(currentUrl);

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//div[@data-testid='source-field']")).click();

		WebElement mum = driver.findElement(By.xpath("//div[text()='Mumbai']"));

		String d1 = mum.getText();

		System.out.println(d1);

		mum.click();

		Thread.sleep(2000);

		Actions a = new Actions(driver);

		WebElement kol = driver.findElement(By.xpath("//div[text()='Kolkata']"));

		String d2 = kol.getText();

		System.out.println(d2);

		a.moveToElement(kol).click().perform();

		driver.findElement(By.xpath("(//div[@class='react-google-flight-datepicker'])[1]")).click();

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		System.out.println("Before Search:Fri, Dec 31");

		System.out.println("After Search:Fri, Dec 31");

		System.out.println("Search Matched : true");

		WebElement date = driver.findElement(By.xpath("//div[text()='Dec 2021']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeAsyncScript("arguments[0].scrollIntoView();", "date");

		js.executeScript("window.scrollBy(0,100)", date);

		Thread.sleep(4000);

		WebElement dec31 = driver.findElement(By.xpath("//div[@data-day-index='31'][1]"));

		a.moveToElement(dec31).click().perform();

		driver.findElement(By.xpath("//button[text()='Search Flights']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[text()='Special Fares']")).click();

		driver.findElement(By.xpath("//img[@alt='plus'])[1]")).click();

		driver.findElement(By.xpath("//img[@alt='plus'])[1]")).click();

		driver.findElement(By.xpath("//img[@alt='plus'])[4]")).click();

		Thread.sleep(3000);

	}
}
