
package arrayprograms;

 import java.util.Scanner;
public class ArrayProb2 {
   


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] marks = new int[8][3]; // Array to store marks of 8 students in 3 subjects
        int[] rollNumbers = new int[8]; // Array to store roll numbers of students

        // Input marks for each student
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            rollNumbers[i] = i + 1;
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextInt();
            }
        }

        // Calculate average marks for each student and print details
        System.out.println("\nStudent Details:");
        for (int i = 0; i < 8; i++) {
            int totalMarks = 0;
            for (int j = 0; j < 3; j++) {
                totalMarks += marks[i][j];
            }
            double averageMarks = (double) totalMarks / 3.0;
            System.out.println("Roll Number: " + rollNumbers[i]);
            System.out.println("Average Marks: " + averageMarks);
            System.out.println();
        }

        scanner.close();
    }
}

}
