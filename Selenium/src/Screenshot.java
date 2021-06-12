import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
		Date dt=new Date(0);
		String date=dFormat.format(dt);
		System.out.println(date);
		//System.out.println(dt);
		String ss=date.toString().replace(" ", "-").replace(":", "-");
		System.out.println(ss);
		//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		File screenshort=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshort, new File(".//screenshot//" + ss + ".png"));

	}

}
