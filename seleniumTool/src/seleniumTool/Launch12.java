package seleniumTool;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch12 {
	private static final String List = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement gmail=driver.findElement(By.name("q"));
	gmail.sendKeys("java");
	gmail.click();
	Thread.sleep(2000);
	
	List<WebElement> Search=driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]/li"));
	for(WebElement name:Search)
	{
		System.out.println(name.getText());
	}
	//gmail.sendKeys("java",Keys.ENTER);
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//div/a[contains(.,'Images')]")).click();
	//driver.findElement(By.xpath("//img[@id=\"rT8rqQKh8jt3DM:\"]")).click();
	
	

}}
