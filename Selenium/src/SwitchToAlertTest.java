import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.server.handler.SendKeys;

public class SwitchToAlertTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		String field1=driver.findElement(By.xpath("/html/body/div[2]/div[3]/fieldset/legend")).getAttribute("textContent");
		System.out.println(field1);
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Testing");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
        driver.switchTo().alert().accept();
        driver.findElement(By.id("name")).sendKeys("Testing1");
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

	}

}
