/*
 * The User Registration System program implements an application that needs
 * to ensure all validations are in place during the User Entry.
 * UC9: Should clear all email samples provided separately.
 *
 * @author: Sanjana Bhandure
 * @version: 1.9
 * @date: 1-05-2022
 */

package com.Bridgelabz.Day19_RegexUserRegistrationProblem;

import java.util.Scanner;

public class UserRegisterMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Email: ");
        String email = scanner.nextLine();
        System.out.println(UserRegister.isValidEmail(email));
    }
}
