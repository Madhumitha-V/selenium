package seleniumTool;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shirt",Keys.ENTER);
		
		//Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("https://assets.myntassets.com/dpr_2,q_60,w_210,c_limit,fl_progressive/assets/images/7189947/2018/8/30/b0a17130-00b2-47dd-9acf-75fcdf7333111535614137835-Bene-Kleed-Men-Off-White--Blue-Slim-Fit-Printed-Casual-Shirt-3181535614137565-1.jpg"));
		search.click();
		ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
				driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(tabs.get(0));
}}
