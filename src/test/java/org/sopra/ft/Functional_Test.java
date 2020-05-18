package org.sopra.ft;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Functional_Test {

	@Test
	public void functionalTest() throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver", "C:\\Workspace\\chromedriver_win32\\chromedriver.exe");
    	ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
		WebDriver driver = new ChromeDriver(options);
		// Launch website
		driver.navigate().to("https://master-di-india-demo-di-india-demo.apps.ocp4.innershift.sodigital.io/di-india-demo/");
		driver.navigate().refresh();
		TimeUnit.SECONDS.sleep(10);
		// Click on the search text box and send value
		WebElement divElement = driver.findElement(By.id("header_h1"));
		String str = divElement.getText();
		System.out.println(str);
		assertEquals("Welcome to DI-India", str);
	}
}
