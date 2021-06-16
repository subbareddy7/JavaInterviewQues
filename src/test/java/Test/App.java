package Test;
import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App {
	
	
	WebDriver driver=new ChromeDriver();
	Actions action=new Actions(driver);
	
	public void openUrl() {
	
		driver.get("https://return-order-app.herokuapp.com/");
		driver.manage().window().maximize();
	}
	
	public void enterOrderIDAndFindOrder() {
		
		driver.findElement(By.xpath("//input[@id='order-id']")).sendKeys("1257945872");
		driver.findElement(By.xpath("//button[contains(text(),'Find Order')]")).click();
	}
	
	public void returnOrder() {
		driver.findElement(By.xpath("//button[text()='Return This Product']")).click();
	}
	
	public void retrunToken() {
	
		String  tokenRes=driver.findElement(By.xpath("//div/h1/following::div[@class='result']")).getText();
		driver.close();
		System.out.println("Result:: "+tokenRes);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SetUtility\\chromedriver.exe");
		App app=new App();
		app.openUrl();
		app.enterOrderIDAndFindOrder();
		app.returnOrder();
		app.retrunToken();	
		
	}

}
