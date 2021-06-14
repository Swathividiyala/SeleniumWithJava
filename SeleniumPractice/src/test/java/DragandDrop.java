import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		WebElement drag=driver.findElement(By.id("sourceImage"));
		WebElement drop= driver.findElement(By.id("targetDiv"));
		Actions af =new Actions(driver);
	    /*af.moveToElement(drag);
	    af.moveToElement(drop);
	    af.release();
	    af.perform();*/
		af.dragAndDrop(drag, drop).perform();
		driver.quit();
	}

}

