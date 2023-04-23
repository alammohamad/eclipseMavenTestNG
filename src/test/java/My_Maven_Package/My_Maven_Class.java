package My_Maven_Package;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class My_Maven_Class {
	WebDriver driver;

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\browserdriver\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		//WebDriver driver = new ChromeDriver();
		//driver= new FirefoxDriver();
		//Used to get a lot of errors and chome open and stay there
		// https://stackoverflow.com/questions/75678572/java-io-ioexception-invalid-status-code-403-text-forbidden
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
				
		 WebElement textBox = driver.findElement(By.id("APjFqb"));
		 textBox.sendKeys("Selenium");
		 textBox.sendKeys(Keys.ENTER);
		 driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/a/h3")).click();		 
		 String actualTitle = driver.getTitle();
		 String expectedTitle = "Selenium";
		 assertEquals(expectedTitle, actualTitle);
		 System.out.println("actualTitle....: " + actualTitle + "    expectedTitle.....: " + expectedTitle);
		 		
		driver.close();

	}

}
