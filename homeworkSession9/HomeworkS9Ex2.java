package homeworkSession9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkS9Ex2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.qaevolution.com/websandbox.html");
		
		WebElement iframe = driver.findElement(By.id("IF2"));
		driver.switchTo().frame(iframe);
		
		WebElement iFrameText = driver.findElement(By.cssSelector("body > header > div > div > div.logo > h1 > a"));
		System.out.println("The header of iFrame2 is: " + iFrameText.getText());
		
		driver.quit();
		
		
		

	}

}
