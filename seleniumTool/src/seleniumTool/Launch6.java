package seleniumTool;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.log.Log;

public class Launch6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement gmail=driver.findElement(By.name("q"));
	gmail.sendKeys("java",Keys.ENTER);
	
	
	
	
	
	//Thread.sleep(2000);
	//gmail.sendKeys("java",Keys.ENTER);
	
	//driver.findElement(By.name("password")).sendKeys("alya",Keys.ENTER);
	//WebElement pas=driver.findElement(By.name("password"));
	//pas.sendKeys("efbwhbf",Keys.ENTER);

}}
