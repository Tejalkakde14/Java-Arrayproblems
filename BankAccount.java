
//ArrayBanaccount

import java.util.Scanner;

class BankAccount {
    private static int accountCount = 1000; // Starting account number
    private String accountNumber;
    private String nameOfDepositor;
    private String addressOfDepositor;
    private String typeOfAccount;
    private double balance;
    private int numberOfTransactions;

    public BankAccount(String name, String address, String type, double initialBalance) {
        this.nameOfDepositor = name;
        this.addressOfDepositor = address;
        this.typeOfAccount = type;
        this.balance = initialBalance;
        this.accountNumber = "BA" + accountCount++;
        this.numberOfTransactions = 0;
    }

    public void displayInformation() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name of Depositor: " + nameOfDepositor);
        System.out.println("Address of Depositor: " + addressOfDepositor);
        System.out.println("Type of Account: " + typeOfAccount);
        System.out.println("Balance: $" + balance);
        System.out.println("Number of Transactions: " + numberOfTransactions);
    }

    public void deposit(double amount) {
        balance += amount;
        numberOfTransactions++;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            numberOfTransactions++;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void changeAddress(String newAddress) {
        this.addressOfDepositor = newAddress;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }
}

public class Main {
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
            System.out.print("Type of account: ");
            String type = scanner.nextLine();
            System.out.print("Initial balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            accounts[i] = new BankAccount(name, address, type, balance);
        }

        // Print information of any depositor
        System.out.print("\nEnter the index of the depositor to display information: ");
        int index = scanner.nextInt();
        accounts[index - 1].displayInformation();

        // Add some amount to the account of any depositor
        System.out.print("\nEnter the index of the depositor to deposit amount: ");
        index = scanner.nextInt();
        System.out.print("Enter the amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        accounts[index - 1].deposit(depositAmount);
        System.out.println("Deposited successfully.");
        accounts[index - 1].displayInformation();

        // Remove some amount from the account of any depositor
        System.out.print("\nEnter the index of the depositor to withdraw amount: ");
        index = scanner.nextInt();
        System.out.print("Enter the amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        accounts[index - 1].withdraw(withdrawAmount);
        System.out.println("Withdrawn successfully.");
        accounts[index - 1].displayInformation();

        // Change the address of any depositor
        System.out.print("\nEnter the index of the depositor to change address: ");
        index = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter the new address: ");
        String newAddress = scanner.nextLine();
        accounts[index - 1].changeAddress(newAddress);
        System.out.println("Address changed successfully.");
        accounts[index - 1].displayInformation();

        // Randomly repeat these processes for some other bank accounts
        // (This part is left as an exercise for the reader)

        // Print the total number of transactions
        int totalTransactions = 0;
        for (BankAccount account : accounts) {
            totalTransactions += account.getNumberOfTransactions();
        }
        System.out.println("\nTotal number of transactions: " + totalTransactions);

        scanner.close();
    }
}
