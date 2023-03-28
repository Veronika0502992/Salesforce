package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test(description = "Check if user can log in", retryAnalyzer = Retry.class)
    public void login() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        driver.findElement(By.cssSelector("[title=User]")).isDisplayed();


    }
}
