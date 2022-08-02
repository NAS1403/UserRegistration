package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validFirstName();
        userRegistration.validSecondName();
        userRegistration.validEmailId();
        userRegistration.ValidPhoneNumber();
        userRegistration.validPassword();
    }
    public void validFirstName(){
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");

        System.out.println("Enter user first name");
        String fName = scanner.next();

        Matcher match = pattern.matcher(fName);
        if (match.matches())
            System.out.println("First name is Valid");
        else
            System.out.println("First name is InValid");
    }

    public void validSecondName(){
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");


        System.out.println("Enter user second name");
        String sName = scanner.next();

        Matcher match = pattern.matcher(sName);
        if (match.matches())
            System.out.println("Second name is Valid");
        else
            System.out.println("Second name is InValid");
    }

    public void validEmailId(){
        Pattern pattern = Pattern.compile("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$");
        System.out.println("Enter user email ");
        scanner.nextLine();
        String email = scanner.nextLine();

        Matcher match = pattern.matcher(email);
        if (match.matches())
            System.out.println("Email is Valid");
        else
            System.out.println("Email is InValid");
    }

    public void ValidPhoneNumber(){
        Pattern pattern = Pattern.compile("^[9][1]\s[6-9][0-9]{9}$");
        System.out.println("Enter user Phone number");

        String phoneNumber = scanner.nextLine();

        Matcher match = pattern.matcher(phoneNumber);
        if (match.matches())
            System.out.println("Phone number is Valid");
        else
            System.out.println("Phone number is InValid");

    }

    public void validPassword(){
        Pattern pattern = Pattern.compile("^[a-z]{8,}$");
        System.out.println("Enter user Password");

        String password = scanner.nextLine();

        Matcher match = pattern.matcher(password);
        if (match.matches())
            System.out.println("password is Valid");
        else
            System.out.println("password is InValid");
    }

}
