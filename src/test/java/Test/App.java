package Test;

import java.awt.Desktop.Action;
import java.net.Authenticator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App {

	WebDriver driver = new ChromeDriver();
	Actions action = new Actions(driver);

	public void openUrl(String username, String Pswd) {

		driver.get("https://"+username+":"+Pswd+"@"+"sc-dev-web-aws.anthem.com/prweb/PRRestService/api/v1/data/D_UpdateEndPointURL/?ENDPointURL=www.legatohealth.com&ENDPointPurpose=TestURL");
		//https://AG82801:rules@sc-dev-web-aws.anthem.com/prweb/PRRestService/api/v1/data/D_UpdateEndPointURL/?ENDPointURL=&ENDPointPurpose=
		driver.manage().window().maximize();	
		String Response=driver.findElement(By.xpath("//body")).getText();
		System.out.println(Response);
	}

	public void enterOrderIDAndFindOrder() {

		driver.findElement(By.xpath("//input[@id='order-id']")).sendKeys("1257945872");
		driver.findElement(By.xpath("//button[contains(text(),'Find Order')]")).click();
	}

	public void returnOrder() {
		driver.findElement(By.xpath("//button[text()='Return This Product']")).click();
	}

	public void retrunToken() {

		String tokenRes = driver.findElement(By.xpath("//div/h1/following::div[@class='result']")).getText();
		driver.close();
		System.out.println("Result:: " + tokenRes);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SetUtility\\chromedriver.exe");
		App app = new App();
		app.openUrl("AG79469", "rules");
		/*
		 * app.enterOrderIDAndFindOrder(); app.returnOrder(); app.retrunToken();
		 */

	}

}
