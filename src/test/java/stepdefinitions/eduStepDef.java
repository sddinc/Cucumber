package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.eduPage;
import utilities.Driver;

public class eduStepDef {

eduPage eduPage =new eduPage();

    @Given("user visit to site {string}")
    public void userVisitToSite(String siteLink) {
        Driver.getDriver().get(siteLink);

    }


    @And("user login {string} and {string}")
    public void userLoginAnd(String userName, String userPass) {
        eduPage.userName.sendKeys(userName);
        eduPage.userPass.sendKeys(userPass);
        eduPage.buttonLogin.click();
        System.out.println(Driver.getDriver().getTitle());
    }
    @Then("verify that staff list")
    public void verify_that_staff_list() {

    }


}
