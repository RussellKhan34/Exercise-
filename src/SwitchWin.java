import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DevilR\\eclipse-workspace\\Selenium\\Jars\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en-GB&flowName=GlifWebSignIn&flowEntry=SignUp");
		  
		  driver.manage().window().maximize();
		  
		  WebElement st=driver.findElement(By.linkText("Help"));
		  boolean bl = st.isDisplayed();
		  
		  if (bl) {
			   System.out.println("Title is correct");
			  }
			  else {
			   System.out.println("Title is not correct");
			  }
			  
			  WebElement ab=driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[2]/a"));
			  boolean bll = st.isDisplayed();
			  
			  if (bll) {
			   System.out.println("Title is correct");
			  }
			  else {
			   System.out.println("Title is not correct");
			  }
			  
			  WebElement bc=driver.findElement(By.partialLinkText("Terms"));
			  boolean blll = st.isDisplayed();
			  
			  if (blll) {
			   System.out.println("Title is correct");
			  }
			  else {
			   System.out.println("Title is not correct");
			  }
			  
			  driver.findElement(By.linkText("Help")).click();
			  driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[2]/a")).click();
			  driver.findElement(By.partialLinkText("Terms")).click();
			  
			  Thread.sleep(6000);
			  Set<String> win = driver.getWindowHandles();
			  
			  Iterator<String> it = win.iterator();
			  String parentwindow = it.next();
			  String Firstchildwindow = it.next();
			  String Secondchildwindow = it.next();
			  String Thirdchildwindow = it.next();
			  
			  System.out.println(driver.getTitle());
			  
			  
			  driver.switchTo().window(Firstchildwindow);
			  System.out.println(driver.getTitle());
			  
			  driver.switchTo().window(Thirdchildwindow);
			  System.out.println(driver.getTitle());

	}

}
