/*
 * The User Registration System program implements an application that needs
 * to ensure all validations are in place during the User Entry.
 * UC1: As a User need to enter a valid First Name.
 *
 * @author: Sanjana Bhandure
 * @version: 1.0
 * @date: 30-04-2022
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
    }
}
