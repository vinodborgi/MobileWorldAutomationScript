import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Sign_Up {
	@Test
    public void signup() throws InterruptedException {
        // TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver","C:/Users/vinodkumar.borgi/Downloads/chromedriver_win32/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         Thread.sleep(2000);
         LandingPage landingpage2 = new LandingPage(driver);
         landingpage2.goTo();
         landingpage2.signupapplication("Vinod","Borgi","abc@gmail.com","abc123","03/01/1998","8618628949","Welcome to qualitest family");
    }
}

