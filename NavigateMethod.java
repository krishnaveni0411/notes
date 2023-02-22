package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateMethod {
public static void main(String[] args) throws InterruptedException {
	EdgeDriver driver=new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	 driver.get("http://leaftaps.com/opentaps/control/main");
	 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    
	 driver.navigate().to("https://www.facebook.com/");
	 Thread.sleep(3000);
	 driver.findElement(By.id("email")).sendKeys("krishnaecrystal123@gmail.com");
	 driver.findElement(By.id("pass")).sendKeys("qazwsx@123");
	 driver.findElement(By.name("login")).click();
	 
	 
	 Thread.sleep(3000);
	 driver.navigate().back();
	 
	 driver.navigate().back();
	 Thread.sleep(3000);
	 driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	 Thread.sleep(3000);
	 driver.navigate().forward();
	 
	 Thread.sleep(3000);
	 driver.navigate().refresh();
	 driver.close();
	 
}
}
