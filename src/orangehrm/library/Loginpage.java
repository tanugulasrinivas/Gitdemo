package orangehrm.library;

import org.openqa.selenium.By;

import utils.Apputils;

public class Loginpage extends Apputils
{
	public static void login(String Uid,String pwd)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(Uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
	}
	public boolean isAdminModuleDisplayed() 
	{
		if(driver.findElement(By.linkText("Admin")).isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
		
	}
	public boolean isErrMsgDisplayed() 
	{
		String errmsg=driver.findElement(By.xpath("//*[@id=\"spanMessage\"]")).getText();
		if (errmsg.toLowerCase().contains("validation"))
		{
			return true;
		}else
		{
			return false;
		}
	
	}
	public void Logout()
	{
		driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[4]/a")).click();
	}

}
