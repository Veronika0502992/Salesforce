package pages;

import dto.Account;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.Input;
import wrappers.TextArea;

public class NewAccountPage extends BasePage {


    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//div[contains(@class, 'slds-form-element__label')]//span[text()='Account Owner']")));
    }

    @Step("Открытие страницы аккаунтов")
    public NewAccountPage open() {
        driver.get("https://d2w00000rpse8eab.lightning.force.com/lightning/o/Account/new");
        isPageOpened();
        return this;
    }



    @Step("Заполнение полей в новом аккаунте")
    public NewAccountPage fillIn(Account account)
     {

        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Fax").write(account.getFax());
        new Input(driver, "Parent Account").write(account.getParentAccount());
        new Input(driver, "Website").write(account.getWebsite());
        new Input(driver, "Employees").write(account.getEmployee());
        new Input(driver, "Annual Revenue").write(account.getAnnualRevenue());
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Billing State").write(account.getBillingCity());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Shipping State").write(account.getShippingState());
        new Input(driver, "Billing Zip").write(account.getBillingZip());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        new Input(driver, "Shipping Zip").write(account.getShippingZip());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());
        new TextArea(driver, "Description").write(account.getDescription());
        new TextArea(driver, "Billing Street").write(account.getBillingStreet());
        new TextArea(driver, "Shipping Street").write(account.getShippingStreet());
        return this;
    }


    @Step("Сохранение нового аккаунта")
    public void save() {
        driver.findElement(By.cssSelector("[title=Save]")).click();
    }
}
