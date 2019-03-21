import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hwlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rus\\eclipse-workspace\\Exercise-\\Driver\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	
	     List<WebElement> xy= driver.findElements(By.tagName("a"));
	     System.out.println(xy.size());
	     
	     int t = xy.size();
	     
	     if(t==54) {
	   System.out.println("all count is ok");	 
	     }
	     else { 
	    	 System.out.println("something is wrong");
	     }
	
	     for(int i=0;i<=xy.size();i++) {
		System.out.println(xy.get(i).getText());
	}
	     
	
	
	
	}
	
	

}
