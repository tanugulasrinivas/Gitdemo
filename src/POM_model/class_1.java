package POM_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class class_1 {

	@Test
	public void check()

	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		class_2 cl2 = new class_2(driver);
		cl2.check3();
	}

}
