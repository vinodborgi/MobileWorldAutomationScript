package project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sign_In {


@Test
 public void signin() throws InterruptedException {
	
        // TODO Auto-generated method stub
	//public void signinscript() throws InterruptedException { 	
	   System.setProperty("webdriver.chrome.driver","C:/Users/vinodkumar.borgi/Downloads/chromedriver_win32/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         Thread.sleep(1000);   
         LandingPage landingPage3 = new LandingPage(driver);
         landingPage3.goTo();
         landingPage3.signinapplication("Vinod", "abc@123");
         Thread.sleep(3000);
         landingPage3.goTo();
         landingPage3.signinapplication("Vi", "abc@123");
    }
    
}

	