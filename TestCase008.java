package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCase008 {

	public static void main(String[] args) {
		// To verify the pay bill functionality in book a table
        
		// 1. We’ll start with initializing the browser driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SASI\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.eazydiner.com/");
		
		
		driver.findElement(By.cssSelector(".grey.block .padding-0.bucket.meal-bucket.h-100")).click();
		driver.findElement(By.cssSelector(".text-center.margin-t-10 .btn.payeazy_bill.outline_btn.height-40.block.bold.padding-10.font-14.apxor_click")).click();
		String t1=driver.findElement(By.cssSelector(".block.font-17.grey-dark.bold.text-center")).getText();
		String t="Pay Bill here";
		Assert.assertEquals(t1, t);
		driver.quit();

	}

}
