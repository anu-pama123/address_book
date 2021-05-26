package com.bridgelabz;

import java.util.Scanner;
public class AddressBookMain extends AddressBook
{
    AddressBookMain(String firstName, String lastName, String address,  String city, String state, String emailId, String zipCode, String phoneNumber ){
        super(firstName, lastName, address, city, state, emailId, zipCode, phoneNumber);
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = scan.next();
        System.out.println("Enter last name");
        String lastName = scan.next();
        System.out.println("Enter your address");
        String address = scan.next();
        System.out.println("Enter your city");
        String city = scan.next();
        System.out.println("Enter your state");
        String state = scan.next();
        System.out.println("Enter your email");
        String email = scan.next();
        System.out.println("Enter your zip code");
        String zipCode = scan.next();
        System.out.println("Enter your Phone number");
        String phoneNumber = scan.next();
        System.out.println("ADDED DETAILS");
        AddressBookMain object=new AddressBookMain(firstName, lastName, address, city, state, email, zipCode, phoneNumber);
        System.out.println("FirstName : " + object.firstName);
        System.out.println("LastName : " + object.lastName);
        System.out.println("Address : " + object.address);
        System.out.println("City : " + object.city);
        System.out.println("State : " + object.state);
        System.out.println("EmailId : " + object.emailId);
        System.out.println("ZipCode : " + object.zipCode);
        System.out.println("Phone Number : " + object.phoneNumber);

    }

}