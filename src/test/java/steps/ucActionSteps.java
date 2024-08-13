package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageobject.flipLandingPage.ucActionsPO;
import utilities.JavaHelpers;
import utilities.SeleniumHelpers;
import utilities.ThreadManager;

public class ucActionSteps {

    private WebDriver driver = ThreadManager.getDriver();
    private SeleniumHelpers selenium = new SeleniumHelpers(driver);
    private ucActionsPO ucActions = new ucActionsPO (driver);

    private String testData="src/test/resources/testdata/data.properties";

    private String uc_action = JavaHelpers.getPropertyValue(testData,"UCACTIONLANDINGPAGE");

    @Given("user access uc action landing page")
    public void user_access_uc_action_landing_page () {
        selenium.navigateToPage(uc_action);
    }

    @When("user on uc page close popup campaign")
    public void user_on_uc_page_close_popup_campaign () throws InterruptedException {
        ucActions.closePopupCampain ();
    }

    @And("user scroll to bottom")
    public void user_scroll_to_bottom() throws InterruptedException {
        ucActions.scrollToBottom ();
    }

    @Then("display coppyright wording {string}")
    public void display_coppyright_wording (String coppyright) throws InterruptedException {
        System.out.println("Actual : " + ucActions.displaycoppyright());
        Assert.assertTrue(ucActions.displaycoppyright().contains(coppyright));
    }


}
