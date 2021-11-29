package selenium_task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.instagram.com/");
		
		driver.navigate().back();
		
		driver.navigate().to("https://www.youtube.com/");
		
		String t=driver.getTitle();
		
		System.out.println(t);
		
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		
		driver.navigate().back();
		
		driver.navigate().to("https://twitter.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
        String v=driver.getTitle();
		
		System.out.println(v);
		
		String c=driver.getCurrentUrl();
		
		System.out.println(c);
		
		driver.close();
		
			
		
	}

}
