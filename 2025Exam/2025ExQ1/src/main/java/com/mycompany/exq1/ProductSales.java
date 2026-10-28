/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exq1;

/**
 *
 * @author NLS - SMP
 */
public class ProductSales implements iProduct {

    @Override
    public int TotalSales(int[][] productSales) {
        int total = 0;
        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {
                total = total + productSales[i][j];
            }
        }
        return total;
    }

    @Override
    public double AverageSales(int[][] productSales) {
        int total = TotalSales(productSales);
        
        // Using Double.parseDouble to avoid casting, as required
        double totalAsDouble = Double.parseDouble("" + total);
        int numberOfItems = productSales.length * productSales[0].length;
        
        double averageSales = totalAsDouble / numberOfItems;
        return averageSales;
    }

    @Override
    public int MaxSales(int[][] productSales) {
        // Start with the very first number in the array
        int max = productSales[0][0];
        
        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {
                if (productSales[i][j] > max) {
                    max = productSales[i][j];
                }
            }
        }
        return max;
    }

    @Override
    public int MinSales(int[][] productSales) {
        // Start with the very first number in the array
        int min = productSales[0][0];
        
        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {
                if (productSales[i][j] < min) {
                    min = productSales[i][j];
                }
            }
        }
        return min;
    }
}
