package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By signInLink = By.linkText("Sign In");
    By welcomeText = By.xpath("//h2[@class='page__heading']");

    By userEmail = By.id("user[email]");
    By userPassword = By.id("user[password]");
    By signInButton = By.xpath("//button[@type='submit']");

    By errorMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");

    public void clickOnSignInLink() {
        clickOnElement(signInLink);
    }

    public String getWelcomeTextFromSignInPage() {
        return getTextFromElement(welcomeText);
    }

    public void enterUserEmail(String userNameText) {
        sendTextToElement(userEmail, userNameText);
    }

    public void enterUserPassword(String userPasswordText) {
        sendTextToElement(userPassword, userPasswordText);
    }

    public void clickOnSignInButton() {
        clickOnElement(signInButton);
    }

    public String getErrorMessageForInvaidUserNameAndPassword(){
        return getTextFromElement(errorMessage);
    }
}
