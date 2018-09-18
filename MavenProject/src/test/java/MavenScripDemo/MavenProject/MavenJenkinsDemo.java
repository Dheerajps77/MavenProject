package MavenScripDemo.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MavenJenkinsDemo 
{
	public static WebDriver driver;
	
	@Test
	public void Test1()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumJars\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}

}
