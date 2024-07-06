package pages;

import org.openqa.selenium.By;

import static helper.Utility.driver;

public class WebPage {
    By input_email_handphone = By.xpath("//input[@name='email']");
    By click_selanjutnya = By.xpath("//button[@class='paper-button auth-form__submit-btn green-button']");
    By input_password = By.xpath("//input[@placeholder='Masukkan kata sandi Anda']");
    By click_masuk = By.xpath("//div[@class='mat-mdc-dialog-surface mdc-dialog__surface']//child::button");
    By invoice_home_dashboard = By.xpath("//div[@class='invoicer-wrapper']");

    By error_msg(String errMsg) {
        return By.xpath("//h3[contains(text(),'" + errMsg + "')]");
    }
    public void openBrowser() {
        driver.get("https://www.paper.id/webappv1/#/login");
    }

    public void inputUser(String email) {
        driver.findElement(input_email_handphone).sendKeys(email);
    }

    public void clickSelanjutnya() {
        driver.findElement(click_selanjutnya).click();
    }

    public void inputPassword(String password) {
        driver.findElement(input_password).sendKeys(password);
    }

    public void clickMasuk() {
        driver.findElement(click_masuk).click();
    }

    public void verifyUserInDashboardPage() {
        driver.findElement(invoice_home_dashboard).isDisplayed();
    }

    public void verifyErrMsg(String errMsg) {
        driver.findElement(error_msg(errMsg)).isDisplayed();
    }
}
