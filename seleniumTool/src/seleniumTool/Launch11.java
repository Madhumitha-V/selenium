package seleniumTool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement gmail=driver.findElement(By.xpath("//label[@for='email']"));
        System.out.println(gmail.getText());
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(gmail.getText());
        WebElement gmail1=driver.findElement(By.xpath("//label[@for=\"pass\"]"));
        System.out.println(gmail1.getText());
        driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys(gmail1.getText());
        
        
}}
