package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends Utils{

    //verify user on register page with assert
    public void verifyUserIsOnRegisterPage(){
        Assert.assertTrue(driver.getCurrentUrl().contains("register"), "User is NOT on register page");
    }

    //enter registration details
    public void enterRegistrationDetails()
    {
        waitForClickable(By.id("register-button"), 10);
        //Enter registration details
        typeText(By.name("FirstName"), "FirstNameTest");
        typeText(By.name("LastName"),"LastNameTest");
        selectByText(By.name("DateOfBirthDay"), "21");
        selectByText(By.name("DateOfBirthMonth"), "May");
        selectByText(By.name("DateOfBirthYear"), "1987");
        typeText(By.name("Email"),"test+"+timeStamp()+"@test.com");
        typeText(By.name("Password"),"testtest1234");
        typeText(By.name("ConfirmPassword"),"testtest1234");
        clickOnElement(By.id("register-button"));
    }
}
