package com.junit.assignmentci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidatorTests {
    Validator validator = new Validator();

    @Test
    @DisplayName("Test for phone number with valid requirements")
    void shouldReturnTrueWithValidPhoneNumber() {
        String phoneNumber = "0764517376";

        boolean result = validator.isPhoneNumberValid(phoneNumber);
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Test for phone number not starting with zero")
    void shouldReturnFalseWhenPhoneNumberNotStartWithZero() {
        String phoneNumber = "9812277969";

        boolean result = validator.isPhoneNumberValid(phoneNumber);
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Test for phone number length less than 6")
    void shouldReturnFalseWhenPhoneNumberLengthIsLessThan6() {
        String phoneNumber = "09812";

        boolean result = validator.isPhoneNumberValid(phoneNumber);
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Test for phone number length is greater than 10")
    void shouldReturnFalseWhenPhoneNumberLengthIsGreaterThan10() {
        String phoneNumber = "091981277969";

        boolean result = validator.isPhoneNumberValid(phoneNumber);
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Test for phone number length is between 7 to 10")
    void shouldReturnTrueWhenPhoneNumberLengthIsBetween7to10() {
        String phoneNumber = "09198127";

        boolean result = validator.isPhoneNumberValid(phoneNumber);
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Test for phone number length is exact 6")
    void shouldReturnTrueWhenPhoneNumberLengthExact6() {
        String phoneNumber = "091976";

        boolean result = validator.isPhoneNumberValid(phoneNumber);
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Test for phone number length is exact 10")
    void shouldReturnTruePhoneNumberLengthExact10() {
        String phoneNumber = "0919675432";

        boolean result = validator.isPhoneNumberValid(phoneNumber);
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Test for phone number include alphabet")
    void shouldReturnFalseWhenPhoneNumberIncludeAlphabet() {
        String phoneNumber = "09A19";

        boolean result = validator.isPhoneNumberValid(phoneNumber);
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Test for valid email")
    void shouldReturnTrueWithValidEmail() {
        String email = "priyanka.priyanka@iths.se";

        boolean result = validator.isEmailValid(email);
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Test for invalid email")
    void shouldReturnFalseWithMissingAtSign() {
        String email = "priyanka.priyankaiths.se";

        boolean result = validator.isEmailValid(email);
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Test for missing name in email")
    void shouldReturnFalseWithMissingName() {
        String email = "@iths.se";

        boolean result = validator.isEmailValid(email);
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Test for missing domain name in email")
    void shouldReturnFalseWithMissingDomainName() {
        String email = "priyanka.se";

        boolean result = validator.isEmailValid(email);
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Test for missing top level domain in email")
    void shouldReturnFalseWithMissingTopLevelDomain() {
        String email = "priyanka@ithgs";

        boolean result = validator.isEmailValid(email);
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Test for missing dot in email")
    void shouldReturnFalseWithMissingDot() {
        String email = "priyanka@ithsse";

        boolean result = validator.isEmailValid(email);
        Assertions.assertFalse(result);
    }


}
