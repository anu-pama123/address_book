package com.bridgelabz;

import java.util.*;
import java.util.Scanner;

public class AddressBookMain extends CollectionClass {
    private static volatile int choice;
    private static volatile int choice1;
    public static CollectionClass collectionObject = new CollectionClass();

    public static boolean isDuplicate(String firstName) {
        return collectionObject.personDetails.containsKey(firstName);
    }

    public void createMenu() {
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("MENU OPTIONS\n1.Add\n2.Edit\n3.Delete\n4.Search");
            System.out.println("ENTER YOUR CHOICE");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    do {
                        System.out.println("Enter first name");
                        String firstName = scan.next();
                        if ((isDuplicate(firstName))) {
                            System.out.println(firstName + "'s details are already Present");
                            break;
                        }
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
                        if(!collectionObject.cityPersonMap.containsKey(city)){
                            List<UpdateContact> list=new ArrayList<UpdateContact>();
                            list.add(object);
                            collectionObject.cityPersonMap.put(city,list);
                        }else {
                            collectionObject.cityPersonMap.get(city).add(object);
                        }
                        System.out.println(collectionObject.cityPersonMap.get(city));
                        if(!collectionObject.statePeronMap.containsKey(state)){
                            List<UpdateContact> list=new ArrayList<UpdateContact>();
                            list.add(object);
                            collectionObject.statePeronMap.put(state, list);
                        }else {
                            collectionObject.statePeronMap.get(state).add(object);
                        }
                        System.out.println("Enter 0 to quit, Any other number to Add another person");
                        choice = scan.nextInt();
                    } while (choice != 0);
                    System.out.println("Enter 0 to quit, Any other number to go to main");
                    choice = scan.nextInt();
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
                case 4:
                    System.out.println("SEARCH OPTIONS\n1.By City\n2.By State\nEnter choice");
                    choice1 = scan.nextInt();
                    switch (choice1) {
                        case 1:
                            System.out.println("Enter city name");
                            String city = scan.next();
                            scan.nextLine();
                            if(collectionObject.cityPersonMap.containsKey(city)){
                                System.out.println("no of people from " +city+" is : "+collectionObject.cityPersonMap.get(city).size());
                                for(int i = 0; i < collectionObject.cityPersonMap.get(city).size(); i++){
                                    System.out.println(collectionObject.cityPersonMap.get(city).get(i).firstName);
                                }
                            }
                            break;
                        case 2:
                            int count = 0;
                            System.out.println("Enter state name");
                            String state = scan.next();
                            scan.nextLine();
                            if(collectionObject.statePeronMap.containsKey(state)){
                                System.out.println("no of people from" + state + " is : "+collectionObject.statePeronMap.get(state).size());
                                for(int i = 0; i< collectionObject.statePeronMap.get(state).size(); i++){
                                    System.out.println(collectionObject.statePeronMap.get(state).get(i).firstName);
                                }
                            }
                            break;
                        default:
                            System.out.println("ENTER A VALID INPUT");
                    }
                    System.out.println("Enter 0 to quit, any other number to return to MENU");
                    choice1 = scan.nextInt();

            }
        }while (choice != 0);
    }

    public static void main (String[]args){
        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.createMenu();
    }
}