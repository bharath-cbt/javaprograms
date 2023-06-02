import java.util.Scanner;

public class AppleDistribution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total number of apples: ");
        int totalApples = input.nextInt();

        System.out.print("Enter the number of extra apples Gia has: ");
        int giaExtraApples = input.nextInt();

        int giaApples = (totalApples + giaExtraApples) / 2;
        int maddieApples = totalApples - giaApples;

        System.out.println("Gia has " + giaApples + " apples.");
        System.out.println("Maddie has " + maddieApples + " apples.");
    }
}
