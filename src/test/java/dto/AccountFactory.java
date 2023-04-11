package dto;

import com.github.javafaker.Faker;

public class AccountFactory {

    public Account getRandom() {

        Faker faker = new Faker();
        return Account.builder()
                .accountName(faker.name().fullName())
                .phone(faker.phoneNumber().phoneNumber())
                .build();

    }
}
