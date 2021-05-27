package com.bridgelabz;

import java.util.Scanner;
import java.util.HashMap;
public class AddressBookMain
{
    public static void main(String[] args)
    {
        HashMap<String,UpdateContact> personDetails = new HashMap<>();
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
        UpdateContact object=new UpdateContact(firstName, lastName, address, city, state, email, zipCode, phoneNumber);
        System.out.println("FirstName : " + object.firstName);
        System.out.println("LastName : " + object.lastName);
        System.out.println("Address : " + object.address);
        System.out.println("City : " + object.city);
        System.out.println("State : " + object.state);
        System.out.println("EmailId : " + object.emailId);
        System.out.println("ZipCode : " + object.zipCode);
        System.out.println("Phone Number : " + object.phoneNumber);
        personDetails.put(firstName,object);
        int choice=1;
        do
        {
            System.out.println("Enter the name");
            firstName = scan.next();
            System.out.println("EDIT OPTIONS\n1.Address\n2.City\n3.State\n4.Zip Code\n5.Phone Number");
            System.out.println("ENTER YOUR CHOICE");
            choice = scan.nextInt();
            personDetails.get(firstName).updateContactBasedOnName(choice);
            System.out.println("Enter 0 to quit, Any other number to continue");
            choice = scan.nextInt();
        }
        while (choice!=0);
        System.out.println("----UPDATED----");
        System.out.println("Enter Person's first name to be deleted");
        firstName = scan.next();
        personDetails.remove(firstName);
        System.out.println("----PERSON DELETED---- ");
    }

}