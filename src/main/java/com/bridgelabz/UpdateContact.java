package com.bridgelabz;

import java.util.Scanner;

public class UpdateContact extends AddressBook {

    UpdateContact(String firstName, String lastName, String address, String city, String state, String emailId, String zipCode, String phoneNumber ) {
        super(firstName, lastName, address, city, state, emailId, zipCode, phoneNumber);
    }

    public void updateContactBasedOnName(int choice) {
        Scanner scan = new Scanner(System.in);
        switch (choice) {
                case 1: System.out.println("Enter new Address");
                    this.address = scan.next();
                    break;
                case 2: System.out.println("Enter new City Name");
                    this.city = scan.next();
                    break;
                case 3: System.out.println("Enter new State Name");
                    this.state = scan.next();
                    break;
                case 4: System.out.println("Enter new Zip code");
                    this.zipCode = scan.next();
                    break;
                case 5: System.out.println("Enter new Phone Number");
                    this.phoneNumber = scan.next();
                    break;
                default: System.out.println("ENTER A VALID CHOICE");
            }
    }
}
