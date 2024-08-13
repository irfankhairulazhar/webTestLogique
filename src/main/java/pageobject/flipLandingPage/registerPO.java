package pageobject.flipLandingPage;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utilities.SeleniumHelpers;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class registerPO {

    WebDriver driver;
    SeleniumHelpers selenium;

    public registerPO (WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(xpath = "//input[@placeholder='Nama Depan']")
    WebElement inputFristName;

    @FindBy(xpath = "//input[@placeholder='Nama Belakang']")
    WebElement inputLastNAme;

    @FindBy(xpath = "//input[@placeholder='Tempat Lahir']")
    WebElement inputPob;

    @FindBy(xpath = "//input[@aria-placeholder='Pilih Pekerjaan']")
    WebElement inputOccupation;

    @FindBy(xpath = "//input[@placeholder='Nama Perusahaan']")
    WebElement inputCompanyName;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/textarea[1]")
    WebElement inputCompanyAddress;

    @FindBy(xpath = "(//input[@placeholder='DD/MM/YYYY'])[1]")
    WebElement inputDob;

    @FindBy(xpath = "//input[@placeholder='Nomor KTP']")
    WebElement inputIdNumber;

    @FindBy(xpath = "//input[@placeholder='Nomor Telepon Perusahaan']")
    WebElement inputCompanyNumber;

    @FindBy(css = "[type='checkbox']")
    WebElement lifeTimeExpired;

    @FindBy(xpath = "//button[.='Ada NPWP']")
    WebElement hasNpwp;

    @FindBy(css = "[placeholder='Nomor NPWP']")
    WebElement inputNpwpNumber;

    @FindBy(css = "[aria-placeholder='Jenis Kendaraan']")
    WebElement selectVehicleType;

    @FindBy(css = "[aria-placeholder='Pilih Kendaraan']")
    WebElement selectFindNewVehicle;

    @FindBy(css = "[aria-placeholder='Pilih Provinsi']")
    WebElement selectProvince;

    @FindBy(css = "[aria-placeholder='Pilih Kota']")
    WebElement selectCity;

    @FindBy(xpath = "//div[12]//div[1]//textarea[1]")
    WebElement selectDomicile;

    @FindBy(css = "[placeholder='Nomor Telepon']")
    WebElement inputPhoneNumber;

    @FindBy(css = "[aria-placeholder='Pilih Tujuan']")
    WebElement selectProposeToBuy;

    @FindBy(css = "[name='email']")
    WebElement inputEmail;

    @FindBy(css = "[name='new_password']")
    WebElement inputPassword;

    @FindBy(css = "[name='confirm_password']")
    WebElement userReinputPassword;

    @FindBy(xpath = "//button[.='Selanjutnya']")
    WebElement continueButton;

    @FindBy(css = "[placeholder='Nomor Rekening']")
    WebElement inputAccBankNumber;

    @FindBy(css = "[aria-placeholder='Pilih Bank']")
    WebElement selectBankName;

    @FindBy(css = "[placeholder='Nama Pemilik Rekening']")
    WebElement inputAccBankName;

    @FindBy(css = "[aria-placeholder='Pilih Sumber Tabungan']")
    WebElement inputSof;

    @FindBy(css = "[aria-placeholder='Pilih Metode Pembayaran']")
    WebElement inputPaymentMethod;

    @FindBy(xpath = "//button[.='Daftar']")
    WebElement buttonRegister;

    @FindBy(xpath = "//div[@class='mosha__toast__content__description']")
    WebElement displayPopupSuccess;

    @FindBy(xpath = "//h1[contains(text(),'Selamat Datang')]")
    WebElement directToLoginPage;

    public void inputFristName (String firstName) throws InterruptedException {
        selenium.enterText(inputFristName, firstName, true);
    }

    public void inputLastNAme (String lastName) throws InterruptedException {
        selenium.enterText(inputLastNAme, lastName, true);
    }

    public void inputPob (String pob) throws InterruptedException {
        selenium.enterText(inputPob, pob, true);
    }

    public void inputOccupation (String occ) throws InterruptedException {
        selenium.hardWait(2);
        selenium.enterText(inputOccupation, occ, true);
        Actions act = new Actions(driver);
        act.sendKeys(Keys.ENTER).perform();
    }

    public void inputCompanyName (String companyName) throws InterruptedException {
        selenium.enterText(inputCompanyName, companyName, true);
    }

    public void inputCompanyAddress (String comAddress) throws InterruptedException {
        selenium.hardWait(2);
        selenium.click(inputCompanyAddress);
        selenium.enterText(inputCompanyAddress, comAddress, true);
    }

    public void inputDob (String dob) throws InterruptedException {
        selenium.hardWait(2);
        selenium.click(inputDob);
        driver.findElement(By.xpath("(//div[.='2'])[1]")).click();
        driver.findElement(By.xpath("//span[@class='dp__action dp__select']")).click();
    }

    public void inputIdNumber (String idNumber) throws InterruptedException {
        selenium.hardWait(2);
        selenium.enterText(inputIdNumber, idNumber, true);
    }

    public void inputCompanyNumber (String comNumber) throws InterruptedException {
        selenium.enterText(inputCompanyNumber, comNumber, true);
    }

    public void uploadID () throws InterruptedException {
        selenium.hardWait(2);
        WebElement test = driver.findElement(By.xpath("//input[@name='uploadKtp']"));
        String currentStyle = test.getAttribute("class");
        System.out.println("Current inline style attribute: " + currentStyle);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].removeAttribute('class')", test);
        currentStyle = test.getAttribute("class");
        System.out.println("Updated inline style attribute: " + currentStyle);
        selenium.hardWait(3);
        String imagePath =  System.getProperty("user.dir") +"\\src\\test\\resources\\file\\careers_1.jpeg";
        selenium.hardWait(3);
        driver.findElement(By.xpath("//input[@name='uploadKtp']")).sendKeys((imagePath));
        selenium.hardWait(1);
        selenium.click(lifeTimeExpired);

    }

    public void inputNpwpNumber (String npwpNumber) throws InterruptedException {
        selenium.click(hasNpwp);
        selenium.hardWait(2);
        selenium.enterText(inputNpwpNumber, npwpNumber, true);
    }

    public void selectVehicleType (String vehicle) throws InterruptedException {
        selenium.enterText(selectVehicleType, vehicle, true);
        selenium.hardWait(2);
        Actions act = new Actions(driver);
        act.sendKeys(Keys.ENTER).perform();
    }

    public void selectFindNewVehicle (String newVehicle) throws InterruptedException {
        selenium.enterText(selectFindNewVehicle, newVehicle, true);
        Actions act = new Actions(driver);
        act.sendKeys(Keys.ENTER).perform();
    }

    public void selectProvince (String province) throws InterruptedException {
        selenium.enterText(selectProvince, province, true);
        Actions act = new Actions(driver);
        act.sendKeys(Keys.ENTER).perform();
    }

    public void selectCity (String city) throws InterruptedException {
        selenium.enterText(selectCity, city, true);
        selenium.hardWait(2);
        Actions act = new Actions(driver);
        act.sendKeys(Keys.DOWN).perform();
        act.sendKeys(Keys.ENTER).perform();
        selenium.hardWait(2);
        act.sendKeys(Keys.TAB).perform();
    }

    public void selectDomicile (String domicile) throws InterruptedException {
        selenium.hardWait(2);
        Actions act = new Actions(driver);
        act.sendKeys(domicile).perform();
    }

    public void inputPhoneNumber (String phnNumber) throws InterruptedException {
        selenium.enterText(inputPhoneNumber, phnNumber, true);
    }

    public void selectProposeToBuy (String prpBuy) throws InterruptedException {
        selenium.hardWait(2);
        selenium.enterText(selectProposeToBuy, prpBuy, true);
        selenium.hardWait(1);
        Actions act = new Actions(driver);
        act.sendKeys(Keys.ENTER).perform();
    }

    public void inputEmail (String email) throws InterruptedException {
        selenium.enterText(inputEmail, email, true);
    }

    public void inputPassword (String pass) throws InterruptedException {
        selenium.enterText(inputPassword, pass, true);
    }

    public void userReinputPassword (String regs) throws InterruptedException {
        selenium.enterText(userReinputPassword, regs, true);

    }

    public void continueButton () throws InterruptedException {
        selenium.hardWait(2);
        selenium.click(continueButton);
    }

    public void inputAccBankNumber (String bankNumber) throws InterruptedException {
        selenium.hardWait(2);
        selenium.enterText(inputAccBankNumber, bankNumber, true);
    }

    public void selectBankName (String bankName) throws InterruptedException {
        selenium.enterText(selectBankName, bankName, true);
        selenium.hardWait(1);
        Actions act = new Actions(driver);
        act.sendKeys(Keys.ENTER).perform();
    }

    public void inputAccBankName (String acc) throws InterruptedException {
        selenium.enterText(inputAccBankName, acc, true);
    }

    public void inputSof (String sof) throws InterruptedException {
        selenium.enterText(inputSof, sof, true);
        selenium.hardWait(1);
        Actions act = new Actions(driver);
        act.sendKeys(Keys.ENTER).perform();
    }

    public void inputPaymentMethod (String payMtd) throws InterruptedException {
        selenium.enterText(inputPaymentMethod, payMtd, true);
        selenium.hardWait(1);
        Actions act = new Actions(driver);
        act.sendKeys(Keys.ENTER).perform();
    }

    public void buttonRegister () throws InterruptedException {
        selenium.hardWait(2);
        selenium.click(buttonRegister);
    }

    public String displayPopupSuccess () throws InterruptedException {
        selenium.hardWait(1);
        return selenium.getText(displayPopupSuccess);
    }

    public String directToLoginPage () throws InterruptedException {
        selenium.hardWait(2);
        return selenium.getText(directToLoginPage);
    }
}
