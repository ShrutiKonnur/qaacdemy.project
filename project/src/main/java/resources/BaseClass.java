package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		 prop = new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Prakat-L-015\\Desktop\\workspace\\project\\src\\main\\java\\resources\\data.properties");
	    prop.load(fis);
	    String broweserName=prop.getProperty("browser");
	    if(broweserName.equals("chrome"))
	    {
	    	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	         driver=new ChromeDriver();
	 
	    }
	    else if(broweserName.equals("firefox"))
	    {
	    	System.setProperty("webdriver.firefox.driver","C:\\selenium\\geckodriver-v0.26.0-win64\\firefoxdriver.exe");
	         driver=new FirefoxDriver();
	    }
	    else if(broweserName.equals("IE"))
	    {
	    	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	         driver=new ChromeDriver();	
	    }
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    return driver;
		
	}

}
