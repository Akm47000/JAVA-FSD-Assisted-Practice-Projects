import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RegistrationForm {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver",  "E:\\\\Tools and Softwares\\\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&prevRID=DS045WW0MB0CK9M5HA8B&openid.assoc_handle=inflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&mobileBrowserWeblabTreatment=C");
		
		//name
		WebElement name= driver.findElement(By.id("ap_customer_name"));
		name.sendKeys("Akanksh Mulka");
		
		//email
		WebElement email= driver.findElement(By.id("ap_phone_number"));
		email.sendKeys("9000951430");
		
		//mobile
		WebElement mobile= driver.findElement(By.id("ap_email"));
		mobile.sendKeys("akm74000@gmail.com");
		
		
		//password
		WebElement password= driver.findElement(By.id("ap_password"));
		password.sendKeys("masthiG321");
		
		//button
		WebElement register= driver.findElement(By.id("continue"));
		register.click();
		Thread.sleep(20000);
		
	}

}
