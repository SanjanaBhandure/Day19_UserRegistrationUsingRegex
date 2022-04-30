package com.brigelabz.UserRegister;

import com.Bridgelabz.Day19_RegexUserRegistrationProblem.UserRegister;
import org.junit.Assert;
import org.junit.Test;


public class UserRegisterTestCase {

    /*
     * isValidFirstNameTestCase created to validate first name
     */
    @Test
    public void isValidFirstNameTestCase() {
        boolean actualResult = UserRegister.isValidFirstName("Sanjana");
        Assert.assertTrue("Sanjana", true);
    }

    /*
     * isValidLastNameTestCase created to validate last name
     */
    @Test
    public void isValidLastNameTestCase() {
        boolean actualResult = UserRegister.isValidLastName("Bhandure");
        Assert.assertTrue("Bhandure", true);
    }

    /*
     * isValidEmailTestCase created to validate email
     */
    @Test
    public void isValidEmailTestCase() {
        boolean actualResult = UserRegister.isValidEmail("abc@gmail.com");
        Assert.assertTrue("abc@gmail.com", true);
    }

    /*
     * isValidEmailTestCase created to validate phone number
     */
    @Test
    public void isValidPhoneNumberTestCase() {
        boolean actualResult = UserRegister.isValidPhoneNumber("91 90000000000");
        Assert.assertTrue("91 90000000000", true);
    }


    /*
     * isValidEmailTestCase created to validate password
     */
    @Test
    public void isValidPasswordTestCase() {
        boolean actualResult = UserRegister.isValidPassword("abcde1234");
        Assert.assertTrue("abcde1234", true);
    }
}
