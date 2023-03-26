package orangehrm.library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Apputils;

public class Addemloyee extends Apputils
{
	public static boolean Newemployye(String fname,String lname)
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_pim_addEmployee\"]")).click();
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		String empid= driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewEmployeeList\"]")).click();
		
		System.out.println(empid);
		driver.findElement(By.xpath("//*[@id=\'empsearch_id\']")).sendKeys(empid);
		driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
		
		WebElement emptable=driver.findElement(By.id("resultTable"));
		List<WebElement>rows=emptable.findElements(By.tagName("tr"));
		boolean res=false;
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			if(cols.get(1).getText().equals(empid))
			{
				res= true;
				break;
			}
		}
			
				return res;
			
		
		
	}
}
