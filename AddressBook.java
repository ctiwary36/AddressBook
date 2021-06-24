package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook {
    //main method
        public static void main(String[] args) {
            //printing welcome massage
            //creating object for address
            //taking input from user
            //printing address detail
            //giving option to user to add or view address
            System.out.println("Welcome to Address Book Program");

            ArrayList<Address> list = new ArrayList<Address>();
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("\n\n"
                        + "Choose your option:\n"
                        + "1. Create new Address\n"
                        + "2. View all the existing address\n"
                        + "3. Edit The Exisiting address\n"
                        + "4. exit\n");
                int option = sc.nextInt();
                sc.nextLine();
                switch (option) {
                    case 1:
                        Address address1 = new Address();
                        System.out.println("Enter your First name:");
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

                        for (Address addaddress1 : list) {
                            System.out.println(addaddress1);
                        }
                        System.out.println("\n\n");
                        break;
                    case 3:
                        System.out.println("Edit record");
                        //code for edit the address
                        System.out.println("Enter name to edit:");
                        for(int i=0;i<list.size();i++){
                            address1=list.get(i);

                            if(sc.nextLine().equals(address1.getFirstname())) {
                                System.out.println("\n\n"
                                        + "Choose your option:\n"
                                        + "1. enter 1 for firstname\n"
                                        + "2. enter 2 for lastname \n"
                                        + "3. enter 3 for city\n"
                                        + "4. enter 4 for state\n"
                                        + "5. enter 5 for email\n"
                                        + "6. enter 6 Zip \n"
                                        + "7. enter 7 phoneNumber \n"
                                );
                                int option1 = sc.nextInt();
                                sc.nextInt();
                                switch(option1) {
                                    case 1:
                                        System.out.println("Enter your new First name:");
                                        address1.setFirstname(sc.nextLine());
                                    case 2:
                                        System.out.println("Enter your new Last name:");
                                        address1.setLastname(sc.nextLine());
                                    case 3:
                                        System.out.println("Enter your new city:");
                                        address1.setCity(sc.nextLine());
                                    case 4:
                                        System.out.println("Enter your new State:");
                                        address1.setState(sc.nextLine());
                                    case 5:
                                        System.out.println("Enter your new Email:");
                                        address1.setEmail(sc.nextLine());
                                    case 6:
                                            System.out.println("Enter your new zip:");
                                            address1.setZip(sc.nextLine());
                                    case 7:
                                        System.out.println("Enter your new phone Number:");
                                        address1.setPhoneNumber(sc.nextLine());
                                }
                            }
                            else {
                                System.out.println("User not found");
                            }
                        }
                        break;
                        //code for remove address
                    case 4:
                        System.out.println("remove record");
                        System.out.println("Enter name to remove:");
                        for(int i=0;i<list.size();i++){
                            address1=list.get(i);
                            if(sc.nextLine().equals(address1.getFirstname())) {
                                list.remove(address1);
                                System.out.println("List After removing"+list);
                            }
                            else {
                                System.out.println("User not found");
                            }
                        }
                        break;
                    case 5:
                        System.out.println("please enter valid option");
                }


                    System.out.println("address detail" + list);

                }


            }
        }

