package com.tb.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.tb.base.TestBase;

public class LoginTest extends TestBase {

	
	@Test
	public void loginAsBankManager() throws InterruptedException {
		
		driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
		Thread.sleep(3000);
	}
}