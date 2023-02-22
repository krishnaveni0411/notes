package week4.day3;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;

public class NavigateMethodBassic {
public static void main(String[] args) throws InterruptedException {
	EdgeDriver driver=new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	 driver.get("http://leaftaps.com/opentaps/control/main");
	  
	 driver.navigate().to("https://www.facebook.com/");
	 Thread.sleep(3000);

	 driver.navigate().back();
	 Thread.sleep(3000);
	
	 driver.navigate().forward();
	 Thread.sleep(3000);
	
	 driver.navigate().refresh();
	 
	// we can give statements to perform in each link and we have to give thread so that the dom element will be loaded
}
}
