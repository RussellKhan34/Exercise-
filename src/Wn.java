import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rus\\eclipse-workspace\\Exercise-\\Driver\\chromedriver.exe");
		WebDriver x = new ChromeDriver(); // referance of class
		x.get("https://jqueryui.com/");
	}

}
