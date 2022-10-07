import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver",  "E:\\Tools and Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&prevRID=SDZSJZC3WSA2PPWPT0ZW&openid.assoc_handle=inflex&openid.mode=checkid_setup&failedSignInCount=0&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

		// email
		WebElement mail = driver.findElement(By.id("ap_email"));
		mail.sendKeys("9000951430");
		
		// button
		WebElement Login = driver.findElement(By.id("continue"));
		Login.click();

		// password
		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys("masthiG321");
		
		
		// button
		WebElement Login1 = driver.findElement(By.id("signInSubmit"));
		Login1.click();
		Thread.sleep(20000);

  }
}
