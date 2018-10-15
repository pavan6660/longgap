package seleniumpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class practice1 
{
	WebDriver driver;
	
	@Test
public void pavan() throws Exception
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\A PAVAN\\Desktop\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	WebElement ele =driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[1]/span"));
	Actions act =new Actions(driver);
	act.moveToElement(ele).click().build().perform();
	Thread.sleep(3000);
	/*List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println("No.of links"+links.size());
	for(int i=0;i<=links.size();i++)
	{
		System.out.println(links.get(i).getText());	
		}
	Thread.sleep(3000);*/

driver.close();
}
}