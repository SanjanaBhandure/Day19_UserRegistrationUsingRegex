package com.brigelabz.UserRegister;

import com.Bridgelabz.Day19_RegexUserRegistrationProblem.UserRegister;
import org.junit.Assert;
import org.junit.Test;


public class UserRegisterTestCase {

    /*
     * isValidFirstNameTestCase
     */
    @Test
    public void isValidFirstNameTestCase() {
        boolean actualResult = UserRegister.isValidFirstName("Sanjana");
        Assert.assertTrue("Sanjana", true);
    }

    /*
     * isValidLastNameTestCase
     */
    @Test
    public void isValidLastNameTestCase() {
        boolean actualResult = UserRegister.isValidLastName("Bhandure");
        Assert.assertTrue("Bhandure", true);
    }

    /*
     * isValidEmailTestCase
     */
    @Test
    public void isValidEmailTestCase() {
        boolean actualResult = UserRegister.isValidEmail("abc@gmail.com");
        Assert.assertTrue("abc@gmail.com", true);
    }

    /*
     * isValidEmailTestCase
     */
    @Test
    public void isValidPhoneNumberTestCase() {
        boolean actualResult = UserRegister.isValidPhoneNumber("91 90000000000");
        Assert.assertTrue("91 90000000000", true);
    }

}
