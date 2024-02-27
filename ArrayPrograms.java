
package arrayprograms;

import java.util.Scanner;

public class ArrayPrograms {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating arrays to store employee details
        String[] names = new String[10];
        double[] salaries = new double[10];
        String[] dateOfJoinings = new String[10];

        // Adding 10 employees
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = scanner.nextLine();
            System.out.print("Salary: ");
            salaries[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Date of Joining (YYYY-MM-DD): ");
            dateOfJoinings[i] = scanner.nextLine();
        }

        // Printing employee details
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("Name: " + names[i]);
            System.out.println("Salary: " + salaries[i]);
            System.out.println("Date of Joining: " + dateOfJoinings[i]);
            System.out.println();
        }

        // Closing scanner
        scanner.close();
    
}

    
  
    
}
