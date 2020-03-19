package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {
	
	public WebDriver driver;
	
	By signin=By.cssSelector("a[href*='sign_in']");
	By titile=By.cssSelector(".text-center");
	By navbar=By.xpath("//ul[@class='nav navbar-nav navbar-right']");
	
	public Landingpage(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement getLogin() {
		
		return driver.findElement(signin);
		
		
		
	}
	public WebElement getTitle() {
		
		return driver.findElement(titile);
		
		
		
	}
public WebElement getNavBar() {
		
		return driver.findElement(navbar);
		
		
		
	}

}
