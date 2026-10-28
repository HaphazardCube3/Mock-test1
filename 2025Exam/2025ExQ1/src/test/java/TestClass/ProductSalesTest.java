/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestClass;

import com.mycompany.exq1.ProductSales;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author NLS - SMP
 */
public class ProductSalesTest {
    
    // The dummy data for the tests
    int[][] testData = {
        {300, 150, 700},
        {250, 200, 600}
    };

    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        ProductSales ps = new ProductSales();
        int expectedTotal = 2200;
        int actualTotal = ps.TotalSales(testData);
        
        // Check if they match
        assertEquals(expectedTotal, actualTotal);
    }

    @Test
    public void AverageSales_ReturnsAverageProductSales() {
        ProductSales ps = new ProductSales();
        double expectedAverage = 366.6666666666667;
        double actualAverage = ps.AverageSales(testData);
        
        // The 0.0 is the "delta" required for doubles in JUnit
        assertEquals(expectedAverage, actualAverage, 0.0);
    }
}
