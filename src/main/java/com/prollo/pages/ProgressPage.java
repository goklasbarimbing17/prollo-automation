package com.prollo.pages;

import com.github.javafaker.Faker;
import com.prollo.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Locale;

public class ProgressPage {
    private WebDriver driver;
    private Faker faker;

    public ProgressPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    //region ELEMENTS PROGRESS PAGE
    //region SHARE COMPRO
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div[1]/div/div/div[1]/div[2]/div[1]/div/div/div")
    WebElement cardProspect;
    @FindBy(xpath = "//div[@data-rbd-droppable-id='share_compro']//div[1]")
    WebElement cardShareCompro;
    @FindBy(xpath = "//body/div[@id='root']/div[@class='css-0']/div[@class='css-9fgts9']/div[@class='css-vxacve']/div[@class='css-57csye']/div[@class='css-0']/div[@class='react-kanban-board']/div[@data-rbd-droppable-id='board-droppable']/div[2]")
    WebElement stageShareCompro;
    @FindBy(xpath = "//body/div[@id='root']/div[@class='css-0']/div[@class='css-9fgts9']/div[@class='css-vxacve']/div[@class='css-57csye']/div[@class='css-0']/div[@class='react-kanban-board']/div[@data-rbd-droppable-id='board-droppable']/div[3]")
    WebElement stageInitialMeetings;
    @FindBy(xpath = "/html/body/div[6]/div[4]/div/section/div")
    WebElement formTambahClient;
    @FindBy(xpath = "//div[@class='chakra-modal__content-container css-1yb2anq']")
    WebElement formTambahMeeting;
    @FindBy(xpath = "//input[@id='product_name']")
    WebElement fieldProductName;
    @FindBy(xpath = "//input[@id='company_name']")
    WebElement fieldCompanyName;
    @FindBy(xpath = "//input[@id='project_name']")
    WebElement fieldProjectName;
    @FindBy(xpath = "//textarea[@id='company_address']")
    WebElement fieldCompanyAddress;
    @FindBy(xpath = "//input[@id='business_type']")
    WebElement fieldBusinessType;
    @FindBy(xpath = "//input[@id='name_pic']")
    WebElement fieldPicName;
    @FindBy(xpath = "//input[@id='phone_pic']")
    WebElement fieldTelpPic;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/div/div/form/div[9]/div[1]/div/div[1]/div[2]/input")
    WebElement fieldEmailPic;
    @FindBy(xpath = "//select[@id='source']")
    WebElement fieldSource;
    @FindBy(xpath = "//button[normalize-space()='Create']")
    WebElement btnCreate;
    @FindBy(xpath = "(//div[@id='toast-2-title'])[1]")
    WebElement alertComplete;
    @FindBy(xpath = "(//div[@id='toast-3-title'])[1]")
    WebElement alertDuplicateEditShareCompro;
    @FindBy(xpath = "(//div[@id='toast-4-title'])[1]")
    WebElement alertCompleteEditShareCompro;
    @FindBy(xpath = "(//div[@id='toast-1-title'])[1]")
    WebElement alertDuplicateData;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/div/div/form/div[2]/div/div[2]")
    WebElement emptyCompanyName;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/div/div/form/div[3]/div/div[2]")
    WebElement emptyProductName;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/div/div/form/div[4]/div/div[2]")
    WebElement emptyProjectName;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/div/div/form/div[5]/div/div")
    WebElement emptyCompanyAddress;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/div/div/form/div[6]/div/div[2]")
    WebElement emptyTypeOfBusiness;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/div/div/form/div[7]/div/div[2]")
    WebElement emptyPicName;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/div/div/form/div[8]/div/div[2]")
    WebElement emptyTelpPic;
    @FindBy(xpath = "/html/body/div[6]/div[4]/div/section/div/div/form/div[9]/div[2]")
    WebElement emptyEmailPic;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/div/div/form/div[10]/div/div[2]")
    WebElement emptySource;
    @FindBy(xpath = "/html/body/div[5]/div[6]/div[4]/div/section/footer/button[1]")
    WebElement btnCancelDangerShareCompro;
    @FindBy(xpath = "//*[@id='chakra-modal--body-18']/div/form/div[9]/div[1]/div/div[2]/div[1]/svg")
    WebElement deleteEmailPic;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div/div[3]/div/button[2]")
    WebElement btnActivityProspect;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/div/div/div/div[1]/div[2]/div/p")
    WebElement statusAddToProspect;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/div/div/div/div[2]/div[2]/div/p")
    WebElement statusCreateClient;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div[1]/div/div/div/div/div/div[3]/div/button[1]")
    WebElement btnDetailShareCompro;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div[1]/div/div/div/div/div/p[1]")
    WebElement productNameShareCompro;
    @FindBy(xpath = "/html/body/div[6]/div[4]/div/section/header/div/div[1]/p[1]")
    WebElement resultDetailShareCompro;
    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement btnSaveEditShareCompro;
    @FindBy(xpath = "//button[normalize-space()='Edit']")
    WebElement btnEditShareCompro;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div[1]/div/p")
    WebElement txtProgressPage;
    //endregion

    //region INITIAL MEETINGS
    @FindBy(xpath = "//input[@id='name']")
    WebElement fieldSubject;
    @FindBy(xpath = "//input[@id='location']")
    WebElement fieldLocation;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/div/div/form/div[3]/div[1]/div/div[1]/div[2]/input")
    WebElement fieldParticipants;
    @FindBy(xpath = "//input[@id='date']")
    WebElement fieldDate;
    @FindBy(xpath = "//input[@id='notes']")
    WebElement fieldNotes;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/div/div/form/div[1]/div/div[2]")
    WebElement emptySubject;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/div/div/form/div[2]/div/div[2]")
    WebElement emptyLocation;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/div/div/form/div[3]/div[2]")
    WebElement emptyParticipant;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/div/div/form/div[4]/div/div[2]")
    WebElement emptyDateAndTime;
    @FindBy(xpath = "//div[@class=' css-1wy0on6']//div[1]//*[name()='svg']")
    WebElement deleteEmailParticipant;
    @FindBy(xpath = "//button[normalize-space()='Create']")
    WebElement btnCreateMeeting;
    @FindBy(xpath = "(//div[@id='toast-1-title'])[1]")
    WebElement alertCompleteInitialMeetings;
    @FindBy(xpath = "(//div[@id='toast-2-title'])[1]")
    WebElement alertCompleteEditInitialMeetings;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div[1]/div/div/div[3]/div[2]/div[1]/div/div/div/div/div/div[3]/div/button[1]")
    WebElement btnDetailInitialMeetings;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div[1]/div/div/div[3]/div[2]/div[1]/div/div/div/div/div/p[1]")
    WebElement brandNameInitialMeetings;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div/div[1]/div/div/div[3]/div[2]/div[1]/div/div/div/div/div/p[2]")
    WebElement companyNameInitialMeetings;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/header/div/div[1]/p[2]")
    WebElement companyNameDetailInitialMeetings;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/header/div/div[1]/p[1]")
    WebElement brandNameDetailInitialMeetings;
    @FindBy(xpath = "//button[normalize-space()='Edit']")
    WebElement btnEditInitialMeetings;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/div/div/div[2]/div/div/div[1]/form/div[4]/div[1]/div/label[2]/span[2]")
    WebElement momFreeText;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/div/div/div[2]/div/div/div[1]/form/div[4]/div[1]/div/label[1]/span[2]")
    WebElement momUpload;
    @FindBy(xpath = "//textarea[@id='text']")
    WebElement txtAreaFreeText;
    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement btnSaveEditInitialMeetings;

    //Empty Edit Initial meetings
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/div/div/div[2]/div/div/div[1]/form/div[1]/div/div[2]")
    WebElement emptySubjectEdit;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/div/div/div[2]/div/div/div[1]/form/div[2]/div/div[2]")
    WebElement emptyLocationEdit;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/div/div/div[2]/div/div/div[1]/form/div[4]/div[2]")
    WebElement emptyTypeOfMom;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/div/div/div[2]/div/div/div[1]/form/div[5]/div/div")
    WebElement emptyMom;

    //endregion


    //region CLIENT ASSESSMENT
    @FindBy(xpath = "//div[@data-rbd-droppable-id='initial_meetings']//div[1]")
    WebElement cardInitialMeeting;
    @FindBy(xpath = "//div[@data-rbd-droppable-id='client_assesment']")
    WebElement stageCA;//body/div[@id='root']/div[@class='css-0']/div[@class='css-9fgts9']/div[@class='css-vxacve']/div[@class='css-57csye']/div[@class='css-0']/div[@class='react-kanban-board']/div[@data-rbd-droppable-id='board-droppable']/div[1]
    @FindBy(xpath = "//div[@id='chakra-modal--body-ca__form']")
    WebElement formCA;
    @FindBy(xpath = "//input[@id='cooperation_period']")
    WebElement fieldPeriodKerjasama;
    @FindBy(xpath = "//span[normalize-space()='Labour Supply']")
    WebElement labourSupply;
    @FindBy(xpath = "//input[@id='labour_supply.amount']")
    WebElement fieldJumlahTK;
    @FindBy(xpath = "//input[@id='labour_supply.salary']")
    WebElement fieldBiayagaji;
    @FindBy(xpath = "//input[@id='labour_supply.fee']")
    WebElement fieldManagementFee;
    @FindBy(xpath = "//select[@id='labour_supply.ppn_type']")
    WebElement fieldSumberPPN;
    @FindBy(xpath = "//input[@id='labour_supply.ppn']")
    public WebElement fieldPpn;
    @FindBy(xpath = "//button[normalize-space()='Calculate']")
    WebElement btnCalculate;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/div/div/div[1]/div/form[2]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/input")
    WebElement jumlahBiayaGaji;
    @FindBy(xpath = "//input[@id='labour_supply_fee']")
    WebElement managementFee;
    @FindBy(xpath = "//input[@id='labour_supply_total']")
    WebElement total;
    @FindBy(xpath = "//input[@id='labour_supply_ppn']")
    WebElement ppn;
    @FindBy(xpath = "//input[@id='labour_supply_grand_total']")
    WebElement grandTotal;
    @FindBy(xpath = "//*[contains(text(), 'Jumlah TK harus diinput')]")
    WebElement emptyJumlahTK;
    @FindBy(xpath = "//*[contains(text(), 'Biaya Gaji/Tk harus diinput')]")
    WebElement emptyBiayaGaji;
    @FindBy(xpath = "//*[contains(text(), 'Pilih Salah satu sumber PPN')]")
    WebElement emptySumberPPN;
    @FindBy(xpath = "//*[contains(text(), 'Minimal Jumlah Tk minimal adalah 1')]")
    WebElement jumlahTKUnder1;
    @FindBy(xpath = "//*[contains(text(), 'Minimal Biaya Gaji/Tk minimal adalah Rp 1')]")
    WebElement biayaGajiUnder1;
    @FindBy(xpath = "//input[@id='location']")
    WebElement fieldLokasi;
    @FindBy(xpath = "//*[contains(text(), 'Periode Kerjasama Harus Diisi!')]")
    WebElement emptyPeriodKerjasama;
    @FindBy(xpath = "//*[contains(text(), 'Lokasi Kerja Harus Disii!')]")
    WebElement emptyLokasiKerja;
    @FindBy(xpath = "/html/body/div[5]/div[4]/div/section/div/div/div[1]/div/form[2]/div/div/div/div[2]/div[1]")
    WebElement labelLabourSupply;

    //Job Supply
    @FindBy(xpath = "//span[normalize-space()='Job Supply']")
    WebElement jobSupply;
    @FindBy(xpath = "//input[@id='job_supply.qty']")
    WebElement fieldQty;
    @FindBy(xpath = "//input[@id='job_supply.price_per_qty']")
    WebElement fieldPricePerQty;
    @FindBy(xpath = "//select[@id='job_supply.is_ppn']")
    WebElement fieldJobSupplyPpn;
    @FindBy(xpath = "//input[@id='job_supply_total']")
    WebElement jobSupplyTotal;
    @FindBy(xpath = "//input[@id='job_supply_ppn']")
    WebElement jobSupplyPpn;
    @FindBy(xpath = "//input[@id='job_supply_grand_total']")
    WebElement jobSupplyGrandTotal;
    @FindBy(xpath = "//input[@id='job_supply_total_cost']")
    WebElement jobSupplyTotalCost;
    @FindBy(xpath = "//input[@id='job_supply_loss']")
    WebElement jobSupplyLoss;
    @FindBy(xpath = "//div[normalize-space()='Job Supply']")
    WebElement labelJobSupply;
    @FindBy(xpath = "//*[contains(text(), 'Qty/Target harus diinput')]")
    WebElement emptyFieldQty;
    @FindBy(xpath = "//*[contains(text(), 'Harga per QTY harus diinput')]")
    WebElement emptyFieldPricePerQty;
    @FindBy(xpath = "//*[contains(text(), 'Pilih Salah satu sumber PPN')]")
    WebElement emptyFieldPpn;
    @FindBy(xpath = "//*[contains(text(), 'Minimal Qty adalah 1')]")
    WebElement qtyUnder1;
    @FindBy(xpath = "//*[contains(text(), 'Minimal Harga per QTY adalah 1')]")
    WebElement pricePerQtyUnder1;


    //endregion

    //endregion


    //region STEP DEFINITIONS

    //region METHOD SHARE COMPRO
    public void dragToShareCompro() {
        // Creating object of Actions class to build composite actions
        Actions builder = new Actions(driver);
        //Building a drag and drop action
        Action dragAndDrop = builder
                .clickAndHold(this.cardProspect)
                .moveToElement(this.stageShareCompro)
                .release(this.stageShareCompro)
                .build();
        //Performing the drag and drop actions
        dragAndDrop.perform();
    }

    public String validateFormAddClient() {
        String result = "";
        if (fieldCompanyName.isDisplayed()) {
            result = "Is Displayed";
        } else {
            result = "Is Not Displayed";
        }
        return result;
    }


    public void setCompanyName(String companyName) {
        this.fieldCompanyName.clear();
        this.fieldCompanyName.sendKeys(companyName);
    }

    public void setProductName(String productName) {
        this.fieldProductName.clear();
        this.fieldProductName.sendKeys(productName);
    }

    public void setProjectName(String projectName) {
        this.fieldProjectName.clear();
        this.fieldProjectName.sendKeys(projectName);
    }

    public void setCompanyAddress(String companyAddress) {
        this.fieldCompanyAddress.clear();
        this.fieldCompanyAddress.sendKeys(companyAddress);
    }

    public void setBusinessType(String businessType) {
        this.fieldBusinessType.clear();
        this.fieldBusinessType.sendKeys(businessType);
    }

    public void setPicName(String picName) {
        this.fieldPicName.clear();
        this.fieldPicName.sendKeys(picName);
    }

    public void setTelpPic(String telpPic) {
        this.fieldTelpPic.clear();
        this.fieldTelpPic.sendKeys(telpPic);
    }

    public void setEmailPic(String emailPic) {
        this.fieldEmailPic.clear();
        this.fieldEmailPic.sendKeys(emailPic);
    }

    public void setSource(int value) {
        Select dropdownSource = new Select(fieldSource);
        dropdownSource.selectByIndex(value);
    }

    public void clickBtnCreate() {
        this.btnCreate.click();
    }

    public String getTxtAlertSuccess() {
        return this.alertComplete.getText();
    }

    public String getTxtAlertIsDuplicate() {
        return this.alertDuplicateData.getText();
    }

    public String getTxtEmptyCompanyName() {
        return this.emptyCompanyName.getText();
    }

    public String getTxtEmptyProductName() {
        return this.emptyProductName.getText();
    }

    public String getTxtEmptyProjectName() {
        return this.emptyProjectName.getText();
    }

    public String getTxtEmptyCompanyAddress() {
        return this.emptyCompanyAddress.getText();
    }

    public String getTxtEmptyTypeOfBusiness() {
        return this.emptyTypeOfBusiness.getText();
    }

    public String getTxtEmptyPicName() {
        return this.emptyPicName.getText();
    }

    public String getTxtEmptyTelpPic() {
        return this.emptyTelpPic.getText();
    }

    public String getTxtEmptyEmailPic() {
        return this.emptyEmailPic.getText();
    }

    public String getTxtEmptySource() {
        return this.emptySource.getText();
    }

    public void clickBtnCancelDangerShareCompro() {
        this.btnCancelDangerShareCompro.click();
    }

    public void clickBtnActivityProspect() {
        this.btnActivityProspect.click();
    }

    public void clickModalActivity() {
        this.statusAddToProspect.click();
    }

    public String getTxtStatusAddToProspect() {
        return this.statusAddToProspect.getText();
    }

    public String getTxtStatusCreateClient() {
        return this.statusCreateClient.getText();
    }

    public void clickBtnDetailShareCompro() {
        this.btnDetailShareCompro.click();
    }

    public String getTxtProductNameShareCompro() {
        return this.productNameShareCompro.getText();
    }

    public String getTxtResultDetailShareCompro() {
        return this.resultDetailShareCompro.getText();
    }

    public void clickBtnEditShareCompro() {
        this.btnEditShareCompro.click();
    }

    public void clickBtnSaveEditShareCompro() {
        this.btnSaveEditShareCompro.click();
    }

    public boolean checkFieldCompanyName() {
        return this.fieldCompanyName.isEnabled();
    }

    public boolean checkFieldProductName() {
        return this.fieldProductName.isEnabled();
    }

    public boolean checkFieldProjectName() {
        return this.fieldProjectName.isEnabled();
    }

    public boolean checkFieldCompanyAddress() {
        return this.fieldCompanyAddress.isEnabled();
    }

    public boolean checkFieldBusinessType() {
        return this.fieldBusinessType.isEnabled();
    }

    public boolean checkFieldPicName() {
        return this.fieldPicName.isEnabled();
    }

    public boolean checkFieldTelpPic() {
        return this.fieldTelpPic.isEnabled();
    }

    public boolean checkFieldSource() {
        return this.fieldSource.isEnabled();
    }

    //Get Text Validation Edit Share Compro with invalid credentials
    public String getTxtEmptyCompanyNameEdit() {
        return this.emptyCompanyName.getText();
    }

    public String getTxtEmptyProductNameEdit() {
        return this.emptyProductName.getText();
    }

    public String getTxtEmptyProjectNameEdit() {
        return this.emptyProductName.getText();
    }

    public String getTxtEmptyCompanyAddressEdit() {
        return this.emptyCompanyAddress.getText();
    }

    public String getTxtEmptyBusinessTypeEdit() {
        return this.emptyTypeOfBusiness.getText();
    }

    public String getTxtEmptyPicNameEdit() {
        return this.emptyPicName.getText();
    }

    public String getTxtEmptyTelpPicEdit() {
        return this.emptyTelpPic.getText();
    }

    public String getTxtEmptyEmailPicEdit() {
        return this.emptyEmailPic.getText();
    }

    public String getTxtEmptySourceEdit() {
        return this.emptySource.getText();
    }

    public String getTxtAlertDuplicateEditShareCompro() {
        return this.alertDuplicateEditShareCompro.getText();
    }

    public String getTxtAlertSuccessEditShareCompro() {
        return this.alertCompleteEditShareCompro.getText();
    }

    public String getTxtProgressPage() {
        return this.txtProgressPage.getText();
    }
    //endregion

    //region METHOD INITIAL MEETINGS
    public void dragToInitialMeeting() {
        Actions builder = new Actions(driver);
        Action dragAndDrop = builder
                .clickAndHold(this.cardShareCompro)
                .moveToElement(this.stageInitialMeetings)
                .release(this.stageInitialMeetings)
                .build();
        dragAndDrop.perform();
    }

    public String validateFormInitialMeetings() {
        String result = "";
        if (formTambahMeeting.isDisplayed()) {
            result = "Is Displayed";
        } else {
            result = "Is Not Displayed";
        }
        return result;
    }

    public void clickBtnDetailInitialMeetings() {
        this.btnDetailInitialMeetings.click();
    }

    public void setSubject(String subject) {
        this.fieldSubject.clear();
        this.fieldSubject.sendKeys(subject);
    }

    public void setLocationMeeting(String location) {
        this.fieldLocation.clear();
        this.fieldLocation.sendKeys(location);
    }

    public void setParticipants(String email) {
        this.fieldParticipants.sendKeys(email);
    }

    public void setDateAndTime(String dateTime) {
        this.fieldDate.sendKeys(dateTime);
    }

    public void setNotesMeeting(String note) {
        this.fieldNotes.clear();
        this.fieldNotes.sendKeys(note);
    }

    public void clickBtnSubmitMeetings() {
        this.btnCreateMeeting.click();
    }

    public String getTxtEmptySubject() {
        return this.emptySubject.getText();
    }

    public String getTxtEmptyLocation() {
        return this.emptyLocation.getText();
    }

    public String getTxtEmptyParticipant() {
        return this.emptyParticipant.getText();
    }

    public String getTxtEmptyDateAndTime() {
        return this.emptyDateAndTime.getText();
    }

    public void clickDeleteEmailParticipant() {
        this.deleteEmailParticipant.click();
    }

    public void clickDeleteEmailPIC() {
        this.deleteEmailPic.click();
    }

    public void deleteDateAndTime() {
        this.fieldDate.click();
    }

    public String getTxtAlertSuccessInitialMeetings() {
        return this.alertCompleteInitialMeetings.getText();
    }

    public String getTxtCompanyNameInitialMeetings() {
        return this.companyNameInitialMeetings.getText();
    }

    public String getTxtBrandNameInitialMeetings() {
        return this.brandNameInitialMeetings.getText();
    }

    public String getTxtCompanyNameDetailInitialMeetings() {
        return this.companyNameDetailInitialMeetings.getText();
    }

    public String getTxtBrandNameDetailInitialMeetings() {
        return this.brandNameDetailInitialMeetings.getText();
    }

    public void clickBtnEditInitialMeetings() {
        this.btnEditInitialMeetings.click();
    }

    public void selectMomFreeText() {
        this.momFreeText.click();
    }

    public void selectMomUpload() {
        this.momUpload.click();
    }

    public void setMomFreeText(String mom) {
        this.txtAreaFreeText.clear();
        this.txtAreaFreeText.sendKeys(mom);
    }

    public void clickBtnSaveEditInitialMeetings() {
        this.btnSaveEditInitialMeetings.click();
    }

    public Boolean checkFieldSubjectName() {
        return this.fieldSubject.isEnabled();
    }

    public Boolean checkFieldLocation() {
        return this.fieldLocation.isEnabled();
    }

    public Boolean checkFieldDateTime() {
        return this.fieldDate.isEnabled();
    }

    public String getTxtEmptySubjectEdit() {
        return this.emptySubjectEdit.getText();
    }

    public String getTxtEmptyLocationEdit() {
        return this.emptyLocationEdit.getText();
    }

    public String getTxtEmptyTypeOfMomEdit() {
        return this.emptyTypeOfMom.getText();
    }

    public String getTxtEmptyMom() {
        return this.emptyMom.getText();
    }

    public String getTxtAlertSuccessEditInitialMeetings() {
        return this.alertCompleteEditInitialMeetings.getText();
    }


    //endregion

    //region METHOD CLIENT ASSESSMENT
    public void dragToCA() {
        Actions builder = new Actions(driver);
        Action dragAndDrop = builder
                .clickAndHold(this.cardInitialMeeting)
                .moveToElement(this.stageCA)
                .release(this.stageCA)
                .build();
        dragAndDrop.perform();
    }

    public String validateFormClientAssessment() {
        String result = "";
        if (formCA.isDisplayed()) {
            result = "Is Displayed";
        } else {
            result = "Is Not Displayed";
        }
        return result;
    }

    public void setFieldPeriodKerjasama(Integer periodKerjasama) {
        if (periodKerjasama == 0) {
            this.fieldPeriodKerjasama.clear();
        } else {
            this.fieldPeriodKerjasama.clear();
            this.fieldPeriodKerjasama.sendKeys(String.valueOf(periodKerjasama));
        }
    }

    public void setFieldLokasiKerja(String status) {
        faker = new Faker(new Locale("id"));
        if (status.equals("Lokasi empty")) {
            this.fieldLokasi.clear();
        } else {
            this.fieldLokasi.clear();
            this.fieldLokasi.sendKeys(faker.address().city());
//        this.fieldLokasi.clear();
//        this.fieldLokasi.sendKeys(lokasi);
        }
    }

    public String getTxtEmptyPeriodKerjasama() {
        return this.emptyPeriodKerjasama.getText();
    }

    public String getTxtEmptyLokasi() {
        return this.emptyLokasiKerja.getText();
    }

    public void selectLabourSupply() {
        this.labourSupply.click();
    }

    public void setFieldJumlahTK(Integer jumlahTK) {
        if (jumlahTK == -1) {
            this.fieldJumlahTK.clear();
        } else {
            this.fieldJumlahTK.clear();
            this.fieldJumlahTK.sendKeys(String.valueOf(jumlahTK));
        }
    }

    public void setFieldBiayagaji(Integer biayagaji) {
        if (biayagaji == -1) {
            this.fieldBiayagaji.clear();
        } else {
            this.fieldBiayagaji.clear();
            this.fieldBiayagaji.sendKeys(String.valueOf(biayagaji));
        }
    }

    public void setFieldManagementFee(Integer managementFee) {
        if (managementFee == -1) {
            this.fieldManagementFee.clear();
        } else {
            this.fieldManagementFee.clear();
            this.fieldManagementFee.sendKeys(String.valueOf(managementFee));
        }
    }

    public void selectSumberPPN(Integer index) {
        Select dropdownSumberPPN = new Select(fieldSumberPPN);
        dropdownSumberPPN.selectByIndex(index);
    }

    public void setFieldPpn(Integer ppn) {
        if (ppn == 00) {
            this.fieldPpn.clear();
        } else {
            this.fieldPpn.clear();
            this.fieldPpn.sendKeys(String.valueOf(ppn));
        }
    }

    public void clickBtnCalculate() {
        this.btnCalculate.click();
    }

    public int getJumlahBiayaGaji() {
        String originalValue = this.jumlahBiayaGaji.getAttribute("value");
        //replace "12.000.000" to "12000000"
        String replaceValue = originalValue.replaceAll("\\.", "");
        //Convert string to integer
        return Integer.parseInt(replaceValue);
    }

    public int getManagementFee() {
        String mFeeOriginal = this.managementFee.getAttribute("value");
        String mFeeReplace = mFeeOriginal.replaceAll("\\.", "");
        return Integer.parseInt(mFeeReplace);
    }

    public int getTotal() {
        String totalOriginal = this.total.getAttribute("value");
        String totalReplace = totalOriginal.replaceAll("\\.", "");
        return Integer.parseInt(totalReplace);
    }

    public int getPpn() {
        String ppnOriginal = this.ppn.getAttribute("value");
        String ppnReplace = ppnOriginal.replaceAll("\\.", "");
        return Integer.parseInt(ppnReplace);
    }

    public int getGrandTotal() {
        String grandTotalOriginal = this.grandTotal.getAttribute("value");
        String grandTotalReplace = grandTotalOriginal.replaceAll("\\.", "");
        return Integer.parseInt(grandTotalReplace);
    }

    public String getTxtEmptyJumlahTk() {
        return this.emptyJumlahTK.getText();
    }

    public String getTxtEmptyBiayaGaji() {
        return this.emptyBiayaGaji.getText();
    }

    public String getTxtJumlahTKUnder1() {
        return this.jumlahTKUnder1.getText();
    }

    public String getTxtBiayaGajiUnder1() {
        return this.biayaGajiUnder1.getText();
    }

    public String getTxtEmptySumberPPN() {
        return this.emptySumberPPN.getText();
    }

    public String getLabelLabourSupply() {
        return this.labelLabourSupply.getText();
    }

    public void clickJobSupply() {
        this.jobSupply.click();
    }

    public void setFieldQty(Integer qty) {
        if (qty == -1) {
            this.fieldQty.clear();
        } else {
            this.fieldQty.clear();
            this.fieldQty.sendKeys(String.valueOf(qty));
        }
    }

    public void setFieldPricePerQty(Integer pricePerQty) {
        if (pricePerQty == -1) {
            this.fieldPricePerQty.clear();
        } else {
            this.fieldPricePerQty.clear();
            this.fieldPricePerQty.sendKeys(String.valueOf(pricePerQty));
        }
    }

    public void selectPPN(Integer index) {
        Select dropdownPPN = new Select(fieldJobSupplyPpn);
        dropdownPPN.selectByIndex(index);
    }

    public String getLabelJobSupply() {
        return this.labelJobSupply.getText();
    }

    public int getJobSupplyTotalBiaya() {
        String totalOriginal = this.jobSupplyTotal.getAttribute("value");
        String totalReplace = totalOriginal.replaceAll("\\.", "");
        return Integer.parseInt(totalReplace);
    }

    public int getJobSupplyPpn() {
        String ppnOriginal = this.jobSupplyPpn.getAttribute("value");
        String ppnReplace = ppnOriginal.replaceAll("\\.", "");
        return Integer.parseInt(ppnReplace);
    }

    public int getJobSupplyGrandTotal() {
        String grandTotalOriginal = this.jobSupplyGrandTotal.getAttribute("value");
        String grandTotalReplace = grandTotalOriginal.replaceAll("\\.", "");
        return Integer.parseInt(grandTotalReplace);
    }

    public int getJobSupplyTotalCost() {
        String totalCostOriginal = this.jobSupplyTotalCost.getAttribute("value");
        String totalCostReplace = totalCostOriginal.replaceAll("\\.", "");
        return Integer.parseInt(totalCostReplace);
    }

    public int getJobSupplyLaba() {
        String labaOriginal = this.jobSupplyLoss.getAttribute("value");
        String labaReplace = labaOriginal.replaceAll("\\.", "");
        return Integer.parseInt(labaReplace);
    }

    public String getTxtEmptyQty() {
        return this.emptyFieldQty.getText();
    }

    public String getTxtEmptyPricePerQty() {
        return this.emptyFieldPricePerQty.getText();
    }

    public String getTxtQtyUnder1() {
        return this.qtyUnder1.getText();
    }

    public String getTxtPricePerQtyUnder1() {
        return this.pricePerQtyUnder1.getText();
    }

    public String getTxtemptyPpn() {
        return this.emptyFieldPpn.getText();
    }


    //endregion

    //region SIGNATURE
    // SIGNATURE
//    @FindBy(xpath = "//input[@placeholder='Username']")
//    WebElement username;
//    @FindBy(xpath = "//input[@placeholder='Password']")
//    WebElement password;
//    @FindBy(xpath = "//button[normalize-space()='Login']")
//    WebElement btnLogin;
//    @FindBy(xpath = "//span[normalize-space()='Digital Signature']")
//    WebElement menuSignature;
//    @FindBy(xpath = "//canvas[@id='signature']")
//    WebElement canvas;
//
//
//    public void setLogin() {
//        this.username.sendKeys("D6230271");
//        this.password.sendKeys("a");
//        this.btnLogin.click();
//    }
//
//    public void clickMenuSignature() {
//        this.menuSignature.click();
//    }
//
//    public void setSignature() {
//        Actions builder = new Actions(driver);
//        Action signature = builder
//                .clickAndHold(canvas)
//                .moveToElement(canvas, 0, -100)
//                .moveByOffset(50, -45)
//                .moveByOffset(20, -7)
//                .moveByOffset(0, 20)
//                .moveByOffset(50, -20)
//                .moveByOffset(80, 40)
//                .release(canvas)
//                .build();
//        signature.perform();
//    }
    //endregion
    //endregion
}