package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class EditLeadAndVerify {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Find Leads")).click();
	    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Akash");
	    driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("K");
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    driver.findElement(By.linkText("Akash")).click();
	    String companyName="XYZ,PVT.LTD";
	    driver.findElement(By.linkText("Edit")).click();
	    driver.findElement(By.id("updateLeadForm_companyName")).clear();
	    driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Amazon");
	    driver.findElement(By.className("smallSubmit")).click();
	    String updatedCompanyName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
	    if(companyName.equals(updatedCompanyName)) {
	    	System.out.println("The company name is not updated");
	    }else
	    	System.out.println("The Company name is updated");
		driver.close();
	}
}
