package parameterizeTests;

import com.github.javafaker.Faker;

public class TestDataWithFaker {
    Faker faker = new Faker();

    public String
            email = faker.internet().emailAddress(),
            lastName = faker.name().lastName(),
            firstName = faker.name().name(),
            mobilePhone = faker.phoneNumber().subscriberNumber(12),
            subjects = faker.address().fullAddress();
}