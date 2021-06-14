//import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxTest {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		String field1=driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/fieldset/legend")).getAttribute("textContent");
		System.out.println(field1);
		/*driver.findElement(By.name("checkBoxOption1")).click();
		//Deselect the checkbox
		driver.findElement(By.name("checkBoxOption1")).click();
		Thread.sleep(500);
		driver.findElement(By.name("checkBoxOption2")).click();
		Thread.sleep(500);
		driver.findElement(By.name("checkBoxOption3")).click();
		driver.findElement(By.name("checkBoxOption3")).getSize();
		List<WebElement> count=driver.findElements(By.xpath("//input[@type='checkbox']"));
		int countofcheckboxes=count.size();
		System.out.println(countofcheckboxes);
		*/
		
		 int a = driver.findElements(By.xpath("//input [@type='checkbox']")).size();  
	     System.out.println(a);  
	     for(int i=1;i<=a;i++)  
	     {  
	         driver.findElements(By.xpath("//input[@type='checkbox']")).get(2).click();  
	     } 

	}

}
