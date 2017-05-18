package octo.calc.automate;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class JMeterSeleniumDemoTest{
   @Test
   public void test02Chrome(){
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://ec2-54-219-133-160.us-west-1.compute.amazonaws.com:8080/Calculator/");
		System.out.println("Chrome browser opened and navigated to Tomcat site");
		driver.quit();
	}
}