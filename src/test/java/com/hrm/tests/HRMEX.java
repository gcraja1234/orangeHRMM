package com.hrm.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HRMEX {
	// Hello Raj Ravi
		@Test
		public void loginhrm()
		{
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.testingmasters.com/hrm");
	    }

}
