package mip;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findelements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty ("webdriver.gecko.driver", "/Users/bala/Desktop/Insurance/mip/mip_libraries/geckodriver");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		List<WebElement> ele = driver.findElements(By.xpath("//a"));
		int count = ele.size();
		System.out.println("the count s :"+ count);
		
		for(int i = 0; i<count ; i++)
		{
			WebElement aa = ele.get(i);
			String bb = aa.getText();
			System.out.println(bb);
			Point bc = aa.getLocation();
			System.out.println("the location of  " + bb + " is :" + bc);
		}
		
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		System.exit(0);
	}

}
