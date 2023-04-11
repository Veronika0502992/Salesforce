package tests;

import dto.Account;
import dto.AccountFactory;
import org.testng.annotations.Test;
import pages.AccountListPage;
import pages.NewAccountPage;

public class AccountsTest extends BaseTest {


    @Test(description = "check the possibility of creating and saving a new account", retryAnalyzer = Retry.class)
    public void accounts() {
        loginPage.open();
        loginPage.isPageOpened();
        loginPage.login(USER, PASSWORD);
        accountListPage.open()
                .isPageOpened();
        accountListPage.clickNew();
        newAccountPage.isPageOpened();
        //Account account = new Account("test", "123456", "852741", "test", "test", "test",
                //"test", "test", "test", "test", "test", "3333",
                //"test", "8888", "test", "test", "test", "test");
        Account account2 = Account.builder()
                .accountName("Test")
                .parentAccount("Test")
                .fax("123456")
                .phone("8962")
                .annualRevenue("Test")
                .website("Test")
                .employee("Test")
                .description("Test")
                .billingCity("Test")
                .billingState("Test")
                .shippingCity("Test")
                .shippingState("Test")
                .billingCountry("Test")
                .billingZip("789")
                .shippingCountry("Test")
                .shippingZip("9999")
                .billingStreet("Test")
                .shippingStreet("Test")
                .build();
        newAccountPage.fillIn(account2)
                .save();

    }
}
