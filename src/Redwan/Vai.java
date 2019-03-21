package Redwan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vai {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rus\\eclipse-workspace\\Exercise-\\Driver\\chromedriver.exe");
		WebDriver x = new ChromeDriver(); // referance of class
		x.get("https://www.facebook.com/");
		x.manage().window().maximize();
	    x.findElement(By.xpath("//input[@type='email']")).sendKeys("raselkhan6934@yahoo.com");
	    x.findElement(By.xpath("//input[@id='pass']")).sendKeys("890000kr");
	    x.findElement(By.xpath("//input[@id='u_0_2']")).click();

	    
	
	
	
	
	
	
	}
}
