import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
       WebElement element=driver.findElement(By.xpath("//*[@id=\"mousehover\"]"));
       Actions action=new Actions(driver);
       action.moveToElement(element).perform();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.findElement(By.xpath("//a[text()='Top']")).click();
       driver.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[2]")).click();
       //driver.quit();
     
	}

}
