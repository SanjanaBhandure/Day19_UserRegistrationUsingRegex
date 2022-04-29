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

    /*
     * phoneNumber method created
     * E.g. 91 9919819801 - Country code follow by space and 10 digit number
     */
    public static void phoneNumber() {
        System.out.println("Enter phone Number with country code(space between country code and phone Number): ");
        String phoneNumber = scanner.nextLine();
        if (Pattern.matches("^[1-9]{2}\\s{1}[1-9]{1}[0-9]{9}$", phoneNumber) == true)
            System.out.println("Valid Phone Number");
        else
            System.out.println("Invalid Phone Number");
    }

    /*
     *  password method created should have at least 1 UpperCase.
     */
    public static void password() {
        System.out.println("Enter Password: ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (Pattern.matches("^[A-Z]{1}[A-Za-z0-9,@#$&*().]{8,}[A-Za-z0-9]$", password) == true)
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }
}
