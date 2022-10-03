package com.demoqa.utils;

import com.github.javafaker.Faker;

import java.util.Locale;

import static com.demoqa.utils.RandomDate.*;
import static com.demoqa.utils.RandomUtils.getHobbies;
import static com.demoqa.utils.RandomUtils.getRandomPhoneNumber;

public class TestData {
    static Faker faker = new Faker(new Locale("en-GB"));
    public static String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = faker.demographic().sex(),
            mobile = getRandomPhoneNumber(10),
            month = getMonth(),
            year = getYear(),
            day = getDay(month, year),
            subjects = "English",
            hobbies = getHobbies(),
            picture = "QA-Tester-meme-03.jpg",
            currentAddress = faker.address().fullAddress(),
            state = "NCR",
            city = "Noida";

}
