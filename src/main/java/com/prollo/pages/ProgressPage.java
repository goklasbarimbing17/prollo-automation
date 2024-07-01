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

    //Facility Management
    @FindBy(xpath = "//span[normalize-space()='Facility Management']")
    WebElement facilityManagement;
    @FindBy(xpath = "//div[normalize-space()='Facility Management']")
    WebElement labelFacilityManagement;
    @FindBy(xpath = "//input[@id='facility_management.qty']")
    WebElement fieldQtyFm;
    @FindBy(xpath = "//input[@id='facility_management.price_per_qty']")
    WebElement fieldPricePerQtyFm;
    @FindBy(xpath = "//select[@id='facility_management.is_ppn']")
    WebElement fieldFacilityManagementPpn;
    @FindBy(xpath = "//input[@id='fm_total']")
    WebElement fmTotal;
    @FindBy(xpath = "//input[@id='fm_ppn']")
    WebElement fmPpn;
    @FindBy(xpath = "//input[@id='fm_grand_total']")
    WebElement fmGrandTotal;
    @FindBy(xpath = "//input[@id='fm_total_payment']")
    WebElement fmTotalPayment;
    @FindBy(xpath = "//input[@id='fm_loss']")
    WebElement fmLoss;
    @FindBy(xpath = "//*[contains(text(), 'Qty/Target harus diinput')]")
    WebElement emptyFmQty;
    @FindBy(xpath = "//*[contains(text(), 'Harga per QTY harus diinput')]")
    WebElement emptyFmPricePerQty;
    @FindBy(xpath = "//*[contains(text(), 'Pilih Salah satu sumber PPN')]")
    WebElement emptyFmPpn;
    @FindBy(xpath = "//*[contains(text(), 'Minimal Qty adalah 1')]")
    WebElement fmQtyUnder1;
    @FindBy(xpath = "//*[contains(text(), 'Minimal Harga per QTY adalah 1')]")
    WebElement fmPricePerQtyUnder1;
    @FindBy(xpath = "//body[1]/div[6]/div[4]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/label[4]/input[1]")
    public WebElement cbFm;


    //Recruitment Service
    @FindBy(xpath = "//span[normalize-space()='Recruitment Services']")
    WebElement recruitmentService;
    @FindBy(xpath = "//div[normalize-space()='Recruitment Services']")
    WebElement labelRecruitmentService;
    @FindBy(xpath = "//input[@id='recruitment_service.amount']")
    WebElement rsAmount;
    @FindBy(xpath = "//input[@id='recruitment_service.salary']")
    WebElement rsSalary;
    @FindBy(xpath = "//input[@id='recruitment_service.fee']")
    WebElement rsMfee;
    @FindBy(xpath = "//input[@id='rs_total_slaray']")
    WebElement rsTotalSalary;
    @FindBy(xpath = "//input[@id='rs_total_salary_per_year']")
    WebElement rsSalaryPerYear;
    @FindBy(xpath = "//input[@id='rs_total_fee']")
    WebElement rsTotalFee;
    @FindBy(xpath = "//input[@id='rs_total_worker']")
    WebElement rsTotalWorker;
    @FindBy(xpath = "//*[contains(text(), 'Jumlah TK harus diinput')]")
    WebElement rsAmountEmpty;
    @FindBy(xpath = "//*[contains(text(), 'Biaya Gaji/Tk harus diinput')]")
    WebElement rsSalaryEmpty;
    @FindBy(xpath = "//*[contains(text(), 'Minimal Jumlah Tk minimal adalah 1')]")
    WebElement rsAmountUnder1;
    @FindBy(xpath = "//*[contains(text(), 'Minimal Biaya Gaji/Tk minimal adalah Rp 1')]")
    WebElement rsSalaryUnder1;

    //Training
    @FindBy(xpath = "//span[normalize-space()='Training']")
    WebElement training;
    @FindBy(xpath = "//div[normalize-space()='Training']")
    WebElement labelTraining;
    @FindBy(xpath = "//input[@id='training.qty']")
    WebElement trainingQty;
    @FindBy(xpath = "//input[@id='training.price_per_qty']")
    WebElement trainingPricePerQty;
    @FindBy(xpath = "//select[@id='training.is_ppn']")
    WebElement trainingIsPpn;
    @FindBy(xpath = "//input[@id='training_total']")
    WebElement trainingTotal;
    @FindBy(xpath = "//input[@id='training_ppn']")
    WebElement trainingPpn;
    @FindBy(xpath = "//input[@id='training_grand_total']")
    WebElement trainingGrandTotal;
    @FindBy(xpath = "//input[@id='training_total_cost']")
    WebElement trainingTotalCost;
    @FindBy(xpath = "//input[@id='training_loss']")
    WebElement trainingLoss;
    @FindBy(xpath = "//*[contains(text(), 'Qty/Target harus diinput')]")
    WebElement trainingQtyEmpty;
    @FindBy(xpath = "//*[contains(text(), 'Harga per QTY harus diinput')]")
    WebElement trainingPricePerQtyEmpty;
    @FindBy(xpath = "//*[contains(text(), 'Pilih Salah satu sumber PPN')]")
    WebElement trainingIsPpnEmpty;
    @FindBy(xpath = "//*[contains(text(), 'Minimal Qty adalah 1')]")
    WebElement trainingMinQty;
    @FindBy(xpath = "//*[contains(text(), 'Minimal Harga per QTY adalah Rp 1')]")
    WebElement trainingMinPricePerQty;

    //FUNDS
    @FindBy(xpath = "//input[@id='estimated_fund']")
    WebElement estimatedFund;
    @FindBy(xpath = "//input[@id='payment_term']")
    WebElement paymentTerm;
    @FindBy(xpath = "//input[@id='fund_turnover_month']")
    WebElement fundTurnoverMonth;
    @FindBy(xpath = "//input[@id='fund_turnover']")
    WebElement fundTurnover;
    @FindBy(xpath = "//*[contains(text(), 'Termin Pembayaran minimal 1 Bulan')]")
    WebElement paymentTermMinValue;
    @FindBy(xpath = "//*[contains(text(), 'Termin Pembayaran tidak boleh lebih dari 3 Bulan')]")
    WebElement paymentTermMaxValue;

    //Client Data Assessment - General
    @FindBy(xpath = "//input[@id='data_scoring.established_year']")
    WebElement establishedYear;
    @FindBy(xpath = "//input[@id='data_scoring.total_employees']")
    WebElement totalEmployees;
    @FindBy(xpath = "//select[@id='data_scoring.office_type']")
    WebElement officeType;
    @FindBy(xpath = "//*[contains(text(), 'Tahun Berdiri Harus Diisi!')]")
    WebElement establishedYearEmpty;
    @FindBy(xpath = "//*[contains(text(), 'Total Karyawan Harus Diisi!')]")
    WebElement totalEmployeesEmpty;
    @FindBy(xpath = "//*[contains(text(), 'Tipe Gedung Harus Dipilih!')]")
    WebElement officeTypeEmpty;

    //Client Data Assessment - Company Rating
    @FindBy(xpath = "//select[@id='data_scoring.company_rating']")
    public WebElement companyRating;
    @FindBy(xpath = "//*[contains(text(), 'Rating  Harus Dipilih!')]")
    WebElement companyRatingEmpty;

    //Client Data Assessment - Finansial
    @FindBy(xpath = "//select[@id='data_scoring.finance']")
    public WebElement finansial;
    @FindBy(xpath = "//*[contains(text(), 'Finansial Harus Dipilih!')]")
    WebElement finansialEmpty;

    //Client Data Assessment - Legalitas
    @FindBy(xpath = "//select[@id='data_scoring.ojk']")
    WebElement ojk;
    @FindBy(xpath = "//select[@id='data_scoring.aftech']")
    WebElement aftech;
    @FindBy(xpath = "//select[@id='data_scoring.afpi']")
    WebElement afpi;
    @FindBy(xpath = "//*[contains(text(), 'OJK Harus Dipilih!')]")
    WebElement ojkEmpty;
    @FindBy(xpath = "//*[contains(text(), 'AFTECH Harus Dipilih!')]")
    WebElement aftechEmpty;
    @FindBy(xpath = "//*[contains(text(), 'AFPI Harus Dipilih!')]")
    WebElement afpiEmpty;

    //Client Data Assessment - Informasi Lainnya
    @FindBy(xpath = "//select[@id='data_scoring.company_owner']")
    public WebElement companyOwner;
    @FindBy(xpath = "//input[@id='data_scoring.owner_name']")
    public WebElement ownerName;
    @FindBy(xpath = "//input[@id='data_scoring.director_1']")
    WebElement directorUtama;
    @FindBy(xpath = "//input[@id='data_scoring.director_2']")
    WebElement direksi1;
    @FindBy(xpath = "//input[@id='data_scoring.director_3']")
    WebElement direksi2;
    @FindBy(xpath = "//input[@id='data_scoring.director_4']")
    WebElement direksi3;
    @FindBy(xpath = "//select[@id='data_scoring.company_info']")
    WebElement companyInfo;
    @FindBy(xpath = "//textarea[@id='data_scoring.additional_info']")
    WebElement additionalInfo;
    @FindBy(xpath = "//*[contains(text(), ' Pemilik Perusahaan  Harus Disi!')]")
    WebElement companyOwnerEmpty;
    @FindBy(xpath = "//*[contains(text(), ' Nama Pemilik  Harus Disi!')]")
    WebElement ownerNameEmpty;
    @FindBy(xpath = "//*[contains(text(), ' Informasi Perusahaan  Harus Disi!')]")
    WebElement companyInfoEmpty;

    //Submit data Client Assessment
    @FindBy(xpath = "//button[normalize-space()='Submit']")
    WebElement btnSubmitCa;
    @FindBy(xpath = "(//div[@id='toast-1-title'])[1]")
    WebElement alertSuccessCA;


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

    public void selectJobSupply() {
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

    public void selectFacilityManagement() {
        this.facilityManagement.click();
    }

    public String getLabelFormFm() {
        return this.labelFacilityManagement.getText();
    }

    public void setFieldQtyFm(Integer qty) {
        if (qty == -1) {
            this.fieldQtyFm.clear();
        } else {
            this.fieldQtyFm.clear();
            this.fieldQtyFm.sendKeys(String.valueOf(qty));
        }
    }

    public void setFieldPricePerQtyFm(Integer pricePerQty) {
        if (pricePerQty == -1) {
            this.fieldPricePerQtyFm.clear();
        } else {
            this.fieldPricePerQtyFm.clear();
            this.fieldPricePerQtyFm.sendKeys(String.valueOf(pricePerQty));
        }
    }

    public void selectPpnFm(Integer index) {
        Select dropdownPpnFm = new Select(fieldFacilityManagementPpn);
        dropdownPpnFm.selectByIndex(index);
    }

    public int getFmTotal() {
        String totalOriginal = this.fmTotal.getAttribute("value");
        String totalReplace = totalOriginal.replaceAll("\\.", "");
        return Integer.parseInt(totalReplace);
    }

    public int getFmPpn() {
        String ppnOriginal = this.fmPpn.getAttribute("value");
        String ppnReplace = ppnOriginal.replaceAll("\\.", "");
        return Integer.parseInt(ppnReplace);
    }

    public int getFmGrandTotal() {
        String grandTotalOriginal = this.fmGrandTotal.getAttribute("value");
        String grandTotalReplace = grandTotalOriginal.replaceAll("\\.", "");
        return Integer.parseInt(grandTotalReplace);
    }

    public int getFmTotalPayment() {
        String totalPaymentOriginal = this.fmTotalPayment.getAttribute("value");
        String totalPaymentReplace = totalPaymentOriginal.replaceAll("\\.", "");
        return Integer.parseInt(totalPaymentReplace);
    }

    public int getFmLoss() {
        String lossOriginal = this.fmLoss.getAttribute("value");
        String lossReplace = lossOriginal.replaceAll("\\.", "");
        return Integer.parseInt(lossReplace);
    }

    public String getTxtEmptyFmQty() {
        return this.emptyFmQty.getText();
    }

    public String getTxtEmptyFmPricePerQty() {
        return this.emptyFmPricePerQty.getText();
    }

    public String getTxtEmptyFmPpn() {
        return this.emptyFmPpn.getText();
    }

    public String getTxtFmQtyUnder1() {
        return this.fmQtyUnder1.getText();
    }

    public String getTxtFmPricePerQtyUnder1() {
        return this.fmPricePerQtyUnder1.getText();
    }

    public void selectRecruitmentService() {
        this.recruitmentService.click();
    }

    public String getLabelRs() {
        return this.labelRecruitmentService.getText();
    }

    public void setRsAmount(Integer amount) {
        if (amount == -1) {
            this.rsAmount.clear();
        } else {
            this.rsAmount.clear();
            this.rsAmount.sendKeys(String.valueOf(amount));
        }
    }

    public void setRsSalary(Integer salary) {
        if (salary == -1) {
            this.rsSalary.clear();
        } else {
            this.rsSalary.clear();
            this.rsSalary.sendKeys(String.valueOf(salary));
        }
    }

    public void setRsMfee(Integer mFee) {
        this.rsMfee.clear();
        this.rsMfee.sendKeys(String.valueOf(mFee));
    }

    public int getRsTotalSalary() {
        String totalSalaryOriginal = this.rsTotalSalary.getAttribute("value");
        String totalSalaryReplace = totalSalaryOriginal.replaceAll("\\.", "");
        return Integer.parseInt(totalSalaryReplace);
    }

    public int getRsSalaryPerYear() {
        String salaryPerYearOri = this.rsSalaryPerYear.getAttribute("value");
        String salaryPerYearReplace = salaryPerYearOri.replaceAll("\\.", "");
        return Integer.parseInt(salaryPerYearReplace);
    }

    public int getRsTotalFee() {
        String totalFeeOri = this.rsTotalFee.getAttribute("value");
        String totalFeeReplace = totalFeeOri.replaceAll("\\.", "");
        return Integer.parseInt(totalFeeReplace);
    }

    public int getRsTotalWorker() {
        String totalWorkerOri = this.rsTotalWorker.getAttribute("value");
        String totalWorkerReplace = totalWorkerOri.replaceAll("\\.", "");
        return Integer.parseInt(totalWorkerReplace);
    }

    public String getRsAmountEmpty() {
        return this.rsAmountEmpty.getText();
    }

    public String getRsSalaryEmpty() {
        return this.rsSalaryEmpty.getText();
    }

    public String getRsAmountUnder1() {
        return this.rsAmountUnder1.getText();
    }

    public String getRsSalaryUnder1() {
        return this.rsSalaryUnder1.getText();
    }

    //Training
    public void selectTraining() {
        this.training.click();
    }

    public String getLabelTraining() {
        return this.labelTraining.getText();
    }

    public void setTrainQty(Integer qty) {
        if (qty == -1) {
            this.trainingQty.clear();
        } else {
            this.trainingQty.clear();
            this.trainingQty.sendKeys(String.valueOf(qty));
        }
    }

    public void setTrainPricePerQty(Integer pricePerQty) {
        if (pricePerQty == -1) {
            this.trainingPricePerQty.clear();
        } else {
            this.trainingPricePerQty.clear();
            this.trainingPricePerQty.sendKeys(String.valueOf(pricePerQty));
        }
    }

    public void setTrainPpn(Integer index) {
        Select dropPpn = new Select(trainingIsPpn);
        dropPpn.selectByIndex(index);
    }

    public int getTrainingTotal() {
        String trainingTotalOri = this.trainingTotal.getAttribute("value");
        String trainingTotalReplace = trainingTotalOri.replaceAll("\\.", "");
        return Integer.parseInt(trainingTotalReplace);
    }

    public int getTrainingPpn() {
        String trainingPpnOri = this.trainingPpn.getAttribute("value");
        String trainingPpnReplace = trainingPpnOri.replaceAll("\\.", "");
        return Integer.parseInt(trainingPpnReplace);
    }

    public int getTrainingGrandTotal() {
        String trainingGrandTotalOri = this.trainingGrandTotal.getAttribute("value");
        String trainingGrandTotalReplace = trainingGrandTotalOri.replaceAll("\\.", "");
        return Integer.parseInt(trainingGrandTotalReplace);
    }

    public int getTrainingTotalCost() {
        String trainingTotalCostOri = this.trainingTotalCost.getAttribute("value");
        String trainingTotalCostReplace = trainingTotalCostOri.replaceAll("\\.", "");
        return Integer.parseInt(trainingTotalCostReplace);
    }

    public int getTrainingLoss() {
        String trainingLossOri = this.trainingLoss.getAttribute("value");
        String trainingLossReplace = trainingLossOri.replaceAll("\\.", "");
        return Integer.parseInt(trainingLossReplace);
    }

    public String getTxtTrainingQtyEmpty() {
        return this.trainingQtyEmpty.getText();
    }

    public String getTxtTrainingPricePerQtyEmpty() {
        return this.trainingPricePerQtyEmpty.getText();
    }

    public String getTxtTrainingMinQty() {
        return this.trainingMinQty.getText();
    }

    public String getTxtTrainingPpnEmpty() {
        return this.trainingIsPpnEmpty.getText();
    }

    public String getTxtTrainingMinPricePerQty() {
        return this.trainingMinPricePerQty.getText();
    }

    //FUNDS
    public int getEstimateFound() {
        String ori = this.estimatedFund.getAttribute("value");
        String replace = ori.replaceAll("\\.", "");
        return Integer.parseInt(replace);
    }

    public void setPaymentTerm(int paymentTerm) {
        this.paymentTerm.clear();
        this.paymentTerm.sendKeys(String.valueOf(paymentTerm));
    }

    public int getFundTurnoverMonth() {
        return Integer.parseInt(fundTurnoverMonth.getAttribute("value"));
    }

    public int getFundTurnover() {
        String ori = this.fundTurnover.getAttribute("value");
        String replace = ori.replaceAll("\\.", "");
        return Integer.parseInt(replace);
    }

    public String getPaymentTermMinValue() {
        return this.paymentTermMinValue.getText();
    }

    public String getPaymentTermMaxValue() {
        return this.paymentTermMaxValue.getText();
    }

    //CLIENT DATA ASSESSMENT
    public void setEstablishedYear(String year) {
        this.establishedYear.clear();
        this.establishedYear.sendKeys(year);
    }

    public void setTotalEmployee(String totalEmployee) {
        this.totalEmployees.clear();
        this.totalEmployees.sendKeys(totalEmployee);
    }

    public void setOfficeType(int index) {
        Select dropdownOfficeType = new Select(officeType);
        dropdownOfficeType.selectByIndex(index);
    }

    public String getEstablishedYearEmpty() {
        return this.establishedYearEmpty.getText();
    }

    public String getTotalEmployeeEmpty() {
        return this.totalEmployeesEmpty.getText();
    }

    public String getOfficeTypeEmpty() {
        return this.officeTypeEmpty.getText();
    }

    public void setCompanyRating(int index) {
        Select drpCompanyRating = new Select(this.companyRating);
        drpCompanyRating.selectByIndex(index);
    }

    public String getCompanyRatingEmpty() {
        return this.companyRatingEmpty.getText();
    }

    public void setFinansial(int index) {
        Select drpFinansial = new Select(this.finansial);
        drpFinansial.selectByIndex(index);
    }

    public String getFinansialEmpty() {
        return this.finansialEmpty.getText();
    }

    public void setOjk(int index) {
        Select drpOjk = new Select(ojk);
        drpOjk.selectByIndex(index);
    }

    public void setAftech(int index) {
        Select drpAftech = new Select(aftech);
        drpAftech.selectByIndex(index);
    }

    public void setAfpi(int index) {
        Select drpAfpi = new Select(afpi);
        drpAfpi.selectByIndex(index);
    }

    public String getOjkEmpty() {
        return this.ojkEmpty.getText();
    }

    public String getAftechEmpty() {
        return this.aftechEmpty.getText();
    }

    public String getAfpiEmpty() {
        return this.afpiEmpty.getText();
    }

    public void setCompanyOwner(int index) {
        Select drpCompanyOwner = new Select(companyOwner);
        drpCompanyOwner.selectByIndex(index);
    }

    public void setOwnerName(String status) {
        faker = new Faker();
        if (status.equals("owner name empty")) {
            this.ownerName.clear();
        } else {
            this.ownerName.clear();
            this.ownerName.sendKeys(faker.name().fullName());
        }
    }

    public void setDirectorUtama() {
        faker = new Faker();
        this.directorUtama.clear();
        this.directorUtama.sendKeys(faker.name().fullName());
    }

    public void setDireksi1() {
        faker = new Faker();
        this.direksi1.clear();
        this.direksi1.sendKeys(faker.name().fullName());
    }

    public void setDireksi2() {
        faker = new Faker();
        this.direksi2.clear();
        this.direksi2.sendKeys(faker.name().fullName());
    }

    public void setDireksi3() {
        faker = new Faker();
        this.direksi3.clear();
        this.direksi3.sendKeys(faker.name().fullName());
    }

    public void setCompanyInfo(int index){
        Select drpCompanyInfo = new Select(companyInfo);
        drpCompanyInfo.selectByIndex(index);
    }

    public void setAdditionalInfo(){
        faker = new Faker();
        this.additionalInfo.clear();
        this.additionalInfo.sendKeys(faker.lorem().sentence());
    }

    public String getCompanyOwnerEmpty(){
        return this.companyOwnerEmpty.getText();
    }
    public String getOwnerNameEmpty(){
        return this.ownerNameEmpty.getText();
    }
    public String getCompanyInfoEmpty(){
        return this.companyInfoEmpty.getText();
    }

    //Submit data Client Assessment
    public void clickBtnSubmitCA(){
        this.btnSubmitCa.click();
    }

    public String getAlertSuccessCa(){
        return this.alertSuccessCA.getText();
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
