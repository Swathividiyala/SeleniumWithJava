import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWaitSyncranization {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		WebElement move=driver.findElement(By.xpath("//*[@id='mainContent']/div[1]/ul/li[3]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(move).perform();
		WebDriverWait driver1=new WebDriverWait(driver, 20);
		driver1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='mainContent']/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[3]/a"))).click();

}
}
