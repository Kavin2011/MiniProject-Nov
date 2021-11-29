package selenium_task;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectable_Automation {
	
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");


		WebDriver driver=new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Selectable.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("(//a[@class='analystic']) [2]")).click();
		
		WebElement w1=driver.findElement(By.xpath("//*[@id=\"Serialize\"]/ul/li[4]"));
		
		w1.click();
		
		String s1=w1.getText();
		
		System.out.println(s1);
		
		WebElement w2=driver.findElement(By.xpath("//span[@id='result']"));
		
		String s2=w2.getText();
		
		System.out.println("You've selected: "+s2);

}

	
}