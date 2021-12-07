package com.dlg.base;
import com.dlg.pageobjects.LoginPage;
import com.dlg.pageobjects.LoginSuccessPage;
import com.dlg.util.DriverFactory;
import com.dlg.util.DriverUtils;


public class BasePage {
    public  static LoginPage loginPage;
    public  static LoginSuccessPage loginSuccessPage;
    public  static DriverUtils driverUtils;

    public static void initPages()
    {
        loginPage=new LoginPage(DriverFactory.driver);
        loginSuccessPage=new LoginSuccessPage(DriverFactory.driver);
        driverUtils= new DriverUtils();
    }
}
