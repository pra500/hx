package p;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class BrowserStackTest {

	WebDriver driver;

	/*
	 * 
	 * 
	 * @author: Pragti Gupta
	 */
	
	@Test
	@Step("for getting url")
	@Description("url")
	public void titleTest() {

		String url = driver.getCurrentUrl();
		System.out.println(url);

	}	
	
	
	@BeforeTest
	@Step("launching the browser")
	public void beforeTest() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.browserstack.com/");
	}

	@AfterTest
	@Step("closing the browser")
	public void afterTest() {
		driver.close();
	}
	
	
	
	
	

}
