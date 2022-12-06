package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTestClass {

    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){

        loginPage.clickOnSignInLink();

        String expectedSignInMessage = "Welcome Back!";
        Assert.assertEquals(loginPage.getWelcomeTextFromSignInPage(), expectedSignInMessage, "Not on sign in page");
    }

    @Test
    public void verifyTheErrorMessage(){

        loginPage.clickOnSignInLink();
        loginPage.enterUserEmail("priem123@email.com");
        loginPage.enterUserPassword("prime123");
        loginPage.clickOnSignInButton();

        String expectedSignInErrorMessage = "Invalid email or password.";
        Assert.assertEquals(loginPage.getErrorMessageForInvaidUserNameAndPassword(), expectedSignInErrorMessage,
                "No error message displayed");
        
    }
}
