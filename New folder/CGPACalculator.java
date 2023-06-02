import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();

        double[] credits = new double[n];
        double[] grades = new double[n];
        double totalCredits = 0;
        double totalPoints = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the credit for subject " + (i + 1) + ": ");
            credits[i] = sc.nextDouble();
            totalCredits += credits[i];

            System.out.print("Enter the grade for subject " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
            totalPoints += grades[i] * credits[i];
        }

        double cgpa = totalPoints / totalCredits;
        System.out.println("Your CGPA is: " + cgpa);
    }
}