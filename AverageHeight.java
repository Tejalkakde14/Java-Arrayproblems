//3. Write a program to calculate the average height of all the students of a class. 
The number of students and their heights are entered by the user.

import java.util.Scanner;

public class AverageHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        double totalHeight = 0;


        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the height of student " + (i + 1) + " (in meters): ");
            double height = scanner.nextDouble();
            totalHeight += height;
        }

        
        double averageHeight = totalHeight / numStudents;

        
        System.out.printf("The average height of all students is: %.2f meters\n", averageHeight);

        
        scanner.close();
    }
}
