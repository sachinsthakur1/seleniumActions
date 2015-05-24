package seleniumactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SliderExample {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.thetestroom.com/webapp/");
		driver.findElement(By.id("contact_link")).click();
		
		WebElement slider = driver.findElement(By. xpath("//div[@id='slider-1']/a"));
        Actions move = new Actions(driver );
        Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
        action.perform();
        driver.quit();
	}

	
}
