package testpackage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class firstprogram{
	
	
	 @Test
	 public void testcase001() {
		  
		  
		  WebDriver driver = WebDriverManager.chromedriver().create();
		  driver.manage().window().maximize(); 
		  driver.get("https://www.google.com/");
		  
		  }

}
