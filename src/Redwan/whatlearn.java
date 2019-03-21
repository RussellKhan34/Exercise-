package Redwan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class whatlearn {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rus\\eclipse-workspace\\Exercise-\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.findElement(By.xpath("//button[@id='u_0_u']")).getText());
		String st=driver.findElement(By.xpath("//button[@id='u_0_u']")).getText();
		
		if(st.equalsIgnoreCase("Sign Up")){
			System.out.println("Sign up text matched ");
		}
		else
		{
			System.out.println("Sign up did not matched");
		}
		
	}

	//*[@id="content"]/div/div/div/div/div[1]/div[1]/div[1]/img
		
		
	}            
