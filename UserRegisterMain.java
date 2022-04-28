/*
 * The User Registration System program implements an application that needs
 * to ensure all validations are in place during the User Entry.
 * UC4: As a User need to follow pre-defined Mobile Format.
 *
 * @author: Sanjana Bhandure
 * @version: 1.3
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
    }
}
