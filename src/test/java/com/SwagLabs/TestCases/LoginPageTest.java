package com.SwagLabs.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
  @Test(priority=1)
  public void verifyUrl() 
  {
	  String curl=lp.getUrl();
	  Assert.assertTrue(curl.contains("demo"),"Fail:Url is not matches");
	  System.out.println("Url is matched!: "+curl);
  }
  
  @Test(priority=2)
  public void verifyTitle() 
  {
	  String title=lp.getAppTitle();
	  Assert.assertTrue(title.contains("Swag"),"Fail:Title is not matches");
	  System.out.println("Title is matched!: "+title);
  }
  
  @Test(priority=3)
  public void verifyLogin() 
  {
	  String curl=lp.doLogin("standard_user","secret_sauce");
	  Assert.assertTrue(curl.contains("inventory"),"Login Fail");
	  System.out.println("Login Completed!");
  }
}
