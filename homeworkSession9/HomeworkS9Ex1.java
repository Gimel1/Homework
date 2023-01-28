package homeworkSession9;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkS9Ex1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoqa.com/browser-windows");
		
		String mainWindowHandle = driver.getWindowHandle();
		
		WebElement newWindow = driver.findElement(By.id("windowButton"));
		
		for(int i=0; i<4;i++) {
			newWindow.click();
			}
		Set<String> allWindowHandles = driver.getWindowHandles();
		for(String child : allWindowHandles){
			if(!child.equalsIgnoreCase(mainWindowHandle));
			driver.switchTo().window(child);
			Thread.sleep(2000);
			driver.navigate().to("https://google.com");
			Thread.sleep(2000);
		
			}
			driver.quit();
			
		}
		

	}


