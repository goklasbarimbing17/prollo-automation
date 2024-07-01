package com.prollo.pages;

import com.prollo.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DashboardPage {
    private WebDriver driver;

    public DashboardPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div/div[2]/div[1]/div/div/div[2]/div[1]/div[1]")
    WebElement cardProspect;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div/div[2]/div[1]/div/div/div[2]/div[2]")
    WebElement cardShareCompro;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div/div[2]/div[1]/div/div/div[2]/div[3]")
    WebElement cardInitialMeeting;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div/div[2]/div[1]/div/div/div[2]/div[4]")
    WebElement cardClientAssessment;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div/div[2]/div[1]/div/div/div[2]/div[5]")
    WebElement cardComplete;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div/div[2]/div[1]/div/div/div[2]/div[6]")
    WebElement cardClientDrop;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div/div[2]/div[1]/div/div/div[2]/div[7]")
    WebElement cardSuratPenawaran;
    @FindBy(xpath = "//div[@class='css-15xeu5g']//table[@role='table']/tbody/tr")
    List<WebElement> listClient;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div/div/div[1]/div/div/div[2]/div[1]/div[1]/div[2]/p[1]")
    WebElement totalProspect;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div/div/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/p[1]")
    WebElement totalShareCompro;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div/div/div[1]/div/div/div[2]/div[3]/div[1]/div[2]/p[1]")
    WebElement totalInitialMeeting;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div/div/div[1]/div/div/div[2]/div[4]/div[1]/div[2]/p[1]")
    WebElement totalCA;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div/div/div[1]/div/div/div[2]/div[5]/div[1]/div[2]/p[1]")
    WebElement totalCompleted;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div/div/div[1]/div/div/div[2]/div[6]/div[1]/div[2]/p[1]")
    WebElement totalDrop;

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div/div/div[4]/div/div/div[2]/div/table/tbody/tr[1]/td[2]/a")
    WebElement listClientProgress;
    @FindBy(xpath = "//p[@class='chakra-text text__warp css-lg5qd5']")
    WebElement companyNameProgress;

    @FindBy(xpath = "//a[@href='/xpipe/admin/dashboard']")
    WebElement btnDashboard;


    public void clickProspect() {
        this.cardProspect.click();
    }

    public void clickShareCompro() {
        this.cardShareCompro.click();
    }

    public void clickInitialMeeting() {
        this.cardInitialMeeting.click();
    }

    public void clickClientAssessment() {
        this.cardClientAssessment.click();
    }

    public void clickComplete() {
        this.cardComplete.click();
    }

    public void clickClientDrop() {
        this.cardClientDrop.click();
    }

    public int getCountRows() {
        return this.listClient.size();
    }

    public String getTotalProspect() {
        return this.totalProspect.getText();
    }

    public String getTotalShareCompro() {
        return this.totalShareCompro.getText();
    }

    public String getTotalInitialMeeting() {
        return this.totalInitialMeeting.getText();
    }

    public String getTotalCA() {
        return this.totalCA.getText();
    }

    public String getTotalCompleted() {
        return this.totalCompleted.getText();
    }

    public String getTotalDrop() {
        return this.totalDrop.getText();
    }

    public void clickListClientProgress() {
        this.listClientProgress.click();
    }

    public String getTxtCompanyName() {
        return this.listClientProgress.getText();
    }

    public String getCompanyNameProgress() {
        return this.companyNameProgress.getText();
    }

    public void clickBtnDashboard() {
        this.btnDashboard.click();
    }
}
