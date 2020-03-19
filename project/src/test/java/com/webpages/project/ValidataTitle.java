package com.webpages.project;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.Landingpage;
import pageObjects.LoginPage;
import resources.BaseClass;

public class ValidataTitle extends BaseClass {
	@BeforeTest
	public void intialize() throws IOException
	{
		driver=initializeDriver();
		driver.get("http://qaclickacademy.com");
			
	}
	@Test
	public void basePageNavigation() throws IOException {
	
	{
		
		Landingpage l = new Landingpage(driver);
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		
		
	

}}
	@AfterTest
	public void teardown()
	{
		driver.close();
	
	


}
	}

