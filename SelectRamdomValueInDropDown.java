package week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectRamdomValueInDropDown {
public static void main(String[] args) {
	 EdgeDriver driver=new EdgeDriver();
	 driver.get("https://leafground.com/select.xhtml;jsessionid=node0297llw43prfo1hkr9eef8nsf102385.node0");
	 driver.manage().window().maximize();
	 WebElement element = driver.findElement(By.xpath("//select[contains(@class,'selectonemenu')]"));
	 Select selectOption=new Select(element);
	 List<WebElement> options = selectOption.getOptions();
	 int size = options.size();
	 selectOption.selectByIndex(size-1);
	 
}
}
