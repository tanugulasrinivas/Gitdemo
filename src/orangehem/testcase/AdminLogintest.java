package orangehem.testcase;

import orangehrm.library.Loginpage;
import utils.Apputils;

public class AdminLogintest extends Apputils {

	public static void main(String[] args) {
		Apputils.launchApp();
		
		Loginpage lp=new Loginpage();
		lp.login("Admin","Qedge123!@#");
		boolean res=lp.isAdminModuleDisplayed();
		if(res)
		{
			System.out.println("Admin testcase is pass");
		}else 
		{
			System.out.println("Admin testcase is fail");
		}
		Apputils.Close();

	}

}
