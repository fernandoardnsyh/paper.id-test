package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.WebPage;

public class WebStep {

    WebPage webPage;
    public WebStep() {
        this.webPage = new WebPage();
    }

    @Given("open login page paper.id")
    public void openLoginPagePaperId() {
        webPage.openBrowser();
    }

    @And("user input email atau no handphone {string}")
    public void userInputEmailAtauNoHandphone(String email) {
        webPage.inputUser(email);
    }

    @And("user click selanjutnya")
    public void userClickSelanjutnya() {
        webPage.clickSelanjutnya();
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        webPage.inputPassword(password);
    }

    @And("user click masuk")
    public void userClickMasuk() {
        webPage.clickMasuk();
    }

    @Then("verify user success login to dashboard page")
    public void verifyUserSuccessLoginToDashboardPage() {
        webPage.verifyUserInDashboardPage();
    }

    @Then("user will see error message {string}")
    public void userWillSeeErrorMessage(String errMsg) {
        webPage.verifyErrMsg(errMsg);
    }
}
