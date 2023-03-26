package orangehem.testcase;

import orangehrm.library.Loginpage;
import utils.Apputils;

public class AdminLogintestinvaliddata  extends Apputils{

	public static void main(String[] args) {
		Apputils.launchApp();
		Loginpage lp=new Loginpage();
		lp.login("Admin","1234");
		boolean res=lp.isErrMsgDisplayed();
		if(res)
		{
			System.out.println("System displayed excepected Errormsg,Admin testcase is pass");
		}else 
		{
			System.out.println("System not displayed excepected Errormsg,Admin testcase is fail");
		}
		Apputils.Close();

	}

}
