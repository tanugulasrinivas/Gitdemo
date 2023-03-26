package orangehem.testcase;

import org.openqa.selenium.By;

import orangehrm.library.Loginpage;
import orangehrm.library.newUserReg;
import utils.Apputils;

public class UserRegistrationtest extends Apputils {

	public static void main(String[] args) throws InterruptedException {
		Apputils.launchApp();
		Loginpage lp=new Loginpage();
		lp.login("Admin","Qedge123!@#");
		newUserReg li=new newUserReg();
		boolean res=li.newUser("ESS","Ramesh Demo","stella124","QedGE204@");
		if(res)
		{
			System.out.println("New User test is passed");
		}
		else {
			System.out.println("New User test is failed");
		}
		Apputils.Close();
		
	}

}
