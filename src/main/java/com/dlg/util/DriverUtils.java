package com.dlg.util;

public class DriverUtils {
    public void navigateToUrl(String url)
    {
        DriverFactory.driver.navigate().to(url);
    }

    public String getPageTitle()
    {
        return DriverFactory.driver.getTitle();
    }
}
