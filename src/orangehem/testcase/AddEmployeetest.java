package orangehem.testcase;

import orangehrm.library.Addemloyee;
import orangehrm.library.Loginpage;
import utils.Apputils;

public class AddEmployeetest extends Apputils{

	public static void main(String[] args) 
	{
		Apputils.launchApp();
		Loginpage lp=new Loginpage();
		Loginpage.login("Admin","Qedge123!@#");
		Addemloyee lr=new Addemloyee();
		boolean res=lr.Newemployye("srinivas","Eralla");
		if(res)
		{
			System.out.println("Addemloyee testcase is pass");
		}
		else {
			System.out.println("Addemployee testcase is fail");
		}
		Apputils.Close();
	}

}
