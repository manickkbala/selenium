package mip;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Training {
	static
	{
		System.setProperty("webdriver.gecko.driver", "/Users/bala/Desktop/Insurance/mip/mip_libraries/geckodriver");

	}

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.gecko.driver", "/Users/bala/Desktop/Insurance/mip/mip_libraries/geckodriver");
		WebDriver driver = new FirefoxDriver();
		//driver.get("file:///Users/bala/Desktop/training.html");
		driver.get("https://foodrx.3tandai.com/login");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("bala@digbihealth.com");
		
		Thread.sleep(5000);
				
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("bala123");
		
		Thread.sleep(5000);
	

		 WebElement ele = driver.findElement(By.xpath("//button[@class=\"mobile-button noTextSelect\"]"));
		ele.click();
		
		Thread.sleep(9000);

		String title = driver.getTitle();
		System.out.println("the page title is "+ title);
		
		if(title.equals("Dashboard"))
		{
			System.out.println("success");
		}
		else
		{
			System.out.println("false");
		}
		
		//To get the current url
		//String url = driver.getCurrentUrl();
		//System.out.println("The current url is  :" +url);
		
		//To get the current page title:
		//String title = driver.getTitle();
		//System.out.println("The current title is : " + title);
		
		//To get the current page source is:
		//String ps = driver.getPageSource();
		//System.out.println("The current page source is : " + ps);

		//driver.findElement(By.tagName("input"));
		// WebElement ele = driver.findElement(By.xpath("//input[@type = 'text' and @id = 'abc']"));
		 
		 //driver.findElement(By.id("abc")).;
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
