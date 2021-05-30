package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain extends CollectionClass
{
    private static int choice;
    public static CollectionClass collectionObject = new CollectionClass();
    public static void main(String[] args)
    {
        do
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("MENU OPTIONS\n1.Add\n2.Edit\n3.Delete");
            System.out.println("ENTER YOUR CHOICE");
            choice = scan.nextInt();
            switch (choice)
            {
                case 1:
                    do {

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
                        UpdateContact object = new UpdateContact(firstName, lastName, address, city, state, email, zipCode, phoneNumber);
                        System.out.println("FirstName : " + object.firstName);
                        System.out.println("LastName : " + object.lastName);
                        System.out.println("Address : " + object.address);
                        System.out.println("City : " + object.city);
                        System.out.println("State : " + object.state);
                        System.out.println("EmailId : " + object.emailId);
                        System.out.println("ZipCode : " + object.zipCode);
                        System.out.println("Phone Number : " + object.phoneNumber);
                        collectionObject.personDetails.put(firstName, object);
                        System.out.println("Enter 0 to quit, Any other number to Add another person");
                        choice = scan.nextInt();
                    }
                    while (choice != 0);
                    break;
                case 2:
                    System.out.println("EDIT OPTIONS\n1.Address\n2.City\n3.State\n4.Zip Code\n5.Phone Number");
                    System.out.println("ENTER YOUR CHOICE");
                    choice = scan.nextInt();
                    System.out.println("Enter the name of person to edit : ");
                    String firstName = scan.next();
                    collectionObject.personDetails.get(firstName).updateContactBasedOnName(choice);
                    System.out.println("----UPDATED----");
                    System.out.println("Enter 0 to quit, Any other number to continue");
                    choice = scan.nextInt();
                    break;
                case 3:
                    System.out.println("Enter Person's first name to be deleted");
                    firstName = scan.next();
                    collectionObject.personDetails.remove(firstName);
                    System.out.println("----PERSON DELETED---- ");
                    break;
                default:
                    System.out.println("ENTER A VALID INPUT");
            }
            System.out.println("Enter 0 to quit, any other number to return to MENU");
            choice = scan.nextInt();
        }
        while (choice != 0);
    }
    }
