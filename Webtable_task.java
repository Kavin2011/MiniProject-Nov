package selenium_task;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Webtable_task {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.softwaretestingo.com/handle-static-web-table-in-selenium/");

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		String title = driver.getTitle();
		System.out.println(title);

		Actions a = new Actions(driver);

		WebElement j1 = driver.findElement(By.tagName("tbody"));

		a.moveToElement(j1).perform();

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		List<WebElement> rows = j1.findElements(By.tagName("tr"));

		int s = rows.size();

		System.out.println(s);

		System.out.println("*********************");

		for (int i = 2; i < 8; i++) {
			
			WebElement j = driver.findElement(By.xpath("//tbody/tr[" +i +"] /td[3]"));
			
			List<WebElement> rows3 = driver.findElements(By.xpath("//tbody/tr[" + i + "]"));	
			
			if (j.getText().equals("JAVA")) {
				
				for (WebElement w1 : rows3) {
					
					System.out.println(w1.getText() + " ");
				}
				break;
			}
		}
	}
}
