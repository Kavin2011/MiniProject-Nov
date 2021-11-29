package selenium_task;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drag_Drop {

	public static void main(String[] args) throws Throwable {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	    
	    driver.get("http://demo.automationtesting.in/Static.html");
	    
	    String currentUrl = driver.getCurrentUrl();
	    
	    System.out.println(currentUrl);
	    
	    String title = driver.getTitle();
	    System.out.println(title);
		  
	    WebElement a = driver.findElement(By.id("angular"));
	    
	    WebElement b = driver.findElement(By.id("mongo"));
	    
	    WebElement c = driver.findElement(By.id("node"));
	    
	    WebElement d = driver.findElement(By.id("droparea"));
	    
	    Thread.sleep(2000);
	    
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("function createEvent(typeOfEvent) {\n" +"var event =document.createEvent(\"CustomEvent\");"
	    		+ "\n" +"event.initCustomEvent(typeOfEvent,true, true, null);\n" +"event.dataTransfer = {\n" +"data: {},\n" 
	    		+"setData: function (key, value) {\n" +"this.data[key] = value;\n" +"},\n" 
	    		+"getData: function (key) {\n" +"return this.data[key];\n" +"}\n" +"};\n" +"return event;\n" +"}\n" 
	    		+"\n" +"function dispatchEvent(element, event,transferData) {\n" +"if (transferData !== undefined) {\n" 
	    		+"event.dataTransfer = transferData;\n" +"}\n" +"if (element.dispatchEvent) {\n" 
	    		+ "element.dispatchEvent(event);\n" +"} else if (element.fireEvent) {\n" +"element.fireEvent(\"on\" "
	    				+ "+ event.type, event);\n" +"}\n" +"}\n" +"\n" +"function simulateHTML5DragAndDrop(element, destination) "
	    						+ "{\n" +"var dragStartEvent =createEvent('dragstart');\n" +"dispatchEvent(element, dragStartEvent);"
	    								+ "\n" +"var dropEvent = createEvent('drop');\n" 
	    						+"dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n" 
	    								+"var dragEndEvent = createEvent('dragend');\n" 
	    						+"dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" 
	    								+"}\n" +"\n" +"var source = arguments[0];\n" +"var destination = arguments[1];\n" 
	    						+"simulateHTML5DragAndDrop(source,destination);",a, d);
	    Thread.sleep(2000);
	    
	    js.executeScript("function createEvent(typeOfEvent) {\n" +"var event =document.createEvent(\"CustomEvent\");"
	    		+ "\n" +"event.initCustomEvent(typeOfEvent,true, true, null);\n" +"event.dataTransfer = {\n" +"data: {},\n" 
	    		+"setData: function (key, value) {\n" +"this.data[key] = value;\n" +"},\n" 
	    		+"getData: function (key) {\n" +"return this.data[key];\n" +"}\n" +"};\n" +"return event;\n" +"}\n" 
	    		+"\n" +"function dispatchEvent(element, event,transferData) {\n" +"if (transferData !== undefined) {\n" 
	    		+"event.dataTransfer = transferData;\n" +"}\n" +"if (element.dispatchEvent) {\n" 
	    		+ "element.dispatchEvent(event);\n" +"} else if (element.fireEvent) {\n" +"element.fireEvent(\"on\" "
	    				+ "+ event.type, event);\n" +"}\n" +"}\n" +"\n" +"function simulateHTML5DragAndDrop(element, destination) "
	    						+ "{\n" +"var dragStartEvent =createEvent('dragstart');\n" +"dispatchEvent(element, dragStartEvent);"
	    								+ "\n" +"var dropEvent = createEvent('drop');\n" 
	    						+"dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n" 
	    								+"var dragEndEvent = createEvent('dragend');\n" 
	    						+"dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" 
	    								+"}\n" +"\n" +"var source = arguments[0];\n" +"var destination = arguments[1];\n" 
	    						+"simulateHTML5DragAndDrop(source,destination);",b, d);
	    Thread.sleep(2000);
	    
	    js.executeScript("function createEvent(typeOfEvent) {\n" +"var event =document.createEvent(\"CustomEvent\");"
	    		+ "\n" +"event.initCustomEvent(typeOfEvent,true, true, null);\n" +"event.dataTransfer = {\n" +"data: {},\n" 
	    		+"setData: function (key, value) {\n" +"this.data[key] = value;\n" +"},\n" 
	    		+"getData: function (key) {\n" +"return this.data[key];\n" +"}\n" +"};\n" +"return event;\n" +"}\n" 
	    		+"\n" +"function dispatchEvent(element, event,transferData) {\n" +"if (transferData !== undefined) {\n" 
	    		+"event.dataTransfer = transferData;\n" +"}\n" +"if (element.dispatchEvent) {\n" 
	    		+ "element.dispatchEvent(event);\n" +"} else if (element.fireEvent) {\n" +"element.fireEvent(\"on\" "
	    				+ "+ event.type, event);\n" +"}\n" +"}\n" +"\n" +"function simulateHTML5DragAndDrop(element, destination) "
	    						+ "{\n" +"var dragStartEvent =createEvent('dragstart');\n" +"dispatchEvent(element, dragStartEvent);"
	    								+ "\n" +"var dropEvent = createEvent('drop');\n" 
	    						+"dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n" 
	    								+"var dragEndEvent = createEvent('dragend');\n" 
	    						+"dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" 
	    								+"}\n" +"\n" +"var source = arguments[0];\n" +"var destination = arguments[1];\n" 
	    						+"simulateHTML5DragAndDrop(source,destination);",c, d);
	    
	    Thread.sleep(1500);
	    
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File k = t.getScreenshotAs(OutputType.FILE);
			
		File l = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\dragddrop.png");
			
		FileUtils.copyFile(k, l);
	    
	    driver.quit();
	}
}


