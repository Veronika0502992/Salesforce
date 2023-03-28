package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.Input;
import wrappers.TextArea;

public class AccountsPage extends BasePage {


    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Открытие страницы аккаунтов")
    public void open() {
        driver.get("https://d2w00000rpse8eab.lightning.force.com/lightning/o/Account/list");
    }

    @Step("Добавление нового аккаунта")
    public void clickNew() {
        driver.findElement(By.cssSelector("[title=New]")).click();
    }

    @Step("Заполнение полей в новом аккаунте")
    public void fillIn(String accountName, String phone, String fax, String parentAccount, String website, String employees, String annualRevenue,
                       String billingCity, String billingState, String shippingCity, String shippingState, String billingZip, String billingCountry,
                       String shippingZip, String shippingCountry) {

        new Input(driver, "Account Name").write(accountName);
        new Input(driver, "Phone").write(phone);
        new Input(driver, "Fax").write(fax);
        new Input(driver, "Parent Account").write(parentAccount);
        new Input(driver, "Website").write(website);
        new Input(driver, "Employees").write(employees);
        new Input(driver, "Annual Revenue").write(annualRevenue);
        new Input(driver, "Billing City").write(billingCity);
        new Input(driver, "Billing State").write(billingState);
        new Input(driver, "Shipping City").write(shippingCity);
        new Input(driver, "Shipping State").write(shippingState);
        new Input(driver, "Billing Zip").write(billingZip);
        new Input(driver, "Billing Country").write(billingCountry);
        new Input(driver, "Shipping Zip").write(shippingZip);
        new Input(driver, "Shipping Country").write(shippingCountry);
    }

    @Step("Заполнение полей в новом аккаунте")
    public void fillInMore(String description, String billingStreet, String shippingStreet) {
        new TextArea(driver, "Description").writeMore(description);
        new TextArea(driver, "Billing Street").writeMore(billingStreet);
        new TextArea(driver, "Shipping Street").writeMore(shippingStreet);
    }


    public void save() {
        driver.findElement(By.cssSelector("[title=Save]")).click();
    }
}
