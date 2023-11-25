package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{


    //click on registration button
    public void clickOnRegisterButton()
    {
        clickOnElement(By.className("ico-register"));

    }

    // click on login button
    public void clickOnLoginButton()
    {
        clickOnElement(By.className("ico-login"));
    }



}
