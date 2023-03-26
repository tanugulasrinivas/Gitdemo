package POM_model;

import org.openqa.selenium.WebDriver;

public class class_3 {
	WebDriver driver;
	
	public class_3(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void check3()
	{
		driver.get("http://amazon.com");
	}

}
