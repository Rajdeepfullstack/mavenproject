
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class firstprogram{
	
	
	 public static void main(String[] args) {
		  
		  
		  WebDriver driver = WebDriverManager.chromedriver().create();
		  driver.manage().window().maximize(); 
		  driver.get("https://www.google.com/");
		  
		  }

}
