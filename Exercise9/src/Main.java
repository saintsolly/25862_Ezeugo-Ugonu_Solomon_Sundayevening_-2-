/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Main.java (Test Class)
public class Main {
    public static void main(String[] args) {
        // Create instances of library items
        Book book = new Book("Java Programming", "John Doe", "B001", 14);
        Magazine magazine = new Magazine("Tech Monthly", "Jane Smith", "M001", 7);
        DVD dvd = new DVD("Inception", "Christopher Nolan", "D001", 7);
        DigitalBook digitalBook = new DigitalBook("Online Learning Java", "Sarah Lee", "DB001", 30);

        // Borrow and return items
        book.borrowItem();
        magazine.borrowItem();
        dvd.borrowItem();
        digitalBook.borrowItem();
    
        // Display item details
        book.displayItemDetails();
        magazine.displayItemDetails();
        dvd.displayItemDetails();
        digitalBook.displayItemDetails();

        // Return items
        book.returnItem();
        magazine.returnItem();
        dvd.returnItem();
        digitalBook.returnItem();

        // Digital Access (Online Reading)
        digitalBook.onlineReading();
    }
}

import java.util.Scanner;

interface Selling {
    double calculatePayment(String productType, int quantity);
}

class SellingSmall implements Selling {
    @Override
    public double calculatePayment(String productType, int quantity) {
        switch (productType.toLowerCase()) {
            case "bread":
                return quantity <= 100 ? quantity * 700 : quantity * 500;
            case "chocolate":
                return quantity <= 100 ? quantity * 1500 : quantity * 1000;
            case "milk":
                return quantity <= 200 ? quantity * 2000 : quantity * 1200;
            default:
                throw new IllegalArgumentException("Invalid product type.");
        }
    }
}

class SellingBig implements Selling {
    @Override
    public double calculatePayment(String productType, int quantity) {
        return new SellingSmall().calculatePayment(productType, quantity);
    }
}

public class CustomerPhocusLtd {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Selling sellingSmall = new SellingSmall();
        Selling sellingBig = new SellingBig();

        String[][] customerData = new String[3][5];
        double[] totalPrices = new double[3];

        System.out.println("Welcome to Customer Phocus Ltd Selling Management System!");

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for Customer " + (i + 1));

            customerData[i][0] = getInput("Customer National ID");
            customerData[i][1] = getInput("Customer Names");
            customerData[i][2] = getInput("Customer Address");
            customerData[i][3] = getValidatedInput("Customer Age", "integer");
            customerData[i][4] = getInput("Customer Nationality");

            System.out.println("Choose a product to sell: Bread, Chocolate, or Milk");
            String product = scanner.nextLine().trim();
            while (!product.equalsIgnoreCase("bread") && !product.equalsIgnoreCase("chocolate") && !product.equalsIgnoreCase("milk")) {
                System.out.println("Invalid product. Please choose Bread, Chocolate, or Milk.");
                product = scanner.nextLine().trim();
            }

            int quantity = Integer.parseInt(getValidatedInput("Quantity", "integer"));

            double pricePerUnit = getPricePerUnit(product, quantity, sellingSmall, sellingBig);
            double totalPrice = pricePerUnit * quantity;
            totalPrices[i] = totalPrice;

            System.out.printf("Price per unit: %.2f RWF\n", pricePerUnit);
            System.out.printf("Total price for %d %s: %.2f RWF\n", quantity, product, totalPrice);
        }

        System.out.println("\n--- Customer Details and Payments ---");
        for (int i = 0; i < 3; i++) {
            System.out.println("Customer " + (i + 1) + ":");
            System.out.println("National ID: " + customerData[i][0]);
            System.out.println("Names: " + customerData[i][1]);
            System.out.println("Address: " + customerData[i][2]);
            System.out.println("Age: " + customerData[i][3]);
            System.out.println("Nationality: " + customerData[i][4]);
            System.out.printf("Total Payment: %.2f RWF\n", totalPrices[i]);
            System.out.println("-----------------------");
        }
    }

    private static String getInput(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextLine().trim();
    }

    private static String getValidatedInput(String prompt, String type) {
        while (true) {
            try {
                System.out.print(prompt + ": ");
                String input = scanner.nextLine().trim();
                if (type.equals("integer")) {
                    Integer.parseInt(input);
                }
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid " + type + ".");
            }
        }
    }

    private static double getPricePerUnit(String product, int quantity, Selling sellingSmall, Selling sellingBig) {
        if (quantity > 100) {
            return sellingBig.calculatePayment(product, quantity) / quantity;
        } else {
            return sellingSmall.calculatePayment(product, quantity) / quantity;
        }
    }
}

