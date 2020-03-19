package com.webpages.project;



import java.io.IOException;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import pageObjects.LoginPage;
import resources.BaseClass;


public class Homepage extends BaseClass  {
	 
	@BeforeTest
	public void intialize() throws IOException
	{
		driver=initializeDriver();
		
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String username,String password,String text) throws IOException {
	
	{
		driver.get("http://qaclickacademy.com");
		Landingpage l = new Landingpage(driver);
		l.getLogin().click();
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		System.out.println(text);
		lp.getLogin().click();
	}}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][3];
		data[0][0]="nonrestricteduser@gmail.com";
		data[0][1]="9880441954";
		data[0][2]="Restricted";
		
    data[1][0]="Restricted@gmail.com";
		data[1][1]="234567";
		data[1][2]="nonrestricteduser";
		
		return data;
		
				
				
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	
	


}

	}


