package seleniumTool;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.className("google-auth")).sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@data-gaaction=\"popup.auth.close\"]")).click();
		//WebElement d= driver.findElement(By.xpath("//li[@class='topnav_item diningunit']"));
		//System.out.println(d.getText());
		//driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys(d.getText());
		List<WebElement> menu=driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]"));
		for(WebElement name:menu)
		{
			System.out.println(name.getText());
		}
		//List<WebElement> menu=driver.findElements(By.xpath(""));
		//span[contains(.,'Sale')]/parent::li/descendant::span[contains(.,'Sofas')]
}}
