package com.prollo.stepdefinitions;

import com.prollo.hooks.Hooks;
import com.prollo.pages.ProgressPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Random;

public class TestProgress {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static ProgressPage progressPage = new ProgressPage();
    private String companyName, productNameShareCompro, brandNameInitialMeetings, companyNameInitialMeetings;
    private int nJumlahTK, nBiayaGaji, nManagementFee, nPpn, nQty, nHargaPerQty, nPpnJobSupply, resultBiayaGaji, resultManagementFee,
            resultTotal, resultPPN, resultGrandTotal, jobSupplyTotalCost, jobSupplyPPN, jobSupplyGrandTotal, jobSupplyTotalBiaya, jobSupplyLaba,
            fmQty, fmPricePerQty, fmPpn, fmTotalResult, fmPpnResult, fmGrandTotal, fmTotalPayment, fmLoss,
            rsAmount, rsSalary, rsMfee, rsTotalSalary, rsSalaryPerYear, rsTotalFee, rsTotalWorker,
            tQty, tPricePerQty, tPpn, trainingTotal, trainingPpn, trainingGrandTotal, trainingTotalCost, trainingLoss,
            fPaymentTerm, fundTurnoverMonth, fundTunrover, fEstimateFund;
    private Random rand = new Random();

    public TestProgress() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("go to menu process")
    public void go_to_menu_process() {
        driver.get("https://dev.dikahadir.com/xpipe/admin/projects/progress");
        extentTest.log(LogStatus.PASS, "Go to menu process");
    }

    @When("click button activity prospect")
    public void click_button_activity_prospect() {
        Hooks.delay(1);
        progressPage.clickBtnActivityProspect();
        extentTest.log(LogStatus.PASS, "click button activity prospect");
    }

    @Then("validate progress page")
    public void validate_progress_page() {
        Hooks.delay(0.5);
        Assert.assertEquals(progressPage.getTxtProgressPage(), "Progress");
        extentTest.log(LogStatus.PASS, "validate progress page");
    }

    @Then("validate activity page")
    public void validate_activity_page() {
        Hooks.delay(1);
        Assert.assertEquals(progressPage.getTxtStatusAddToProspect(), "Add to Prospect");
        Hooks.delay(0.5);
        Assert.assertEquals(progressPage.getTxtStatusCreateClient(), "Created Client");
        extentTest.log(LogStatus.PASS, "validate activity page");
    }

    @When("drag card to share compro")
    public void drag_card_to_share_compro() {
        Hooks.delay(1);
        progressPage.clickModalActivity();
        Hooks.Escape();
        Hooks.delay(1);
        progressPage.dragToShareCompro();
        extentTest.log(LogStatus.PASS, "Drag card to share compro");
    }

    @Then("validation displays the share compro form")
    public void validation_displays_the_share_compro_form() {
        Hooks.delay(0.5);
        Assert.assertEquals(progressPage.validateFormAddClient(), "Is Displayed");
        extentTest.log(LogStatus.PASS, "Validation displays the share compro form");
    }

    @When("input company name {string}")
    public void input_company_name(String companyName) {
        Hooks.delay(0.5);
        progressPage.setCompanyName(companyName);
        extentTest.log(LogStatus.PASS, "Input company name");
    }

    @When("input product name {string}")
    public void input_product_name(String productName) {
        Hooks.delay(0.5);
        progressPage.setProductName(productName);
        extentTest.log(LogStatus.PASS, "Input product name");
    }

    @When("input project name {string}")
    public void input_project_name(String projectName) {
        Hooks.delay(0.5);
        int randNumber = rand.nextInt(10000);
        String projectNameRand = projectName + " " + randNumber;
        if (projectName.isEmpty() || projectName.equals("Project Dummy 25")) {
            progressPage.setProjectName(projectName);
            extentTest.log(LogStatus.PASS, "Input project name");
        } else {
            progressPage.setProjectName(projectNameRand);
            extentTest.log(LogStatus.PASS, "Input project name");
        }
    }

    @When("input company address {string}")
    public void input_company_address(String companyAddress) {
        Hooks.delay(0.5);
        progressPage.setCompanyAddress(companyAddress);
        extentTest.log(LogStatus.PASS, "Input company address");
    }

    @When("input type of business {string}")
    public void input_type_of_business(String businessType) {
        Hooks.delay(0.5);
        progressPage.setBusinessType(businessType);
        extentTest.log(LogStatus.PASS, "Input business type");
    }

    @When("input PIC name {string}")
    public void input_pic_name(String picName) {
        Hooks.delay(0.5);
        progressPage.setPicName(picName);
        extentTest.log(LogStatus.PASS, "Input PIC name");
    }

    @When("input telephone number PIC {string}")
    public void input_telephone_number_pic(String telpPic) {
        Hooks.delay(0.5);
        progressPage.setTelpPic(telpPic);
        extentTest.log(LogStatus.PASS, "Input telephone number PIC");
    }

    @When("input email PIC {string}")
    public void input_email_pic(String emailPic) {
        Hooks.delay(0.5);
        if (emailPic.isEmpty()) {
            progressPage.clickDeleteEmailPIC();
            Hooks.delay(2);
            progressPage.setEmailPic(emailPic);
            Hooks.delay(1);
            Hooks.Enter();
        } else if (emailPic.equals("dummy123@gmail.com")) {
            progressPage.setEmailPic(emailPic);
            Hooks.delay(1);
            Hooks.Enter();
        }
        extentTest.log(LogStatus.PASS, "Input email PIC");
    }

    @When("select source {int}")
    public void select_source(int index) {
        Hooks.delay(0.5);
        progressPage.setSource(index);
        extentTest.log(LogStatus.PASS, "Select source");
    }

    @When("click button create")
    public void click_button_create() {
        Hooks.delay(0.5);
        progressPage.clickBtnCreate();
        extentTest.log(LogStatus.PASS, "click button create");
    }

    @Then("validate input form {string} {string}")
    public void validate_input_form(String status, String result) {
        Hooks.delay(1);
        switch (status) {
            case "Company Name" -> {
                Assert.assertEquals(progressPage.getTxtEmptyCompanyName(), result);
                extentTest.log(LogStatus.PASS, "validate empty company name");
            }
            case "Product Name" -> {
                Assert.assertEquals(progressPage.getTxtEmptyProductName(), result);
                extentTest.log(LogStatus.PASS, "validate empty product name");
            }
            case "Project Name" -> {
                Assert.assertEquals(progressPage.getTxtEmptyProjectName(), result);
                extentTest.log(LogStatus.PASS, "validate empty project name");
            }
            case "Company Address" -> {
                Assert.assertEquals(progressPage.getTxtEmptyCompanyAddress(), result);
                extentTest.log(LogStatus.PASS, "validate empty company address");
            }
            case "Type Of Business" -> {
                Assert.assertEquals(progressPage.getTxtEmptyTypeOfBusiness(), result);
                extentTest.log(LogStatus.PASS, "validate empty Type of business");
            }
            case "Pic Name" -> {
                Assert.assertEquals(progressPage.getTxtEmptyPicName(), result);
                extentTest.log(LogStatus.PASS, "validate empty Pic Name");
            }
            case "Telp Pic" -> {
                Assert.assertEquals(progressPage.getTxtEmptyTelpPic(), result);
                extentTest.log(LogStatus.PASS, "validate empty Telp Pic");
            }
            case "Email Pic" -> {
                Assert.assertEquals(progressPage.getTxtEmptyEmailPic(), result);
                extentTest.log(LogStatus.PASS, "validate empty Email Pic");
            }
            case "Source" -> {
                Assert.assertEquals(progressPage.getTxtEmptySource(), result);
                extentTest.log(LogStatus.PASS, "validate empty Resource");
            }
            case "Duplicate" -> {
                progressPage.clickBtnCancelDangerShareCompro();
                Assert.assertEquals(progressPage.getTxtAlertIsDuplicate(), result);
                extentTest.log(LogStatus.PASS, "validate duplicate data");
            }
            case "Success" -> {
                Assert.assertEquals(progressPage.getTxtAlertSuccess(), result);
                extentTest.log(LogStatus.PASS, "validate input form");
            }
        }
    }

    @When("click view detail share compro")
    public void click_view_detail_share_compro() {
        Hooks.delay(0.5);
        productNameShareCompro = progressPage.getTxtProductNameShareCompro();
        Hooks.delay(0.5);
        progressPage.clickBtnDetailShareCompro();
        extentTest.log(LogStatus.PASS, "Click view detail share compro");
    }

    @Then("validation display the detail share compro")
    public void validation_display_the_detail_share_compro() {
        Hooks.delay(0.5);
        Assert.assertEquals(progressPage.getTxtResultDetailShareCompro(), productNameShareCompro);
        extentTest.log(LogStatus.PASS, "Validation display the detail share compro");
    }

    @When("click button edit share compro")
    public void click_button_edit_share_compro() {
        Hooks.delay(0.5);
        progressPage.clickBtnEditShareCompro();
        extentTest.log(LogStatus.PASS, "click button edit share compro");
    }

    @Then("validation display the edit share compro form")
    public void validation_display_the_edit_share_compro_form() {
        Hooks.delay(1);
        Assert.assertTrue(progressPage.checkFieldCompanyName());
        Assert.assertTrue(progressPage.checkFieldProductName());
        Assert.assertTrue(progressPage.checkFieldProjectName());
        Assert.assertTrue(progressPage.checkFieldCompanyAddress());
        Assert.assertTrue(progressPage.checkFieldBusinessType());
        Assert.assertTrue(progressPage.checkFieldPicName());
        Assert.assertTrue(progressPage.checkFieldTelpPic());
        Assert.assertTrue(progressPage.checkFieldSource());
        extentTest.log(LogStatus.PASS, "Validation display the edit share compro form");
    }

    @When("edit company name {string}")
    public void edit_company_name(String companyName) {
        Hooks.delay(0.5);
        progressPage.setCompanyName(companyName);
        extentTest.log(LogStatus.PASS, "Edit company name");
    }

    @When("edit product name {string}")
    public void edit_product_name(String productName) {
        Hooks.delay(0.5);
        progressPage.setProductName(productName);
        extentTest.log(LogStatus.PASS, "Edit product name");
    }

    @When("edit project name {string}")
    public void edit_project_name(String projectName) {
        Hooks.delay(0.5);
        int randNumber = rand.nextInt(10000);
        String projectNameRand = projectName + " " + randNumber;
        if (projectName.isEmpty() || projectName.equals("Project Dummy 25")) {
            progressPage.setProjectName(projectName);
        } else {
            progressPage.setProjectName(projectNameRand);
        }
        extentTest.log(LogStatus.PASS, "Edit project name");
    }

    @When("edit company address {string}")
    public void edit_company_address(String companyAddress) {
        Hooks.delay(0.5);
        progressPage.setCompanyAddress(companyAddress);
        extentTest.log(LogStatus.PASS, "Edit company addres");
    }

    @When("edit type of business {string}")
    public void edit_type_of_business(String typeBusiness) {
        Hooks.delay(0.5);
        progressPage.setBusinessType(typeBusiness);
        extentTest.log(LogStatus.PASS, "Edit type of business");
    }

    @When("edit PIC name {string}")
    public void edit_pic_name(String picName) {
        Hooks.delay(0.5);
        progressPage.setPicName(picName);
        extentTest.log(LogStatus.PASS, "Edit PIC name");
    }

    @When("edit telephone number PIC {string}")
    public void edit_telephone_number_pic(String telpPic) {
        Hooks.delay(0.5);
        progressPage.setTelpPic(telpPic);
        extentTest.log(LogStatus.PASS, "Edit telephone number PIC");
    }

    @When("edit email PIC {string}")
    public void edit_email_pic(String emailPic) {
        Hooks.delay(0.5);
        if (emailPic.isEmpty()) {
            progressPage.clickDeleteEmailPIC();
            Hooks.delay(2);
            progressPage.setEmailPic(emailPic);
            Hooks.delay(1);
            Hooks.Enter();
        } else if (emailPic.equals("dummy123@gmail.com")) {
            progressPage.setEmailPic(emailPic);
            Hooks.delay(1);
            Hooks.Enter();
        }
        extentTest.log(LogStatus.PASS, "Edit email PIC");
    }

    @When("edit source {int}")
    public void edit_source(Integer index) {
        Hooks.delay(0.5);
        progressPage.setSource(index);
        extentTest.log(LogStatus.PASS, "Edit source");
    }

    @When("click button save edit share compro")
    public void click_button_save_edit_share_compro() {
        Hooks.delay(0.5);
        progressPage.clickBtnSaveEditShareCompro();
        extentTest.log(LogStatus.PASS, "Click button Save edit share compro");
    }

    @Then("validate edit form share compro {string} {string}")
    public void validate_edit_form_share_compro(String status, String result) {
        Hooks.delay(1);
        switch (status) {
            case "Company Name" -> {
                Assert.assertEquals(progressPage.getTxtEmptyCompanyNameEdit(), result);
                extentTest.log(LogStatus.PASS, "Validate edit form share compro with empty company name");
            }
            case "Product Name" -> {
                Assert.assertEquals(progressPage.getTxtEmptyProductNameEdit(), result);
                extentTest.log(LogStatus.PASS, "Validate edit form share compro with empty product name");
            }
            case "Project Name" -> {
                Assert.assertEquals(progressPage.getTxtEmptyProjectNameEdit(), result);
                extentTest.log(LogStatus.PASS, "Validate edit form share compro with empty project name");
            }
            case "Company Address" -> {
                Assert.assertEquals(progressPage.getTxtEmptyCompanyAddressEdit(), result);
                extentTest.log(LogStatus.PASS, "Validate edit form share compro with empty company address");
            }
            case "Type Of Business" -> {
                Assert.assertEquals(progressPage.getTxtEmptyBusinessTypeEdit(), result);
                extentTest.log(LogStatus.PASS, "Validate edit form share compro with empty business type");
            }
            case "Pic Name" -> {
                Assert.assertEquals(progressPage.getTxtEmptyPicNameEdit(), result);
                extentTest.log(LogStatus.PASS, "Validate edit form share compro with empty PIC name");
            }
            case "Telp Pic" -> {
                Assert.assertEquals(progressPage.getTxtEmptyTelpPicEdit(), result);
                extentTest.log(LogStatus.PASS, "Validate edit form share compro with empty telp PIC");
            }
            case "Email Pic" -> {
                Assert.assertEquals(progressPage.getTxtEmptyEmailPicEdit(), result);
                extentTest.log(LogStatus.PASS, "Validate edit form share compro with empty email PIC");
            }
            case "Source" -> {
                Assert.assertEquals(progressPage.getTxtEmptySourceEdit(), result);
                extentTest.log(LogStatus.PASS, "Validate edit form share compro with empty  name");
            }
            case "Duplicate" -> {
                progressPage.clickBtnCancelDangerShareCompro();
                Assert.assertEquals(progressPage.getTxtAlertDuplicateEditShareCompro(), result);
                extentTest.log(LogStatus.PASS, "Validate edit form share compro with duplicate data");
            }
            case "Success" -> {
                Assert.assertEquals(progressPage.getTxtAlertSuccessEditShareCompro(), result);
                extentTest.log(LogStatus.PASS, "Validate edit form share compro with valid credentials");
            }
        }
    }

    //region INITIAL MEETINGS
    @When("drag card to initial meetings")
    public void drag_card_to_initial_meetings() {
        Hooks.delay(3);
        progressPage.dragToInitialMeeting();
        extentTest.log(LogStatus.PASS, "drag card to initial meetings");
    }

    @Then("validation displays the initial meetings form")
    public void validation_displays_the_initial_meetings_form() {
        Hooks.delay(1);
        Assert.assertEquals(progressPage.validateFormInitialMeetings(), "Is Displayed");
        extentTest.log(LogStatus.PASS, "validation displays the initial meetings form");
    }


    @When("input subject meeting {string}")
    public void input_subject_meeting(String subject) {
        Hooks.delay(0.5);
        progressPage.setSubject(subject);
        extentTest.log(LogStatus.PASS, "input subject meeting");
    }

    @When("input location meeting {string}")
    public void input_location_meeting(String location) {
        Hooks.delay(0.5);
        progressPage.setLocationMeeting(location);
        extentTest.log(LogStatus.PASS, "input location meeting");
    }

    @When("input participants {string}")
    public void input_participants(String participants) {
        Hooks.delay(0.5);
        if (participants.isEmpty()) {
            progressPage.clickDeleteEmailParticipant();
            Hooks.delay(2);
            progressPage.setParticipants(participants);
            Hooks.delay(1);
            Hooks.Enter();
            extentTest.log(LogStatus.PASS, "input participants");
        } else if (participants.equals("dummy123@gmail.com")) {
            progressPage.setParticipants(participants);
            Hooks.delay(1);
            Hooks.Enter();
            extentTest.log(LogStatus.PASS, "input participants");
        }
    }

    @When("input tanggal dan jam {string}")
    public void input_tanggal_dan_jam(String date) {
        Hooks.delay(0.5);
//        progressPage.clickDateAndTime();
//        Hooks.delay(1);
        if (date.isEmpty()) {
            progressPage.deleteDateAndTime();
            Hooks.BackSpace();
            progressPage.setDateAndTime(date);
        } else {
            progressPage.setDateAndTime(date);
            Hooks.setTanggal();
        }
        extentTest.log(LogStatus.PASS, "input tanggal dan jam");
    }

    @When("input notes {string}")
    public void input_notes(String note) {
        Hooks.delay(0.5);
        progressPage.setNotesMeeting(note);
        extentTest.log(LogStatus.PASS, "input notes");
    }

    @When("click button create initial meetings")
    public void click_button_create_initial_meetings() {
        Hooks.delay(0.5);
        progressPage.clickBtnSubmitMeetings();
        extentTest.log(LogStatus.PASS, "click button create initial meetings");
    }

    @Then("validate input form initial meetings {string} {string}")
    public void validate_input_form_initial_meetings(String status, String result) {
        Hooks.delay(1);
        switch (status) {
            case "subject empty" -> {
                Assert.assertEquals(progressPage.getTxtEmptySubject(), result);
                extentTest.log(LogStatus.PASS, "validate input with subject empty");
            }
            case "location empty" -> {
                Assert.assertEquals(progressPage.getTxtEmptyLocation(), result);
                extentTest.log(LogStatus.PASS, "validate input with location empty");
            }
            case "participants empty" -> {
                Assert.assertEquals(progressPage.getTxtEmptyParticipant(), result);
                extentTest.log(LogStatus.PASS, "validate input with participant empty");
            }
            case "date empty" -> {
                Assert.assertEquals(progressPage.getTxtEmptyDateAndTime(), result);
                extentTest.log(LogStatus.PASS, "validate input with date and time empty");
            }
            case "complete" -> {
                Assert.assertEquals(progressPage.getTxtAlertSuccessInitialMeetings(), result);
                extentTest.log(LogStatus.PASS, "validate input form initial meetings");
            }
        }
    }

    @When("click view detail initial meetings")
    public void click_view_detail_initial_meetings() {
        Hooks.delay(0.5);
        brandNameInitialMeetings = progressPage.getTxtBrandNameInitialMeetings();
        companyNameInitialMeetings = progressPage.getTxtCompanyNameInitialMeetings();
        Hooks.delay(0.5);
        progressPage.clickBtnDetailInitialMeetings();
        extentTest.log(LogStatus.PASS, "Click view detail Initial meetings");
    }

    @Then("validation display the detail initial meetings")
    public void validation_display_the_detail_initial_meetings() {
        Hooks.delay(0.5);
        Assert.assertEquals(progressPage.getTxtBrandNameDetailInitialMeetings(), brandNameInitialMeetings);
        Assert.assertEquals(progressPage.getTxtCompanyNameDetailInitialMeetings(), companyNameInitialMeetings);
        extentTest.log(LogStatus.PASS, "Validation display the detail initial meetings");
    }

    @When("click button edit initial meetings")
    public void click_button_edit_initial_meetings() {
        Hooks.delay(0.5);
        progressPage.clickBtnEditInitialMeetings();
        extentTest.log(LogStatus.PASS, "click button edit initial meetings");
    }

    @Then("validation display the edit initial meetings form")
    public void validation_display_the_edit_initial_meetings_form() {
        Hooks.delay(1);
        Assert.assertTrue(progressPage.checkFieldDateTime());
        Assert.assertTrue(progressPage.checkFieldSubjectName());
        Assert.assertTrue(progressPage.checkFieldLocation());
        extentTest.log(LogStatus.PASS, "Validation display the edit initial meetings form");
    }

    //Edit Form Initial Meetings ---------------------------------------------------------------------->
    @When("edit subject meeting {string}")
    public void edit_subject_meeting(String subject) {
        Hooks.delay(0.5);
        progressPage.setSubject(subject);
        extentTest.log(LogStatus.PASS, "Edit subject meeting");
    }

    @When("edit location meeting {string}")
    public void edit_location_meeting(String location) {
        Hooks.delay(0.5);
        progressPage.setLocationMeeting(location);
        extentTest.log(LogStatus.PASS, "Edit location meeting");
    }

    @When("edit tanggal dan jam {string}")
    public void edit_tanggal_dan_jam(String datetime) {
        Hooks.delay(0.5);
        if (datetime.isEmpty()) {
            progressPage.deleteDateAndTime();
            Hooks.BackSpace();
            progressPage.setDateAndTime(datetime);
        } else {
            progressPage.setDateAndTime(datetime);
            Hooks.setTanggal();
        }
        extentTest.log(LogStatus.PASS, "Edit tanggal dan jam");
    }

    @When("select type of mom {int}")
    public void select_type_of_mom(int typeMom) {
        Hooks.delay(0.5);
        if (typeMom == 1) {
            progressPage.selectMomFreeText();
            extentTest.log(LogStatus.PASS, "Select type of Mom");
        } else if (typeMom == 0) {
            extentTest.log(LogStatus.PASS, "Dont select type of Mom");
        }
    }

    @When("input or upload mom {string}")
    public void input_or_upload_mom(String mom) {
        Hooks.delay(0.5);
        progressPage.setMomFreeText(mom);
        extentTest.log(LogStatus.PASS, "Input or Upload MOM");
    }

    @When("click button save initial meetings")
    public void click_button_save_initial_meetings() {
        Hooks.delay(0.5);
        progressPage.clickBtnSaveEditInitialMeetings();
        extentTest.log(LogStatus.PASS, "Click button save initial meetings");
    }

    @Then("validate edit initial meetings {string} {string}")
    public void validate_edit_initial_meetings(String status, String result) {
        Hooks.delay(0.5);
        switch (status) {
            case "subject empty" -> {
                Assert.assertEquals(progressPage.getTxtEmptySubjectEdit(), result);
                extentTest.log(LogStatus.PASS, "Validate edit initial meetings with subject empty");
            }
            case "location empty" -> {
                Assert.assertEquals(progressPage.getTxtEmptyLocationEdit(), result);
                extentTest.log(LogStatus.PASS, "Validate edit initial meetings with location empty");
            }
            case "don't select type upload mom" -> {
                Assert.assertEquals(progressPage.getTxtEmptyTypeOfMomEdit(), result);
                extentTest.log(LogStatus.PASS, "Validate edit initial meetings by not selecting the type of mom");
            }
            case "mom empty" -> {
                Assert.assertEquals(progressPage.getTxtEmptyMom(), result);
                extentTest.log(LogStatus.PASS, "Validate edit initial meetings with mom empty ");
            }
            case "mom under 10 character" -> {
                Assert.assertEquals(progressPage.getTxtEmptyMom(), result);
                extentTest.log(LogStatus.PASS, "Validate edit initial meetings by entered mom under 10 character");
            }
            case "complete" -> {
                Assert.assertEquals(progressPage.getTxtAlertSuccessEditInitialMeetings(), result);
                extentTest.log(LogStatus.PASS, "Validate complete edit initial meetings");
            }
        }
    }

    //endregion

    //region CLIENT ASSESSMENT

    //Drag initial meeting to client assessment
    @When("drag card to client assessment")
    public void drag_card_to_client_assessment() {
        Hooks.delay(0.5);
        progressPage.dragToCA();
        extentTest.log(LogStatus.PASS, "Drag card to client assessment");
    }

    @Then("validation displays the client assessment form")
    public void validation_displays_the_client_assessment_form() {
        Hooks.delay(0.5);
        Assert.assertEquals(progressPage.validateFormClientAssessment(), "Is Displayed");
        extentTest.log(LogStatus.PASS, "Validation displays the client assessment form");
    }

    //Cooperation
    @When("input periode kerjasama {int}")
    public void input_periode_kerjasama(Integer periodKerjasama) {
        Hooks.delay(0.5);
        progressPage.setFieldPeriodKerjasama(periodKerjasama);
        extentTest.log(LogStatus.PASS, "input periode kerjasama");
    }

    @When("input lokasi kerja {string}")
    public void input_lokasi_kerja(String status) {
        Hooks.delay(0.5);
        progressPage.setFieldLokasiKerja(status);
        extentTest.log(LogStatus.PASS, "Input lokasi kerja");
    }

    @Then("validate input field {string} {string}")
    public void validasi_input_field(String result, String status) {
        Hooks.delay(0.5);
        switch (status) {
            case "Periode empty" -> {
                Assert.assertTrue(progressPage.getTxtEmptyPeriodKerjasama().contains(result));
                extentTest.log(LogStatus.PASS, "Validation periode kerjasama empty");
            }
            case "Lokasi empty" -> {
                Assert.assertTrue(progressPage.getTxtEmptyLokasi().contains(result));
                extentTest.log(LogStatus.PASS, "Validation lokasi kerja empty");
            }
            case "Success" -> {
                Assert.assertTrue("Berhasil".contains(result));
                extentTest.log(LogStatus.PASS, "Validation valid input field periode kerjasama and Lokasi kerja");
            }
        }
    }

    @When("ceklist jenis kerjasama labour supply")
    public void ceklist_jenis_kerjasama_labour_supply() {
        Hooks.delay(0.5);
        progressPage.selectLabourSupply();
        extentTest.log(LogStatus.PASS, "Ceklist jenis kerjasama");
    }

    @Then("validate the labour supply display form")
    public void validate_the_labour_supply_display_form() {
        Hooks.delay(0.5);
        Assert.assertTrue(progressPage.getLabelLabourSupply().contains("Labour Supply"));
        extentTest.log(LogStatus.PASS, "validate the labor supply display form");
    }


    //Cooperation - Labour Supply
    @When("input jumlah TK {int}")
    public void input_jumlah_tk(Integer jumlahTK) {
        Hooks.delay(0.5);
        nJumlahTK = jumlahTK;
        progressPage.setFieldJumlahTK(jumlahTK);
        extentTest.log(LogStatus.PASS, "Input jumlah TK");
    }

    @When("input biaya gaji TK {int}")
    public void input_biaya_gaji_tk(Integer biayaGaji) {
        Hooks.delay(0.5);
        nBiayaGaji = biayaGaji;
        progressPage.setFieldBiayagaji(biayaGaji);
        extentTest.log(LogStatus.PASS, "Input biaya gaji TK");
    }

    @When("input managementFee {int}")
    public void input_management_fee(Integer managementFee) {
        Hooks.delay(0.5);
        nManagementFee = managementFee;
        progressPage.setFieldManagementFee(managementFee);
        extentTest.log(LogStatus.PASS, "Input management fee");
    }

    @When("select sumber ppn {int}")
    public void select_sumber_ppn(Integer sumberPPN) {
        Hooks.delay(0.5);
        progressPage.selectSumberPPN(sumberPPN);
        extentTest.log(LogStatus.PASS, "Select sumber ppn");
    }

    @When("input ppn {int}")
    public void input_ppn(Integer ppn) {
        Hooks.delay(0.5);
        if (progressPage.fieldPpn.isDisplayed()) {
            nPpn = ppn;
            progressPage.setFieldPpn(ppn);
        } else {
            nPpn = 11;
        }
        extentTest.log(LogStatus.PASS, "Input ppn");
    }

    @When("click button calculate")
    public void click_button_calculate() {
        Hooks.delay(0.5);
        progressPage.clickBtnCalculate();
        extentTest.log(LogStatus.PASS, "Click button calculate");
    }

    @Then("validate input cooperation labour supply {string}")
    public void validate_input_cooperation_labour_supply(String status) {
        Hooks.delay(1);
        switch (status) {
            case "empty jumlah TK" -> {
                Assert.assertEquals(progressPage.getTxtEmptyJumlahTk(), "Jumlah TK harus diinput");
                extentTest.log(LogStatus.PASS, "Validate input cooperation labour supply with jumlah TK empty");
            }
            case "empty biaya gaji" -> {
                Assert.assertEquals(progressPage.getTxtEmptyBiayaGaji(), "Biaya Gaji/Tk harus diinput");
                extentTest.log(LogStatus.PASS, "Validate input cooperation labour supply with Biaya Gaji empty");
            }
            case "empty sumber ppn" -> {
                Assert.assertEquals(progressPage.getTxtEmptySumberPPN(), "Pilih Salah satu sumber PPN");
                extentTest.log(LogStatus.PASS, "Validate input cooperation labour supply with sumber PPN empty");
            }
            case "jumlah tk <= 0" -> {
                Assert.assertEquals(progressPage.getTxtJumlahTKUnder1(), "Minimal Jumlah Tk minimal adalah 1");
                extentTest.log(LogStatus.PASS, "Validate input cooperation labour supply with jumlah TK under 1");
            }
            case "biaya gaji <= 0" -> {
                Assert.assertEquals(progressPage.getTxtBiayaGajiUnder1(), "Minimal Biaya Gaji/Tk minimal adalah Rp 1");
                extentTest.log(LogStatus.PASS, "Validate input cooperation labour supply with biaya gaji under 1");
            }
            case "success" -> {
                resultBiayaGaji = nJumlahTK * nBiayaGaji;
                resultManagementFee = resultBiayaGaji * nManagementFee / 100;
                resultTotal = resultBiayaGaji + resultManagementFee;
                resultPPN = (resultBiayaGaji * nPpn / 100) + (resultManagementFee * nPpn / 100);
                resultGrandTotal = resultTotal + resultPPN;
                Assert.assertEquals(progressPage.getJumlahBiayaGaji(), resultBiayaGaji);
                Assert.assertEquals(progressPage.getManagementFee(), resultManagementFee);
                Assert.assertEquals(progressPage.getTotal(), resultTotal);
                Assert.assertEquals(progressPage.getPpn(), resultPPN);
                Assert.assertEquals(progressPage.getGrandTotal(), resultGrandTotal);
                Hooks.delay(1);
                progressPage.selectLabourSupply();
            }
        }

    }

    //Cooperation - Job Supply
    @When("ceklist jenis kerjasama job supply")
    public void ceklist_jenis_kerjasama_job_supply() {
        Hooks.delay(0.5);
        progressPage.selectJobSupply();
        extentTest.log(LogStatus.PASS, "ceklist jenis kerjasama job supply");
    }

    @Then("validate the job supply display form")
    public void validate_the_job_supply_display_form() {
        Hooks.delay(0.5);
        Assert.assertTrue(progressPage.getLabelJobSupply().contains("Job Supply"));
        extentTest.log(LogStatus.PASS, "validate the job supply display form");
    }

    @When("input qty target {int}")
    public void input_qty_target(Integer qty) {
        Hooks.delay(0.5);
        nQty = qty;
        progressPage.setFieldQty(qty);
        extentTest.log(LogStatus.PASS, "input qty target");
    }

    @When("input harga per qty {int}")
    public void input_harga_per_qty(Integer pricePerQty) {
        Hooks.delay(0.5);
        nHargaPerQty = pricePerQty;
        progressPage.setFieldPricePerQty(pricePerQty);
        extentTest.log(LogStatus.PASS, "Input harga per qty");
    }

    @When("pilih ppn job supply {int}")
    public void pilih_ppn_job_supply(Integer index) {
        Hooks.delay(0.5);
        if (index == 1) {
            nPpnJobSupply = 11;
        } else {
            nPpnJobSupply = 0;
        }
        progressPage.selectPPN(index);
        extentTest.log(LogStatus.PASS, "Pilih ppn job supply");
    }

    @When("click button calculate job supply")
    public void click_button_calculate_job_supply() {
        Hooks.delay(0.5);
        progressPage.clickBtnCalculate();
        extentTest.log(LogStatus.PASS, "Click button calculate job supply");
    }

    @Then("validate input cooperation job supply {string}")
    public void validate_input_cooperation_job_supply(String status) {
        Hooks.delay(1);
        jobSupplyTotalBiaya = nQty * nHargaPerQty;
        jobSupplyPPN = (jobSupplyTotalBiaya * nPpnJobSupply) / 100;
        jobSupplyGrandTotal = jobSupplyTotalBiaya + jobSupplyPPN;
        jobSupplyTotalCost = (70 * jobSupplyTotalBiaya) / 100;
        jobSupplyLaba = jobSupplyTotalBiaya - jobSupplyTotalCost;

        if (status.equals("empty qty target")) {
            Assert.assertEquals(progressPage.getTxtEmptyQty(), "Qty/Target harus diinput");
            extentTest.log(LogStatus.PASS, "Validate input cooperation job supply with Qty target empty");
        } else if (status.equals("empty harga per qty")) {
            Assert.assertEquals(progressPage.getTxtEmptyPricePerQty(), "Harga per QTY harus diinput");
            extentTest.log(LogStatus.PASS, "Validate input cooperation job supply with Price per Qty empty");
        } else if (status.equals("qty target under 1")) {
            Assert.assertEquals(progressPage.getTxtQtyUnder1(), "Minimal Qty adalah 1");
            extentTest.log(LogStatus.PASS, "Validate input cooperation job supply with qty target under 1");
        } else if (status.equals("harga per qty under 1")) {
            Assert.assertEquals(progressPage.getTxtPricePerQtyUnder1(), "Minimal Harga per QTY adalah 1");
            extentTest.log(LogStatus.PASS, "Validate input cooperation job supply with price per qty under 1");
        } else if (status.equals("empty ppn")) {
            Assert.assertEquals(progressPage.getTxtemptyPpn(), "Pilih Salah satu sumber PPN");
            extentTest.log(LogStatus.PASS, "Validate input cooperation job supply with ppn empty");
        } else if (status.equals("no ppn") || status.equals("success")) {
            Assert.assertEquals(progressPage.getJobSupplyTotalBiaya(), jobSupplyTotalBiaya);
//            System.out.println(jobSupplyTotalBiaya);
            Assert.assertEquals(progressPage.getJobSupplyPpn(), jobSupplyPPN);
//            System.out.println(jobSupplyPPN);
            Assert.assertEquals(progressPage.getJobSupplyGrandTotal(), jobSupplyGrandTotal);
//            System.out.println(jobSupplyGrandTotal);
            Assert.assertEquals(progressPage.getJobSupplyTotalCost(), jobSupplyTotalCost);
//            System.out.println(jobSupplyTotalCost);
            Assert.assertEquals(progressPage.getJobSupplyLaba(), jobSupplyLaba);
//            System.out.println(jobSupplyLaba);
            extentTest.log(LogStatus.PASS, "Successful validation of job supply form input");
            Hooks.delay(1);
            progressPage.selectJobSupply();
        }
    }

    //FACILITY MANAGEMENT
    @When("checklist jenis kerjasama facility management")
    public void checklist_jenis_kerjasama_facility_management() {
        Hooks.delay(0.5);
        progressPage.selectFacilityManagement();
        extentTest.log(LogStatus.PASS, "Checklist jenis kerjasama facility management");
    }

    @Then("validate the facility management display form")
    public void validate_the_facility_management_display_form() {
        Hooks.delay(0.5);
        Assert.assertEquals(progressPage.getLabelFormFm(), "Facility Management");
        extentTest.log(LogStatus.PASS, "Validate the facility management display form");
    }

    @When("input qty target facility management {int}")
    public void input_qty_target_facility_management(Integer qty) {
        Hooks.delay(0.5);
        fmQty = qty;
        progressPage.setFieldQtyFm(qty);
        extentTest.log(LogStatus.PASS, "Input qty target facility management");
    }

    @When("input harga per qty facility management {int}")
    public void input_harga_per_qty_facility_management(Integer pricePerQty) {
        Hooks.delay(0.5);
        fmPricePerQty = pricePerQty;
        progressPage.setFieldPricePerQtyFm(pricePerQty);
        extentTest.log(LogStatus.PASS, "Input price per qty facility management");
    }

    @When("pilih ppn facility management {int}")
    public void pilih_ppn_facility_management(Integer index) {
        Hooks.delay(0.5);
        if (index == 1) {
            fmPpn = 11;
        } else {
            fmPpn = 0;
        }
        progressPage.selectPpnFm(index);
        extentTest.log(LogStatus.PASS, "pilih ppn facility management");
    }

    @When("click button calculate facility management")
    public void click_button_calculate_facility_management() {
        Hooks.delay(0.5);
        progressPage.clickBtnCalculate();
        extentTest.log(LogStatus.PASS, "Click button calculate facility management");
    }

    @Then("validate input cooperation facility management {string} {int}")
    public void validate_input_cooperation_facility_management(String status, int ppn) {
        Hooks.delay(0.5);
        //Calculate
        fmTotalResult = fmQty * fmPricePerQty;
        fmPpnResult = (fmTotalResult * fmPpn) / 100;
        fmGrandTotal = fmTotalResult + fmPpnResult;
        fmTotalPayment = (70 * fmTotalResult) / 100;
        fmLoss = fmTotalResult - fmTotalPayment;

        if (status.equals("empty qty target")) {
            Assert.assertEquals(progressPage.getTxtEmptyFmQty(), "Qty/Target harus diinput");
            extentTest.log(LogStatus.PASS, "Validate input cooperation facility management with Qty target empty");
        } else if (status.equals("empty harga per qty")) {
            Assert.assertEquals(progressPage.getTxtEmptyFmPricePerQty(), "Harga per QTY harus diinput");
            extentTest.log(LogStatus.PASS, "Validate input cooperation facility management with harga per Qty empty");
        } else if (status.equals("qty target under 1")) {
            Assert.assertEquals(progressPage.getTxtFmQtyUnder1(), "Minimal Qty adalah 1");
            extentTest.log(LogStatus.PASS, "Validate input cooperation facility management with Qty target under 1");
        } else if (status.equals("harga per qty under 1")) {
            Assert.assertEquals(progressPage.getTxtFmPricePerQtyUnder1(), "Minimal Harga per QTY adalah 1");
            extentTest.log(LogStatus.PASS, "Validate input cooperation facility management with harga per Qty under 1");
        } else if (status.equals("empty ppn")) {
            Assert.assertEquals(progressPage.getTxtEmptyFmPpn(), "Pilih Salah satu sumber PPN");
            extentTest.log(LogStatus.PASS, "Validate input cooperation facility management with ppn empty");
        } else if (status.equals("success") || status.equals("does't use ppn")) {
            Assert.assertEquals(progressPage.getFmTotal(), fmTotalResult);
            Assert.assertEquals(progressPage.getFmPpn(), fmPpnResult);
            Assert.assertEquals(progressPage.getFmGrandTotal(), fmGrandTotal);
            Assert.assertEquals(progressPage.getFmTotalPayment(), fmTotalPayment);
            Assert.assertEquals(progressPage.getFmLoss(), fmLoss);
            extentTest.log(LogStatus.PASS, "Successful validation of facility management form input");
            Hooks.delay(0.5);
            if (ppn == 1) {
                progressPage.selectFacilityManagement();
            }
        }
//        switch (status) {
//            case "empty qty target" -> {
//                Assert.assertEquals(progressPage.getTxtEmptyFmQty(), "Qty/Target harus diinput");
//                extentTest.log(LogStatus.PASS, "Validate input cooperation facility management with Qty target empty");
//            }
//            case "empty harga per qty" -> {
//                Assert.assertEquals(progressPage.getTxtEmptyFmPricePerQty(), "Harga per QTY harus diinput");
//                extentTest.log(LogStatus.PASS, "Validate input cooperation facility management with harga per Qty empty");
//            }
//            case "qty target under 1" -> {
//                Assert.assertEquals(progressPage.getTxtFmQtyUnder1(), "Minimal Qty adalah 1");
//                extentTest.log(LogStatus.PASS, "Validate input cooperation facility management with Qty target under 1");
//            }
//            case "harga per qty under 1" -> {
//                Assert.assertEquals(progressPage.getTxtFmPricePerQtyUnder1(), "Minimal Harga per QTY adalah 1");
//                extentTest.log(LogStatus.PASS, "Validate input cooperation facility management with harga per Qty under 1");
//            }
//            case "empty ppn" -> {
//                Assert.assertEquals(progressPage.getTxtEmptyFmPpn(), "Pilih Salah satu sumber PPN");
//                extentTest.log(LogStatus.PASS, "Validate input cooperation facility management with ppn empty");
//            }
//
//            default -> {
//                Assert.assertEquals(progressPage.getFmTotal(), fmTotalResult);
//                Assert.assertEquals(progressPage.getFmPpn(), fmPpnResult);
//                Assert.assertEquals(progressPage.getFmGrandTotal(), fmGrandTotal);
//                Assert.assertEquals(progressPage.getFmTotalPayment(), fmTotalPayment);
//                Assert.assertEquals(progressPage.getFmLoss(), fmLoss);
//                extentTest.log(LogStatus.PASS, "Successful validation of facility management form input");
//                Hooks.delay(1);
//                progressPage.selectFacilityManagement();
//            }
//        }
    }

    // RECRUITMENT SERVICE
    @When("checklist jenis kerjasama recruitment service")
    public void checklist_jenis_kerjasama_recruitment_service() {
        Hooks.delay(0.5);
        progressPage.selectRecruitmentService();
        extentTest.log(LogStatus.PASS, "Checklist jenis kerjasama recruitment service");
    }

    @Then("validate input coorperation recruitment service")
    public void validate_input_coorperation_recruitment_service() {
        Hooks.delay(0.5);
        Assert.assertEquals(progressPage.getLabelRs(), "Recruitment Services");
        extentTest.log(LogStatus.PASS, "Validate input coorperation recruitment services");
    }

    @When("input jumlah tk recruitment service {int}")
    public void input_jumlah_tk_recruitment_service(Integer amount) {
        Hooks.delay(0.5);
        rsAmount = amount;
        progressPage.setRsAmount(amount);
        extentTest.log(LogStatus.PASS, "Input jumlah tk recruitment service");
    }

    @When("input biaya gaji tk recruitment service {int}")
    public void input_biaya_gaji_tk_recruitment_service(Integer salary) {
        Hooks.delay(0.5);
        rsSalary = salary;
        progressPage.setRsSalary(salary);
        extentTest.log(LogStatus.PASS, "Input biaya gaji tk recruitment service");
    }

    @When("input management fee recruitment service {int}")
    public void input_management_fee_recruitment_service(Integer mfee) {
        Hooks.delay(0.5);
        rsMfee = mfee;
        progressPage.setRsMfee(mfee);
        extentTest.log(LogStatus.PASS, "Input management fee recruitment service");
    }

    @When("click button calculate recruitment service")
    public void click_button_calculate_recruitment_service() {
        Hooks.delay(0.5);
        progressPage.clickBtnCalculate();
        extentTest.log(LogStatus.PASS, "click button calculate recruitment service");
    }

    @Then("validate input coorperation recruitment service {string}")
    public void validate_input_coorperation_recruitment_service(String status) {
        Hooks.delay(0.5);

        switch (status) {
            case "amount empty" -> {
                Assert.assertEquals(progressPage.getRsAmountEmpty(), "Jumlah TK harus diinput");
                extentTest.log(LogStatus.PASS, "Validate input cooperation Recruitment services with jumlah tk empty");
            }
            case "salary empty" -> {
                Assert.assertEquals(progressPage.getRsSalaryEmpty(), "Biaya Gaji/Tk harus diinput");
                extentTest.log(LogStatus.PASS, "Validate input cooperation Recruitment services with Biaya gaji/tk empty");
            }
            case "amount under 1" -> {
                Assert.assertEquals(progressPage.getRsAmountUnder1(), "Minimal Jumlah Tk minimal adalah 1");
                extentTest.log(LogStatus.PASS, "Validate input cooperation Recruitment services with jumlah tk under 1");
            }
            case "salary under 1" -> {
                Assert.assertEquals(progressPage.getRsSalaryUnder1(), "Minimal Biaya Gaji/Tk minimal adalah Rp 1");
                extentTest.log(LogStatus.PASS, "Validate input cooperation Recruitment services with biaya gaji/tk under 1");
            }
            case "success" -> {
                //Calculate Recruitment Services
                rsTotalSalary = rsAmount * rsSalary;
                rsSalaryPerYear = rsTotalSalary * 13;
                rsTotalFee = (rsSalaryPerYear * rsMfee) / 100;
                rsTotalWorker = rsTotalFee / rsAmount;
                //Validation calculate Recruitment services
                Assert.assertEquals(progressPage.getRsTotalSalary(), rsTotalSalary);
                Assert.assertEquals(progressPage.getRsSalaryPerYear(), rsSalaryPerYear);
                Assert.assertEquals(progressPage.getRsTotalFee(), rsTotalFee);
                Assert.assertEquals(progressPage.getRsTotalWorker(), rsTotalWorker);
                extentTest.log(LogStatus.PASS, "Successful validation of Recruitment service form input");
                Hooks.delay(1);
                progressPage.selectRecruitmentService();
            }
        }
    }

    //TRAINING
    @When("checklist jenis kerjasama training")
    public void checklist_jenis_kerjasama_training() {
        Hooks.delay(0.5);
        progressPage.selectTraining();
        extentTest.log(LogStatus.PASS, "checklist jenis kerjasama training");
    }

    @Then("validate input coorperation training")
    public void validate_input_coorperation_training() {
        Hooks.delay(0.5);
        Assert.assertEquals(progressPage.getLabelTraining(), "Training");
        extentTest.log(LogStatus.PASS, "validate input coorperation training");
    }

    @When("input qty target training {int}")
    public void input_qty_target_training(Integer qty) {
        Hooks.delay(0.5);
        tQty = qty;
        progressPage.setTrainQty(qty);
        extentTest.log(LogStatus.PASS, "Input qty target training");
    }

    @When("input harga per qty training {int}")
    public void input_harga_per_qty_training(Integer pricePerQty) {
        Hooks.delay(0.5);
        tPricePerQty = pricePerQty;
        progressPage.setTrainPricePerQty(pricePerQty);
        extentTest.log(LogStatus.PASS, "Input harga per qty training");
    }

    @When("pilih ppn training {int}")
    public void pilih_ppn_training(Integer ppn) {
        Hooks.delay(0.5);
        if (ppn == 1) {
            tPpn = 11;
        } else {
            tPpn = 0;
        }
        progressPage.setTrainPpn(ppn);
        extentTest.log(LogStatus.PASS, "pilih ppn training");

    }

    @When("click button calculate training")
    public void click_button_calculate_training() {
        Hooks.delay(0.5);
        progressPage.clickBtnCalculate();
        extentTest.log(LogStatus.PASS, "Click button calculate training");
    }

    @Then("validate input cooperation training {string} {int}")
    public void validate_input_cooperation_training(String status, Integer ppn) {
        Hooks.delay(0.5);

        switch (status) {
            case "empty qty target" -> {
                Assert.assertEquals(progressPage.getTxtTrainingQtyEmpty(), "Qty/Target harus diinput");
                extentTest.log(LogStatus.PASS, "Validate input cooperation training with qty target empty");
            }
            case "empty harga per qty" -> {
                Assert.assertEquals(progressPage.getTxtTrainingPricePerQtyEmpty(), "Harga per QTY harus diinput");
                extentTest.log(LogStatus.PASS, "Validate input cooperation training with price per qty empty");
            }
            case "qty target under 1" -> {
                Assert.assertEquals(progressPage.getTxtTrainingMinQty(), "Minimal Qty adalah 1");
                extentTest.log(LogStatus.PASS, "Validate input cooperation training with qty input minimal value");
            }
            case "harga per qty under 1" -> {
                Assert.assertEquals(progressPage.getTxtTrainingMinPricePerQty(), "Minimal Harga per QTY adalah Rp 1");
                extentTest.log(LogStatus.PASS, "Validate input cooperation training with price per qty input minimal value");
            }
            case "empty ppn" -> {
                Assert.assertEquals(progressPage.getTxtTrainingPpnEmpty(), "Pilih Salah satu sumber PPN");
                extentTest.log(LogStatus.PASS, "Validate input cooperation training with empty Ppn");
            }
            default -> {
                //Calculate Training
                trainingTotal = tQty * tPricePerQty;
                trainingPpn = (trainingTotal * tPpn) / 100;
                trainingGrandTotal = trainingTotal + trainingPpn;
                trainingTotalCost = (70 * trainingTotal) / 100;
                trainingLoss = trainingTotal - trainingTotalCost;
                fEstimateFund = trainingGrandTotal;

                //Validation
                Assert.assertEquals(progressPage.getTrainingTotal(), trainingTotal);
                Assert.assertEquals(progressPage.getTrainingPpn(), trainingPpn);
                Assert.assertEquals(progressPage.getTrainingGrandTotal(), trainingGrandTotal);
                Assert.assertEquals(progressPage.getTrainingTotalCost(), trainingTotalCost);
                Assert.assertEquals(progressPage.getTrainingLoss(), trainingLoss);
                extentTest.log(LogStatus.PASS, "Successful validation of Training form input");
                Hooks.delay(1);
            }
        }
    }

    //FUNDS
    @Then("validation fund according to cooperative calculations")
    public void validation_fund_according_to_cooperative_calculations() {
        Hooks.delay(0.5);
        fEstimateFund = progressPage.getTrainingGrandTotal();
        Assert.assertEquals(progressPage.getEstimateFound(), fEstimateFund);
        extentTest.log(LogStatus.PASS, "Validation fund according to cooperative calculations");
    }

    @When("input payment term {int}")
    public void input_payment_term(int paymentTerm) {
        Hooks.delay(0.5);
        fPaymentTerm = paymentTerm;
        progressPage.setPaymentTerm(paymentTerm);
        extentTest.log(LogStatus.PASS, "input payment term");
    }

    @Then("check fund turnover month {string}")
    public void check_fund_turnover_month(String status) {
        Hooks.delay(0.5);

        switch (status) {
            case "payment term min value" -> {
                Assert.assertEquals(progressPage.getPaymentTermMinValue(), "Termin Pembayaran minimal 1 Bulan");
                extentTest.log(LogStatus.PASS, "check fund turnover month with input payment term min value");
            }
            case "payment term max value" -> {
                Assert.assertEquals(progressPage.getPaymentTermMaxValue(), "Termin Pembayaran tidak boleh lebih dari 3 Bulan");
                extentTest.log(LogStatus.PASS, "check fund turnover month with input payment term max value");
            }
            default -> {
                fundTurnoverMonth = fPaymentTerm + 2;

                Assert.assertEquals(progressPage.getFundTurnoverMonth(), fundTurnoverMonth);
                extentTest.log(LogStatus.PASS, "check fund turnover month");
            }

        }
    }

    @Then("check result fund turn over {string}")
    public void check_result_fund_turn_over(String status) {
        Hooks.delay(0.5);

        switch (status) {
            case "payment term min value" -> {
                Assert.assertEquals(progressPage.getPaymentTermMinValue(), "Termin Pembayaran minimal 1 Bulan");
                extentTest.log(LogStatus.PASS, "check fund turnover month with input payment term min value");
            }
            case "payment term max value" -> {
                Assert.assertEquals(progressPage.getPaymentTermMaxValue(), "Termin Pembayaran tidak boleh lebih dari 3 Bulan");
                extentTest.log(LogStatus.PASS, "check fund turnover month with input payment term max value");
            }
            default -> {
                fEstimateFund = progressPage.getTrainingGrandTotal();
                fundTunrover = fEstimateFund * fundTurnoverMonth;
                Assert.assertEquals(progressPage.getFundTurnover(), fundTunrover);
                extentTest.log(LogStatus.PASS, "check result fund turn over");
            }
        }
    }

    // CLIENT DATA ASSESSMENT - GENERAL
    @When("input established year {string}")
    public void input_established_year(String year) {
        Hooks.delay(0.5);
        progressPage.setEstablishedYear(year);
        extentTest.log(LogStatus.PASS, "input established year");
    }

    @When("input total employees {string}")
    public void input_total_employees(String totalEmployee) {
        Hooks.delay(0.5);
        progressPage.setTotalEmployee(totalEmployee);
        extentTest.log(LogStatus.PASS, "input total employees");
    }

    @When("select office type {int}")
    public void select_office_type(Integer index) {
        Hooks.delay(0.5);
        progressPage.setOfficeType(index);
        extentTest.log(LogStatus.PASS, "select office type");
    }

    @Then("validate input form CA General {string}")
    public void validate_input_form_ca_general(String status) {
        Hooks.delay(0.5);

        switch (status) {
            case "established year empty" -> {
                Assert.assertEquals(progressPage.getEstablishedYearEmpty(), "Tahun Berdiri Harus Diisi!");
                extentTest.log(LogStatus.PASS, "Validate input form CA General with established year empty");
            }
            case "total employee empty" -> {
                Assert.assertEquals(progressPage.getTotalEmployeeEmpty(), "Total Karyawan Harus Diisi!");
                extentTest.log(LogStatus.PASS, "Validate input form CA General with total employee empty");
            }
            case "office type empty" -> {
                Assert.assertEquals(progressPage.getOfficeTypeEmpty(), "Tipe Gedung Harus Dipilih!");
                extentTest.log(LogStatus.PASS, "Validate input form CA General with office type empty");
            }
            default -> extentTest.log(LogStatus.PASS, "Validate input form CA General with valid credentials");
        }
    }

    //CLIENT DATA ASSESSMENT - COMPANY RATING
    @When("select company rating {int}")
    public void select_company_rating(Integer index) {
        Hooks.delay(0.5);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", progressPage.companyRating);
        progressPage.setCompanyRating(index);
        extentTest.log(LogStatus.PASS, "select company rating");
    }

    @Then("validate input form CA company rating {string}")
    public void validate_input_form_ca_company_rating(String status) {
        Hooks.delay(0.5);
        if ("company rating empty".equals(status)) {
            Assert.assertEquals(progressPage.getCompanyRatingEmpty(), "Rating Harus Dipilih!");
            extentTest.log(LogStatus.PASS, "validate input form CA company rating is empty");
        } else {
            extentTest.log(LogStatus.PASS, "validate input form CA company rating");
        }
    }

    //CLIENT DATA ASSESSMENT - FINANSIAL
    @When("select finansial {int}")
    public void select_finansial(Integer index) {
        Hooks.delay(0.5);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", progressPage.finansial);
        progressPage.setFinansial(index);
        extentTest.log(LogStatus.PASS, "Select finansial");
    }

    @Then("validate input form CA finansial {string}")
    public void validate_input_form_ca_finansial(String status) {
        Hooks.delay(0.5);
        if ("finansial empty".equals(status)) {
            Assert.assertEquals(progressPage.getFinansialEmpty(), "Finansial Harus Dipilih!");
            extentTest.log(LogStatus.PASS, "validate input form CA finansial is empty");
        } else {
            extentTest.log(LogStatus.PASS, "validate input form CA finansial");
        }
    }

    //CLIENT DATA ASSESSMENT - LEGALITAS
    @When("select ojk {int}")
    public void select_ojk(Integer ojk) {
        Hooks.delay(0.5);
        progressPage.setOjk(ojk);
        extentTest.log(LogStatus.PASS, "select ojk");
    }

    @When("select aftech {int}")
    public void select_aftech(Integer aftech) {
        Hooks.delay(0.5);
        progressPage.setAftech(aftech);
        extentTest.log(LogStatus.PASS, "select aftech");
    }

    @When("select afpi {int}")
    public void select_afpi(Integer afpi) {
        Hooks.delay(0.5);
        progressPage.setAfpi(afpi);
        extentTest.log(LogStatus.PASS, "select afpi");
    }

    @Then("validate input form ca legalitas {string}")
    public void validate_input_form_ca_legalitas(String status) {
        Hooks.delay(0.5);

        switch (status) {
            case "ojk empty" -> {
                Assert.assertEquals(progressPage.getOjkEmpty(), "OJK Harus Dipilih!");
                extentTest.log(LogStatus.PASS, "Validate input form CA legalitas with ojk empty");
            }
            case "aftech empty" -> {
                Assert.assertEquals(progressPage.getAftechEmpty(), "AFTECH Harus Dipilih!");
                extentTest.log(LogStatus.PASS, "Validate input form CA legalitas with aftech empty");
            }
            case "afpi empty" -> {
                Assert.assertEquals(progressPage.getAfpiEmpty(), "AFPI Harus Dipilih!");
                extentTest.log(LogStatus.PASS, "Validate input form CA legalitas with afpi empty");
            }
            default -> extentTest.log(LogStatus.PASS, "Validate input form CA legalitas");

        }
    }

    //CLIENT DATA ASSESSMENT - Informasi Lainnya
    @When("select company owner {int}")
    public void select_company_owner(Integer companyOwner) {
        Hooks.delay(0.5);
        progressPage.setCompanyOwner(companyOwner);
        extentTest.log(LogStatus.PASS, "Select company owner");
    }

    @When("input owner name {string}")
    public void input_owner_name(String status) {
        Hooks.delay(0.5);
        progressPage.setOwnerName(status);
        extentTest.log(LogStatus.PASS, "Input owner name");
    }

    @When("input direktur utama")
    public void input_direktur_utama() {
        Hooks.delay(0.5);
        progressPage.setDirectorUtama();
        extentTest.log(LogStatus.PASS, "Input direktur utama");
    }

    @When("input direksi1")
    public void input_direksi1() {
        Hooks.delay(0.5);
        progressPage.setDireksi1();
        extentTest.log(LogStatus.PASS, "Input direksi1");
    }

    @When("input direksi2")
    public void input_direksi2() {
        Hooks.delay(0.5);
        progressPage.setDireksi2();
        extentTest.log(LogStatus.PASS, "Input Direksi2");
    }

    @When("input direksi3")
    public void input_direksi3() {
        Hooks.delay(0.5);
        progressPage.setDireksi3();
        extentTest.log(LogStatus.PASS, "Input Direksi3");
    }

    @When("select company info {int}")
    public void select_company_info(Integer companyInfo) {
        Hooks.delay(0.5);
        progressPage.setCompanyInfo(companyInfo);
        extentTest.log(LogStatus.PASS, "Select company info");
    }

    @When("input additional info")
    public void input_additional_info() {
        Hooks.delay(0.5);
        progressPage.setAdditionalInfo();
        extentTest.log(LogStatus.PASS, "Input Additional info");
    }

    @Then("validasi input form ca informasi lainnya {string}")
    public void validasi_input_form_ca_informasi_lainnya(String status) {
        Hooks.delay(0.5);

        switch (status) {
            case "company owner empty" -> {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", progressPage.companyOwner);
                Assert.assertEquals(progressPage.getCompanyOwnerEmpty(), "Pemilik Perusahaan Harus Disi!");
                extentTest.log(LogStatus.PASS, "Validasi input form CA informasi lainnya with company owner empty");
            }
            case "owner name empty" -> {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", progressPage.ownerName);
                Assert.assertEquals(progressPage.getOwnerNameEmpty(), "Nama Pemilik Harus Disi!");
                extentTest.log(LogStatus.PASS, "Validasi input form CA informasi lainnya with owner name empty");
            }
            case "company info empty" -> {
                Assert.assertEquals(progressPage.getCompanyInfoEmpty(), "Informasi Perusahaan Harus Disi!");
                extentTest.log(LogStatus.PASS, "Validasi input form CA informasi lainnya with company info empty");
            }
            default -> extentTest.log(LogStatus.PASS, "Validasi success input form ca informasi lainnya");
        }
    }

    //Submit data Client Assessment
    @When("click button submit")
    public void click_button_submit() {
        Hooks.delay(0.5);
        progressPage.clickBtnSubmitCA();
        extentTest.log(LogStatus.PASS,"Click button submit");
    }

    @Then("validasi submit form client assessment")
    public void validasi_submit_form_client_assessment() {
        Hooks.delay(0.5);
        Assert.assertEquals(progressPage.getAlertSuccessCa(),"Sukses menambahkan Client Assessment");
        extentTest.log(LogStatus.PASS,"Validasi submit form client assessment");
    }

    //endregion
}