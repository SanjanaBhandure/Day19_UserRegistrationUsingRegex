package com.Bridgelabz.Day19_RegexUserRegistrationProblem;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegister {
    static Scanner scanner = new Scanner(System.in);

    /*
     * firstName method created in which First Name starts with Cap and has minimum 3 Characters.
     */
    public static void firstName() {
        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();
        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", firstName) == true)
            System.out.println("Valid First Name");
        else
            System.out.println("Invalid First Name");
    }

    /*
     * lastName method created in which Last Name starts with Cap and has minimum 3 Characters.
     */
    public static void lastName() {
        System.out.println("Enter Last Name: ");
        String lastName = scanner.nextLine();
        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lastName) == true)
            System.out.println("Valid Last Name");
        else
            System.out.println("Invalid Last Name");
    }

    /*
     * email method created in which Email has 3 mandatory conditions
     */
    public static void email() {
        System.out.println("Enter Valid Email: ");
        String email = scanner.nextLine();
        if (Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", email) == true)
            System.out.println("Valid Email");
        else
            System.out.println("Invalid Email");
    }
}
