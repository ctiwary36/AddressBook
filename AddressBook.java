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
            //giving option to user to add or view address
            System.out.println("Welcome to Address Book Program");

            ArrayList<Address> list = new ArrayList<Address>();
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("\n\n"
                        + "Choose your option:\n"
                        + "1. Create new Address\n"
                        + "2. View all the existing address\n"
                        + "3. exit\n");
                int option = sc.nextInt();
                sc.nextLine();
                switch (option) {
                    case 1:
                        Address address1 = new Address();
                        System.out.println("Enter your name:");
                        String s = sc.nextLine();
                        address1.setFirstname(s);


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
                        break;
                    case 2:
                        System.out.println("First_name\tLast_name\tCity\tState\tZip\tPhone_number\tEmail_id");
                        for (Address addaddress1 : list) {
                            System.out.println(addaddress1);
                        }
                        System.out.println("\n\n");
                        break;
                    case 3:
                        return;

                }


                    System.out.println("address detail" + list);

                }


            }
        }

