package test.case013;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		//To verify the eazydiner functionality from a list  of hotels page in book a table
         
		// 1. We’ll start with initializing the browser driver
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\SASI\\Downloads\\chromedriver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.eazydiner.com/");
				
				String s= driver.getTitle();
				driver.findElement(By.cssSelector(".grey.block .padding-0.bucket.meal-bucket.h-100")).click();
				String s1 = driver.getTitle();
				driver.findElement(By.cssSelector(".w-2-12.padding-10.text-center.bd-right-grey-light.padding-l-20")).click();
				String s2 = driver.getTitle();
				if(s.equalsIgnoreCase(s1)) {
				Assert.assertEquals(true, false);
				}
				else {
					Assert.assertEquals(true, true);
				}
				if(s.equalsIgnoreCase(s2)) {
					Assert.assertEquals(true, true);
					}
				else {
					Assert.assertEquals(true, false);
				}
				driver.quit();
	}

}

