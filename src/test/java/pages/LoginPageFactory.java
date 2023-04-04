package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory extends BasePage {
    @FindBy(id = "username")
    WebElement userNameInput;
    @FindBy(id = "password")
    WebElement passwordInput;
    @FindBy(id = "Login")
    WebElement loginButton;


    @Override
    public void isPageOpened() {

    }

    public LoginPageFactory(WebDriver driver) {
        super(driver);
    }


    @Step("Открытие страницы логина")
    public void open() {
        driver.get(LOGIN_URL);
        PageFactory.initElements(driver, this);
    }

    @Step("Ввод логина и пароля")
    public void login(String user, String password) {
        userNameInput.sendKeys(user);
        passwordInput.sendKeys(password);
        loginButton.click();
    }


}
