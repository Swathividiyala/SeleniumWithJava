import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableTest {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		String field1=driver.findElement(By.xpath("/html/body/div[3]/div[1]/fieldset/legend")).getAttribute("textContent");
		System.out.println(field1);
		driver.findElement(By.name("courses"));
		//driver.switchTo().frame(frame1);
		List<WebElement> rowcount=driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr"));
		int size=rowcount.size();
		System.out.println(size);
		
		List<WebElement> columncount=driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr[2]/td"));
		int size1=columncount.size();
		System.out.println(size1);
		
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"product\"]/tbody/tr[2]/td[1]")).getText());
		
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=size1;j++)
{
	//System.out.print(driver.findElement(By.xpath("//*[@id=\"product\"]/tbody/tr["+ i + "]/td["+ j + "]")).getText()+ "  ");
	System.out.print(driver.findElement(By.xpath("//*[@id='product']/tbody/tr["+ i + "]/td["+ j + "]")).getText()+ "  ");
	
}
		}
			System.out.println();
			
		}
	}
		





