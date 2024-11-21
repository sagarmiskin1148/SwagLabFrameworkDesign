package Spack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shank\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
