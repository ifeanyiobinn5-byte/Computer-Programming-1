// Name: OKAFOR EMMANUEL IFEANYICHUKWU
// Matric No: 25/16516
// Department: SOFTWARE ENGINEERING
// Course: COS 201

import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Student: OKAFOR EMMANUEL IFEANYICHUKWU - 25/16516 - SOFTWARE ENGINEERING");
        System.out.print("Enter item name: ");
        String itemName = input.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();
        double totalCost = quantity * unitPrice;
        System.out.println("\n--- Item Details ---");
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Cost: " + totalCost);
        input.close();
    }
}
