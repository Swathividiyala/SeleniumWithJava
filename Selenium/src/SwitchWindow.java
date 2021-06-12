import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		String field1=driver.findElement(By.xpath("/html/body/div[2]/div[1]/fieldset/legend")).getAttribute("textContent");
		System.out.println(field1);
		Thread.sleep(2000);
		driver.findElement(By.id("openwindow")).click();

	}

}
