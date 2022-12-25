package homeWork78;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://google.com/");
		
		String URL = "https://google.com";
		
		String actualUrl = driver.getCurrentUrl();
		if(actualUrl.equals(URL))
		System.out.println("Test passed!");
		else { 
		System.out.println("Test failed!");
		}
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Automation");
		Thread.sleep(1000);
		
		driver.quit();
		
	}

}
