/*
 * The User Registration System program implements an application that needs
 * to ensure all validations are in place during the User Entry.
 * UC2: As a User need to enter a valid Last Name.
 *
 * @author: Sanjana Bhandure
 * @version: 1.1
 * @date: 1-05-2022
 */

package com.Bridgelabz.Day19_RegexUserRegistrationProblem;

import java.util.Scanner;

public class UserRegisterMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();
        // method calling to check whether the name is written in proper way or not.
        System.out.println(UserRegister.isValidFirstName(firstName));

        System.out.println("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println(UserRegister.isValidLastName(lastName));
    }
}
