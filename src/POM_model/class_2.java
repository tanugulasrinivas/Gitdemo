package POM_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class class_2  extends class_3{
	WebDriver driver;
	public class_2(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	public void check2()
	{
		driver.get("http://orangehrm.qedgetech.com");
				
	}

}
