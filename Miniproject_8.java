package selenium_task;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Miniproject_8 {
	
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");
		
		String s1=driver.getCurrentUrl();
		
		System.out.println(s1);
		
		String s2=driver.getTitle();
		
		System.out.println(s2);
				
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("Kavinkumar20");
		
		driver.findElement(By.id("password")).sendKeys("Kavin@2011");
		
		driver.findElement(By.id("login")).click();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		WebElement w1=driver.findElement(By.xpath("//*[@class='login_title']"));
		
		String s3=w1.getText();
		
		System.out.println(s3);
		
		Thread.sleep(2000);
		
		WebElement location= driver.findElement(By.id("location"));
		
		Select a1 = new Select(location);
		
		a1.selectByIndex(5);
		
		System.out.println("Location : " +location.getAttribute("value"));
		
		Thread.sleep(2000);
		
		WebElement hotels= driver.findElement(By.id("hotels"));
		
		Select a2 = new Select(hotels);
		
		a2.selectByIndex(1);
		
		System.out.println("Hotels: " +hotels.getAttribute("value"));
		
		Thread.sleep(2000);
		
		WebElement room= driver.findElement(By.id("room_type"));
		
		Select a3 = new Select(room);
		
		a3.selectByIndex(1);
		
		System.out.println("Room Type: " +room.getAttribute("value"));
		
		WebElement roomnum= driver.findElement(By.id("room_nos"));
		
		Select a4 = new Select(roomnum);
		
		a4.selectByValue("2");
		
		System.out.println("Number of Rooms: " +roomnum.getAttribute("value"));
		
		Thread.sleep(2000);
		
		WebElement datein=driver.findElement(By.xpath("//*[@id='datepick_in']"));
		
		datein.clear();
		
		Thread.sleep(2000);
		
		datein.sendKeys("29/11/2021");
		
		System.out.println("Check In Date: " +datein.getAttribute("value"));
		
		WebElement dateout=driver.findElement(By.xpath("//*[@id='datepick_out']"));
		
		dateout.clear();
		
		Thread.sleep(2000);
		
		dateout.sendKeys("30/11/2021");
		
		
				
		System.out.println("Check Out Date: " +dateout.getAttribute("value"));
		
		WebElement adult= driver.findElement(By.id("adult_room"));
		
		Select a7 = new Select(adult);
		
		a7.selectByValue("2");
		
		System.out.println("Adults per Room: " +adult.getAttribute("value"));
		
		Thread.sleep(2000);
		
		WebElement child= driver.findElement(By.id("child_room"));
		
		Select a8 = new Select(child);
		
		a8.selectByValue("1");
		
		System.out.println("Children per Room: " +child.getAttribute("value"));
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("Submit")).click();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.findElement(By.id("radiobutton_0")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("continue")).click();
		
		Thread.sleep(2000);
		
		WebElement first= driver.findElement(By.id("first_name"));
		
		first.sendKeys("Kavin");
		
		System.out.println("First Name: " +first.getAttribute("value"));
		
		WebElement last= driver.findElement(By.id("last_name"));
		
		last.sendKeys("Kumar");
		
		System.out.println("Last Name: " +last.getAttribute("value"));
		
		WebElement address= driver.findElement(By.id("address"));
		
		address.sendKeys("Porur Chennai");
		
		System.out.println("Billing Address: " +address.getAttribute("value"));
		
		WebElement cc= driver.findElement(By.id("cc_num"));
		
		cc.sendKeys("4231879823127898");
		
		WebElement ccnum= driver.findElement(By.id("cc_type"));
		
		Select e1 = new Select(ccnum);
		
		e1.selectByIndex(2);
		
		Thread.sleep(2000);
		
		WebElement month= driver.findElement(By.id("cc_exp_month"));
		
		Select e2 = new Select(month);
		
		e2.selectByValue("7");
		
		Thread.sleep(2000);
		
		WebElement year= driver.findElement(By.id("cc_exp_year"));
		
		Select e3 = new Select(year);
		
		e3.selectByValue("2022");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("cc_cvv")).sendKeys("921");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("book_now")).click();
			
		Thread.sleep(4000);
		
		driver.findElement(By.id("my_itinerary")).click();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File c = t.getScreenshotAs(OutputType.FILE);
			
		File d = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\hotelbooksc_click.png");
			
		FileUtils.copyFile(c, d);
			
		Thread.sleep(4000);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}

}