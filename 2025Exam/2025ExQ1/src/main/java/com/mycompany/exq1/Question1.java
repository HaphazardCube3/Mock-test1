/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exq1;

/**
 *
 * @author NLS - SMP
 */
public class Question1 {

    public static void main(String[] args) {
        // The 2D Array from the table
        int[][] sales = {
            {300, 150, 700}, // Year 1
            {250, 200, 600} // Year 2
        };

        // Create the object
        ProductSales ps = new ProductSales();

        // Call the methods
        int total = ps.TotalSales(sales);
        double average = ps.AverageSales(sales);
        int max = ps.MaxSales(sales);
        int min = ps.MinSales(sales);

        // Print the report
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("---------------------------------");

        System.out.printf("Total sales:    %d%n", total);

        // We use %.0f to show the average as a whole number (like 367) as per the screenshot
        System.out.printf("Average sales:  %.0f%n", average);

        System.out.printf("Maximum sales:  %d%n", max);
        System.out.printf("Minimum sales:  %d%n", min);
    }
}
