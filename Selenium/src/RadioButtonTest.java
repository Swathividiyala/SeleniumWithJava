import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		 String field=driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/legend")).getAttribute("textContent");
		 driver.manage().window().maximize(); 
		 System.out.println(field);
		 //driver.findElement(By.xpath("//input[@value='radio1']")).getAttribute("textContent");
		 driver.manage().window().maximize(); ;
		 //driver.findElement(By.xpath("//input[@value='radio2']")).click();
		 int a = driver.findElements(By.xpath("//input [@name='radioButton']")).size();  
	     System.out.println(a); 
	     for(int i=1;i<=a;i++)  
	     {  
	         driver.findElements(By.xpath("//input[@name='radioButton']")).get(0).click();  
	     } 
	     
	  	} 
		
	}


