//5. Write a program to create a directory that contains the following information.
//(a) Name of a person
/(b) Address
//(c) Telephone Number (if available with STD code)
//(d) Mobile Number (if available)
//(e) Head of the family

import java.util.Scanner;

class PersonDirectory {
    String name;
    String address;
    String telephoneNumber;
    String mobileNumber;
    String headOfFamily;

    public PersonDirectory(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.mobileNumber = mobileNumber;
        this.headOfFamily = headOfFamily;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        if (telephoneNumber != null) {
            System.out.println("Telephone Number: " + telephoneNumber);
        }
        if (mobileNumber != null) {
            System.out.println("Mobile Number: " + mobileNumber);
        }
        if (headOfFamily != null) {
            System.out.println("Head of the Family: " + headOfFamily);
        }
    }
}

public class DirectoryCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        System.out.print("Enter telephone number (with STD code), if available: ");
        String telephoneNumber = scanner.nextLine();

        System.out.print("Enter mobile number, if available: ");
        String mobileNumber = scanner.nextLine();

        System.out.print("Enter head of the family, if available: ");
        String headOfFamily = scanner.nextLine();

        PersonDirectory person = new PersonDirectory(name, address, telephoneNumber, mobileNumber, headOfFamily);

        System.out.println("\nDirectory Information:");
        person.displayInfo();

        scanner.close();
    }
}
