package com.anhtester.projects.bms.logins;

import com.anhtester.constants.FrameworkConstants;
import com.anhtester.helpers.PropertiesHelpers;
import com.anhtester.projects.cms.CommonPageCMS;
import com.anhtester.projects.cms.users.pages.dashboard.DashboardPage;
import org.openqa.selenium.By;

import static com.anhtester.keywords.WebUI.*;
import static com.anhtester.keywords.WebUI.clickElement;


public class LoginPageBMS extends CommonPageCMS{

    private By buttonLogin=By.xpath("");
    private By titleLoginPage=By.xpath("");
    private By inputEmail= By.xpath("");
    private By inputPassword= By.xpath("");
    private By titleVenueDashboardPage= By.xpath("");

    public void openLoginPage(){
        openWebsite(FrameworkConstants.URL_CMS_USER);
        clickElement(buttonCookies);
        clickElement(buttonLogin);
        waitForPageLoaded();
        verifyElementVisible(titleLoginPage,"Login page is Not displayed");
    }




}
