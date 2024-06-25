package com.prollo.stepdefinitions;

import com.prollo.hooks.Hooks;
import com.prollo.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static LoginPage loginPage = new LoginPage();

    public TestLogin(){
        driver = Hooks.driver;
        extentTest =Hooks.extentTest;
    }
    @Given("Input url web prollo {string}")
    public void input_url_web_prollo(String url) {
       driver.get(url);
       extentTest.log(LogStatus.PASS, "Input url web prollo");
    }
    @Then("Menampilkan halaman login {string}")
    public void menampilkan_halaman_login(String result) {
        Assert.assertEquals(loginPage.getTitlePage(), result);
        extentTest.log(LogStatus.PASS,"Menampilkan halaman login");
    }

    @When("User input nik {string}")
    public void user_input_nik(String nik) {
        loginPage.setTxtUsername(nik);
        extentTest.log(LogStatus.PASS,"User input nik");
    }

    @When("User input password {string}")
    public void user_input_password(String password) {
        loginPage.setTxtPassword(password);
        extentTest.log(LogStatus.PASS,"User input password");
    }

    @When("Klik tombol Sign In")
    public void klik_tombol_sign_in() {
        loginPage.clickBtnSignIn();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS,"Klik Tombol Sign In");
    }

    @Then("Berhasil login dan menampilkan halaman dashboard {string} {string}")
    public void berhasil_login_dan_menampilkan_halaman_dashboard(String result, String status) {
        Hooks.delay(1);
        if (status.contains("invalid nik")){
            Assert.assertEquals(loginPage.getTextInvalidNikAndPassword(),result);
            extentTest.log(LogStatus.PASS,"Show alert invalid Nik");
        }else if (status.contains("invalid password")){
            Assert.assertEquals(loginPage.getTextInvalidNikAndPassword(),result);
            extentTest.log(LogStatus.PASS,"Show alert invalid password");
        }else if (status.equals("nik empty")){
            Assert.assertEquals(loginPage.getTxtNikEmpty(),result);
            extentTest.log(LogStatus.PASS,"show text nik empty");
        }else if (status.equals("password empty")){
            Assert.assertEquals(loginPage.getTxtPasswordEmpty(),result);
            extentTest.log(LogStatus.PASS,"show text password empty");
        }else if (status.equals("password & nik empty")){
            Assert.assertEquals(loginPage.getTxtAnyCredentials(),result);
            extentTest.log(LogStatus.PASS,"show text password empty and nik empty");
        }else if (status.equals("valid login")){
            Assert.assertEquals(loginPage.getTextDashboardPage(),result);
            extentTest.log(LogStatus.PASS,"show dashboard page");
        }
    }


}
