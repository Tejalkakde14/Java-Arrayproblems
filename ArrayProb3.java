
package arrayprograms;

import java.util.Scanner;
public class ArrayProb3 {
 


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Create an array to store the heights of students
        double[] heights = new double[numStudents];

        // Input heights of students
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the height of student " + (i + 1) + " in centimeters: ");
            heights[i] = scanner.nextDouble();
        }

        // Calculate the sum of heights
        double totalHeight = 0;
        for (double height : heights) {
            totalHeight += height;
        }

        // Calculate the average height
        double averageHeight = totalHeight / numStudents;

        // Display the average height
        System.out.println("The average height of all students is: " + averageHeight + " centimeters.");

        scanner.close();
    }
}
   
}
