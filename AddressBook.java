package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook {
    //main method
        public static void main(String[] args) {
            //printing welcome massage
            //creating object for address
            //taking input from user
            //printing adress detail
            System.out.println("Welcome to Address Book Program....!!!");
            Address address1 = new Address();
            ArrayList<Address> list=new ArrayList<Address>();

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name:");
            String s=sc.nextLine();
            address1.setFirstname(s);
            String fname= address1. getFirstname();

            System.out.println("Enter your Last Name:");
            address1.setLastname(sc.nextLine());

            System.out.println("Enter your City:");
            address1.setCity(sc.nextLine());

            System.out.println("Enter your State:");
            address1.setState(sc.nextLine());

            System.out.println("Enter your email:");
            address1.setEmail(sc.nextLine());

            System.out.println("Enter your Zip:");
            address1.setZip(sc.next());

            System.out.println("Enter your PhoneNumber:");
            address1.setPhoneNumber(sc.next());

        list.add(address1);

            System.out.println("address detail" +list);

        }


    }

