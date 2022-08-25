import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class DriverSetUp {
	public static void Browser(String value) {
		value=value.trim();
		System.out.println(value);
	 if (value=="Chrome") {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.opencart.com/index.php?route=cms/download");
	 }
	 else {
		 System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\Desktop\\msedgedriver.exe");
		 WebDriver driver= new EdgeDriver();
		 driver.get("https://www.opencart.com/index.php?route=cms/download");
	 }
	
	
	}
}
