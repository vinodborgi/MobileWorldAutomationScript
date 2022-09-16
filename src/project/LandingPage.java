package project;
import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Test;

public class LandingPage {
    WebDriver driver;
    public LandingPage(WebDriver driver)
    {
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
     
    }
  
//Inspected HomePage WebElements--------------------------------------------------------
	@FindBy(css= "button[type='submit']")
  	WebElement signin;
	
	@FindBy(css= "a[href='signup.html']")
	WebElement signup;
	
//Inspected SignUp WebElements----------------------------------------------------------
	
	@FindBy(id= "myName")
	WebElement myName;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@placeholder='Enter Email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='date']")
	WebElement date;
	
	@FindBy(css = "div[class='col-md-2'] label")
	WebElement gender;
	
	@FindBy(xpath = "//input[@placeholder='91XXXXXXXXXX']")
	WebElement mobilenumber;
	
	@FindBy(xpath = "//textarea[@placeholder='Short Bio']")
	WebElement shortbio;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement register;
	
	
	//Inspected SignIn WebElements--------------------------------------------------------------
	
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement pass;
	
	@FindBy(xpath = "//a[@type='submit']")
	WebElement login;
	
	
	//Inspectd SearchBox WebElements-------------------------------------------------

	@FindBy(xpath = "//a[normalize-space()='All Mobiles']")
	WebElement allmobiles;
	
	@FindBy(id = "myInput")
	WebElement search;
	
	@FindBy(xpath = "//tbody/tr[1]/td[5]/a[1]")
	WebElement order;
	
	public void goTo()
	{
		driver.get("https://mobileworld.banyanpro.com/");
	}
	
	
	//SignUp
	
	public void signupapplication(String fname, String lname, String emailid, String pass, String dob, String mobnum, String ShortBio) throws InterruptedException 
	{
		
		signin.click();
		signup.click();
		myName.sendKeys(fname);
		Thread.sleep(1000);
		lastname.sendKeys(lname);
		Thread.sleep(1000);
		email.sendKeys(emailid);
		Thread.sleep(1000);
		password.sendKeys(pass);
		Thread.sleep(1000);
		date.sendKeys(dob);
		Thread.sleep(1000);
		gender.click();
		Thread.sleep(1000);
		mobilenumber.sendKeys(mobnum);
		Thread.sleep(1000);
		shortbio.sendKeys(ShortBio);
		Thread.sleep(1000);
		register.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert(); // switch to alert
		alert.accept();
	}
	
	//SignIn
	
	public void signinapplication(String uname,String password) throws InterruptedException 
	{
		signin.click();
		username.sendKeys(uname);
		Thread.sleep(2000);
		pass.sendKeys(password);
		Thread.sleep(1000);
		login.click();
	}
	
	// ALLMobiles SearchBox
	
	public void searchbox(String searchtext) throws InterruptedException 
	{
		allmobiles.click();
		Thread.sleep(2000);
		search.sendKeys(searchtext);
		//order.click();
		
	}
	
}




