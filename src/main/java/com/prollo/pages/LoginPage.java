package com.prollo.pages;

import com.prollo.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='nik']")
    WebElement txtNik;
    @FindBy(xpath = "//input[@id='password']")
    WebElement txtPassword;
    @FindBy(xpath = "//button[normalize-space()='SIGN IN']")
    WebElement btnSignIn;
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/a[1]/div/div/p")
    public WebElement txtDashboardPage;
    @FindBy(id = "//p[@class='chakra-text css-1slga07']")
    WebElement txtLoginPage;
    @FindBy(xpath = "//div[@role='alert']")
    WebElement invalidNikAndPassword;
    @FindBy(xpath = "/html/body/div[1]/div/div/form/div[1]/div")
    WebElement nikEmpty;
    @FindBy(xpath = "/html/body/div[1]/div/div/form/div[2]/div[2]")
    WebElement passwordEmpty;
    @FindBy(xpath = "//span[normalize-space()='Logout']")
    WebElement btnLogout;

    public void klikBtnLogout() {
        btnLogout.click();
    }

    public void setTxtUsername(String username) {
        this.txtNik.clear();
        this.txtNik.sendKeys(username);
    }

    public void setTxtPassword(String password) {
        this.txtPassword.clear();
        this.txtPassword.sendKeys(password);
    }

    public void clickBtnSignIn() {
        this.btnSignIn.click();
    }

    public void loginUser(String username, String password) {
        this.txtNik.sendKeys(username);
        this.txtPassword.sendKeys(password);
        this.btnSignIn.click();
    }

    public String getTxtNikEmpty() {
        return this.nikEmpty.getText();
    }

    public String getTxtPasswordEmpty() {
        return this.passwordEmpty.getText();
    }

    public String getTxtAnyCredentials() {
        String nikEmptyText = this.nikEmpty.getText();
        String passwordEmptyText = this.passwordEmpty.getText();
        return nikEmptyText + " " + passwordEmptyText;
    }

    public String getTextInvalidNikAndPassword(){
        return this.invalidNikAndPassword.getText();
    }

    public String getTextDashboardPage() {
        return txtDashboardPage.getText();
//        String result = "";
//        if (this.txtDashboardPage.isDisplayed()) {
//            result = "Tampil";
//        } else {
//            result = "Tidak tampil";
//        }
//        return result;
    }

    public String getTxtLoginPage() {
        return txtLoginPage.getText();
    }

    public String getTitlePage() {
        String resultTitle = "";
        String titlePageNotFound = driver.getTitle();
        String titlePageLogin = driver.getTitle();
        if (titlePageNotFound.contains("Not Found")) {
            resultTitle = titlePageNotFound;
        } else if (titlePageLogin.contains("Prolog")) {
            resultTitle = titlePageLogin;
        }
        return resultTitle;
    }


}

