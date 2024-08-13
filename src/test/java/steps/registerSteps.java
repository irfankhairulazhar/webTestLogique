package steps;

import io.cucumber.java.JavaBackendProviderService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageobject.flipLandingPage.registerPO;
import pageobject.flipLandingPage.ucActionsPO;
import utilities.JavaHelpers;
import utilities.SeleniumHelpers;
import utilities.ThreadManager;

public class registerSteps {

    private WebDriver driver = ThreadManager.getDriver();
    private SeleniumHelpers selenium = new SeleniumHelpers(driver);
    private registerPO registers = new registerPO (driver);

    private String testData="src/test/resources/testdata/data.properties";
    private String URLREGISTER = JavaHelpers.getPropertyValue(testData, "UCREGISTER");
    private String alertusername = JavaHelpers.getPropertyValue(testData, "POPUPUSERNAME");
    private String alertpassword = JavaHelpers.getPropertyValue(testData, "POPUPPASSWORD");


    @Given("user direct to uc register page")
    public void user_direct_to_uc_register_page () throws InterruptedException {
        selenium.navigateToPage(URLREGISTER);
        String url = driver.getCurrentUrl().replaceAll("https://", "");
        String username = alertusername;
        String password = alertpassword;
        String URL = "https://" + username + ":" + password + "@" + url;
        driver.get(URL);
    }

    @When("user on register page input valid first name {string}")
    public void user_on_register_page_input_valid_first_name (String firstName) throws InterruptedException {
        registers.inputFristName (firstName);
    }

    @And("user input valid last name {string}")
    public void user_input_valid_last_name (String lastName) throws InterruptedException {
        registers.inputLastNAme (lastName);
    }

    @And("user input pob {string}")
    public void user_input_pob (String pob) throws InterruptedException {
        registers.inputPob(pob);
    }

    @And("user select occupation {string}")
    public void user_select_occupation (String occ) throws InterruptedException {
        registers.inputOccupation (occ);
    }

    @And("user input company name {string}")
    public void user_input_company_name (String companyName) throws InterruptedException {
        registers.inputCompanyName (companyName);
    }

    @And("user input company address {string}")
    public void user_input_company_address (String comAddress) throws InterruptedException {
        registers.inputCompanyAddress (comAddress);
    }

    @And("user input dob {string}")
    public void user_input_dob (String dob) throws InterruptedException {
        registers.inputDob(dob);
    }

    @And("user input id number {string}")
    public void user_input_id_number (String idNumber) throws InterruptedException {
        registers.inputIdNumber (idNumber);
    }

    @And("user input company number {string}")
    public void user_input_company_number (String comNumber) throws InterruptedException {
        registers.inputCompanyNumber (comNumber);
    }

    @And("user upload id")
    public void user_upload_id () throws InterruptedException {
        registers.uploadID ();
    }

    @And("user input NPWP number {string}")
    public void user_input_NPWP_number (String npwpNumber) throws InterruptedException {
        registers.inputNpwpNumber (npwpNumber);
    }

    @And("user select vehicle type {string}")
    public void user_select_vehicle_type (String vehicle) throws InterruptedException {
        registers.selectVehicleType (vehicle);
    }

    @And("user select find new vehicle {string}")
    public void user_select_find_new_vehicle (String newVehicle) throws InterruptedException {
        registers.selectFindNewVehicle (newVehicle);
    }

    @And("user select province {string}")
    public void user_select_province (String province) throws InterruptedException {
        registers.selectProvince (province);
    }

    @And("user select city {string}")
    public void user_select_city (String city) throws InterruptedException {
        registers.selectCity (city);
    }

    @And("user select domicile {string}")
    public void user_select_domicile (String domicile) throws InterruptedException {
        registers.selectDomicile (domicile);
    }

    @And("user input phone number {string}")
    public void user_input_phone_number (String phnNumber) throws InterruptedException {
        registers.inputPhoneNumber (phnNumber);
    }

    @And("user purpose to buy {string}")
    public void user_purpose_to_buy (String prpBuy) throws InterruptedException {
        registers.selectProposeToBuy (prpBuy);
    }

    @And("user input email {string}")
    public void user_input_email (String email) throws InterruptedException {
        registers.inputEmail (email);
    }

    @And("user input password {string}")
    public void user_input_password (String pass) throws InterruptedException {
        registers.inputPassword (pass);
    }

    @And("user reinput password {string}")
    public void user_reinput_password (String regs) throws InterruptedException {
        registers.userReinputPassword (regs);
    }

    @And("user click continue button")
    public void user_click_continue_button () throws InterruptedException {
        registers.continueButton ();
    }

    @And("user input acc bank number {string}")
    public void user_input_acc_bank_number (String bankNumber) throws InterruptedException {
        registers.inputAccBankNumber (bankNumber);
    }

    @And("user select bank name {string}")
    public void user_select_bank_name (String bankName) throws InterruptedException {
        registers.selectBankName (bankName);
    }

    @And("user input acc bank name {string}")
    public void user_input_acc_bank_name (String acc) throws InterruptedException {
        registers.inputAccBankName (acc);
    }

    @And("user input source of fund {string}")
    public void user_input_source_of_fund (String sof) throws InterruptedException {
        registers.inputSof (sof);
    }

    @And("user input payment method {string}")
    public void user_input_payment_method (String payMtd) throws InterruptedException {
        registers.inputPaymentMethod (payMtd);
    }

    @And("user click button register")
    public void user_click_button_register () throws InterruptedException {
        registers.buttonRegister ();
    }

    @Then("user will get popup success {string}")
    public void user_will_get_popup_success (String success) throws InterruptedException {
        System.out.println("Actual : " + registers.displayPopupSuccess());
        Assert.assertTrue(registers.displayPopupSuccess().contains(success));
    }

    @Then("user direct to login page {string}")
    public void user_direct_to_login_page (String loginPage) throws InterruptedException {
        System.out.println("Actual : " + registers.directToLoginPage());
        Assert.assertTrue(registers.directToLoginPage().contains(loginPage));
    }








}
