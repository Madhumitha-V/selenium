package seleniumTool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement email=driver.findElement(By.id("email"));
	email.sendKeys("ranbir");
	WebElement pas=driver.findElement(By.id("pass"));
	pas.sendKeys("alia");
	WebElement log=driver.findElement(By.id("loginbutton"));
	log.click();
	}
	}

