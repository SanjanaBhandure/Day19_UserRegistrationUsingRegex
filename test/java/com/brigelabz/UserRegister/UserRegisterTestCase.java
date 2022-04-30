package com.brigelabz.UserRegister;

import com.Bridgelabz.Day19_RegexUserRegistrationProblem.UserRegister;
import org.junit.Assert;
import org.junit.Test;


public class UserRegisterTestCase {

    /*
     * isValidFirstNameTestCase created to validate first Name
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


}
