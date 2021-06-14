import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		String field1=driver.findElement(By.xpath("/html/body/div[1]/div[3]/fieldset/legend")).getAttribute("textContent");
	    System.out.println(field1);
	    Select select= new Select(driver.findElement(By.id("dropdown-class-example"))); 
	    select.selectByValue("option1");
	    Thread.sleep(500);
	    select.selectByVisibleText("Option2");
	    Thread.sleep(500);
	    select.selectByIndex(3);
	    
	}

}
