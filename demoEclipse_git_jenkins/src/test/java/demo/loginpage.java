package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginpage {
	

  @Test
	public void logintest() {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.automationexercise.com/login");
	
	driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/button[1]/p")).click();
	
	WebElement email = driver.findElement(By.name("email"));
    email.sendKeys("rinkumarathe23@gmail.com");

  
    WebElement password = driver.findElement(By.name("password"));
    password.sendKeys("rinku12345678");
	
    WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Login']"));
    loginBtn.click();
	}
	
}
