// Name: OKAFOR EMMANUEL IFEANYICHUKWU
// Matric No: 25/16516
// Department: SOFTWARE ENGINEERING
// Course: COS 201

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Student: OKAFOR EMMANUEL IFEANYICHUKWU - 25/16516 - SOFTWARE ENGINEERING");
        System.out.print("Enter score 1: ");
        double score1 = input.nextDouble();
        System.out.print("Enter score 2: ");
        double score2 = input.nextDouble();
        System.out.print("Enter score 3: ");
        double score3 = input.nextDouble();
        double total = score1 + score2 + score3;
        double average = total / 3;
        System.out.println("Total Score: " + total);
        System.out.println("Average Score: " + average);
        input.close();
    }
}
