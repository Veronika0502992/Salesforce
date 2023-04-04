package pages;

import dto.Account;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.Input;
import wrappers.TextArea;

public class AccountListPage extends BasePage {


    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//div[contains(@class, 'slds-breadcrumb__item')]//span[text()='Accounts']")));
    }

    @Step("Открытие страницы аккаунтов")
    public AccountListPage open() {
        driver.get("https://d2w00000rpse8eab.lightning.force.com/lightning/o/Account/list");
        isPageOpened();
        return this;
    }

    @Step("Добавление нового аккаунта")
    public NewAccountPage clickNew() {
        driver.findElement(By.cssSelector("[title=New]")).click();
        NewAccountPage newAccountPage = new NewAccountPage(driver);
        newAccountPage.isPageOpened();
        return newAccountPage;
    }


}
