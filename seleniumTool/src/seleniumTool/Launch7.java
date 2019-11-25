package seleniumTool;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement gmail=driver.findElement(By.name("q"));
	gmail.sendKeys("java",Keys.ENTER);
	WebElement clear=driver.findElement(By.name("q"));
	clear.clear();
	Thread.sleep(2000);
	WebElement gmail1=driver.findElement(By.name("q"));
	gmail1.sendKeys("selenium",Keys.ENTER);
	driver.navigate().back();
	driver.navigate().forward();
	
	

}}
