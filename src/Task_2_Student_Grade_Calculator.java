//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Task_2_Student_Grade_Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of subjects: ");
        int n = scanner.nextInt();

        int totalMarks = 0;


        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks = totalMarks + marks;
        }


        double avg = totalMarks / n;


        char grade;
        if (avg >= 90) {
            grade = 'A';
        } else if (avg >= 80) {
            grade = 'B';
        } else if (avg >= 70) {
            grade = 'C';
        } else if (avg >= 60) {
            grade = 'D';
        } else if (avg >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }


        System.out.println("Total Marks: \n" + totalMarks);
        System.out.println("Average Percentage: " + avg + "%");
        System.out.println("Grade: " + grade);


    }
}
