/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayprograms;

import java.util.Scanner;

class Person {
    String name;
    String address;
    String telephoneNumber;
    String mobileNumber;
    String headOfFamily;

    public Person(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.mobileNumber = mobileNumber;
        this.headOfFamily = headOfFamily;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        if (telephoneNumber != null) {
            System.out.println("Telephone Number: " + telephoneNumber);
        }
        if (mobileNumber != null) {
            System.out.println("Mobile Number: " + mobileNumber);
        }
        System.out.println("Head of the Family: " + headOfFamily);
        System.out.println();
    }
}

public class ArrayProb5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person[] directory = new Person[2]; // Creating a directory with capacity for 2 persons

        // Input details for each person
        for (int i = 0; i < directory.length; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Telephone Number (if available with STD code): ");
            String telephoneNumber = scanner.nextLine();
            System.out.print("Mobile Number (if available): ");
            String mobileNumber = scanner.nextLine();
            System.out.print("Head of the Family: ");
            String headOfFamily = scanner.nextLine();

            directory[i] = new Person(name, address, telephoneNumber, mobileNumber, headOfFamily);
        }

        // Display details of all persons in the directory
        System.out.println("\nDirectory:");
        for (Person person : directory) {
            person.displayDetails();
        }

        scanner.close();
    }
}

