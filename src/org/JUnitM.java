package org;

import org.junit.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JUnitM {
	
	public WebDriver driver;
	
	@BeforeClass
	public static void sadasd() {
		System.out.println("I will be called before setup");
	}
	
	@Before
	public void setup() {
		System.out.println("I will be called before every test execution");
		System.setProperty("webdriver.chrome.driver", "./libs/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void test01() {
		System.out.println("I am in test 1");
		driver.findElement(By.name("q")).sendKeys("Prashanth Sams");
		Assert.assertEquals(driver.getTitle(), "Gogle");
	}
	
	@Test @Ignore
	public void test02() {
		System.out.println("I am in test 2");
		driver.findElement(By.name("q")).sendKeys("Prashanth Sams");
	}
	
	
	@After
	public void teardown() {
		driver.quit();
	}
	

}
