package pageobject.flipLandingPage;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utilities.SeleniumHelpers;

public class ucActionsPO {
    WebDriver driver;
    SeleniumHelpers selenium;

    public ucActionsPO(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(xpath = "//p[@class='copyright-text']")
    WebElement displaycoppyright;

    public void closePopupCampain () throws InterruptedException {
        selenium.hardWait(2);
        WebElement popupButton = null;
        try {
            popupButton = driver.findElement(By.xpath("//img[@alt='close']")); // Use appropriate locator
        } catch (NoSuchElementException e) {
            // Popup does not exist
        }
        if (popupButton != null) {
            // Popup is present, click the button
            popupButton.click();
            System.out.println("Popup displayed and clicked.");
        } else {
            // Popup is not present
            System.out.println("No popup displayed.");
        }


    }

    public void scrollToBottom () throws InterruptedException {
        selenium.hardWait(2);
        WebElement about = driver.findElement(By.xpath("//p[@class='copyright-text']"));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", about);

    }

    public String displaycoppyright () throws InterruptedException {
        selenium.hardWait(2);
        return selenium.getText(displaycoppyright);
    }



}
