package com.prollo.pages;

import com.github.javafaker.Faker;
import com.prollo.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.SelectionKey;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class ListClientPage {
    private WebDriver driver;
    private Faker faker = new Faker(new Locale("id"));
    private Random random = new Random();

    public ListClientPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //region ELEMENT
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[3]/div/button")
    WebElement prospectMenu;
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[3]/div/div/div/a[1]/button")
    WebElement listClientMenu;
    @FindBy(xpath = "//p[@class='chakra-text css-vmsygq']")
    WebElement txtListClientPage;
    @FindBy(xpath = "//button[@class='chakra-button css-ak59vf']")
    WebElement btnCreateNewClient;
    @FindBy(xpath = "//select[@id='client_type']")
    WebElement fieldClientType;
    @FindBy(xpath = "//input[@id='company_name']")
    WebElement fieldCompanyName;
    @FindBy(xpath = "//input[@id='name_pic']")
    WebElement fieldNamePIC;
    @FindBy(xpath = "//input[@id='phone_pic']")
    WebElement fieldPhonePIC;
    @FindBy(xpath = "/html/body/div[3]/div[4]/div/section/div/div/form/div[5]/div[1]/div/div[1]/div[2]/input")
    WebElement fieldEmailPIC;
    @FindBy(xpath = "//select[@id='source']")
    WebElement fieldSource;
    @FindBy(xpath = "//button[normalize-space()='Create']")
    WebElement btnCreateClient;
    @FindBy(xpath = "//*[contains(text(), 'Nama Perusahaan tidak boleh kosong')]")
    WebElement txtCompanyNameEmpty;
    @FindBy(xpath = "//*[contains(text(), 'Source tidak boleh kosong')]")
    WebElement txtSourceEmpty;
    @FindBy(xpath = "//div[@class='chakra-modal__content-container css-ikr2h6']")
    WebElement formAddClient;
    @FindBy(xpath = "(//div[@id='toast-1-title'])[1]")
    WebElement alertDuplicateAddClient;
    @FindBy(xpath = "(//div[@id='toast-2-title'])[1]")
    WebElement alertSuccessAddProspect;
    @FindBy(xpath = "(//div[@id='toast-3-title'])[1]")
    WebElement alertDupilcateEditClient;
    @FindBy(xpath = "(//div[@id='toast-3-title'])[1]")//"//li[@class='chakra-toast']//div[@id='toast-2-title']")
    WebElement alertSuccessEditClient;
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/p[1]/span[1]")
    WebElement txtNewProspect;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div/div[2]/div[2]/div[1]/p[2]")
    WebElement txtCompanyName;
    @FindBy(xpath = "//div[@class='css-qdy6gx']//div[2]//div[2]//div[1]//div[1]//div[1]//button[1]")
    WebElement btnDetail;
    @FindBy(xpath = "//div[@class='chakra-modal__content-container css-ikr2h6']")
    WebElement formEditClient;
    @FindBy(xpath = "//button[normalize-space()='Edit']")
    WebElement btnEdit;
    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement btnSaveEditClient;
    @FindBy(xpath = "//select[@class='chakra-select css-1nof5sa']")
    WebElement dropdownFilter;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div/div[2]/div[2]/div[2]/div/p")
    WebElement stageStatus;
    @FindBy(xpath = "/html/body/div[3]/div[6]/div[4]/div/section/footer/button[1]")
    WebElement btnCancelDanger;
    //endregion

    //region METHOD STEP DEFINITIONS
    public void clickProspectMenu() {
        this.prospectMenu.click();
    }

    public void clickListClientMenu() {
        this.listClientMenu.click();
    }

    public String getTxtListClientPage() {
        return this.txtListClientPage.getText();
    }

    public void setClientType(int index) {
        Select drpClientType = new Select(fieldClientType);
        drpClientType.selectByIndex(index);
    }

    public void setCompanyName(String status) {
        List<String> companyTypes = Arrays.asList("PT", "CV", "UD", "PD", "Koperasi");
        String companyType = companyTypes.get(random.nextInt(companyTypes.size()));
        String companyName = faker.company().name();
        if (status.equals("Company Name Empty")) {
            this.fieldCompanyName.clear();
        } else if (status.equals("Duplicate")) {
            this.fieldCompanyName.clear();
            this.fieldCompanyName.sendKeys("PT DUMMY TBK 12");
        } else {
            this.fieldCompanyName.clear();
            this.fieldCompanyName.sendKeys(String.format("%s %s",companyType,companyName));
        }
    }

    public void setNamePIC() {
        this.fieldNamePIC.clear();
        this.fieldNamePIC.sendKeys(faker.name().fullName());
    }

    public void setPhonePIC() {
        String prefix ="08";
        String suffix = faker.number().digits(10);
        this.fieldPhonePIC.clear();
        this.fieldPhonePIC.sendKeys(prefix + suffix);
    }

    public void setEmailPIC() {
        this.fieldEmailPIC.clear();
        this.fieldEmailPIC.sendKeys(faker.internet().emailAddress());
    }

    public void setSourceNewClient(int index) {
        Select drpSource = new Select(fieldSource);
        drpSource.selectByIndex(index);
    }

    public void clickBtnCreate() {
        this.btnCreateClient.click();
    }

    public String getTxtCompanyNameEmpty() {
        return this.txtCompanyNameEmpty.getText();
    }

    public void clickBtnCreateNewClient() {
        this.btnCreateNewClient.click();
    }

    public String getTxtSourceEmpty() {
        return this.txtSourceEmpty.getText();
    }

    public String validateFormAddClient() {
        String result = "";
        if (formAddClient.isDisplayed()) {
            result = "Is Displayed";
        } else {
            result = "Is Not Displayed";
        }
        return result;
    }

    public String getAlertSuccessAddProspect() {
        return this.alertSuccessAddProspect.getText();
    }

    public String getTxtNewProspect() {
        return this.txtNewProspect.getText();
    }

    public String getTxtCompanyName() {
        return this.txtCompanyName.getText();
    }

    public void clickBtnDetail() {
        this.btnDetail.click();
    }

    public String validateFormEditClient() {
        String result = "";
        if (formEditClient.isDisplayed()) {
            result = "Is Displayed";
        } else {
            result = "Is Not Displayed";
        }
        return result;
    }

    public void clickBtnEdit() {
        this.btnEdit.click();
    }

    public boolean checkFieldClientType() {
        return this.fieldClientType.isEnabled();
    }

    public boolean checkFieldCompanyName() {
        return this.fieldCompanyName.isEnabled();
    }

    public boolean checkFieldPicName() {
        return this.fieldNamePIC.isEnabled();
    }

    public boolean checkFieldTelpPic() {
        return this.fieldPhonePIC.isEnabled();
    }

    public boolean checkFieldEmailPic() {
        return this.fieldEmailPIC.isEnabled();
    }

    public boolean checkFieldSource() {
        return this.fieldSource.isEnabled();
    }

    public void clickBtnSaveEditClient() {
        this.btnSaveEditClient.click();
    }

    public String getAlertSuccessEditClient() {
        return this.alertSuccessEditClient.getText();
    }

    public void setDropdownFilter(int index) {
        Select drpClientProgress = new Select(dropdownFilter);
        drpClientProgress.selectByIndex(index);
    }

    public String getResultFilter() {
        return this.stageStatus.getText();
    }

    public void clickBtnCancelDanger() {
        this.btnCancelDanger.click();
    }

    public String getAlertDuplicateAddClient() {
        return alertDuplicateAddClient.getText();
    }

    public String getAlertDuplicateEditClient(){
        return this.alertDupilcateEditClient.getText();
    }
    //endregion

}
