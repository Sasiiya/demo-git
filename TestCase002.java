package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCase002 {

	public static void main(String[] args) {
		// To verify the user able to change the location
		// 1. We’ll start with initializing the browser driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SASI\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.eazydiner.com/");
		
		driver.findElement(By.cssSelector("#srchbar")).click();
		String s1=driver.findElement(By.cssSelector("a[data-city='Chennai'] .lh-25.semi-bold.regular.grey")).getText();
		driver.findElement(By.cssSelector("a[data-city='Chennai']")).click();
		String s=driver.findElement(By.cssSelector("#city-name")).getText();
		System.out.println(s);
		System.out.println(s1);
		Assert.assertEquals(s, s1);		
		driver.quit();

	}

}