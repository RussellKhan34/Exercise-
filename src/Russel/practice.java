package Russel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdjal\\Desktop\\QA Course\\practice1\\Jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en-GB&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.linkText("Terms")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(3000);
		
		Set<String>apple=driver.getWindowHandles();
		Iterator<String>itr=apple.iterator();
		String windowHome=itr.next();
		String window1Terms=itr.next();
		String window2Privacy=itr.next();
		String window3Help=itr.next();


		driver.switchTo().window(window2Privacy);
		System.out.println(driver.getTitle());
		driver.switchTo().window(window1Terms);
		driver.switchTo().window(window3Help);
		System.out.println(driver.getTitle());

	}

}
