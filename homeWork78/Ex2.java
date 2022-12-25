package homeWork78;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://workoglobe.com/");
		
		driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/div[2]/div[2]/div[2]/div/form/input")).sendKeys("QA Engineer");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/div[2]/div[2]/div[2]/div/form/input")).submit();
		Thread.sleep(1000);
		
		
		driver.quit();

	}

}
