/*
 * The User Registration System program implements an application that needs
 * to ensure all validations are in place during the User Entry.
 * UC5: As a User need to follow pre-defined Password rules.
 * Rule 3: Should have at least 1 numeric number in the password.
 *
 * @author: Sanjana Bhandure
 * @version: 1.6
 * @date: 29-04-2022
 */

package com.Bridgelabz.Day19_RegexUserRegistrationProblem;

public class UserRegisterMain {
    public static void main(String[] args) {
        //method calling
        UserRegister.firstName();
        UserRegister.lastName();
        UserRegister.email();
        UserRegister.phoneNumber();
        UserRegister.password();
    }
}
