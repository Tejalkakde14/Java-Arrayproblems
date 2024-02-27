
package arrayprograms;

import java.util.Scanner;

class BankAccount {
    private static int accountNumberCounter = 1000;

    private String name;
    private String address;
    private String typeOfAccount;
    private double balance;
    private int numberOfTransactions;

    // Constructor
    public BankAccount(String name, String address, String typeOfAccount, double balance) {
        this.name = name;
        this.address = address;
        this.typeOfAccount = typeOfAccount;
        this.balance = balance;
        this.numberOfTransactions = 0;
    }

    // Generate a unique account number for each depositor
    public String generateAccountNumber() {
        return "BA" + accountNumberCounter++;
    }

    // Display information and balance of depositor
    public void displayInfo() {
        System.out.println("Account Number: " + generateAccountNumber());
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Type of Account: " + typeOfAccount);
        System.out.println("Balance: $" + balance);
    }

    // Deposit more amount in the balance of any depositor
    public void deposit(double amount) {
        balance += amount;
        numberOfTransactions++;
    }

    // Withdraw some amount from the balance deposited
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            numberOfTransactions++;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Change the address of depositor
    public void changeAddress(String newAddress) {
        address = newAddress;
    }

    // Getters for number of transactions
    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }
}

public class ArrayProb4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of depositors: ");
        int numDepositors = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        BankAccount[] accounts = new BankAccount[numDepositors];

        // Enter information for each depositor
        for (int i = 0; i < numDepositors; i++) {
            System.out.println("\nEnter information for depositor " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Type of Account: ");
            String typeOfAccount = scanner.nextLine();
            System.out.print("Initial Balance: $");
            double balance = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            accounts[i] = new BankAccount(name, address, typeOfAccount, balance);
        }

        // Print information of any depositor
        System.out.println("\nEnter the depositor number to display information: ");
        int depositorNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        accounts[depositorNumber - 1].displayInfo();

        // Deposit some amount to the account of any depositor
        System.out.println("\nEnter the depositor number to deposit amount: ");
        depositorNumber = scanner.nextInt();
        System.out.print("Enter the amount to deposit: $");
        double depositAmount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        accounts[depositorNumber - 1].deposit(depositAmount);
        System.out.println("Deposit successful!");

        // Display the final information of the depositor
        System.out.println("\nFinal Information after deposit:");
        accounts[depositorNumber - 1].displayInfo();

        // Withdraw some amount from the account of any depositor
        System.out.println("\nEnter the depositor number to withdraw amount: ");
        depositorNumber = scanner.nextInt();
        System.out.print("Enter the amount to withdraw: $");
        double withdrawAmount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        accounts[depositorNumber - 1].withdraw(withdrawAmount);
        System.out.println("Withdrawal successful!");

        // Display the final information of the depositor
        System.out.println("\nFinal Information after withdrawal:");
        accounts[depositorNumber - 1].displayInfo();

        // Change the address of any depositor
        System.out.println("\nEnter the depositor number to change address: ");
        depositorNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter the new address: ");
        String newAddress = scanner.nextLine();
        accounts[depositorNumber - 1].changeAddress(newAddress);
        System.out.println("Address updated successfully!");

        // Display the final information of the depositor
        System.out.println("\nFinal Information after address change:");
        accounts[depositorNumber - 1].displayInfo();

        // Randomly repeat these processes for some other bank accounts
        // For demonstration purposes, let's repeat the processes for one more account
        accounts[1].deposit(200);
        accounts[1].withdraw(50);
        accounts[1].changeAddress("New Street, New City");

        // Print the total number of transactions
        int totalTransactions = 0;
        for (BankAccount account : accounts) {
            totalTransactions += account.getNumberOfTransactions();
        }
        System.out.println("\nTotal number of transactions: " + totalTransactions);

        scanner.close();
    }
}

 
