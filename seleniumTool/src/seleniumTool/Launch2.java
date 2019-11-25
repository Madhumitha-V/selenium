package seleniumTool;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//WebElement gmail=driver.findElement(By.tagName("input"));
		//gmail.sendKeys("madhuneemo@gmail.com",Keys.ENTER);
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		Thread.sleep(2000);
		List<WebElement> menu=driver.findElements(By.xpath("//ul[@class=\"_114Zhd\"]"));
		for(WebElement name:menu)
		{
			System.out.println(name.getText());
		}
		//List<WebElement> menu=driver.findElements(By.xpath("//span[contains(.,'Electronics')]/parent::li/descendant::a[@title='Mi']");
		//for(WebElement name:menu)
		//{
		//	System.out.println(name.getText());
		//}
		
		
	}

}
