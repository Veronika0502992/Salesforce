package dto;

import com.github.javafaker.Faker;

public class AccountFactory {

    public Account getRandom(){
        Account account = new Account();
        Faker faker = new Faker();
        account.setAccountName(faker.name().fullName());
        account.setPhone(faker.phoneNumber().phoneNumber());
        return account;
    }
}
