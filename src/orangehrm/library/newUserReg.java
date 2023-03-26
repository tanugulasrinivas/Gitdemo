package orangehrm.library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Apputils;

public class newUserReg extends Apputils {
	public boolean newUser(String role,String empname,String Username,String pswrd) throws InterruptedException 
	{
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]")).click();
		driver.findElement(By.name("btnAdd")).click();
		Select userrole=new Select(driver.findElement(By.id("systemUser_userType")));
		userrole.selectByVisibleText(role);
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(empname);
		driver.findElement(By.id("systemUser_userName")).sendKeys(Username);
		driver.findElement(By.id("systemUser_password")).sendKeys(pswrd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pswrd);
		Thread.sleep(3000);
		
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(Username);
		driver.findElement(By.id("searchBtn")).click();
		WebElement restble=driver.findElement(By.id("resultTable"));
		List<WebElement> rows,cols;
		rows=restble.findElements(By.tagName("tr"));
		boolean res=false;
		for(int i=1;i<rows.size();i++)
		{
			cols=rows.get(i).findElements(By.tagName("td"));
			if(cols.get(1).getText().equals(Username));
			{
				res=true;
				break;
			}
		
		}
		return res;
		
		
		
		
		
		
		
	}

}
