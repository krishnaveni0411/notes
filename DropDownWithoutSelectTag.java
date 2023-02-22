package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DropDownWithoutSelectTag {
	public static void main(String[] args) throws InterruptedException {
		 EdgeDriver driver=new EdgeDriver();
		 driver.get("https://leafground.com/select.xhtml;jsessionid=node0297llw43prfo1hkr9eef8nsf102385.node0");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//span[contains(@class,'ui-button-icon')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//li[text()='ReactJs']")).click();
		 
	}
}
