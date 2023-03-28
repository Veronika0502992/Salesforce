package tests;

import org.testng.annotations.Test;

public class AccountsTest extends BaseTest {
    @Test(description = "check the possibility of creating and saving a new account", retryAnalyzer = Retry.class)
    public void accounts() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        accountsPage.open();
        accountsPage.clickNew();
        accountsPage.fillIn("Anna", "123456", "789456", "Mama", "oooooo", "777", "888",
                "hhh", "uuuu", "bbb", "bvg", "888", "gfd", "111", "nju");
        accountsPage.fillInMore("plkh", "bhjgu", "jgugku");
        accountsPage.save();
    }
}
