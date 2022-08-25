import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Select the browser type :"+ "\n" +"  1.Chrome" + "\n" + "  2.Edge");
		Scanner sc=new Scanner(System.in);
		String value=sc.nextLine();
		System.out.println(value);
		DriverSetUp.Browser(value);
		

	}

}
