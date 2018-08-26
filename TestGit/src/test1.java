import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {

	public static void main (String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.20.1-win32\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window();
		driver.get("https://www.facebook.com");	
	   
	}
}
