package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AssignmentTestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Setup the chrome driver
		WebDriverManager.chromedriver().setup(); //WebDriverManager used to launch the browser. It's in pom.xml

		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver(); 

		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//To maximize the browser
		driver.manage().window().maximize();
	
	//To get title
		String title = driver.getTitle();
		System.out.println(title);
		
//Enter the login details
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Find Contacts")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
		driver.findElement(By.className("x-btn-text")).click();
		driver.close();
		
		
	}
	

}
