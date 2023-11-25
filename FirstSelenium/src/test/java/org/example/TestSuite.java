package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest{

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    LoginPage loginPage = new LoginPage();


    @Test
    public void verifyUserShouldAbleToRegisterSuccessfully(){
        //click on regsiter button
        homePage.clickOnRegisterButton();
        //verify user is on regsiter page
        registerPage.verifyUserIsOnRegisterPage();
        //enter registration details
        registerPage.enterRegistrationDetails();
//        verify user registered successfully
        registerResultPage.verifyUserRegisteredSuccessfully();
    }


    @Test
    public void verifyUserShouldLogIn()
    {
        //click on login button
        homePage.clickOnLoginButton();
        //fill login details
        loginPage.enterLoginDetails();

    }



}
