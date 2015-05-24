package seleniumactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Select_Example {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.thetestroom.com/webapp/");
		driver.findElement(By.id("adoption_link")).click();
		
		Select select = new Select(driver.findElement(By.id("start_select")));
		select.selectByVisibleText("Today");
	
        //driver.quit();
	}

	
}
